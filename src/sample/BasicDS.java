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
import java.util.*;
import java.lang.*;
public class BasicDS {
    Integer[] a = new Integer[10];
    int i; int k; int j; 
    int n=0;
    void insert()
        {
        
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;
        a[5] = 5;
        a[6] = 6;
        a[7] = 7;
        a[8] = 8;
        a[9] = 9;
        n=10;
        
    }
        void search()
        {
           int key = 5;
           for(i=0;i<10;i++)
           {
           if (key == a[i])
               break;
           }
              
           if(i==9)
               System.out.println("Key not found");
           else
               System.out.println("Key is found" +key);
               
           
        }
        void delete(int del)
        {
            
            
            for(j=0;j<10;j++)
            {
                if(a[j] == del)
                    break;
            }
            for(k=j;k<9;k++)
            {
                a[k] = a[k+1];
                
            }
            n--;
            System.out.println(n);
            System.out.println(a[6]);
            
            
        }
            
            
        
    
    
    public static void main(String args[])
    {
        BasicDS ds = new BasicDS();
        ds.insert();
        ds.search();
        ds.delete(6);
        
        
    }
}
