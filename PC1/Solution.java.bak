import java.util.Scanner;

class Node {
	int data;
	Node next;

	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}

class LinkedList {
	Node head;

	LinkedList() {
		head = null;
	}

	public void pushFront(int ele) {
		Node n = new Node(ele);
		if (head == null)
			head = n;
		else {
			n.next = head;
			head = n;
		}

	}

	public void pushEnd(int ele) {
		Node n = new Node(ele);
		if (head == null)
			head = n;
		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = n;
		}

	}

	public int popFront() 
	{

		if (head == null)
		{
			//System.out.println("list is empty!!!");
			return -1;
		} 
		
		if (head.next == null) 
		{
			int ele = head.data;

			head = null;
			return ele;
		} 
		else
		{

			int ele = head.data;
			head = head.next;
			return ele;
		}
		
	}

	public int popEnd() 
	{

		if (head == null)
		{
			//System.out.println("list is empty!!!");
			return -1;
		} 
		else 
		if (head.next == null) 
		{
			int ele = head.data;

			head = null;
			return ele;
		} 
		else 
		{
			Node temp = head;
			while (temp.next.next != null) 
			{
				temp = temp.next;
			}
			int ele = temp.next.data;
			temp.next = null;
			return ele;
		}

	}

	public String disp() {
		Node temp = head;
		String s="";
		while (temp != null) {
			s+=temp.data;
			temp = temp.next;
		}
	
		return s;
	}

}

class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {
    	LinkedList l=new LinkedList();
    	for(int i=0;i<number.length();i++)
    	{
    	
    		l.pushEnd(Character.getNumericValue(number.charAt(i)));
    	}
    		
    return l;
    }

    public static String digitsToNumber(LinkedList list) {
   return list.disp();
    }

  public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) 
    {
    	int car=0;
    	LinkedList l=new LinkedList();
        while(list1!=null||list2!=null)
    	{  int l1=list1.popEnd();
    		
           int l2=list2.popEnd();
           if(l1==-1 && l2==-1)
        	 {l.pushFront(car);
        	   break;
           }
           if(l1==-1) l1=0;
   		
           if(l2==-1) l2=0;
           		
    	 	int sum=l1+l2+car;
    	 	
    	 	if(sum>=10)
    	 		{
    	 		car=sum/10;
    	 	    sum=sum%10;
    	 		}
    	 	
    	 	l.pushFront(sum);
    	}
    return l;
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                LinkedList pDigits1 = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits1 = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits1, qDigits1);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}