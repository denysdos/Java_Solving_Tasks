package Random_Tasks;

public class retrieve {

    public static String retrieverSymbols(String str){

        String letters = "";
        String digits = "";
        String specCh = "";

        char result;

        for(int i = 0; i < str.length(); i++){
            result = str.charAt(i);

            if (Character.isDigit(result)){
             digits += result;

            }else if (Character.isLetter(result)) {
                letters += result;


            }else if (!Character.isLetterOrDigit(result)) {
                specCh += result;

            }

        }

        return digits;
    }

    public static void main(String[] args) {


        System.out.println("retrieverSymbols(\"mn@#123Ab!\") = " + retrieverSymbols("mn@#123Ab!"));


    }
}


/*
5. write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */