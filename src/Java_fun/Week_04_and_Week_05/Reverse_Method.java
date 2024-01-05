package Java_fun.Week_04_and_Week_05;

public class Reverse_Method {

    public static String ReverseMethod(String str){

        str = str.toLowerCase();
        String result = "";

        for(int i = str.length() -1; i >= 0; i --) {
            char ch= str.charAt(i);
            result +=ch;
        }

        return result;
    }


    public static void main(String[] args) {

        System.out.println("ReverseMethod.ReverseMethod(\"Denys\") = " + Reverse_Method.ReverseMethod("Sadan"));

    }


}





