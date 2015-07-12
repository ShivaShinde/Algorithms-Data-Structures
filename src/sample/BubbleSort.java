/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author Shivasai
 */
    
public class BubbleSort 
{
    
	int i;
	int j;
	int n;
	long temp;
	long[] a;
        int k;
	
        public BubbleSort(int max)
	{
		a = new long[max];
		n=10;
		a[0] = 225;
		a[1] = 50;
		a[2] = 125;
		a[3] = 2;
		a[4] = 15;
		a[5] = 5;
		a[6] = 250;
		a[7] = 251;
		a[8] = 85;
		a[9] = 0;
		
        }
        
        void insert(long m)
        {
            for(i=0;i<m;i++)
            {
                a[i]= m;
            }
            n++;
        }
	
        void bubble()
	{
                for(int i=0;i<n;i++)
                    {
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
                        }
                        for(k=n-1;k>0;k--)
			{
				if(a[k]<a[k-1])
				{
					temp = a[k];
					a[k]=a[k-1];
					a[k-1]=temp;
					
				}
                        }
                        
                    }
		
	}
	
        void display()
	{
		for(i=0;i<n;i++)
			System.out.println(a[i]);
	}

	
        public static void main(String[] args) 
        {
                
		BubbleSort obj = new BubbleSort(10000);
                obj.bubble();
                obj.display();
                
                
                /*for(int j=0;j<max;j++)
                {
                    long m=(long)(java.lang.Math.random()*(max-1));
                    obj.insert(m);
                    obj.display();
		
                }*/
                
	}

}

    

