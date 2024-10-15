package org.example;

public class MyProgram {
    public static void main(String[] args) {
        MyTime t = new MyTime(12, 59,59, false);
        MyTime t1 = new MyTime(10, 12, 30, true);
        MyTime x;

        x = t;

        t.setHours(12);
        t.setMinutes(30);
        t.setSeconds(100);

        System.out.println(t);
        System.out.println(t1);

        x.setHours(6);
        System.out.println(t);

        System.out.println(t == t1);
        System.out.println(t.equals(t1));
        System.out.println(t.toString());
    }
}








