package Java_fun.Week_04_and_Week_05;

public class Same_Letters {

    public static boolean StringChecker(String str, String str1) {

        str = str.toLowerCase();
        str1 = str1.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            boolean sameString = false;

            for (int j = 0; j < str1.length(); j++) {
                char ch1 = str.charAt(j);
                if (ch == ch1) {
                    sameString = true;
                    break;
                }

            }
            if (!sameString) {
                return false;
            }

        }

        return true;
    }


    public static void main(String[] args) {

        System.out.println("SameLetters.StringChecker(\"abc\",\"cba\") = " + Same_Letters.StringChecker("ccc", "aaa"));


    }

}

/*
Write a return method that check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:
 */




