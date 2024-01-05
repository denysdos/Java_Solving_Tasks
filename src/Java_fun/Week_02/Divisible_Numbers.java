package Java_fun.Week_02;

public class Divisible_Numbers {


    public static void main(String[] args) {

        String result = "", result1 = "",result2 = "";

        for (int i = 1; i < 101; i++) {
            if (i % 15 == 0) {
                result += i + " ";
            }

            if (i % 5 == 0) {
                result1 += i + " ";
            }

            if (i % 3 == 0) {
                result2 += i + " ";
            }

        }


        System.out.println("Divisible by 15 " + result);
        System.out.println("Divisible by 5 " + result1);
        System.out.println("Divisible by 3 " + result2);


    }

}





