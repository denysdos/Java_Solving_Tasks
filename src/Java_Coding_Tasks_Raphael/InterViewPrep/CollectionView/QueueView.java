package Java_Coding_Tasks_Raphael.InterViewPrep.CollectionView;

import java.util.*;

public class QueueView {

    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("priorityQueue = " + priorityQueue); //adding in random order //allowed duplicates//null is not supported


        Queue<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.addAll(Arrays.asList(10,200,300,40,90)); //allowed duplicates, null is not supported
        System.out.println("arrayDeque = " + arrayDeque);



        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90, null)); //allowed duplicates, null is supported// has index number and able to retrieve specific element from the list

        System.out.println(linkedList);

        //linkedList.get(1);


    }



}
