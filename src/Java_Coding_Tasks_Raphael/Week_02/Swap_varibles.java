package Java_Coding_Tasks_Raphael.Week_02;

public class Swap_varibles {

    public static void swap_var(int a, int b) {

        System.out.println("a = " + a + "\nb = " + b);

        System.out.println("swap");

        a = a + b;

        b = a - b;
        a = a - b;

        System.out.println("a = " + a + "\nb = " + b);
    }


}



