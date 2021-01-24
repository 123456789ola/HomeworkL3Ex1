package com.ola;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface MyAnnotation {

    String p1() default "Def";
    int p2() default 9;


}
