import java.util.Scanner;

/**
 * Created by uitsc_000 on 27.09.2015.
 */
public class Less4 {
    public static void main(String[] args){
    /*System.out.println("Введите возраст ");
        Scanner scanner = new Scanner(System.in);
        String y = scanner.next();
        int year = Integer.parseInt(y);
        scanner.close();
        if ((year>3)&(year <= 6))
            System.out.println("Детский сад");
        else if ((year > 6)&(year <= 17))
            System.out.println("Школа");
            else if((year > 17)&(year <= 22))
                System.out.println("Университет");
                else if ((year > 22)&(year <= 60))
                    System.out.println("Работа");
                    else if ((year >60)&(year<=90))
                        System.out.println("Пенсия");
                        else if (year > 90)
                        System.out.println("Смерть");
                            else if ((year <= 3)&(year >=0))
                            System.out.println("Младенец");
                                else if (year < 0) System.out.println("Возраст не может быть отрицательным");
       */

       /* System.out.println("Введите номер дня: ");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next();
        int d = Integer.parseInt(day);
        scanner.close();
        switch (d){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Будний день недели");
                break;
            case 6:
            case 7:
                System.out.println("Выходной день недели");
                break;
            default:
                System.out.println("Несуществующий день недели");
        }
        */

        /*int n = 10;
        while (n>0){
            System.out.println("tick "+n);
            n--;
        }
        */

        /*int i=100, j=200;
        while (++i < --j);
        System.out.println("Среднее значение "+i);//Цикл без тела
        */

        /*int n = -10;
        do{
            System.out.println("tick "+n);
            n--;
        }
        while (n>0);
        */

        /*int n;
        for (n=10; n>0;n--){
            System.out.println("tick "+n);
        }
        */

        //for (int n =0; n<100; n++, System.out.println(n));

        /*for (int i = 1; i <= 100; i++){
            if ((i % 2) == 0){
                System.out.println(i);
            }
        }
        */

        /*int n=1;
        while (n<=100){
            if ((n%2)==0){
                System.out.println(n);
            }
            n++;
        }
        */

        /*int i = 1;
        do {
            if ((i%2)==0) {
                System.out.println(i);
            }
            i++;
        }
        while (i<=100);
        */

        /*int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for(int x : nums){
            System.out.println("Value is: "+x);
            sum +=x;
        }
        System.out.println("Summation: "+sum);
        */

        /*
        int sum = 0;
        int nums[][] = new int[3][5];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j]=(i+1)*(j+1);

        for (int x[]:nums){
            int sum1 = 0;
            for (int y : x){
                //System.out.println("Value is: "+y); //вывод элемента массива
                sum +=y;
                sum1 +=y;
            }
            System.out.println("Summation: "+sum1); //сумма каждой строки массива
        }
        System.out.println("Summation: "+sum);//общая сумма массива
        */


        /*
        for (int i = 0; i<10; i++){
            if ((i%2)==0) continue;
            System.out.println(i+ " ");
        }
        */


        /*
        boolean t = true;
        first: {
            second: {
                third: {
                    System.out.println("Before the break.");
                    if (t) break second;
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after second block");
        }
        */


        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i =0; i < nums.length; i++){
            int j = i+1;
            if (j%3!=0)continue;
            System.out.println(nums[i]);
        }
    }
}
