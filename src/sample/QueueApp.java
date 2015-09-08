class Queue
{
	private int[] queue;
	private int front;
	private int rear;
	private int n;
	int maxSize;
	
	public Queue(int x)
	{
		queue = new int[5];
		maxSize = x;
		front = 0;
		rear = -1;
		n = 0;
	}
	
	public void insert(int alpha)
	{
		if(isFull())
		{
			rear = -1;
		}
		queue[++rear]=alpha;
		n++;
	}
	
	public int remove()
	{
		if(front == maxSize)
		{
			front =0;
		}
		int temp = queue[front++];
		n--;
		return temp;	
	}
	
	public int peek()
	{
		return queue[rear]; 
	}
	
	public boolean isEmpty()
	{
		return (n == 0);
	}
	
	public boolean isFull()
	{
		return (rear == maxSize-1);
	}
	public void display()
	{
		
	}
	
}
public class QueueApp {

	public static void main(String[] args) {
		
		Queue obj = new Queue(5);
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		obj.insert(40);
		obj.insert(50);
		
		obj.remove();
		obj.remove();
		obj.remove();
		
		obj.insert(60);
		obj.insert(70);
		obj.insert(80);
		
		int a=0;
		while(!obj.isEmpty())
		{
			int value = obj.remove();
			System.out.println(value);
		}
		
		
	}

}
