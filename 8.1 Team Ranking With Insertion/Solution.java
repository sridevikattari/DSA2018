import java.util.*;
import java.util.Scanner;
class Team{
	String TeamName;
	int Wins,Losses,Draws;
	public Team(String teamName, int wins, int losses, int draws) {
		super();
		TeamName = teamName;
		Wins = wins;
		Losses = losses;
		Draws = draws;
	}

	
}
  
class WinsComparator implements Comparator<Team>{  
public int compare(Team s1,Team s2){  
if(s1.Wins==s2.Wins)  
return 0;  
else if(s1.Wins<s2.Wins)  
return 1;  
else  
return -1;  
}  
}
class LossesComparator implements Comparator<Team>{  
public int compare(Team s1,Team s2){  
if(s1.Losses==s2.Losses)  
return 0;  
else if(s1.Losses>s2.Losses)  
return 1;  
else  
return -1;  
}  
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<Team> al=new ArrayList<Team>();  
		while (sc.hasNext()) {
		String		s = sc.nextLine();
				String[] ar = s.split(",");
				al.add(new Team(ar[0],Integer.parseInt(ar[1]),Integer.parseInt(ar[2]),Integer.parseInt(ar[3])));
		}
		
				  
				//System.out.println("sorting by age...");  
				  
				Collections.sort(al,new WinsComparator());  
			/*	for(Team st: al){  
				System.out.println(st.TeamName +" "+st.Wins+" "+st.Losses+" "+st.Draws);  
				}  
				  
					System.out.println("Sorting by Name...");  
			*/	  
				Collections.sort(al,new LossesComparator());  
				  
				for(Team st: al){  
				System.out.println(st.TeamName +" "+st.Wins+" "+st.Losses+" "+st.Draws);  
				}    
				  
				
		sc.close();		  
				
			} 

}
