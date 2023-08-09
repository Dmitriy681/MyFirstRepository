import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Point3D pt1 = new Point3D();
        pt1.x = 10;
        pt1.y = 20;
        System.out.println("X = " + pt1.x + ",Y = " + pt1.y);

        Line ln1 = new Line();{
            ln1.x = 200;
            ln1.y = 300;
            System.out.println(ln1.y + ln1.x);
            if (ln1.x < ln1.y){
                System.out.println("Line Y is Over");
            } else {
                System.out.println("X is Over");
            }
        }

    }





}
