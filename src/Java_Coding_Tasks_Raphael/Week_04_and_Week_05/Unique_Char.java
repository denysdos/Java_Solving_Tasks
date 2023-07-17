package Java_Coding_Tasks_Raphael.Week_04_and_Week_05;

public class Unique_Char {

    public static String UniqueChar(String str) {

        str = str.toLowerCase();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;

            }
        }

        return result;

    }


    public static void main(String[] args) {

        System.out.println("UniqeChar.UniqueChar(\"ABBBBCCAAASASASASASAFDSFDF\") = " + Unique_Char.UniqueChar("ABBBBCCAAASASASASASAFDSFDF"));
    }
}







