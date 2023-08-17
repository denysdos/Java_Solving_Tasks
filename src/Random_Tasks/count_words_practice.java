package Random_Tasks;

public class count_words_practice {

    public static void main(String[] args) {

        //denys
        //01234

        /*
        Есть  String str
        переменная  int count = 0; - в которую сохраняем наш результат
        луп от 0 до -4 (минус 4 это длинна нашего слова которое нужно найти длинна по индеку 0 - 4 = 5 букв)
        str.substring(i, i + 5) где i это ноль
        почему пять - сабстринг меряет от 0 т.е от первого символа и до последнего симлова +1.
        например слово  denys - 5 букв но если по индексу то будет 4 - 0,1,2,3,4 НО мы делаем сабстринг i + 5
        т.е 5 потому что перед пятым символом заканчивается наше слово.

         */

        String str = "ppa vva denys renys denis denysdenys penysdenys Denys senysDenys"; //6

        int count = 0;

        for (int i = 0; i < str.length()-4 ; i++) {

             if (str.substring(i, i + 5).equalsIgnoreCase("denys")){
                 count++;
             }

        }

        System.out.println(count);

    }


}
