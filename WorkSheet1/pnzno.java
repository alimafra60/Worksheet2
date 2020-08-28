/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author Hi
 */
public class pnzno {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int pos_count=0,neg_count=0,zero_count=0;
        for(int i=0;i<5;i++)
        {
          System.out.println("Enter a number");
          int n=obj.nextInt();
          if(n>0)
              pos_count++;
          if(n<0)
              neg_count++;
          if(n==0)
              zero_count++;
          
              
        }
         System.out.println("Positive numbers:"+pos_count);
          System.out.println("Negative numbers:"+neg_count);
           System.out.println("Zeros:"+zero_count);
    }     
        
    
}
