package com.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
/*    @Override
    public boolean test(Integer integer) {
        if(integer%2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }*/

    public static void main(String args[])
    {
        Predicate<Integer> p = t -> t%2 == 0; // lambda expression  since Presicate is functional interface
        System.out.println(p.test(5));

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5,10,8);
        //list1.stream().filter(p).forEach(t -> System.out.println("print even "+ t));

        list1.stream().filter(t -> t%2 == 0).forEach(t -> System.out.println("print even "+ t));

    }

}
