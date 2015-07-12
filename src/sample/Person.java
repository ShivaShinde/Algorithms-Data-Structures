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
public class Person {
    private String lastName;
    private String firstName;
    private int age;
    public Person(String last, String first, int year)
    {
     lastName = last;
     firstName = first;
     age = year;
    }
    public void display()
    {
        System.out.println("First Name" + firstName);
        System.out.println("Last Name" + lastName);
        System.out.println("age is" + age);
        
    }
    
    public String getLast()
    {
        return lastName;
    }
}

class ClassArray 
{
    int n;
    private Person[] a;
    public ClassArray(int max)
    {
        a = new Person[max];
        n = 0;
    }
    public Person find(String searchKey)
    {
        int j;
        for (j=0;j<n-1;j++)
        {
            if( a[j].getLast().equals(searchKey)) 
            break;
        }
            
            if(j==n)
            return null;
        
            else 
           return a[j];
            
        
        
    }
    public void insert(String last, String first, int age)
    {
        a[n] = new Person(last, first, age);
             n++;
   
    }
    
   public boolean delete(String searchKey)
    {
      int j;
        for (j=0;j<n;j++)
        
            if( a[j].getLast().equals(searchKey)) 
            break;
        
            if(j==n)
                return false;
            else
            {
                for(int k=j;k<n;k++)
                    
                        a[k]=a[k+1];
                        n--;
                        return true;
                    
                
            }
            
        
    }
    
    public void displayA()
    {
        for(int i=0;i<n;i++)
        {
            a[i].display();
                    }
    }
           
           
           
           
}        
class App
{
    public static void main(String args[])
    {
    int max = 100;
    ClassArray arr = new ClassArray(max);
    
    arr.insert("Sai", "Shiva", 24);
    arr.insert("Sai", "Shiva", 24);
    arr.insert("Sai", "Shiva", 24);
    arr.insert("Sai", "Shiva", 24);
    arr.insert("Sai", "Shiva", 24);
    arr.insert("Sai", "Shiva", 24);
    arr.insert("Sai", "Shiva", 24);
    arr.insert("Sai", "Shiva", 24);
    arr.insert("Sai", "Shiva", 24);
    arr.insert("Sai", "Shiva", 24);
    
    String searchKey = "Sai";
    Person found;
    found = arr.find(searchKey);
    if(found != null)
    {
        System.out.println("Found");
        found.display();
    }
    else
        System.out.println("Key not found");
    
    }
}