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
        


                public class High 

                {
                    int n=0;
                    private long[] a = new long[100];
                    private long[] b = new long[100];
                    int i,j,k;
                    int p=0;
    
                    void insert(long x)
                        {
                            a[n] = x;
                            n++;
                        }
       
                    
    
                    void search(long key)
                        {
                            for(j=0;j<10;j++)
                                {
                                    if (a[j] == key)
                                        {
                                            System.out.println(a[j]);
                                                break;
                                        }
                                    
                                }
                            if (n==j)
                            System.out.println("key is not found");
                            else 
                            System.out.println("Key is found");
                        }
    
    
     
                    void delete(long del)
                        {
                            for(j=0;j<10;j++)
                                {
                                    if (a[j] == del)
                                    break;
                                }
                            for(k=j;k<n-1;k++)
                                {
                                    a[k]=a[k+1];
                                }
                                    n--;
                            
                        }
                    
     
                    long getMax()
                        {
                            long max;
                            max = a[0];
                            for(i=0;i<10;i++)
                                {
                                    if(a[i]==0)
                                    return -1;
                                    else
                                        {
                                            if(a[i]>max)
                                            max = a[i];
                                            else 
                                            continue;
                                        }
                                }
                            return max; 
                        }
     
        
                    void maxdelete()
                        {
                            for(j=0;j<10;j++)
                                {
                                    if (a[j] == getMax())
                                    {
                                        for(i=p;i<n;i++)
                                        {
                                            b[i]=getMax();
                                            p++;
                                            break;
                                        }
                                    break;
                                    }
                                }
                            
                            for(k=j;k<n;k++)
                                {
                                    a[k]=a[k+1];
                                }
                                n--;
                                  
                        }
     
                    void silver()
                    {
                        for(i=0;i<n;i++)
                      {
                          int q=0;
                      
                          for(j=0;j<n;j++)
                          {
                              if(a[i]==a[j])
                              {
                                  q++;
                              }
                              while(q>=2)
                              {
                                  a[j]=0;
                                  for(k=j;k<n-1;k++)
                                    {
                                  a[k]=a[k+1];
                                    }
                                  n--;
                                  break;
                                  
                              }
                              
                                  
                          }
                          
                      }
                      System.out.println(n);
                    }
     
                    void display()
                        {
                            for(k=0;k<n;k++)
                                {
                                    System.out.println(a[k]);
                                }
                        }
                    void display1()
                        {
                            for(k=0;k<10;k++)
                                {
                                    System.out.println(b[k]);
                                }
                        }
                }


                

                class HighApp
                    {
         
                    public static void main(String[] args)
                            {
                                   High obj = new High();
                                    
                                    obj.insert(1);
                                    obj.insert(2);
                                    obj.insert(3);
                                    obj.insert(4);
                                    obj.insert(5);
                                    obj.insert(4);
                                    obj.insert(4);
                                    obj.insert(8);
                                    obj.insert(9);                                    
                                    obj.insert(10);
                                    obj.silver();
                                    obj.display();
                                    
                                    /*obj.maxdelete();
                                    obj.display();
                                    obj.maxdelete();
                                    obj.display();
                                    obj.maxdelete();
                                    
                                    obj.display1();*/
                            }
                    }
                            
    
    
    

