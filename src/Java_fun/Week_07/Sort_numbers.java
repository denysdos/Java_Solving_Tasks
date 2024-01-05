package Java_fun.Week_07;

public class Sort_numbers {

    public static boolean bol(int[] nums) {
        int lastIndex = nums.length - 1;

        if (nums[0] == 6 || nums[lastIndex] == 6){
            return true;

        }

        return false;
    }


    public static void main(String[] args) {


        int [] arr = {1,2,3,4,5,6};

        System.out.println("SortNumbers.bol(arr) = " + Sort_numbers.bol(arr));


    }


}



        /*
         if ([0]==6] || nums.length - 1 == 6 ){
            return true;
        }else{
            return false;
        }
         */



/*
/*
     2) Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
            int[] arr = {10, 9, 8, 7};
             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
 */




/*
 int[] arr = {10, 9, 8, 7};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
 */






