package Java_fun.Week_01;

public class Odd_or_Even {


    public static int oddOrEven(int num) {

        if (num % 2 == 0) {
            System.out.println("identify" + "(" + num + "); is ->\"Even\"");
        } else {
            System.out.println("identify" + "(" + num + "); is ->\"Odd\"");
        }
        return num;
    }


    public static void main(String[] args) {


        oddOrEven(5);


    }


}

/*
 Numbers -  Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
 */



