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
public class disc {
    public static void main(String[] args)
    {
        double amount,discount,amtper;
        System.out.println("Enter Amount:");
        Scanner obj=new Scanner(System.in);
        amount=obj.nextInt();
        System.out.println("Enter Discount:");
        discount=obj.nextInt();
        amtper=amount/100*discount;
        System.out.println("Amount to be paid:"+(amount-amtper));
        
        
        
        
    }
    
}
