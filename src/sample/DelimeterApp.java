import java.io.*;
class StackX
{   
	private char[] s;
	private int top;
	int maxSize;
	
		
		public StackX(int x)
		{
		maxSize = x;
		s = new char[x];
		int top = -1;
		}
		public void push(char p)
		{ s[++top]=p;}
		public char pop()
		{ return s[top--]; }
		public char peek()
		{ return s[top]; }
		public boolean isEmpty()
		{ return (top == -1); }
		public boolean isFull()
		{ return (top == (maxSize-1)); }
}




class Delimeter
{
	StackX exe = new StackX(10);
	private char output;
	
		void check(String input)
		{
			for(int j=0;j<input.length();j++)
			{
				char ch = input.charAt(j);
				switch(ch)
				{
					case '{': 
					case '[':
					case '(':
						exe.push(ch);
						break;
					case '}':
					case ')':
					case ']':
						output = exe.pop();
						if((output == '{' && ch != '}') || 
								(output == '(' && ch != ')') ||
								(output == '[' && ch != ']'))
							{
							System.out.println("Error: " +ch +"Missing at" +j);
							}
						else
							{
							System.out.println("Error: " +ch +"Not Missing here at" +j);
							}
					default:
						break;
				}
				System.out.println("2.Working");
			}
		}
}




public class DelimeterApp 
{
	public static void main(String[] args)throws IOException 
	{
		DelimeterApp d = new DelimeterApp();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		Delimeter obj = new Delimeter();
		System.out.println("3.Working");
		obj.check(input);
	}

}
