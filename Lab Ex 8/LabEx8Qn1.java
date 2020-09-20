/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex5;
import java.util.Scanner;

/**
 *
 * @author Hi
 */
public class LabEx8Qn1 {
    public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter Username:");
    String username=obj.next();
    System.out.println("Enter Password:");
    String password=obj.next();
    System.out.println("Entered Username:"+username);
    System.out.println("Entered Password:"+password);
    
        if(username.equals(password))
        {
            System.out.println("*****The Entered Username and Password are Equal*****");
            String con=username+password;
            System.out.println("Concatenating Username and Password:"+con);
        }
        else
            System.out.println("The Entered Username and Password are not Equal");
    
  }   
}

