package org.chenyu.test;

class A {
    static {
        System.out.println("1");
    }
    public A(){
        System.out.println("A");
    }
}
class B extends A{
    static {
        System.out.println("2");
    }
    public B(){
        System.out.println("B");
    }
}
public class MyTest1 {
    public static void main(String[] args) {
        A a = new B();
        a = new B();
    }
}
