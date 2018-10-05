import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {

		Stack<Integer> st=new Stack<Integer>();
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String []sr=s.split(" ");
		int sol=0;
		//System.out.println(Arrays.toString(sr));
		for (String string : sr)
		{
			switch(string)
			{
			case "+":sol=(int)st.pop()+(int)st.pop();
			st.push(sol);
			break;  
			case "-":sol=(int)st.pop()-(int)st.pop();
			st.push(sol);
			break;  
			case "*":sol=(int)st.pop()*(int)st.pop();
			st.push(sol);
			break;  
			case "/":sol=(int)st.pop()/(int)st.pop();
			st.push(sol);
			break; 
			default:st.push(Integer.parseInt(string));
			break;

			}

		}
		System.out.println(sol);
		sc.close();
	}
}

