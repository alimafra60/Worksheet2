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
public class revarr {
    public static void main(String[] args)
    {
        int a[]=new int[5];
        int i;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=obj.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter a number");
           a[i]=obj.nextInt();
        }
        System.out.println("Original Array is:");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" " );
        }
        System.out.println("\n");
        System.out.println("The reversed array is:");
        for(i=n-1;i>=0;i--)
        {
            System.out.print(a[i]+" " );
        }
         System.out.println("\n");        
    }
    
}
