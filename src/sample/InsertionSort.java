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
public class InsertionSort {
	
	int i;
	int j;
	int n;
	int k;
	int small;
	int[] a;
	int temp;
	int p;
	
	public InsertionSort()
	{
		a = new int[10];
		n=0;
		a[0] = 225;
		a[1] = 50;
		a[2] = 125;
		a[3] = 2;
		a[4] = 15;
		a[5] = 5;
		a[6] = 245;
		a[7] = 2500;
		a[8] = 50;
		a[9] = 0;
                n=10;
	}
	
	void Insertion()
	{
			
		for(i=1;i<10;i++)
			{
                            temp = a[i];
                            for(j=i;j>0;j--)
                            {
                                if(a[j-1]>temp)
                                    a[j]=a[j-1];
                                else 
                                    break;
                            }
                            a[j]=temp;
                        }
				
                            
                            
                            
                            /* for(j=0;j<9;j++)
				{
                                        if(a[j]>a[j+1])
					small=j+1;
                                        
                                        temp=a[small];
				
				for(k=small-1;k>0;k--)
				{
					if(a[small]>a[k])
					break;
                                        if(k==0)
                                            break;
                                        
                                }
				
                                for(p=small;p>k;p--)
				{
					a[p]=a[p-1];
                                
                                        if(p==0)
                                            break;
				}
                                if(j==0)
                                    a[k]=temp;
                                else
                                a[k+1]=temp;
				
                                
                                
                                }*/
                        
			
		
	}
        void median()
        {
            int m=0;
            m = (0+n-1)/2;
            System.out.println(a[m]);
        }
        void noDups()
        {
            int q;
            int r;
            int x;
            for(int s=0;s<10;s++)
            {
                int p=0;
                temp=a[s];
                
            for(r=0;r<10;r++)
            {
                if(a[r]==temp)
                {
                    p++;
                    x=p;
                    
                }
        
            }
            }
            }
		
	void display()
	{
		for(i=0;i<10;i++)
			System.out.println(a[i]);
	}

	public static void main(String[] args) 
	{
		InsertionSort obj = new InsertionSort();
                obj.Insertion();
                obj.display();
                obj.noDups();
		obj.display();
		
		
                
	}

}
