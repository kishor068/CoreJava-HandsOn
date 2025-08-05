package org.example.day6;
import  java.util.*;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Map<String,Long> m1=new LinkedHashMap<>();
        m1.put("Bangalore",10000000L);
        m1.put("Udupi",200000L);
        //when override previous hash value of the key
        m1.put("Bangalore",13000000L);//last duplicate key is considered
        m1.put("Hubli",3000000L);
        System.out.println(m1);
        System.out.println(m1.get("Udupi"));

        System.out.println("---------------");
        //TO navigate the values
        for(String x:m1.keySet()){
            System.out.println(x+" "+m1.get(x));
        }
        System.out.println("---------------\n");

        //keyset returns the keys
        //city pop>10000
        m1.keySet().stream().filter((city)->(m1.get(city)>10000)).forEach((city)->{
            System.out.println(city+" "+m1.get(city));
        });

        //count number of cities
        System.out.println("Count of cities"+m1.size());

        //count number of cities >200000
        long count=m1.keySet().stream().filter((city)->(m1.get(city)>200000)).count();
        System.out.println("Count of cities>200000 :"+count);

        //map->list conversion
        List<String> l1=m1.keySet().stream().filter((city)->(m1.get(city)>200000)).collect(Collectors.toList());
        System.out.println("List of Cities where pop>200000: "+l1);

        //find the frequency of each word in the given sentence
        System.out.println("Enter the sentence:");
        String inp=new String();
        inp=sc.nextLine();

        //regex
        String[] arr=inp.split( "[ .,]");
        Map<String,Integer> m2=new HashMap<>();
        for(String x:arr){
            m2.put(x,m2.getOrDefault(x,0)+1);

        }
        System.out.println("Freq of each string in the sentence:"+m2);

        //Create a employee class and find the employee by the id.
        System.out.println("Employee class and find the employee by the id");

    }
}
