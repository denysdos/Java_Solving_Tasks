package Java_fun.Week_02;

public class Swap_varibles {

    public static void swap_var(int a, int b) {

        System.out.println("a = " + a + "\nb = " + b);

        System.out.println("swap");

        a = a + b;

        b = a - b;
        a = a - b;

        System.out.println("a = " + a + "\nb = " + b);
    }

    public static void main(String[] args) {

        swap_var(1,2);



    }

}



/*

        a = a + b;

        b = a - b;
        a = a - b;
 */