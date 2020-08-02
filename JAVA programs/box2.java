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
class box
{
    double height;
    double depth;
    double width;
    public void vol()
            {
               double vol;
               vol=height*depth*width;
               System.out.println("Volume:"+vol);
            }
}
public class box2 {
    public static void main(String[] args)
    {
        
        box obj=new box();
        obj.height=10;
        obj.width=20;
        obj.depth=30;
        //double val=obj.height*obj.depth*obj.width;
        //System.out.println("Volume:"+val);
        obj.vol();
        
        box obj1=new box();
        obj1.height=1;
        obj1.width=5;
        obj1.depth=10;
        //double val1=obj1.height*obj1.depth*obj1.width;
        //System.out.println("Volume:"+val1);
        obj1.vol();
        
        box obj2=new box();
        obj2.height=1;
        obj2.width=9;
        obj2.depth=8;
        //double val2=obj2.height*obj2.depth*obj2.width;
        //System.out.println("Volume:"+val2);
        obj2.vol();
    }
    
}

