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
public class pow {
    public static void main(String[] args)
    {
        /*Scanner obj=new Scanner(System.in);
        double num,power,result;
        System.out.println("Enter a Number");
        num=obj.nextInt();
        System.out.println("Enter a Number");
        power=obj.nextInt();
        result=Math.pow(num,power);
        System.out.print("The power of given no is:"+result);*/
        int number=3,pow=2,sum=1;
        for(int i=0;i<pow;i++)
            
        {
            sum=sum*number;
        }
        System.out.println("The power is:"+sum);
        
    }
    
}
