package Java_Coding_Tasks_Raphael.InterViewPrep.Overriding_Overloading;

public class Method_Overloading {

    public static void main(String[] args) {

        int sun = sun(1, 2);

        System.out.println("sun = " + sun);


        int sun1 = sun(1,2 , 5);

        System.out.println("sun1 = " + sun1);


        int sun2 = sun(2, 7, 9, 12);

        System.out.println("sun2 = " + sun2);


    }


    public static int sun(int a, int b){
        return  a+b;
    }

    public static int sun(int a, int b, int c){
        return  sun(a,b) +c;
    }

    public static int sun(int a, int b, int c, int d){
        return  sun(a,b,c)+d;
    }






}
