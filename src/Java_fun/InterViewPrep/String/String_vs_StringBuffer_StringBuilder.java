package Java_fun.InterViewPrep.String;

public class String_vs_StringBuffer_StringBuilder {


    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Hello");

        str.append(" Java");

        System.out.println("str = " + str);

        str.insert(1," Java");  //HJavaell

        System.out.println("str = " + str);

    }



}
