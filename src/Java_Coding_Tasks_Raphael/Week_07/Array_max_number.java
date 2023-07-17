package Java_Coding_Tasks_Raphael.Week_07;

public class Array_max_number {

    public static int ArrayMaxNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.err.println("Array can not be empty !!!");
            System.exit(1);
        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }


    public static void main(String[] args) {

        int[] numbers = {10, 50, 102, 16, 74, 33, 148, 1, 61, 95};
        int Maximum = Array_max_number.ArrayMaxNumber(numbers);
        System.out.println(Maximum);

        System.out.println("-----------------or------------------");

        System.out.println("MaxNumber.ArrayMaxNumber(numbers) = " + Array_max_number.ArrayMaxNumber(numbers));


    }


}


/*
    1) Array - Find Minimum
Write a method that can find the maximum number from an int Array
 */




