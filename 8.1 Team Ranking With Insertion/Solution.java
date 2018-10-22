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
  
class TeamSort implements Comparator<Team>{  
public int compare(Team s1,Team s2){  
if(s1.Wins==s2.Wins) 
{
	if(s1.Losses==s2.Losses)  
		{
		if(s1.Draws==s2.Draws)  
			return 0;  
			else if(s1.Draws<s2.Draws)  
			return 1;  
			else  
			return -1;  
		}
		else if(s1.Losses>s2.Losses)  
		return 1;  
		else  
		return -1;
}

else if(s1.Wins<s2.Wins)  
return 1;  
else  
return -1;  
}  
}
/*class LossesComparator implements Comparator<Team>{  
public int compare(Team s1,Team s2){  
if(s1.Draws==s2.Draws)  
return 0;  
else if(s1.Draws>s2.Draws)  
return 1;  
else  
return -1;  
}  
}*/

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
		
				  
				/*System.out.println("sorting by age...");  
				  
				Collections.sort(al,new WinsComparator());  
				for(Team st: al){  
				System.out.println(st.TeamName +", "+st.Wins+" "+st.Losses+" "+st.Draws);  
				}*/  
				
				  /*for(int i=0;i<al.size()-1;i++)
					System.out.println(al.get(i).TeamName);
				  System.out.println(al.get(al.size()-1).TeamName);
				  */
		
		
		TeamSort t=new TeamSort();
		
		 int n = al.size(); 
		  
	        // One by one move boundary of unsorted subarray 
	        for (int i = 0; i < n-1; i++) 
	        { 
	            // Find the minimum element in unsorted array 
	            int min_idx = i; 
	            for (int j = i+1; j < n; j++) 
	               
	               	if(t.compare(al.get(j),al.get(min_idx))==-1)
	                    min_idx = j; 
	  
	            // Swap the found minimum element with the first 
	            // element 
	            
	            
	            
	            
	            Team temp = al.get(min_idx); 
	            al.remove(min_idx);
	            al.add(min_idx,al.get(i));
	            al.remove(i);
	            al.add(i,temp); 
	             
	        } 
	       for(int i=0;i<al.size()-1;i++)
			System.out.print(al.get(i).TeamName+",");
		  System.out.print(al.get(al.size()-1).TeamName);
		  
		sc.close();		  
				
			} 

}
