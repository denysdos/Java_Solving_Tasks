package Java_fun.TasksJava.Loop;

public class return_factorial {

    public static int fact(int num){

        int number = 1;

        for (int i = 1; i <= num; i++) {
            number *= i;

        }

        return number;
    }


    public static void main(String[] args) {


        System.out.println("fact(5) = " + fact(5));


    }

}
