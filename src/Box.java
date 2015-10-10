/**
 * Created by uitsc_000 on 04.10.2015.
 */
public class Box {
    double width;
    double heigth;
    double depth;

    void volume(){
        System.out.print("Volume is ");
        System.out.println(width*heigth*depth);
    }
    double volume1(){
        return width*heigth*depth;
    }

    Box(){//конструктор по умолчанию
        System.out.println("Constructing Box");
        width = 10;
        heigth = 10;
        depth = 10;
    }
    Box(double w, double h, double d){//конструктор по умолчанию
        System.out.println("Constructing Box");
        width = w;
        heigth = h;
        depth = d;
    }
    protected void finalize(){
        System.out.println("Goodbye Box");
    }
}
