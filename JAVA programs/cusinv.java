/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet1;

/**
 *
 * @author Hi
 */
public class cusinv {
    public static void main(String[] args)
    {
        Customer obj=new Customer(111,"alim",10);
        System.out.println("ID:"+obj.getid());
        System.out.println("Name:"+obj.getname());
        System.out.println("Discount:"+obj.getdiscount());
        obj.setdiscount(30);
        System.out.println("Changed Discount:"+obj.getdiscount());
        System.out.println("Using to string method:\n");
        System.out.println(obj);
        invoice inv=new invoice(112,obj,2000);
        Customer obj1=new Customer(112,"amris",20);
        System.out.println("*****INVOICE*****");
        System.out.println("New customer ID"+inv.getid());
        System.out.println("Existing Customer:\n"+inv.getcustomer());
        inv.setcustomer(obj1);
        System.out.println("Amount:"+inv.getamount());
        inv.setamount(2000);
        System.out.println("Name of new customer:"+inv.getcustomernname());
        System.out.println("Final Amount:"+(inv.getamount()));
        System.out.println("Final Discount"+obj1.getdiscount());
        System.out.println("Amount after Discount:"+inv.getamountafterdiscount());
        
        
        
        
        
    }
    
}
class Customer
{
    int id;
    String name;
    double discount;
    Customer(int i,String n,double d)
    {
        id=i;
        name=n;
        discount=d;
    }
    int getid()
    {
        return id;
    }
    String getname()
    {
        return name;
        
    }
    double getdiscount()
    {
        return discount;
    }
    double setdiscount(int d1)
    {
        discount=d1;
        return discount;
    }
    public String toString()
    {
        return "ID:"+id+"\nName:"+name+"\ndiscount:"+discount;
    }
}
class invoice
{
    int ID;
    Customer customer;
    double amount;
    invoice(int id,Customer o1,double amt)
{
    ID=id;
    customer=o1;
    amount=amt;
}
    int getid()
    {
        return ID;
    }
    Customer getcustomer()
    {
        return customer;
    }
    void setcustomer(Customer o2)
    {
        customer=o2;
        
    }
    double getamount()
    {
        return amount;
    }
    void setamount(double amt1)
    {
        amount=amt1;
    }
    String getcustomernname()
    {
        return customer.name;
        
    }
    double getamountafterdiscount()
    {
        return amount=amount-((amount*customer.getdiscount())/100);
    }
    }
