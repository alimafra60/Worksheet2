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
public class split {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n=obj.nextInt();
        int r,i = 0,j;
        int a[]=new int[10];
        while(n!=0)
        {
          r=n%10;
          a[i]=r;
          n=n/10;
          i++;
        }
        System.out.println("The splitted numbers are");
        for(j=i-1;j>=0;j--)
        {
            System.out.println(a[j]);
        }
        
        
    }
}
