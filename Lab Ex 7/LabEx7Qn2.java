 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Hi
 */
public class LabEx7Qn2 {
      public static void main(String[] args)
    {
      ArrayList<employee> list=new ArrayList<>(); 
      list.add(new employee("santha",25000));
      list.add(new employee("praveen",35000));
      list.add(new employee("fazil",45000));
      list.add(new employee("shiva",56000));
      list.add(new employee("alim",78000));
      list.add(new employee("bala",56000));
      list.add(new employee("maharishi",59000));
      list.add(new employee("kamali",77000));
      list.add(new employee("nisha",78000));
      list.add(new employee("prabhu",50000));
      list.add(new employee("gajendra",59000));
      list.add(new employee("sahul",34000));
      list.add(new employee("faruk",67000));
      list.add(new employee("ziyavul",90000));
      list.add(new employee("usha",57000));
      list.add(new employee("varun",54000));
      list.add(new employee("selva",58000));
      list.add(new employee("surendar",45000));
      list.add(new employee("rajapandi",43000));
      list.add(new employee("ragul",42000));
      System.out.println(list);
      System.out.println("***********EMPLOYEE NAMES AFTER SORTING***********");
      Collections.sort(list,new namesort().reversed());
      System.out.println(list);
      
    }
    
}
class employee2
{
    String name;
    double salary;
    employee2(String n,double s)
    {
        name=n;
        salary=s;
    }
    public String toString()
    {
        return "Employee Name:"+name+"\tSalary:"+salary;
    }
}    
class namesort1 implements Comparator<employee>
{
    public int compare(employee e1,employee e2)
    {
        return e2.name.compareTo(e1.name);
    }
}
