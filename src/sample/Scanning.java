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
import java.io.*;
import java.util.*;
public class Scanning 
{
    
   public static void main(String[] args) throws FileNotFoundException
   {
    String s; 
            int n=0;
       File a;
       a = new File("C:\\Users\\Shivasai\\Desktop\\first.txt");
    
    
    Scanner shiva;
    shiva = new Scanner(a);
    
    while(shiva.hasNext())
    {
            s = shiva.next();
            System.out.println(s);
        
    }
        
    System.out.println("Its done");
    
        
   }
    
}
