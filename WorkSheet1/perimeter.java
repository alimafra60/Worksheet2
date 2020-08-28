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
public class perimeter {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter side of a square");
        float a=obj.nextFloat();
        System.out.println("Perimeter of square is:"+(4*a));
        
    }
    
}
