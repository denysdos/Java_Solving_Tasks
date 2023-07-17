package Java_Coding_Tasks_Raphael.Week_06;

public class Sum_of_digits_in_String {


    public static int sumOfDigitsInString(String str) {

        //store values here
        int sum = 0;

        //find every symbol in a string
        for (int i = 0; i < str.length(); i++) {
            // every symbol separate
            char ch = str.charAt(i);
            //if our char is digit
            if (Character.isDigit(ch)) {
                //assign it var to digit and get value of these digits
                int digit = Character.getNumericValue(ch);
                //our storage of values ++ digit values
                sum += digit;
            }

        }

        return sum;
    }

    public static void main(String[] args) {

        String givenString = "15";
        System.out.println("sumOfDigitsInString(givenString) = " + sumOfDigitsInString(givenString));
    }
}

/*
Write a method that can return the sum of the digits in a string
 */






