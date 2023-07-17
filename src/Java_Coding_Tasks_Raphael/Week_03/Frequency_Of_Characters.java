package Java_Coding_Tasks_Raphael.Week_03;

public class Frequency_Of_Characters {

    public static void main(String[] args) {

        String str = "AAABBCDD";

        String result = "";

        for (int j = 0; j < str.length(); j++) {

            int count = 0;
            char ch = str.charAt(j);

            for (int i = 0; i <str.length() ; i++) {
                if (str.charAt(i) == ch){
                    count ++;
                }
            }
            if (result.contains(""+ch)){
                continue;
            }
            result += ch + "" + count;
        }

        System.out.println(result);


    }

}



    /*
    1. Cоздаем луп что перебрать весь  str
    2. cоздаем переменную в которой надо размесить резульат   int count = 0;
    3. Создаем переменную char ch = str.charAt(0); с которой будем сравнивать то что перебирает луп
    4. Создаем иф в котором спрашиваем если то что мы перебираем в нашем лупе str.charAt(i) равняется тому что
    мы закрепили char ch = str.charAt(0); в данном случае это буква с индексом 0 т.е А то count ++ и получвется что луп сравниваем всю длинну на совпадение с нашим char ch = str.charAt(0) и если оно совпало count ++
    5.  System.out.println(ch + "" + count); обрати внимание, что мы конкетинейт сh который вне лупа который 0 и count
    и получаем в Ответе А3 буква А повторяется 3 раза
   ********************************************************************************************
        int count = 0;
        char ch = str.charAt(0);

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == ch){
                count ++;
            }
        }
        System.out.println(ch + "" + count);
   **************************************************************************************************


    Но мы идем дальше нам нужно узнать колличество каждой буквы , надо делать nested loop.

    1.помещаем наш первый луп в новый луп чтоб луп  for (int j = 0; j < str.length(); j++) { повторял луп
    for (int i = 0; i <str.length() ; i++) {
    2.

     */




