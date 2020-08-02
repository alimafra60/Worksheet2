/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet1;

import java.util.Scanner;

/**
 *
 * @author Hi
 */
public class Worksheet1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        test obj=new test();
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter a value:");
        int a=obj1.nextInt();
        System.out.println("Enter b value:");
        int b=obj1.nextInt();
        System.out.println("Addition:"+obj.add(a,b));
        System.out.println("Subraction:"+obj.sub(a,b));
        System.out.println("Multiplication:"+obj.mul(a,b));
        System.out.println("Division:"+obj.div(a,b));
        
        // TODO code application logic here
    }
    
}
class test
{
  //int a=10,b=20;
    int add(int a,int b)
    {
       return a+b;
    }
    int sub(int a,int b)
    {
        return a-b;
    }
    int mul(int a,int b)
    {
        return a*b;
    }
    int div(int a,int b)
    {
        return a/b;
    }
}
