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
public class sum1 {
    public static void main(String[] args)
    {
        /*int a,b,c;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter A snd B");
        a=obj.nextInt();
        b=obj.nextInt();
        c=a+b;
        System.out.println("The sum is:"+c);*/
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=obj.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum is:"+sum);
    }
    
}
