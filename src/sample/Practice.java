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
                import java.lang.*;
                import java.util.*;
                

public class Practice {
                            int[] source1;
                            int[] source2;
                            int[] destination;
                            int i;
                            int n;
                            int c;
                            
                            
                            public Practice()
                                {
       
                                    source1 = new int[10];
                                    source2 = new int[10];
                                    destination = new int[20];
                                    n = 0;
        
                                }
    
                            
                            void array1(int key)
                                {
                                    int j;
                                    
                                    for(j=0;j<n;j++)
                                        {
                                            if(source1[j]>key) 
                                            {
                                              break;
                                            }
                                        }
                                                                                       
                                    for(int k=n;k>j;k--)
                                        {
                                            source1[k]=source1[k-1];
                                        }
                                    
                                    source1[j]=key;
                                    n++;
                                }
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            void insert(int key)
                            {
                                    if(source1[0]==0 && n==0)
                                            {
                                                source1[0]=key;
                                                n++;
                                            }
                                    else if (source1[1]==0)
                                            {
                                                if(source1[0]>key)
                                                    {
                                                        source1[1]=source1[0];
                                                        source1[0]=key;
                                                        n++;
                                                    }
                                                else
                                                    {
                                                        source1[1]=key;
                                                        n++;
                                                    }
                                            }
                                    else
                                            {
                                                int lowerbound =0;
                                                int upperbound = n-1;
                                
                                                    shiva: while(true)
                                                                    {
                                                                        c = (lowerbound + upperbound)/2;
                                    
                                                                        if(c==0 && source1[c]>key)
                                                                                add(key);
                                                                        else if(c==0 && source1[c]<key)
                                                                                lowerbound = c+1;
                                                                        else
                                                                                {
                                                                                    if(source1[c]>key && source1[c-1]<key || source1[c-1] == 0)
                                                                                            add(key);
                                                                                    else
                                                                                            {
                                                                                                if(source1[c]>key)
                                                                                                upperbound = c-1;
                                                                                            }
                                                
                                    
                                    
                                                                                   if(source1[c]<key && source1[c+1]>key || source1[c+1] == 0)
                                                                                            {
                                                                                                if(source1[c+1]==0)
                                                                                                    {
                                                                                                        source1[c+1]=key;
                                                                                                        n++;
                                                                                                        break shiva;
                                                        
                                                                                                    }
                                                                                                else
                                                                                                    {
                                                                                                        for(int k=n;k>c;k--)
                                                                                                            {
                                                                                                                source1[k]=source1[k-1];
                                                    
                                                                                                            }
                                                                                                                source1[c+1]=key;
                                                                                                                System.out.println("Key Inserted");
                                                                                                                n++;
                                                                                                                break shiva;
                                                    
                                                                                                    }
                                                    
                                                                                            }
                                                                                    else
                                                                                            {
                                                                                                if(source1[c]<key)
                                                                                                lowerbound = c+1;
                                                                                            }
                                                                                }
                                                    
                                            
                                            
                                            
                                                                   }
                                }
                            }
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            void add(int key)
                            {
                              for(int k=n;k>c;k--)
                                {
                                                        source1[k]=source1[k-1];
                                                    
                                                        }
                                                        source1[c]=key;
                                                        System.out.println("Key Inserted");
                                                        n++;
                                                          
                            }
                            
                            
                            void display()
                            {
                                for(i=0;i<10;i++)
                                {
                                    System.out.println(source1[i]);
                                }
                            }
                            
                            
                            void merge()
                                {
        
                                    
                                }
                            
                            
                            public static void main(String args[])
                                
                            
                                {
                                    
                                    
                                    Practice obj = new Practice();
                                    obj.insert(25);
                                    obj.insert(43);
                                    obj.insert(1800);
                                    obj.insert(9);
                                    obj.insert(10);
                                    obj.insert(15);
                                    obj.insert(18);
                                    obj.insert(19);
                                    obj.insert(0);
                                    obj.insert(1500);
                                    obj.display();
                                    

                                    
                                }
    
}
