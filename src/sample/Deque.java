class DoubleQueue
{
private int[] deque;
private int frontLeft;
private int frontRight;
private int rearLeft;
private int rearRight;
private int n;
private int maxSize;
private int max;
private int leftEle;
private int rightEle;

	public DoubleQueue(int x)
	{
		maxSize = x;
		deque = new int[maxSize];
		n=0;
		frontLeft = 0;
		frontRight = 9;
		rearLeft = maxSize-1;
		rearRight = -1;
		leftEle = 0;
		rightEle = 0;
	}
	
	public void insertLeft(int iL)
	{
		if(rearLeft == maxSize-1)
			
		deque[--rearLeft] = iL;
		n++;
		
	}
	
	public int removeLeft()
	{
		if(rearLeft == maxSize-1)
			rearLeft = -1;
		n--;
		return deque[++rearLeft];
	}
	
	public void insertRight(int iR)
	{
		deque[++rearRight] = iR;
		n++;
	}
	
	public int removeRight()
	{
		if(rearRight == -1)
			rearRight = maxSize-1;
		n--;
		return deque[rearRight--];
		
	}
	
	public boolean isFull()
	{
		return n==maxSize-1;
	}
	
	public boolean isEmpty()
	{
		return n==0;	}
	
	
}
public class Deque {

	public static void main(String[] args) {
		
		DoubleQueue obj = new DoubleQueue(10);
		
		obj.insertRight(10);
		obj.insertRight(20);
		obj.insertRight(30);
		obj.insertRight(40);
		int p=0;
		while(p<4)
		{
			int temp = obj.removeRight();
			System.out.println(temp);
			p++;
		}
		
		
		
	}

}
