import java.util.Scanner;


/**
 * Created by Андрей on 30.09.2015.
 */
public class HomeWork1_2 {
    public static void main(String[] args) {
        //Ввести n чисел с консоли.
        System.out.print("Введите количество чисел в массиве: ");
        Scanner scan = new Scanner(System.in);
        int  n = scan.nextInt();
        System.out.println("Введите аргументы массива: ");
        int mass[] = new int[n];
        for (int i = 0; i < mass.length; i++){
            mass[i]=scan.nextInt();
        }
        //1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        String ms[] = new String[n];
        byte ms1[] = new byte[n];
        int min_length = Integer.MAX_VALUE;
        int max_length = Integer.MIN_VALUE;
        int min_number = 0, max_number = 0;
        for (int i = 0; i < ms.length; i++){
            ms[i]=String.valueOf(mass[i]);
            byte a[] = ms[i].getBytes();
            ms1[i] = (byte) a.length;
            if (a.length < min_length){
                min_length = a.length;
                min_number = mass[i];
            }
            if (a.length > max_length){
                max_length = a.length;
                max_number = mass[i];
            }
        }
        System.out.println("Самое длинное число: "+max_number+", оно имеент длинну: "+max_length);
        System.out.println("Самое короткое число: "+min_number+", оно имеент длинну: "+min_length);
        //2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
        /*for (int ii = ms1.length-1; ii >= 0; ii--)
            for (int i = 0; i < ms1.length; i++) {
                if (i < ms1.length - 1) {
                    if (ms1[i] > ms1[i + 1]) {
                        int buf = mass[i + 1];
                        byte buf1 = ms1[i + 1];
                        mass[i + 1] = mass[i];
                        ms1[i + 1] = ms1[i];
                        mass[i] = buf;
                        ms1[i] = buf1;
                    }
                }
            }
        for (int i = 0; i < mass.length; i++){
            System.out.print(mass[i] + " ");
        }
        System.out.println("");
        */
        /*
        //3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
        byte midl = 0;
        for (int i = 0; i < ms1.length; i++){
            midl += ms1[i];
        }
        midl /= n;
        System.out.println("Средняя длина числа состовляет "+midl);
        System.out.println("Числа, длина которых меньше средней, а также их длина: ");
        for (int i = 0; i < ms1.length; i++){
            if (ms1[i] < midl){
                System.out.println("Число "+mass[i]+" имеет длинну "+ms1[i]);
            }
        }
        System.out.println("Числа, длина которых больше средней, а также их длина: ");
        for (int i = 0; i < ms1.length; i++){
            if (ms1[i] > midl){
                System.out.println("Число "+mass[i]+" имеет длинну "+ms1[i]);
            }
        }
        */
        /*
        //4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.
        byte ms_matches[] = new byte[n];
        byte min_number_matches = Byte.MAX_VALUE;
        int min_number_matches_ch =0;
        for (int i = 0; i < ms.length; i++) {
            byte a[] = ms[i].getBytes();
                if (a.length == 1) {
                    ms_matches[i] = 1;
                } else {
                    for (int j = a.length-1; j >=0; j--){
                        for (int jj = 0; jj < a.length; jj++){
                            if (jj < a.length){
                                if (a[j]<a[jj]){
                                    byte buf1 = a[j];
                                    a[j] = a[jj];
                                    a[jj] = buf1;
                                }
                            }
                        }
                    }
                    byte buf1 =1;
                    for (int j = 0; j < a.length; j++){
                        if (j < a.length-1){
                            if(a[j]!=a[j+1]){
                                buf1 +=1;
                            }
                        }
                    }
                    ms_matches[i] = buf1;
                }
        }
        for (int i = 0; i < mass.length; i++){
            if (min_number_matches > ms_matches[i]){
                min_number_matches_ch = mass[i];
                min_number_matches = ms_matches[i];
            }
        }
        System.out.println("Число, в котором число различных цифр минимально: "+min_number_matches_ch);
        */
        /*
        //5. Найти количество чисел, содержащих только четные цифры, (а среди них количество чисел с равным числом четных и нечетных цифр.)?????
        int count_only_even = 0;
        boolean flag2 = false;
        for (int i = 0; i < ms.length; i++){
            byte a[] = ms[i].getBytes();
            int buf = 0;
            for (int j = 0; j < a.length; j++){
                if (a[j]%2==0) buf +=1;
                else break;
            }
            if (buf == a.length){
                count_only_even +=1;
                flag2 = true;
            }
        }
        if (flag2 == true)
        System.out.println("Количество чисел, содержащих только четные числа: "+count_only_even);
        else System.out.println("Количество чисел, содержащих только четные числа: таких чисел нет");
        int an_equal_number_of_odd_and_even = 0;
        for (int i = 0; i < ms.length; i++){
            if (mass[i]%2==0){
                byte a[] = ms[i].getBytes();
                int even = 0;
                int odd = 0;
                for (int j = 0; j < a.length; j++){
                    if (a.length%2==0) {
                        if (a[j] % 2 == 0) even += 1;
                        else odd += 1;
                        if (odd==even){
                            an_equal_number_of_odd_and_even +=1;
                        }
                    }
                }
            }
        }
        if (an_equal_number_of_odd_and_even !=0) System.out.println("Среди четных, количество с равным числом четных и нечетных цифр: "+an_equal_number_of_odd_and_even);
        else System.out.println("Среди четных, количество с равным числом четных и нечетных цифр: таких чисел нет.");
        */
        /*
        //6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
        int order_to_high = 0;
        int flag =0;
        for (int i =0; i < ms.length; i++){
            byte a[]=ms[i].getBytes();
            int buf = 0;
            if (a.length == 1){
                continue;
            }
            for (int j = 0; j < a.length; j++){
                if (j < a.length-1){
                    if (a[j]<a[j+1]){
                        buf +=1;
                    }
                }
            }
            if (buf == a.length-1){
                flag = 1;
                order_to_high = mass[i];
                break;
            }
        }
        if (flag == 0) System.out.println("Число, цифры в котором идут в строгом порядке возрастания: такого числа нет");
        else
        System.out.println("Число, цифры в котором идут в строгом порядке возрастания: "+order_to_high);
        */
        /*
        //7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
        int only_different_numbers = 0;
        int flag1 =0;
        for (int i = 0; i < ms.length; i++){
            byte a[] = ms[i].getBytes();
            if (a.length == 1){
                continue;
            }
            int buf1 =0;
            for (int j =0; j < a.length-1; j++){
                for (int k = 1; k < a.length; k++){
                    int buf =0;
                    if (a[j] != a[k]){
                        buf +=1;
                    }
                    if (buf == a.length-k){
                        buf1 +=1;
                    }
                }
            }
            if (buf1 == a.length-1){
                flag1 = 1;
                only_different_numbers = mass[i];
                break;
            }
        }
        if (flag1 == 1)
            System.out.println("Число, состоящее только из различных цифр: "+only_different_numbers);
        else System.out.println("Число, состоящее только из различных цифр: такого числа нет");
        */
        /*
        //8. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.
        System.out.print("Введите значение параметра к: ");
        int k = scan.nextInt();
        System.out.print("Зададим размерность вывода NxN: ");
        int dimension = scan.nextInt();
        scan.close();
        int buffer = 0;
        int noll = 0;
        if ((dimension*dimension)>k){
            noll = dimension*dimension-k;
            System.out.println("Для вывода матрицы не достает "+noll+" элементов. Заменим эти элементы на 0");
        }
        if ((dimension*dimension)<k){
            System.out.println("Параметер k больше размерности матрицы! Все элементы не будут показаны.");
        }
        for (int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++){
                if (buffer<=k-1){
                    if (buffer<=n-1) {
                        System.out.print(mass[buffer] + " ");
                        buffer += 1;
                    }
                    else {
                        System.out.print("0 ");
                        buffer +=1;
                    }
                }
                else {
                    System.out.print("0 ");
                    buffer +=1;
                }
                if (j==dimension-1){
                    System.out.println(" ");
                }
            }
        }
        */


    }
}
