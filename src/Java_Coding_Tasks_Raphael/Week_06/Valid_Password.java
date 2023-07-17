package Java_Coding_Tasks_Raphael.Week_06;

public class Valid_Password {

    public static boolean IsValidPassword(String password) {

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        //Password MUST be at least 6 characters
        if (password.length() < 6) {
            return false;
        }

        //and should not contain space
        if (password.contains(" ")) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            //Password should at least contain one upper case letter
            if (Character.isUpperCase(c)) {
                hasUppercase = true;

                //Password should at least contain one lowercase letter
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;

                //Password should at least contain a digit
            } else if (Character.isDigit(c)) {
                hasDigit = true;

                //Password should at least contain one special characters
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        //if all requirements above are met, the method returns true, otherwise returns false
        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {

        boolean password = IsValidPassword("B2233cydeo@gmail");

        System.out.println("Password is valid : " + password);

        //Aa1@cydeo   -> true
        //Aa1@ cydeo -> false
        //aabb -> false
        //B2233cydeo@gmail-> true


    }


}

/*
   1) String - Password Validation Task
Write a return method that can verify if a password is valid or not. Requirements:
 1. Password MUST be at least 6 characters and should not contain space
Password should at least contain one upper case letter
Password should at least contain one lowercase letter
Password should at least contain one special characters
Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */






