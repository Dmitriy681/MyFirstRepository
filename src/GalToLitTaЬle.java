
/*
Тест многострочного комментария
 */

public class GalToLitTaЬle {
    public static void main (String[] args) {
        double duim,metr,fut;
        int counter;

        counter = 0 ;
        for (duim = 1; duim <= 144; duim++) {  // переводим дюймы в метры
            metr = duim *0.025;
            fut = duim *12;
        System.out.println (duim+ " дюймов  " + metr + " в метрах ");

            counter++;
            if (counter == 12) { // 12 дюймов = 1 фут
               System.out.println();
               counter = 0;

                // тест однострочного комментария
                }
            }
        }
}

