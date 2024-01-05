package Java_fun.InterViewPrep.WrapperClass;


public class WrapperClasses {

    public static void main(String[] args) {


        //autoboxing
        byte a = 10;
        Byte b = a;

        System.out.println("b = " + b);

        //unboxing
        Integer d = 17;
        int x = d;

        System.out.println("x = " + x);


        //parse method  --- > convert to the primitive
        String str = "12";

        int i = Integer.parseInt(str);

        System.out.println(i);


        //value of method

        String str1 = "100";

        Integer integer = Integer.valueOf(str1);

        System.out.println("integer = " + integer);


        WrapperClasses wrapperClasses = new WrapperClasses();


        int i1 = sumOfTwo(2,2);

        System.out.println(i1);

    }


    public static int sumOfTwo(int sum, int sum2) {

        int sumOfTwo = sum + sum2;


        return sumOfTwo;
    }


}
