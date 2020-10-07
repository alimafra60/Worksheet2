/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iohandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Hi
 */
public class Ex10Qn3 {
     public static void main(String[] args) {

        try {
            FileInputStream fi = new FileInputStream("1.jpg");
            FileReader fr = new FileReader("1.jpg");
            FileOutputStream fo = new FileOutputStream("output1.jpg");
            FileWriter fw = new FileWriter("output2.jpg");
            int read = 0;
            while ((read = fi.read()) != -1) {
               fo.write(read);
            }
            while ((read = fr.read()) != -1) {
                System.out.print(read);
               fw.write(read);
            }
            fi.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
}
