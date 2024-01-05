package Java_fun.InterViewPrep.Overriding_Overloading;

public class Cat_Child_class  extends Animal_ParentClass {


    public Cat_Child_class(String name, String breed, int age, String size) {
        super(name, breed, age, size);
    }

    @Override
    public void dan() {


    }







/*
Animal_ParentClass animalParentClass = new Animal_ParentClass("name","breed",17,"size");

                animalParentClass.eat();
                String name1 = animalParentClass.name;

                System.out.println("name1 = " + name1);
 */


        /*
        Create a program that will take any String and print the total sum of all the numbers in the
String. Note: numbers can be more than digits from 1-9 so if you have “14” next to each other it
should be considered 14 and not 1 and 4 separate:
         */


    public static void main(String[] args) {


        int numbers2 = numbers2("21");

        System.out.println("numbers = " + numbers2);



    }



    public static int numbers(String nums) {


       int count = 0;

       for (int i = 0; i < nums.length(); i++){
          char result = nums.charAt(i);

           if (Character.isDigit(result)) {
               int numericValue = Character.getNumericValue(result);
                count +=numericValue;

           }
       }


       return count;
    }


    public static int numbers2(String nums) {


        int count = 0;

        for (int i = 0; i < nums.length(); i++) {
            String eachDigit = nums;

            int eachDigitNums = Integer.parseInt(nums.substring(i, i + 2));
             count+=eachDigitNums;

        }

        return  count;


    }



    }










