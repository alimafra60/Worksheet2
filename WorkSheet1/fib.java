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
public class fib {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int a=0,b=1,n,i,c;
        System.out.println("Enter limit");
        n=obj.nextInt();
        System.out.println("Fibonacci Series is:");
        for(i=0;i<n;i++)
        {
           System.out.println(a);
           c=a+b;
            a=b;
            b=c;
            
        }
        
        
    }
    
}
