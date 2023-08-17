package Random_Tasks;

public class Remove_liter_x {

    public static void main(String[] args) {

        //remove duplicates from given string

        String str = "abcdxxx";

        String strRemoved = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (strRemoved.indexOf(ch) == -1) {
                strRemoved += ch;
            }
        }
        System.out.println(strRemoved);


        System.out.println("---------------------------------------------");


        String str1 = "aaddffabb";

        String result = ""; //"abc"z

        for (int k = 0; k < str1.length(); k++) {

            char each = str.charAt(k);

            if (!result.contains("" + each));
            result += each;
        }


        System.out.println(result);
        }


    }








