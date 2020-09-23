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
public class LabEx9Qn2 {
    public static void main(String[] args)
    {
      banktransaction obj=new banktransaction();
      try
      {
          obj.check();
      }
      catch(PinException e)
      {
          System.out.println("Error: "+e);
      }
    }
      
}

    
    

class banktransaction
{
    void check() throws PinException
    {
      System.out.println("Insert Your Card");
      System.out.println("Welcome! S.MOHAMED ALIM");
      System.out.println("Enter Your PIN");
      Scanner sc=new Scanner(System.in);
      String pin=sc.next();
      if(pin.length()==4)
      {
          System.out.println("Enter Amount to Debit");
          int amount=sc.nextInt();
          System.out.println("Please Collect Cash Before Leaving the Bank");
          System.out.println("*****Transaction Successful*****");
          System.out.println("### Have A Nice Day ###");
         
      }
      else
      {
        throw new PinException("Invalid Password");
      }
    }
}
 class PinException extends Exception
            {
               String pin;
               PinException(String pin1)
               {
                   //pin=pin1;
                   super(pin1);
               }
               /*public String toString()
               {
                   return pin;
               }*/
            }

