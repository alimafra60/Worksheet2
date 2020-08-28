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
public class cgpa {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        double g[]=new double[100];
        double c[]=new double[100];
        System.out.println("Enter no of subjects");
        int n=obj.nextInt();
        double sum=0,csum=0;
        for(int i=0;i<n;i++)
        {
          System.out.println("Enter grade and credit for subject"+(i+1));
          g[i]=obj.nextDouble();
          c[i]=obj.nextDouble();
          sum=sum+(g[i]*c[i]);
          csum=csum+c[i];
        }
        System.out.println("CGPA is:"+sum/csum);
        
    }
    
}
