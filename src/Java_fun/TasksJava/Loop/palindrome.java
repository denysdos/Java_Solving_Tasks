package Java_fun.TasksJava.Loop;

public class palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Level")); // true
        System.out.println(isPalindrome("Anna"));  // true
        System.out.println(isPalindrome("Hello")); // false
    }

    public static boolean isPalindrome(String str) {

        str = str.toLowerCase().replaceAll("\\s", "");


        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Символы не совпадают, строка не является палиндромом
            }

            left++;
            right--;
        }

        return true; // Все символы совпадают, строка является палиндромом
    }
}





/*
7. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */