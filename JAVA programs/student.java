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
public class student {
    public static void main(String[] args)
    {
        stud obj[]=new stud[2];//creating array of objects.
        for(int i=0;i<2;i++)
        {
               obj[i]=new stud();//allocating memory for each object
               obj[i].inputs();
               obj[i].calc();
               obj[i].display();
        }
        //obj.inputs();
        //obj.calc();
        //obj.display();
        
    }
    
}
class stud
{
    String name,dept,status;
    double m1,m2,m3,avg;
    void inputs()
    {
       Scanner obj=new Scanner(System.in); 
       name=obj.next();
       dept=obj.next();
       m1=obj.nextDouble();
       m2=obj.nextDouble();
       m3=obj.nextDouble();
    }
    void calc()
    {
        avg=(m1+m2+m3)/3;
        if(m1<50 || m2<50 ||m3<50)
           status="fail";
        else
        {
            if(avg>=80)
              status="First class";
            else if(avg>=70 && avg<=79)
               status="Second class";
            else if(avg>=50 && avg<=69)
                status="Third class";
            
                       
        }
    }
    void display()
    {
        System.out.println("\nName:"+name+"\nDept:"+dept+"\nMark 1:"+m1+"\nMark 2:"+m2+"\nMark 3:"+m3+"\nAverage:"+avg+"\nStatus:"+status);
    }
    
}
