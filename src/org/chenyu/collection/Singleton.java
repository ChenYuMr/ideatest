package org.chenyu.collection;

public class Singleton {
    private static volatile Singleton singleton;

    private Singleton(){}

    public static Singleton getSingleton(){
        synchronized (Singleton.class){
            if(singleton == null){
                singleton = new Singleton();
            }
        }
        return singleton;
    }

    public static void main(String[] args) {

        System.out.println( Singleton.getSingleton());
    }
}