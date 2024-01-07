package Java_fun.TasksJava.CollectionView;

import java.util.*;

public class Set_Review {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90, null));


        Set<Integer> LinkedHashSet = new LinkedHashSet<>();
        LinkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90, null, 10, null));


        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));


        System.out.println("hashSet = " + hashSet); //random insertion order. do not accept duplicates
        System.out.println("LinkedHashSet = " + LinkedHashSet); //do not accept duplicates
        System.out.println("treeSet = " + treeSet); // from smaller to lager , //do not accept duplicates //does not accept null values

        //All above do not support indexes, the best way to reach some particular value by using for each loop


        System.out.println("-----------------------------------");

        for (Integer each : hashSet){
            System.out.println(each);
        }

    }


}
