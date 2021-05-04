import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromienKuli {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Podaj promień: r = ");
        double r = Double.parseDouble(br.readLine());

        double objetosc = (4 *Math.PI* Math.pow(r,3))/3;
        System.out.printf("Objetosc kuli o promieniu "+ r +" wynosi: "+ "%3.2f\n",objetosc);

    }
}
