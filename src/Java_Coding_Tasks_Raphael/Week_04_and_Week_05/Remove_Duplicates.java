package Java_Coding_Tasks_Raphael.Week_04_and_Week_05;

public class Remove_Duplicates {

    public static String ContainsChar(String str1) {

        str1 = str1.toLowerCase();
        String result = "";

        for (int i = 0; i < str1.length(); i++) {

            char currentChar = str1.charAt(i);
            if (result.indexOf(currentChar) == -1) {
                result += currentChar;


            }
        }

        return result;
    }


    public static void main(String[] args) {

        System.out.println("RemoveDuplications.ContainsChar(\"AAAABBBBBCCCCDDDD\") = " + Remove_Duplicates.ContainsChar("AAAABBBBBCCCCDDDD"));


    }


/*
String - Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC") ==> ABC
 */


}
