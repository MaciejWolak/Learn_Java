import java.util.Random;

public class LosoweMinMax {
    public static void main(String[] args) {
        int iloscLiczb = 5;
        double suma = 0, min, max, liczba;
        Random r = new Random();
        min = Math.round(100*(r.nextDouble()));
        max=min;
        suma+=max;


        for (int i = 1; i <= iloscLiczb-1; i++) {
            liczba = Math.round(100*(r.nextDouble()));
            System.out.print(liczba+",");
            if(max<liczba) max=liczba;
            if(liczba<min) min=liczba;

            suma+=liczba;
        }
        System.out.println("max to "+max);
        System.out.println("min to "+min);
        System.out.println("suma to "+suma);
        System.out.println("srednia to "+suma/iloscLiczb);

    }
}
