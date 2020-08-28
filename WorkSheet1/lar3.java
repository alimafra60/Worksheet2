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
public class lar3 {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter three numbers");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        if(a>b && a>c)
            System.out.println("A is Greater...."+a);
        else if(b>c && b>a)
            System.out.println("B is greater...."+b);
        else
            System.out.println("C is greater...."+c);
               
        
        
    }
    
}
