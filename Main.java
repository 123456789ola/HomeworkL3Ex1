package com.ola;
import java.lang.reflect.Method;
import java.lang.Exception.*;
import java.io.File;
import java.util.Scanner;
import  java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
public class Main {

    public static void main(String[] args) {
        HomeTestAnnotation ht =  new HomeTestAnnotation(1,2);
        Class<?> cl = HomeTestAnnotation.class;
     try{
        Method method = cl.getDeclaredMethod("method1", String.class, int.class);
        MyAnnotation ma = method.getAnnotation(MyAnnotation.class);
        method.invoke(ht,ma.p1(),ma.p2());



     }catch (NoSuchMethodException|IllegalAccessException|IllegalArgumentException
     |InvocationTargetException ex){
         ex.printStackTrace();
     }





    }
    }




