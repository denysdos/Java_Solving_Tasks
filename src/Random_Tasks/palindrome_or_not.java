package Random_Tasks;

public class palindrome_or_not {

    public static boolean isPalindrome(String str){

        str = str.toLowerCase().replaceAll("//s","");

        int left = 0;
        int right = str.length()-1;


        while (left < right){

            if (str.charAt(left) != str.charAt(right)){
                    return  false;
            }

            left ++;
            right --;

        }

        return true;
    }

    public static void main(String[] args) {





    }




}
