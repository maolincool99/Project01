package com.lim.java;

import com.lim.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author liml99
 * @create 2020-03-03 18:28
 */
public class TemplateTest {

//    6 . prsf
    private static final int INT90 = 90;
    private static final Customer VIP = new Customer() ;
//    拓展 psf，psfi，psfs
    public static final int int56 = 56;
    public static final int in23 = 23;
    public static final String NATION = "china";



//  1.  psvm
    public static void main(String[] args) {

//    2.    sout
        System.out.println("侬好");
//        拓展 soutp,soutm,soutv, xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));

        System.out.println("TemplateTest.main");

        int num1 = 99;
        System.out.println("num1 = " + num1);

        int num2 = 99;
        int num3 = 99;
        System.out.println("num3 = " + num3);

        System.out.println(num2);

        String[] arr = new String[]{"Tom1","jeery2"};
//  3 fori
        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        拓展 iter ,itar
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i=0; i < arr.length; i++) {
            String s=arr[i];
            System.out.println(s);

        }

        ArrayList<Integer> list=new ArrayList<>();

        list.add(123);
        list.add(5);
        list.add(4);
//        4 list.for
        for (Integer i : list) {
            System.out.println(i);
        }

//        拓展 list.fori
        for (int i=0; i < list.size(); i++) {

        }
//        拓展 list.forr
        for (int i=list.size() - 1; i >= 0; i--) {
            
        }
    }

    public  void otherMethod(){
        System.out.println("TemplateTest.otherMethod");

        ArrayList<Integer> list=new ArrayList<>();

        list.add(123);
        list.add(5);
        list.add(4);
//      5.ifn
        if (list == null) {

        }

//        拓展 inn,xx.nn,xx.null

        if (list != null) {

        }
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
