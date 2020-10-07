/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iohandling;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/**
 *
 * @author Hi
 */
public class Ex10Qn1 {
        public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        DataInputStream ds=new DataInputStream(System.in);
        ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("student.txt"));
        System.out.println("No of Students:");
        int n= Integer.parseInt(ds.readLine());
        student s[]=new student[n];
        String name;
        String rollno;
        for(int i=0;i<n;i++)
        {
            System.out.println("Student name:");
            name = ds.readLine();
            System.out.println("RollNo:");
            rollno= ds.readLine();
            s[i]=new student(name.toLowerCase(),rollno.toLowerCase());
            obj.writeObject(s[i]);         
        }
        obj.close();
        ObjectInputStream obj1=new ObjectInputStream(new FileInputStream("student.txt"));
        while(n>0)
        {
            System.out.println(obj1.readObject());
            n--;
        }
        obj1.close();
        
    }
    
}

class student implements Serializable
{
    String name;
    String rollno;
    student(String n,String p)
    {
        name =n;
        rollno=p;
    }
    public String toString()
    {
        return "Student Name:"+name+"RollNo:"+rollno;
    }
}
    

