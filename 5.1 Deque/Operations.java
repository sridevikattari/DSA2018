
public class Operations {
	Node head;
public void pushRight(int num)
{
	Node n=new Node(num);
	if(head==null)
	{
		head=n;
	}
	if(head.next==null)
	{
		head.next=n;
	}
	Node temp=head;
	while(temp.next!=null)
	{
		temp=temp.next;
	}
	temp.next=n;
}
public void pushLeft(int num)
{
	Node n=new Node(num);
	Node temp;
	if(head==null)
	{
		head=n;
	}
	n.next=head;
	n=head;
}
public int popRight()
{
	if(head==null)
	{
		System.out.println("list is empty");
		return -1;
	}
	if(head.next==null)
	{
		head=null;
		return -1;
	}		
	Node temp=head;
	while(temp.next.next!=null)
	{
		temp.next=temp;
	}
	temp.next=null;
	return -1;
}
public int popLeft()
{
	if(head==null)
	{
		System.out.println("list is empty");
		return -1;
	}
	if(head.next==null)
	{
		head=null;
		return -1;
	}
	head=head.next;
	return -1;
}
public int size()
{
	Node temp=head;
	int count=1;
	while(temp!=null)
	{
		temp=temp.next;
		count++;
	}
	
	return count;
}
}
