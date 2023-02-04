package org.Q2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /**
         * باید از کد اسکی هم استفاده میکردی و  باید
         * از اینتیجر به عنوان کلید استفاده میکردی
         * در کل خوبه
         */
//        Hashtable<String, String> ht = new Hashtable<>();
        Hashtable<Integer, Character> ht = new Hashtable<>();
        String statement="haddi";

        /**
         *
         * شما ارایه ای از کاراکتر میخوای نه ارایه از استرینگ
         * پس از متد دیگه استفاده میکنیم
         * نوشتم برات
         */
//        String[] a=statement.split("");

        char[] a = statement.toCharArray();
        for (int i = 0; i < statement.length(); i++) {


            ht.put((int)a[i],a[i]);
        }

        if (statement.length()==ht.size()){
            System.out.println("statement has all uniq character.");

        }else {
            System.err.println("statement has not  uniq character.");
        }
    }

}
