import java.util.Scanner;


import java.util.Vector;

public class Solution {
	
	    

	public static String toStr(Vector<Integer> l) {
		return "Solution [l=" + l + "]";
	}
		public static Vector numberToDigits(int number) {
	    	Vector<Integer> l=new Vector<Integer>();
	    	for(int i=0;i<number;i++)
	    	{
	    	
	    		l.add(i,i);
	    		
	    	}
	    		
	    return l;
	    }
	    public static Boolean isOneLeft(Vector l) {
	    	int size=0;
	    	for(int i=0;i<l.size();i++)
	    	{int x=(Integer)l.get(i);
	    	if(x!=-1)
	    		size++;
	    		
	    	}
	    		
	    return (size==1);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int p = 0;
		while (p < n) {
			int num = sc.nextInt();
			int m = sc.nextInt();
			Vector<Integer> l = numberToDigits(num);
			// System.out.println("m="+m+toStr(l));
			int i = 0;
	        m=m-1;
			while (l.size() != 0) {
				
				while ((i = i + m) < l.size()) {

					if(l.size()!=1)
						System.out.print(l.remove(i) + " ");
	                    else
	                    	System.out.print(l.remove(i) );

				}
			//	System.out.println("i" + i);
				
				

				if (i >= l.size() && l.size() != 0) {

					i = ((i) % l.size());

					
                    if(l.size()!=1)
					System.out.print(l.remove(i) + " ");
                    else
                    	System.out.print(l.remove(i) );
                    	

				}
				
			}
			System.out.println();
			p++;
		}

	}
	}
