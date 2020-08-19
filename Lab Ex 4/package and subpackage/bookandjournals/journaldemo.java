/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package journalpack;

/**
 *
 * @author Hi
 */
public class journaldemo {
  
    int journalid[]={111,112,113,114};
    String journalname[]={"Economics Journal","Civil Services Journal","Geography Journal","Microbiology jounal"};
    public void display(int i)
    {
        System.out.println("Journal Name:"+journalname[i-1]+"\nJournal Id:"+journalid[i-1]);
    }
}

    

