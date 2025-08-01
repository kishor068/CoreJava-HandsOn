package org.example.day5;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        Integer a[]={10,20,30,50,35};
        Integer b[]=new Integer[]{10,20,10,10,10,70,120,48,160};

//        List<Integer> l1=new ArrayList<>(Arrays.asList(a)); //converts arrays to array list
//        List<Integer> l2=new ArrayList<>(Arrays.asList(b));
        Set<Integer> l1=new LinkedHashSet<>(Arrays.asList(a)); //converts arrays to array list
        Set<Integer> l2=new LinkedHashSet<>(Arrays.asList(b));

        System.out.println(l1);
        System.out.println(l2);

        Iterator<Integer> it=l1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
//            System.out.println(it.next());

        }

//        l1.addAll(2,l2); //add all elements of l2->l1 (using Index also works)
//        l1.removeAll(l2); //remove comman elements b/n l1 and l2 from l1
//        l1.retainAll(l2); // retain common elements b/n l1 and l2
        System.out.println(l1);
        Integer[] c=l1.toArray(new Integer[0]); //convert list to array
        for(Integer x:c){
            System.out.print(x+" ");
        }

    }
}
