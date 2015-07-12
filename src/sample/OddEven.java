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
public class OddEven {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
        int i;
	int j;
	int n;
	long temp;
        long dummy;
        long dolly;
	long[] a;
        int k;
	
        public OddEven(int max)
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
        void oddeven()
{
        int p,q,r,s, x, y, d, b;
        x=n/2;
        if(x%1==0)
        {
            y=x-1;
            for(r=0;r<y;r++)
        {
            for(s=0;s<y;s++)
            {
               b=2*s;
               if(a[b]>a[b+2])
               {
                   dolly=a[b];
                   a[b]=a[b+2];
                   a[b+2]=dolly;
               }
                   
            }
        }
            
            for(p=0;p<y;p++)
        {
            for(q=0;q<y;q++)
            {
               d=2*q+1;
               if(a[d]>a[d+2])
               {
                   dummy=a[d];
                   a[d]=a[d+2];
                   a[d+2]=dummy;
               }
                   
            }
        }
        }
        
        
        else if(x%1!=0)
        {
            if(x%2==0)
            {
                
                for(r=0;r<x;r++)
                {
                    for(s=0;s<x;s++)
                    {
                        b=2*s;
                        if(a[b]>a[b+2])
                        {
                            dolly=a[b];
                            a[b]=a[b+2];
                            a[b+2]=dolly;
                        }
                   
                    }
                }
            }
            
            if(x%2==1)
            {
                y=x;
                for(p=0;p<y;p++)
                {
                    for(q=0;q<y;q++)
                    {
                        d=2*q+1;
                        if(a[d]>a[d+2])
                        {
                            dummy=a[d];
                            a[d]=a[d+2];
                            a[d+2]=dummy;
                        }
                    }
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
                
		OddEven obj = new OddEven(10000);
                obj.oddeven();
                obj.display();
                
                
                /*for(int j=0;j<max;j++)
                {
                    long m=(long)(java.lang.Math.random()*(max-1));
                    obj.insert(m);
                    obj.display();
		
                }*/
                
	}

}

    



