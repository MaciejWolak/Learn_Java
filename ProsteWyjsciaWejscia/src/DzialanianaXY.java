import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DzialanianaXY {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Podaj liczbe x : ");
        float x = Float.parseFloat(br.readLine());
        System.out.print("Podaj liczbe y : ");
        float y = Float.parseFloat(br.readLine());
        System.out.printf("Dodawanie : "+"%3.2f\n",x+y);
        System.out.printf("Odejmowanie : "+"%3.2f\n",x-y);
        System.out.printf("Mnozenie : "+"%3.2f\n",x*y);
        System.out.printf("Dzielenie : "+"%3.2f\n",x/y);
    }
}
