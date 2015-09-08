class PQueue
{
	private int[] queue;
	private int front;
	private int rear;
	private int n;
	private int maxSize;
	
	public PQueue(int x)
	{
		maxSize = x;
		queue = new int[maxSize];
		front = -1;
		rear = 0;
		n = 0;
	}
	
	public void insert(int y)
	{
		int i;
		int k;
		int j=0;
		
		for(i=0;i<n;i++)
		{
			if(y>queue[i])
				break;
		}
		
		for(k=n;k>i;k--)
		{
			queue[k]=queue[k-1];
		}
		
		queue[k] = y;
		front = n;
		n++;
	}
	
	public int remove()
	{
		return queue[front--];
	}
	
	public int peek()
	{
		return queue[front];
	}
	
	public boolean isEmpty()
	{	
		return front==-1;
	}
	
	public boolean isFull()
	{
		return n==maxSize;
	}
	
}

public class PriorityQueue 
{
	public static void main(String[] args) 
	{
		PQueue obj = new PQueue(4);
		obj.insert(10);
		obj.insert(5000);
		obj.insert(30);
		obj.insert(10);
		int jira = obj.peek();
		
		
		
		System.out.println(jira);
		System.out.println();
		System.out.println();
		
		while(!obj.isEmpty())
		{
			int value = obj.remove();
			System.out.println(value);
			
			
		}
		
		
	}

}
