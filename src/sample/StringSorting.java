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
public class StringSorting 
{
    
    private final String Last;
    private final String First;
    private final int age;
    
    public StringSorting(String Lastname, String Firstname, int year)
    {
    Last = Lastname;
    First = Firstname;
    age = year;
    }
    
    public void display()
    {
        System.out.println("LastName is: " +Last);
        System.out.println("FirstName is: " +First);
        System.out.println("Years is: " +age);
    }
    
    public String getLast()
    {
        return Last; 
    }

    
}
class Sort
{
    private StringSorting[] a;
    int n;
    int i;
    int j;
    int k;
    StringSorting temp;
    public Sort(int max)
    {
        a = new StringSorting[max];
        n=0;
    }
    
    void insert(String Lastname, String Firstname, int year) 
    {
     a[n] = new StringSorting(Lastname, Firstname, year);
     n++;
    }
    
    void insertionSort()
    {
        for(i=1;i<10;i++)
        {
                temp = a[i];
                for(j=i;j>0;j--)
                    {
                        if(a[j-1].getLast().compareTo(temp.getLast())>0)
                        a[j]=a[j-1];
                        else 
                            break;
                    }
                        a[j]=temp;
        }
    }
    
    void displayA()
    {
        for(i=0;i<n;i++)
        {
            a[i].display();
        }
    }
    
    void find(String Lastname)
    {  
        int lb = 0;
       int ub =n-1;
       
   while(true)
   {
       int c = (lb+ub)/2;
       
       if(a[c].getLast().equals(Lastname))
       {
           System.out.println("Key Found");
           break;
       }
       else if(lb>ub)
       {
               System.out.println("Key not found");
       break;
       }
        else
               {
                       if(a[c].getLast().compareTo(Lastname)>0)
                       {
                          lb=c+1; 
                       }
                       else
                           ub=c-1;
                           
                       }
           
   }
    }
    
}

class SortApp 
{
    
    public static void main(String args[])
    {
    Sort i = new Sort(20);
    i.insert("Bhai", "Shiva", 24);
    i.insert("Chintu", "Sainik", 24);
    i.insert("Qureshi", "Sindhe", 24);
    i.insert("Pintu", "Sarvesh", 24);
    i.insert("Samanth", "kumar", 24);
    i.insert("Ishaan", "kaveri", 24);
    i.insert("Xindo", "Sagar", 24);
    i.insert("Zebra", "Tendulkar", 24);
    i.insert("Agnesh", "niranjan", 24);
    i.insert("Nikhil", "Suresh", 24);
    i.displayA();
    i.find("arthi");
    i.insertionSort();
    i.displayA();
    }
    
    
}
