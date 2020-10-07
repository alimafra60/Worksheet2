/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iohandling;

import java.io.File;

/**
 *
 * @author Hi
 */
public class Ex10Qn2 {
    public static void main(String[] args)
    {
        File f=new File("C:\\Users\\Hi\\Documents\\NetBeansProjects\\IOHandling\\src\\iohandling\\two.java");
        System.out.println("Existence of file-->"+f.exists());//check whether the file exists
       
       boolean r=f.canRead();
       boolean w=f.canWrite();
 
       if(r==true &&w==false)//to check whether the file is readable or writable
           System.out.println("The file is readable");
       else if(r==false && w==true)
           System.out.println("The file is readable");
        else
           System.out.println("The file is both readable and writable");
       String s=f.getName();
       int i=s.indexOf(".");
       System.out.println("The type of file is-->"+s.substring(i+1));
       
   
       System.out.println("The length of the file is:"+f.length());//to find the length of the file
    }
    
}
