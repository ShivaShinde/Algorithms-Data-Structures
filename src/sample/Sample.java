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
public class Sample {

    public static void main(String args[])
    {
        for(int row=0; row<10;  row++)
        {
            System.out.println();
            for(int col=0; col<10; col++)
            {
                if(col == (5 + row) || col == 5 - row || col == 5)
                {
                   System.out.print("*");
                }
                else
                {
                    System.out.print("-");
            
                }
            }
            
       
        }
            
               }
}

        



    

