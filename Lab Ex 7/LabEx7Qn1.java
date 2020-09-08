/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Hi
 */
public class LabEx7Qn1 {
    

    public static void main(String[] args)
    {
      ArrayList<Integer> list1=new ArrayList<>();
      ArrayList<Integer> list2=new ArrayList<>();  
      ArrayList<Integer> list3=new ArrayList<>();  
      int a,b;
      System.out.println("Enter the limit of list 1");
      Scanner obj=new Scanner(System.in);
      a=obj.nextInt();
      System.out.println("Enter the limit of list 2");
      b=obj.nextInt();
      System.out.println("Enter elements of list 1");
      for(int i=0;i<a;i++)
      {
          int s=obj.nextInt();
          list1.add(s);
      }
      System.out.println("Enter elements of list 2");
      for(int i=0;i<b;i++)
      {
          int s=obj.nextInt();
          list2.add(s);
      }
      Collections.sort(list1);
      Collections.sort(list2);
      System.out.println("The two lists after Sorting");
      System.out.println("List 1:"+list1); 
      System.out.println("List 2:"+list2); 
      intersect obj1=new intersect();
      list3=obj1.intersect(list1,list2,a,b);
      System.out.println("The List contains same elements in List-1 and List-2"+list3);
    }
    
}
class intersect
{
      ArrayList<Integer> l1=new ArrayList<>();
      ArrayList<Integer> l2=new ArrayList<>();  
      ArrayList<Integer> l3=new ArrayList<>();
      int x,y;
      ArrayList intersect(ArrayList list1,ArrayList list2,int a,int b)
      {
          l1=list1;
          l2=list2;
          x=a;
          y=b;
          for(int i=0;i<x;i++)
          {
              for(int j=0;j<y;j++)
              {
                  if(l1.get(i)==l2.get(j))
                  {
                      l3.add(l1.get(i));  
                  }   
              }
          }
          return l3;
      }
    
      
}
          
      
