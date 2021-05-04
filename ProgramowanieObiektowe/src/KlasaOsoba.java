import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KlasaOsoba {

    String nazwisko,imie, ulica,kod,miasto;
    public void inicjuj() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Podaj nazwisko: ");
        nazwisko = br.readLine();
        System.out.print("Podaj imie: ");
        imie = br.readLine();
        System.out.print("Podaj ulica: ");
        ulica = br.readLine();
        System.out.print("Podaj kod: ");
        kod = br.readLine();
        System.out.print("Podaj miasto: ");
        miasto = br.readLine();
    }
    public void drukuj(){
        System.out.println("Wyswietl dane: ");
        System.out.println("nazwisko: " + nazwisko);
        System.out.println("imie: " + imie);
        System.out.println("ulica: " + ulica);
        System.out.println("kod: " + kod);
        System.out.println("miasto: " + miasto);
    }
}
class Karta{
    public static void main(String[] args) throws IOException {
        KlasaOsoba osoba = new KlasaOsoba();
        osoba.inicjuj();
        osoba.drukuj();
    }
}
