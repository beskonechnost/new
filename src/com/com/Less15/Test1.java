package com.com.Less15;

/**
 * Created by uitsc_000 on 07.11.2015.
 */
class Start<T extends Number>{
    T[] nums;

    public Start(T[] nums) {
        this.nums = nums;
    }
    double average(){
        double sum = 0.0;
        for ( int i = 0; i < nums.length; i++){
            sum +=nums[i].doubleValue();
        }
        return sum/nums.length;
    }
    boolean r1 (Start<?> b){//? - позволяет сравнить любой тип с любым типом
        return average()== b.average();
    }
}

public class Test1 {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Start<Integer> iOb = new Start<>(inums);
        double v = iOb.average();
        System.out.println("iob average is "+v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Start<Double> dob = new Start<>(dnums);
        double w = dob.average();
        System.out.println("dob average is "+w);

        System.out.println(dob.r1(iOb));
    }

}
