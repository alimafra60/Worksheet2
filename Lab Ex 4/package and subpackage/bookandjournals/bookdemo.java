/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookpack;

/**
 *
 * @author Hi
 */
public class bookdemo {
     int bookid[]={101,102,103,104};
    int ano[]={123,234,345,456};
    int publication[]={1978,1987,1956,1967,1984};
    String bookname[]={"TimeMachine","Chitra","DivineComedy","Geetanjali"};
    String authorname[]={"H.G.Wells","R.N.Tagore","Dante","Rabindranath Tagore"};
    public void display(int i)
    {
        System.out.println("Book Name:"+bookname[i-1]+"\nAuthor:"+authorname[i-1]+"\nBook Id:"+bookid[i-1]+"\nAccession Number:"+ano[i-1]+"\nPublication:"+publication[i-1]);
  
    }
    
}
