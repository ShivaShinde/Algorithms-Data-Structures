public class Stack {
	private int[] a;
	private int top;
	int i;
	int k;
	public Stack(int k)
	{
		a= new int[k];
		top = -1;
		i=0;
	}
	public void push(int x)
	{
		a[++top]=x;
	}
	
	public int pop()
	{
		return a[top--];
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	public boolean isFull()
	{
		return (top == k-1);
	}
	
	public int peek()
	{
		return a[top];
	}

	public static void main(String[] args) {
		Stack obj = new Stack(8);
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		
		while(!obj.isEmpty())
		{
			int value = obj.pop();
			System.out.println(value);
		}
	}

}
