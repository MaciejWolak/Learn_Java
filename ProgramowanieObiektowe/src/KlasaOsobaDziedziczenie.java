import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KlasaOsobaDziedziczenie {
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
class Kadra extends KlasaOsobaDziedziczenie {
    String wyksztalcenie;
    String stanowisko;

    @Override
    public void inicjuj() throws IOException {
        super.inicjuj();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Podaj wyksztalcenie: ");
        wyksztalcenie = br.readLine();
        System.out.print("Podaj stanowisko: ");
        stanowisko = br.readLine();
    }

    @Override
    public void drukuj() {
        super.drukuj();
        System.out.println("wyksztalcenie: " + wyksztalcenie);
        System.out.println("stanowisko: " + stanowisko);
    }

    public static void main(String[] args) throws IOException {
        Kadra kadra = new Kadra();
        kadra.inicjuj();
        kadra.drukuj();

    }
}