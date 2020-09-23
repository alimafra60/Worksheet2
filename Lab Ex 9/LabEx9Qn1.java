/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex5;

/**
 *
 * @author Hi
 */
public class LabEx9Qn1 {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int arr[] = new int[10];
        String str[] = new String[5];
        arithmetic(a, b);
        arrayindexexception(arr);
        numberformat(a);
        stringindexexception(str);
    }

    static void arithmetic(int a, int b) {
        try {
            a = a / b;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void arrayindexexception(int arr[]) {
        try {
            arr[11] = 200;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void numberformat(int a) {
        try {
            a = Integer.parseInt(" 10 ");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void stringindexexception(String str[]) {
        try {
            str[6] = "i am a programmer";
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


