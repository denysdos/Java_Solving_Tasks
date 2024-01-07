package Java_fun.TasksJava.CollectionView;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {


        List<Integer> ArrayList = new ArrayList<>();
        ArrayList.addAll(Arrays.asList(1, 2, 3, 4, 5));


        List<Integer> LinkedList = new LinkedList<>();
        LinkedList.addAll(Arrays.asList(1, 2, 3, 4, 5));


        List<Integer> vector = new Vector<>();
        vector.addAll(Arrays.asList(1, 2, 3, 4, 5));


        List<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(1, 2, 3, 4, 5));


        System.out.println("ArrayList = " + ArrayList);
        System.out.println("LinkedList = " + LinkedList);
        System.out.println("vector = " + vector);
        System.out.println("stack = " + stack);


        System.out.println("----------------------------------");






        }


    }




