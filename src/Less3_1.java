/**
 * Created by uitsc_000 on 26.09.2015.
 */
public class Less3_1 {
    public  static void main(String[] args){
        /*int a = 7;
        int b = 2;
        System.out.println(a/b); //целочисленное делим на челочисленное и получим целое
        */

        /*int a = 7;
        System.out.println(a++);//начала видит а и выводит его значение, а затем добавляет еденицу
        System.out.println(++a);//к новому значению а добавляется еденица и затем выводится
        */

        /*double f = 0.1;
        double d = .5;
        */

        /*float x = 0, y = 0;
        x = (float)(0.3 + 0.4);
        y = 0.3f + 0.4f;
        System.out.println(x);
        System.out.println(y);
        System.out.println(x==y); //в х сначала в дабле складываем 2 числа и приводим во флоат.
        //в у мы складываем два очень приближенных числа, т.к. это такой тип
        */

        /*int a = 7;
        double b = 0.0;
        double c = -0.0;
        double d = 2.5;
        double g = Double.NEGATIVE_INFINITY; //минус бесконечность
        System.out.println(a/b);
        System.out.println(a/c);
        System.out.println(b == c);
        System.out.println(d/0);
        System.out.println(g*0);
        */

        /*char c1 = '1';
        char c2 = '\u0031';
        char c3 = 49;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c1 + c2 + c3);
        // происходит сложение кодировок, а не символов
        */

        /*char ch1, ch2;
        ch1 = 88;
        ch2 = 'y';
        System.out.println("ch1 and ch2: ");
        System.out.println(ch1 + " " + ch2);// онкотенация строк
        */

       /*System.out.println("4/2="+4/2 == "4/2=2");//сначала приоритет делению, затем конкатенация строки + число, а затем сравнение
       */

        //System.out.println("\u0420\u043e\u0441\u0438\u044f"); //вывод слова юникодом

       /* byte b1 = 50, b2 = -99;
        int k = b1 + b2;//все арифмитические действия происходят в инте
        System.out.println("k=" + k);
        */

        /*byte b1 = 50, b2 = -99;
        b1 += b2; //краткая запись. мы сложили b1 c b2 и записали все это в b1
        System.out.println("b1 = "+ b1);
        */

        byte b1 = 50, b2 = 100;
        byte k = (byte)(b1 + b2);//переполнение байта.
        System.out.println(k);



    }
}
