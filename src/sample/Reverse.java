import java.io.*;
public class Reverse {
	private char[] a;
	int top;
	int j;
	public Reverse()
	{
		a = new char[20];
		top = -1;
	}
	
	public void push(char x)
	{
		if(!isFull())
			{
			a[++top]=x;
			}
		else
			System.out.println("Stack is full");
	}
	public char pop()
	{
		return a[top--];
	}
	public char peek()
	{
		return a[top];
	}
	public boolean isEmpty()
	{
		return (top == -1);
	}
	public boolean isFull()
	{
		return (top == 19);
	}

	public static void main(String[] args) throws IOException
	{
		Reverse obj = new Reverse();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s=br.readLine();
		System.out.println(s.length());
		
		int j=0;
		while(j<s.length())
		{
			obj.push(s.charAt(j));
			System.out.println("working");
			j++;
			
		}
		while(!obj.isEmpty())
		{
			char c = obj.pop();
			System.out.println(c);
		}
		
	}

}
