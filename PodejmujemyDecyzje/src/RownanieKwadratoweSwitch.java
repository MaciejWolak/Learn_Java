import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RownanieKwadratoweSwitch {
    public static void main(String[] args) throws IOException {

        double a, b, c, delta, x1, x2;
        char liczba_pierwiastkow = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Podaj a: ");
        a = Double.parseDouble(br.readLine());
        if (a == 0) {
            System.out.println("a nie może być zerem - podaj jeszcze raz");
            System.out.print("Podaj a: ");
            a = Double.parseDouble(br.readLine());
        }
        System.out.print("Podaj b: ");
        b = Double.parseDouble(br.readLine());
        System.out.print("Podaj c: ");
        c = Double.parseDouble(br.readLine());
        delta = (b * b) - 4 * a * c;
        System.out.println("delta wynosi: " + delta);
        if (delta == 0) liczba_pierwiastkow = 1;
        if (delta > 0) liczba_pierwiastkow = 2;

        switch (liczba_pierwiastkow) {
            case 0 -> System.out.println("Brak rozwiązan");
            case 1 -> {
                x1 = -b / (2 * a);
                System.out.printf("Jedno miejsce zerowe : x1 = " + "%2.2f\n", x1);
            }
            case 2 -> {
                System.out.println("Dwa miesjca zerowe");
                x1 = (-b - Math.sqrt(delta)) / 2 * a;
                System.out.printf("piersze: x1 = " + "%2.2f\n", x1);
                x2 = (-b + Math.sqrt(delta)) / 2 * a;
                System.out.printf("drugie: x2 = " + "%2.2f\n", x2);
            }
        }

    }

}
