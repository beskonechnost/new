import com.UkranianITSchool.Korotkov.OverloadDemo;

/**
 * Created by uitsc_000 on 10.10.2015.
 */
public class Less7 {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.35): "+result);
    }
}
