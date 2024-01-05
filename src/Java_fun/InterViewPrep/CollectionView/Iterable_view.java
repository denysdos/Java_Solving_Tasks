package Java_fun.InterViewPrep.CollectionView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterable_view {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4,5));

        for (int i = 0; i < list.size() ; i++) {
                    if (list.get(i) < 4 ){
                        list.remove(i);
                    }
        }

        System.out.println(list);


        System.out.println("------------------------------------");

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4,5));

        Iterator<Integer> it = list2.iterator();

        while (it.hasNext()){
            if (it.next()< 4){
                it.remove();
            }
        }
        System.out.println("list2 = " + list2);


        System.out.println("------------------------------------");


        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4,5));

        list3.removeIf(p -> p < 4 );

        System.out.println(list3);


    }






}
