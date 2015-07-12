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
public class Insertion {
    private int[] a;
    int n;
    int c;
    
    public Insertion()
    {
        a = new int[10];
        n=0;
    }
    
    int find(int key)
    {
        int lowerbound = 0;
        int upperbound = n-1;
        
        while(true)
        {
            c = (lowerbound + upperbound)/2;
            if(n==0)
                return 0;
            if(lowerbound>=upperbound)
            {
                if(a[c]<key)
                    return c++;
                else
                    return c;
            }
            if(a[c]>key && a[c-1]<key)
                return c;
            else if (a[c]<key && a[c+1]>key)
                return c++;
            else
            {
                if(a[c]>key)
                    upperbound = c-1;
                else
                    lowerbound = c+1;
            }
        }
    }
    
    void insert(int key)
    {
       find(key);
       for(int k=n;k>c;k--)
       {
           a[k]=a[k-1];
       }
       a[c]=key;
       n++;
    }
    void display()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
    
    public static void main(String[] args)
    {
        Insertion i=new Insertion();
        i.insert(56);
        i.insert(1);
        i.insert(78);
        i.insert(3);
        i.insert(4);
        i.insert(200);
        i.insert(6);
        i.insert(7);
        i.insert(1000);
        i.insert(9);
        i.display();
    }
}
