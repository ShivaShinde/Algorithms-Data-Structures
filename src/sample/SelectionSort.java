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
public class SelectionSort {
	
	int i;
	int j;
	int n;
	int small=0;
	int[] a;
	int temp;
	
	public SelectionSort()
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
		a[8] = 85;
		a[9] = 0;
	}
	
	void selection()
	{
		
		for(i=0;i<10;i++)
		{
                    small=i;
			for(j=i;j<9;j++)
			{
				if(a[small]>a[j+1])
				{
				small=j+1;
				}
			}
			temp = a[i];
			a[i]=a[small];
			a[small]=temp;
                        
		}
	}
		
	void display()
	{
		for(i=0;i<10;i++)
			System.out.println(a[i]);
	}

	public static void main(String[] args) 
	{
		SelectionSort obj = new SelectionSort();
		obj.selection();
		obj.display();
		SelectionSort fun = new SelectionSort();
		
	}

}
