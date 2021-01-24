package com.ola;

public class HomeTestAnnotation {
    private int name;
    private int age;

    public HomeTestAnnotation( int name,int age) {
       this.name = name;
        this.age = age;
    }

    public int getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @MyAnnotation(p1 = "Hi", p2 = 4)
    public void method1 (String s, int number2){
     System.out.println("success!! = " + s + "  " + number2);
    }


    @Override
    public String toString() {
        return "HomeTestAnnotation{" + "name=" + name + ", age=" + age + '}';
    }
}


