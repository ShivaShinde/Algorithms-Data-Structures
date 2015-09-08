class LinkList
{
	LinkList next;
	int id;
	double d;
	
	public LinkList(int x, double y)
	{
		id = x;
		d = y;
	}
	
	public void display()
	{
		System.out.println("The integer is:" +id +"The double is:" +d);
	}
	
	
}
class LinkBody{
	
	LinkList first = null;
	LinkList last = null;
	
	public void insertFirst(int x, double y)
	{
		LinkList newLink = new LinkList(x, y);
		if(last == null)
			last = newLink;
		newLink.next = first;
		first = newLink;
		
	}
	
	public void insertLast(int x, double y)
	{
		LinkList newLink = new LinkList(x, y);
		if(last == null){
			first  = newLink;}
			else{
				last = newLink;
			}
		last.next = newLink;
		last = newLink;
	}
	
	
	
	public boolean isEmpty()
	{
		return (first == null);
	}
	
	
	
	
}
public class DoubleEnded {

}
