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
public class BinaryArray {
    private int n;
    private long[] a;
        public BinaryArray()
        {
        a = new long[100];
        n = 0;
        
        }
        public int size()
        {
            return n;
        }
            public void insert(long value)
            {
            int j;
                for(j=0;j<n;j++)
                {
                if(a[j]>value)
                break;
                }
                    for(int k=j;k<n;k++)
                    {
                    a[k]=a[k-1];
                    }
                    a[j]=value;
                    n++;
                      }
                public void find(long searchKey)
                {
                int c;
                int lowerbound = 0;
                int upperbound = n-1;
                System.out.println(n);
                while(true)
                {
                    c = (lowerbound + upperbound)/2;
                    if (a[c]==searchKey)
                    
                    System.out.println("found");
                    
                    
                    
                    else if(lowerbound>upperbound)
                        System.out.println("not found");
                    else
                    {
                          if(a[c] < searchKey)
                            {
                            lowerbound = c+1;  
                            }
                            else
                            {
                            upperbound = c-1;  
                            }
                    }
                
                    
                }
                }
                        public void delete(long del)
                        { int j;
                           for(j=0;j<n;j++)
                           {
                               if(a[j] == del)
                                   break;
                           }
                           for (int k=j;k<n-1;k++)
                           {
                               a[k] = a[k+1];
                               
                           }
                           n--;
                        }
                            public void display()
                            {
                              for(int i=0;i<n;i++)
                              {
                                  System.out.println(a[i]);
                              }
                            }
}

   class BinaryArray1 {
       
    
   public static void main(String args[])
   {
    BinaryArray arr = new BinaryArray();
    arr.insert(10);
    arr.insert(20);
    arr.insert(30);
    arr.insert(40);
    arr.insert(50);
    arr.insert(60);
    arr.insert(70);
    arr.insert(80);
    arr.insert(90);
    arr.insert(100);
    arr.find(30);
    
    /* int searchKey = 30;
    
    
    if(arr.find(searchKey)!= arr.size())
    System.out.println("Found" + searchKey);
    else 
        System.out.println("Can't find" + searchKey); */
    
    
    
    
      
   }
   }                         




        
             
         
        
         
     
    
    
    

