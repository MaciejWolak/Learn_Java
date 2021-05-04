import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ZgadywankaCyfry {
    public static void main(String[] args) throws IOException {
        double losujLiczbe, zgadnijLiczbe;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Random r = new Random();

        System.out.println("Losowanie liczby");
        losujLiczbe = Math.round(9*r.nextDouble());
        System.out.print("Wpisz liczbe od 0 do 9 ...... :");
        zgadnijLiczbe = Double.parseDouble(br.readLine());

        if(losujLiczbe==zgadnijLiczbe){
            System.out.println("Zgadłeś: " + losujLiczbe);
        }
        else{
            System.out.println("Niestety, wylosowana liczba to : " + (int)losujLiczbe);
        }
    }
}
