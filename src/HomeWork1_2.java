import com.UkranianITSchool.Korotkov.WorkFromArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 * Created by Андрей on 30.09.2015.
 */
public class HomeWork1_2 {
    public static void main(String[] args) {
        /*
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
        */
        /*
        //2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
        for (int ii = ms1.length-1; ii >= 0; ii--)
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

        //9.Ввести с консоли n-размерность матрицы a [n] [n].
        // Задать значения элементов матрицы в интервале значений от -n до n с помощью датчика случайных чисел.
        System.out.print("Введите размерность матрицы: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                a[i][j] = (int)((Math.random()*2*n)-n);
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        /*
        //9.1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений.
        //сортировка по строкам
        for (int i =0; i < a.length; i++){
            for (int k = a.length-1; k>=0; k--) {
                for (int j = 0; j < a.length; j++) {
                    if (j<a.length-1) {
                        if (a[i][j] > a[i][j + 1]) {
                            int buf = a[i][j + 1];
                            a[i][j + 1] = a[i][j];
                            a[i][j] = buf;
                        }
                    }
                }
            }
        }
        //Дальше сортировка по столбцам
        for (int j = 0; j<a.length; j++){
            for (int k = a.length-1; k>=0; k--){
                for (int i = 0; i < a.length; i++){
                    if (i<a.length-1){
                        if (a[i][j]>a[i+1][j]){
                            int buf = a[i+1][j];
                            a[i+1][j] =a[i][j];
                            a[i][j] = buf;
                        }
                    }
                }
            }
        }
        //Вывод отсартированного массива
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        */
        /*
        //9.2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз).
        System.out.print("Введите сдвиг k: ");
        int k = scan.nextInt();
        //WorkFromArray.shiftLeft(a, k);
        WorkFromArray.shiftRight(a, k);
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i])+" ");
        }
        */
        /*
        //9.3. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
        int indexai = 0, indexaj = 0, indexbi = 0, indexbj = 0, countN = 0;
        for (int i = 0; i < a.length-1; i++){
            int count = 0;
            for(int j = 0; j < a.length-1; j++){
                if (j < a.length-1){
                    if (a[i][j]<a[i][j+1]){
                        int ai = i, aj = j, bi = i, bj = j;
                        count +=1;
                        if (count > countN){
                            countN = count;
                            indexai = ai;
                            indexaj = aj;
                            indexbi = bi;
                            indexbj = bj;
                        }
                    } else {
                        count = 0;
                    }
                }
                if (j == a.length-1){
                    if (i<a.length-1){
                       if (a[i][j]<a[i+1][0]){
                           int ai = i, aj = j, bi = i+1, bj = 0;
                           count +=1;
                           if (count > countN){
                               countN = count;
                               indexai = ai;
                               indexaj = aj;
                               indexbi = bi;
                               indexbj = bj;
                           }
                       }else {
                           count = 0;
                       }
                    }
                }
            }
        }
        System.out.println(countN);
        System.out.println(indexai+" "+indexaj+" "+indexbi+" "+indexbj);
        */
        /*
        //9.4. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.
        int aSum[] = new int[n];
        for (int i = 0; i<a.length; i++){
            int sumBetweenPositiv = 0;
            int f = 0;
            for (int j = 0; j<a.length; j++){
                if (f == 2) break;
                if (f==1) {
                    if (a[i][j] <= 0) {
                        sumBetweenPositiv += a[i][j];
                        continue;
                    }
                    if (a[i][j]>0&&f==1){
                        f = 2;
                        break;
                    }
                    if (j == a.length-1&&f==1){
                        sumBetweenPositiv = 0;
                    }
                }
                if (f==0){
                if (a[i][j]>0) {
                    f = 1;
                    continue;
                }}
            }
            aSum[i]=sumBetweenPositiv;
        }
        System.out.println(Arrays.toString(aSum));
        */
        //9.5. Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.
        /*
        int a90[][]=new int[n][n];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j<a.length; j++){
                a90[i][j]=a[j][a.length-1-i];
            }
        }
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j<a.length; j++){
                System.out.print(a90[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        */
        /*
        //на 180 градусов
        int a180[][] = new int[n][n];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                a180[i][j]=a[a.length-1-i][a.length-1-j];
            }
        }
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j<a.length; j++){
                System.out.print(a180[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        */
        /*
        //на 270 градусов
        int a270[][] = new int[n][n];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                a270[i][j]=a[a.length-1-j][i];
            }
        }
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j<a.length; j++){
                System.out.print(a270[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        */
        /*
        //9.6 Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.
        int a_middle[] = new int[n];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                a_middle[i] +=a[j][i];
            }
            a_middle[i] /=n;
        }
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
               a[i][j] = a[i][j]-a_middle[i];
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        */
        //9.7. Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.
        int a0i[]=new int[n];
        int a0j[]=new int[n];
        for (int i = 0; i <a.length; i++){
            a0i[i]=-1;
            a0j[i]=-1;
        }
        for (int i = 0; i < a.length; i++){
            int f = 0;
            int count = 0;
            for (int j = 0; j<a.length; j++){
                if (f==0) {
                    if (a[i][0] == 0) {
                        f = 1;
                        count +=1;
                    }
                }
                if (f==1){
                    if (a[i][j]!=0){
                        f=2;
                        break;
                    }else count +=1;
                }
                if (f==2)break;
            }
            if (count == a.length) a0i[i]=i;
        } //тут мы определяем номера строк которые забиты 0
        for (int i = 0; i <a.length; i++){
            a0i[i]=-1;
            a0j[i]=-1;
        }
        for (int i = 0; i < a.length; i++){
            int f = 0;
            int count = 0;
            for (int j = 0; j<a.length; j++){
                if (f==0) {
                    if (a[0][i] == 0) {
                        f = 1;
                        count +=1;
                    }
                }
                if (f==1){
                    if (a[j][i]!=0){
                        f=2;
                        break;
                    }else count +=1;
                }
                if (f==2)break;
            }
            if (count == a.length) a0j[i]=i;
        } //тут мы определяем номера столбцов которые забиты 0
        System.out.println(Arrays.toString(a0i));
        System.out.println(Arrays.toString(a0j));

    }
}
