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
public class simcal {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Option");
        System.out.println("1.Additon\n2.Subraction\n3.Multiplication\n4.Division");
        int c=obj.nextInt();
        System.out.println("Enter two numbers");
        double a=obj.nextInt();
        double b=obj.nextInt();
        switch(c)
        {
            case 1:
            {
               System.out.println("The Addition is:"+(a+b));
               break;
            }
            case 2:
            {
               System.out.println("The Subraction is:"+(a-b));
               break;
            }
            case 3:
            {
               System.out.println("The Multiplication is:"+(a*b));
               break;
            }
            case 4:
            {
               System.out.println("The Division is:"+(a/b));
               break;
            }
        }
        
        
                
    }
    
}
