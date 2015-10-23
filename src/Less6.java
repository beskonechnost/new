/**
 * Created by uitsc_000 on 04.10.2015.
 */
public class Less6 {
    public static void main(String[] args) {

        Box mybox = new Box();
        mybox.depth = 15;
        mybox.heigth = 20;
        mybox.width = 10;
        mybox.volume();

        Box mybox1 = new Box();
        mybox1.width = 10;
        mybox1.heigth= 12;
        mybox1.depth = 5;
        mybox1.volume();

        double vol, vol1;
        vol = mybox.volume1();
        vol1 = mybox1.volume1();
        System.out.println("Volume Box and Box1 is "+vol+" & "+vol1);

        Box mybox2 = new Box(); //конструктор по умолчанию
        double vol2;
        vol2 = mybox2.volume1();
        System.out.println(vol2);

        mybox2=null;
        System.gc();//явный вызов сборщика мусора
    }
}
