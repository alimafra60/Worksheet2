/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi
 */
import java.util.Scanner;
import bookpack.bookdemo;
import journalpack.journaldemo;
public class bookdetails {
    public static void main(String[] args)
    {

        Scanner obj=new Scanner(System.in);
        System.out.println("*****Books and JOurnals Requested by the Student*****");
        System.out.println("Enter Book ID");
        int i=obj.nextInt();
        System.out.println("Enter Journal ID");
        int j=obj.nextInt();
        System.out.println("*****Books and JOurnals Requested by the Staff*****");
        System.out.println("Enter Book ID");
        int p=obj.nextInt();
        System.out.println("Enter Journal ID");
        int q=obj.nextInt();
        student ob1=new student(i,j);
        staff ob2=new staff(p,q);
        System.out.println("*****Details of Books and JOurnals Requested by the Student*****");
        ob1.getstudentinfo();
        System.out.println("*****Details of 1Books and JOurnals Requested by the Student*****");
        ob2.getstaffinfo();
    }
    
}
class student
{
    int bkid,jlid;
    bookdemo obj=new bookdemo();
    journaldemo obj1=new journaldemo();
    student(int b,int j)
    {
        bkid=b;
        jlid=j;
    }
    void getstudentinfo()
    {
        int flag=0;
        int flag1=0;
        for(int i=0;i<5;i++)
        {
            if(obj.bookid[i]==bkid)
            {
                flag=1;
                System.out.println("BOOK DETAILS :");
                obj.display(i);
            } 
        }
        if(flag==0)
        {
            System.out.println("Invalid book id");
        }
        for(int i=0;i<5;i++)
        {
            
            if(obj1.journalid[i]==jlid)
            {
                flag1=1;
                System.out.println("JOURNAL DETAILS :");
                obj1.display(i);
            } 
        }
        if(flag1==0)
        {
            System.out.println("Invalid journal id");
        }
    }
}
class staff
{
    int bkid,jlid;
    bookdemo obj2=new bookdemo();
    journaldemo obj3=new journaldemo();
    staff(int b,int j)
    {
        bkid=b;
        jlid=j;
    }
    void getstaffinfo()
    {
        int flag=0;
        int flag1=0;
        for(int i=0;i<5;i++)
        {
            if(obj2.bookid[i]==bkid)
            {
                flag=1;
                System.out.println("BOOK DETAILS :");
                obj2.display(i);
            } 
        }
        if(flag==0)
        {
            System.out.println("Invalid book id");
        }
        for(int i=0;i<5;i++)
        {
            
            if(obj3.journalid[i]==jlid)
            {
                flag1=1;
                System.out.println("JOURNAL DETAILS :");
                obj3.display(i);
            } 
        }
        if(flag1==0)
        {
            System.out.println("Invalid journal id");
        }
    }
}    
    
