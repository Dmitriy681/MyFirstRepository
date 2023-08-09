public class Soud {
    public static void main (String[] args) {
        double distM, distF, spF, spM, t;
        t = 7.2;
        spF = 1100;
        spM = 1100 / 330;
        distF = spF * 7.2;
        distM = distF / 3.3;
        System.out.println("Расстояние от вспышки молнии = " + distF +" в футах." );
        System.out.println("А в мтерах " +distM);


    }
}
