package Java_fun.InterViewPrep.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayObject {

    public static void main(String[] args) {


        int[] num = new int[4];

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("num.length = " + num.length); //num.length = 4
        System.out.println(Arrays.toString(nums)); //[1, 2, 3, 4, 5, 6, 7]


        int[] taras = {1, 2, 3, 4, 5, 6, 7};
        int[] denys = {1, 2, 3, 4, 5, 6, 7};
        boolean equals = Arrays.equals(taras, denys);
        System.out.println("equals = " + equals); //equals = true


        int[] nums4 = {4, 2, 5, 4, 1, 55, 3};
        Arrays.sort(nums4);
        System.out.println(Arrays.toString(nums4)); //[1, 2, 3, 4, 4, 5, 55]


        int[] num5 = {100, 500, 300, 600};
        int[] result = Arrays.copyOf(num5, 3);
        System.out.println(Arrays.toString(result)); //[100, 500, 300]


        int[] nums6 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] ts = Arrays.copyOfRange(nums6, 2, 6);
        System.out.println(Arrays.toString(ts)); //[30, 40, 50, 60]


        //LOOPING THROUGH ARRAY

        String[] array = {"Cydeo", "Java", "Wooden Spoon",};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println(" ----------------------------------------- ");

        //LOOPING THROUGH ARRAY IN THE REVERSE ORDER


        for (int j = array.length - 1; j >= 0; j--) {
            System.out.println(array[j]);
        }


        //BIGGEST NUMBER

        int[] nuts = {1, 2, 3, 4, 5, 6, 7, 8};
        int max = 0;

        for (int i = 0; i < nuts.length; i++) {
            for (int j = 0; j + 1 < nuts[i]; j++) {

                if (nuts[i] > nuts[j]) {
                    max = nuts[i];
                }
            }
        }
        System.out.println(max + " is biggest number");


        //INSTANTIATING MULTI DIMENSIONAL ARRAY
        int[][] arr2D = new int[3][];

        int[][] arr2D2 = {{1, 2, 3}, {3, 4, 5}, {7, 8, 9}};

        System.out.println(Arrays.deepToString(arr2D2)); //get all
        System.out.println(Arrays.toString(arr2D2[1])); //get single array
        System.out.println(arr2D2[1][1]); //get single with single element


        //LOOPING THROUGH MULTI DIMENSIONAL ARRAY
        int[][] arr2D21 = {{11, 22, 33}, {33, 44, 55}, {77, 88, 99}};
        //                      0        1          2

        for (int i = 0; i < arr2D21.length; i++) {
            int[] arri = arr2D21[i];
            System.out.println(Arrays.toString(arri) + "Single Array");

            for (int j = 0; j < arri.length; j++) {
                int element = arri[j];
                System.out.println("element = " + element);
            }

        }


        //LOOPING THROUGH MULTI DIMENSIONAL ARRAY IN THE REVERSE ORDER
        int[][] arr12 = {{1, 2, 3}, {3, 4, 5}, {7, 8, 9}};

        for (int i = arr12.length - 1; i >= 0; i--) {
            int[] reverseArray = arr12[i];
            System.out.println(Arrays.toString(reverseArray));

            for (int j = reverseArray.length - 1; j >= 0; j--) {
                int element = reverseArray[j];
                System.out.println(element);
            }


        }

        //ArrayList
        ArrayList<String> name = new ArrayList<String>();


        //add method
        name.add("Cydeo");
        name.add("Denys");
        name.add("IT");
        name.add("Genius");
        name.add(1, "Osypenko");


        //set method (updating existing element)
        name.set(3, "soon");
        System.out.println("Array List method " + name);


        //indexOf method
        int denys1 = name.indexOf("Denys");
        System.out.println("indexOf method - index is " + denys1);


        //LOOPING THROUGH  ARRAYLIST in index number
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }

        System.out.println("-------------------------------");

        //LOOPING THROUGH  ARRAYLIST in reversed order
        for (int i = name.size() - 1; i >= 0; i--) {
            System.out.println(name.get(i));
        }

        System.out.println("-------------------------------");

        //LOOPING THROUGH  ARRAYLIST FOR EACH
        for (String each : name) {
            System.out.println(each);
        }



        //Collections Method - find Max
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        int max1 = Collections.max(numbers);

        System.out.println("collections method max is - "+max1);


        //Collections Method - find Min
        ArrayList<Integer> numbers2 = new ArrayList<>();

        numbers2.addAll(Arrays.asList(10,12,13,14,15,16)); //addAll method

        int min = Collections.min(numbers2);

        System.out.println(min);





    }


}
