package Java_fun.Week_03;

public class PrimeNumber {

    public static void main(String[] args) {


        int num = 5;

        String result = "";


        for (int i = 1; i <= num; i++) {
            if (num <= 1) {
                result = "entered number is not prime, cannot be less or equal 1";
            }

            if (i % num == 0) {
                result = "entered number not prime";
            } else {
                result = "Number is prime";
            }

        }

        System.out.println(result);


    }

}

/*
  public static boolean isPrime(int n){

        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {


    boolean num = isPrime(2);

        System.out.println(num);


    }
 */


