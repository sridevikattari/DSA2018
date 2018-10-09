package module5;

import java.util.Scanner;

public class Deque {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int  num=0;
		Operations o=new Operations();
		int n=sc.nextInt();
		while(sc.hasNext())
		{
		String input=sc.nextLine(); 
        String[] arrOfStr = input.split(" ");
        String element1 = arrOfStr[0];
        if(arrOfStr.length>1)
        {
         String element2 = arrOfStr[1];
         num=Integer.parseInt(element2);
        }
        switch(element1)
        {
		case "pushLeft":o.pushLeft(num);
		break;
		case "pushRight":o.pushRight(num);
		break;
		case "popLeft":o.popLeft();
		break;
		case "popRight":o.popRight();
		break;
		case "size":o.size();
		break;
        }
        
		}
		
	}

}
