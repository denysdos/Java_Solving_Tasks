package Java_fun.Week_06;

public class Array_max_Number {

    public static int intArray(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.println("Array can not be empty");
        }

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }


    public static void main(String[] args) {

        int[] numbers = {2, 3, 4, 5, 6, 12};

        System.out.println("ArrayFindMaximum.intArray(numbers) = " + Array_max_Number.intArray(numbers));


    }


}
