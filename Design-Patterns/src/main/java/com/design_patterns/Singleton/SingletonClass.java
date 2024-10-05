package com.design_patterns.Singleton;

public class SingletonClass {

    private static SingletonClass singletonInstance = new SingletonClass();

    private SingletonClass(){

    }

    public static SingletonClass getInstance(){
        return singletonInstance;
    }

    public void printHashCod(){
        System.out.println("hashcode of singleton object is "+singletonInstance);
    }

}
