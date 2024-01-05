package Java_Coding_Tasks_Raphael.InterViewPrep.CodingInterview;

public class Factorial {


    //we need create a method which return itself - factorial number, we need to achieve 5 - 120


    public static void main(String[] args) {

        int factorial = factorial(5);


        System.out.println(factorial);
    }





    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        }

        return num * factorial(num - 1);
    }


}
