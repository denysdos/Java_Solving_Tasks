package Java_fun.TasksJava.Loop;

public class sum_dig {

    public static void main(String[] args) {

        String str = "A1B2C3";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                count += Character.getNumericValue(str.charAt(i));
            }

        }

        System.out.println("count = " + count);

    }


}


/*
6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
 */