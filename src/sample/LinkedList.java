class Link
{
	protected int i;
	protected double d;
	protected Link next;
	
	public Link(int i, double d)
	{
		this.i = i;
		this.d = d;
	}
	
	public void display()
	{
		System.out.println("Integer value is: {" +i +"}" +" " +"double value is:{" +d +"}");
	}
	
}
class List
{
	protected Link first = null;
	
	public void insertFirst(int x, double y)
	{
		Link NewLink = new Link(x,y);
		NewLink.next = first;
		first = NewLink;
	}
	
	public Link remove()
	{
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayLink()
	{
		Link current = first;
		while(current != null)
		{
			current.display();
			current = current.next;
		}
	}
	
	public void linkFind(int key)
	{
		Link find = first;
		while(find != null)
		{
			if(find.i == key)
				{
				find.display();
				break;
				}
			else
			{
				find = find.next;
			}
		}
	}
	
	public void linkDelete(int key)
	{
		Link retainer = first;
		while(first != null)
		{
			if(first.next.i == key)
				{
					first.next.display();
					first.next = first.next.next;
					break;
				}
			else
				{
					first = first.next;
				}
			
		}
		first  = retainer;
	}
	
	
	public boolean isEmpty()
	{
		return first == null;
	}
	
}

public class LinkedList 
{
	public static void main(String args[])
	{
	List obj = new List();
	
	obj.insertFirst(3, 3.3);
	obj.insertFirst(4, 4.4);
	obj.insertFirst(5, 5.5);
	obj.insertFirst(6, 6.6);
	
	obj.displayLink();
	
	
	System.out.println("The element is here:");
	obj.linkFind(4);
	
	System.out.println("The element is deleted");
	obj.linkDelete(4);
	
	System.out.println("Linked Lisy after deletion");
	
	
	obj.displayLink();
	}
}

