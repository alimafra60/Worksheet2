/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi
 */
import bookpack.bookdemo;
import journalpack.journaldemo;
import java.util.Scanner;
public class bookjournalrecords {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
      bookdemo obj=new bookdemo();
      journaldemo obj1=new journaldemo();
      System.out.println("*****Welcome Student*****");
      System.out.println("Enter the no of book to view the details");
      int n=sc.nextInt();
      obj.display(n);
      System.out.println("Enter the no of journal to view the details");
      int j=sc.nextInt();
      obj1.display(j);
        System.out.println("*****Welcome Staff*****");
      System.out.println("Enter the no of book to view the details");
      int b=sc.nextInt();
      obj.display(b);
      System.out.println("Enter the no of journal to view the details");
      int j1=sc.nextInt();
      obj1.display(j1);
      
              
    }
    
}
