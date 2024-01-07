package Java_fun.TasksJava.Loop;

public class retrieve_digits {

    public static void main(String[] args) {

        String task = "mn@#123Ab!";

        String digits = "";
        String Letters = "";
        String specCh ="";

        char result;

        for (int i = 0; i < task.length(); i++) {
            result = task.charAt(i);

            if (Character.isDigit(result)){
                digits += result;
            }else if (Character.isLetter(result)){
                Letters +=result;
            } else if (!Character.isLetterOrDigit(result)) {
                specCh += result;
            }


        }

        System.out.println("digits = " + digits);
        System.out.println("Letters = " + Letters);
        System.out.println("specCh = " + specCh);



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