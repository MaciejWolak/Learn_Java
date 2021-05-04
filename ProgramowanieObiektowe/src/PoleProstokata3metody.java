import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PoleProstokata3metody {
    double a,b,pole;

    public void czytaj() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("podaj a: ");
        a = Double.parseDouble(br.readLine());
        System.out.print("podaj b: ");
        b = Double.parseDouble(br.readLine());
    }
    public void oblicz(){
        pole = a * b;
    }
    public void wyswietlWynik(){
        System.out.println("pole prostokata o bokach: a = "+a+" b = "+b+" wynosi : "+pole);
    }

    public static void main(String[] args) throws IOException {
        PoleProstokata3metody prostokat = new PoleProstokata3metody();
        prostokat.czytaj();
        prostokat.oblicz();
        prostokat.wyswietlWynik();
    }


}
