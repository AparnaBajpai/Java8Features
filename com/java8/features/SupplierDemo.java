package com.java8.features;

import java.util.*;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {

    @Override
    public String get() {
        return "Hi java techie";
    }

    public static void main(String args[])
    {
      //  SupplierDemo d = new SupplierDemo();
      //  System.out.println(d.get());

        Supplier<String> s = () -> "Hi java techie";
        //System.out.println(s.get());

        List<String>  list1 = Arrays.asList("a", "b");
        List<String>  list2 = Arrays.asList();
      //  System.out.println(list1.stream().findAny().orElseGet(s));

        System.out.println(list1.stream().findAny().orElseGet(() -> "Hi java techie"));
        System.out.println(list2.stream().findAny().orElseGet(() -> "Hi java techie"));


        //If have huge collection data go for Stream API.
        //filter method for condition check

        List<String> arlist = new ArrayList<>();
        arlist.add("m");
        arlist.add("mn");

        System.out.println("list print");
        arlist.stream().forEach(t -> System.out.print(t +" "));

        System.out.println("list print with filter");
        arlist.stream().filter(t -> t.equals("m")).forEach(t ->System.out.println(t+ " "));

        HashMap<String,String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        System.out.println("using for each");
        for (Map.Entry obj : map.entrySet()) {
            System.out.println(obj.getKey()+" "+ obj.getValue());
        }

        System.out.println("using Stream java8");
        map.entrySet().stream().forEach(obj -> System.out.println(obj.getKey()+" "+ obj.getValue()));  // map iterate


    }
}
