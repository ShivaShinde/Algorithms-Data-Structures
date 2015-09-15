class Link
{
	public int id;
	public double d;
	Link next;
	Link first = null;
	
	public Link(int x, double y)
	{
		id = x;
		d = y;
	}
	
	public void insertFirst(int x, double y)
	{
		Link newLink = new Link(x, y);
		newLink.next = first;
		first = newLink;
	}
	
	public Link remove()
	{
		Link temp = first;
		first = first.next;
		return first;
	}
	
	public boolean isEmpty()
	{
		return first == null;
	}
	
	void displayEle()
	{
		System.out.println("the integer is:" +id +"and" + "/n"  + "the double is:" +d);
	}
	
	void displayList()
	{
		Link current = first;
		while(!isEmpty())
		{
			if(current == null)
			{
				break;
			}
				else
				{
			current.displayEle();
			current = current.next;
				}
			
		}
	}
	
	void display()
	{
		System.out.println("This is updated:");
	}
	
	
	
}


public class SimpleLinkedList {
	
	
	
	public static void main(String[] args) {
		
		Link obj = new Link(3, 5.5);
		obj.insertFirst(10, 2.33);
		obj.insertFirst(20, 4.33);
		obj.insertFirst(30, 6.33);
		obj.insertFirst(40, 8.33);
		
		obj.remove();
		
		obj.displayList();
		
		

	}

}
