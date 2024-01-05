package Java_fun.InterViewPrep.CodingInterview;

public class Armstrong {

    /**
     * Create a method to check if a number is an Armstrong number
     * parameter: int
     * return: boolean
     * <p>
     * An Armstrong number is a number that's digits can be raised to the power of the total number of digits and summed to equal the original number
     * <p>
     * -> these numbers are also called narcissistic numbers
     * <p>
     * Ex:
     * input: 153
     * output: true
     * <p>
     * the digits are 1, 5, and 3
     * the calculation would be:
     * 1^3 + 5^3 + 3^3
     * -> why is the exponent 3? because there is 3 digits in the number
     * <p>
     * 1^3 = 1 * 1 * 1 = 1
     * 5^3 = 5 * 5 * 5 = 125
     * 3^3 = 3 * 3 * 3 = 27
     * <p>
     * 1 + 125 + 27 = 153 --> the sum is equal to the original number so it is an Armstrong number
     * <p>
     * Test data:
     * 153 -> true
     * 371 -> true
     * 9474 -> true
     * 9475 -> false
     * 123 -> false
     */

    public static void main(String[] args) {

        System.out.println("isArmstrong(153) = " + isArmstrong(153));


    }


    public static boolean isArmstrong(int num) {

        /** Cтринг для того, чтобы можно было узнать длину числа, ниже это делаем (т.к int нельзя узнать длину**/

        String numStr = "" + num;

        /** Сохраняем обратно в инт длину числа чтоб это было числом (с помощью которого будем возводить в степень)**/

        int numLength = numStr.length();

        int sum = 0;

        /** Перебираем каждое число в нашем int numLength **/
        for (int i = 0; i < numStr.length(); i++) {

            /** Приравниваем то что мы наши в Луп к Переменной eachDigitInNumStr. Используем wrapper Class
             * Integer.parseInt и метод чтоб из стринга получить int (т.к на момент когда луп его перебирал это был стринг) и применяем substring где  i
             *  это  первая цифра а i+1 это движемся по одной цифре вперед таким образом, если i это каждая цифра
             *  то i+1 это каждая цифра на одну вперед **/
            int eachDigitInNumStr = Integer.parseInt(numStr.substring(i, i + 1));

            /**Далее надо это все сохрнить, в переменную в которой будет происходить математика.
             * а именно :
             * Т.к мы знаем длину нашего числа и мы получили в лупе каждое число отдельно вызываем метод
             * Math.pow который возводит в степень (в нашем случае степень это длинна числа)**/

            sum += Math.pow(eachDigitInNumStr, numLength);
        }

        /**и т.к у нас метод булееый мы сравниваем то что мы ввели в атрибут метода с тем что у нас получилось в сумме после возведения в степень**/

        return num == sum;
    }

}
/*

   String strNum = "" + num;
        int numLen = strNum.length();
        int sum = 0;

        for (int i = 0; i < strNum.length(); i++) {

            int eachDigit = Integer.parseInt(strNum.substring(i, i + 1));
            sum += Math.pow(eachDigit, numLen);

        }

        return sum == num;
    }
 */