import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Андрей on 28.09.2015.
 */
public class HomeWork1_1 {
    public static void main(String[] args) {
        /*
        //1. Приветствовать любого пользователя при вводе его имени через командную строку.
        System.out.println("Доброго времени суток, как Вас зовут?");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        scan.close();
        System.out.println("Здравствуйте "+name);
        */

        /*
        //2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
        System.out.print("Введите число n -количество чисел: ");
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        int mass[] = new int[n];
        for (int i = 0; i < n; i++) {
            mass[i] = scan.nextInt();
        }
        scan.close();
        System.out.println("Выведем элементы в обратном порядке");
        for (int i = 0; i < mass.length/2; i++){
            int buf = mass[i];
            mass[i] = mass[mass.length-i-1];
            mass[mass.length-i-1] = buf;
        }
        for (int i = 0; i < n; i++){
            System.out.println(mass[i]);
        }
        */


        /*
        //3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
        System.out.print("Задайте количество чисел, сгенерированных автоматически: ");
        Scanner scan = new Scanner(System.in);
        String ch = scan.next();
        scan.close();
        int n = Integer.parseInt(ch);
        for (int i = 1; i <=n; i++){
            Random rand = new Random();
            int a = rand.nextInt();
            System.out.println(a);
        }
        for (int i = 1; i <=n; i++){
            Random rand = new Random();
            int a = rand.nextInt();
            System.out.print(a+" ");
        }
        */


        /*//4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
        String sample = "Kod";
        System.out.print("Введите пароль: ");
        Scanner scan = new Scanner(System.in);
        String password = scan.next();
        scan.close();
        if (Objects.equals(sample, password)) //Знак == применять нельзя, т.к. в таком случае будут сравниваться ссылки на объеты, а ссылки разные
        //equals - сравнивает по символьно.
            System.out.println("Пароль принят, доступ разрешен");
        else System.out.println("Пароль не верный. Перезапустите программу и попробуйте снова.");
        */
        /*
        //5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.
        System.out.print("Введите количество чисел (число n): ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int mass[]= new int[n];
        for (int i = 0; i < n; i++){
            mass[i] = scan.nextInt();
        }
        int sum = 0;
        int mul = 1;
        for (int i = 0; i < n; i++){
            sum += mass[i];
            mul *= mass[i];
        }
        System.out.println("Сумма всех чисел: "+sum);
        System.out.println("Произведение всех чисел: "+mul);
        */


        //6.Ввести с консоли n целых чисел. На консоль вывести: следующее
        System.out.print("Введите число n: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int mass[]= new int[n];
        for (int i = 0; i < n; i++){
            mass[i]=scan.nextInt();
        }
        scan.close();
        /*
        //6.1. Четные и нечетные числа.
        System.out.print("Четные: ");
        for (int i = 0; i < n; i++){
            if (mass[i]%2==0) System.out.print(mass[i] + " ");
        }
        System.out.println(" ");
        System.out.print("Нечетные: ");
        for (int i = 0; i < n; i++){
            if (mass[i]%2!=0) System.out.print(mass[i]+" ");
        }
        System.out.println(" ");
        //6.2. Наибольшее и наименьшее число.
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            if (mass[i]<min) min = mass[i];
            if (mass[i]>max) max = mass[i];
        }
        System.out.println("Минимальное из заданых чисел: "+min);
        System.out.println("Максимальное из заданых чисел: "+max);
        //6.3. Числа, которые делятся на 3 или на 9.
        System.out.print("Числа, которые делятся на 3 или на 9: ");
        int f1 = 0;
        for (int i = 0; i < n; i++){
            if ((mass[i]%3==0)||(mass[i]%9==0))
            {
                System.out.print(mass[i]+" ");
                f1=1;
            }
        }
        if (f1==0) System.out.print("таких чисел нет");
        System.out.println(" ");
        //6.4. Числа, которые делятся на 5 и на 7.
        System.out.print("Числа, которые делятся на 5 и на 7: ");
        int f2 = 0;
        for (int i = 0; i < mass.length; i++){
            if ((mass[i]%5==0)&&(mass[i]%7==0))
            {
                System.out.println(mass[i]+" ");
                f2 = 1;
            }
        }
        if (f2==0) System.out.print("таких чисел нет");
        System.out.println(" ");
        //6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
        System.out.print("Одинаковых цифр нет в трехзначных числах: ");
        String ms[] = new String[n];
        int f3 = 0;
        int f4 = 0;
        for (int i = 0; i < mass.length; i++){
            ms[i]= String.valueOf(mass[i]);
        }
        for (int i = 0; i < ms.length; i++){
            if (ms[i].length()==3){
                byte a[] = ms[i].getBytes();
                if ((a[0]!=a[1])&&(a[0]!=a[2])&&(a[1]!=a[2])) {
                    System.out.print(mass[i] + " ");
                    f3 = 1;
                }
            }
        }
        if (f3 == 0) System.out.println("таких чисел нет");
        System.out.println(" ");
        //6.6. «Счастливые» числа.
        System.out.print("\"Счастливые\" числа: ");
        for (int i = 0; i < ms.length; i++){
            if (ms[i].length()%2==0){
                byte a[] = ms[i].getBytes();
                int count = 0;
                for (int j = 0; j < a.length/2; j++) {
                    if (a[j] != a[a.length - j - 1]) break;
                    else {
                        count += 1;
                    }
                }
                if (count == a.length/2){
                    f4 = 1;
                    System.out.print(mass[i]+" ");
                }
            }
        }
        if (f4==0) System.out.println("таких чисел нет");
        System.out.println(" ");
        */
        // 6.7. Элементы, которые равны полусумме соседних элементов.
        System.out.print("Элементы, которые равны полусумме соседних элементов: ");
        float ms1[] = new float[n];
        int f5 = 0;
        for (int i = 0; i < mass.length; i++){
            ms1[i]=mass[i];
        }
        for (int i = 0; i < ms1.length; i++){
            if (i==0){
                if (ms1[i]==ms1[i+1]/2) {
                    System.out.print(mass[i]+" ");
                    f5 = 1;
                }
                continue;
            }
            if (i==ms1.length){
                if (ms1[i]==ms1[ms1.length-1]/2) {
                    System.out.print(mass[i]+" ");
                    f5 = 1;
                }
                continue;
            }
            if (ms1[i] == ((ms1[i - 1] + ms1[i + 1]) / 2))
            {
            System.out.println(mass[i]+" ");
            f5 = 1;
            }
        }
        if (f5==0) System.out.println("таких чисел нет");
        System.out.println(" ");
    }
}
