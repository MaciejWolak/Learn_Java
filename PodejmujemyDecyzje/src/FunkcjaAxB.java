import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunkcjaAxB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a,b,c,x;
        System.out.println("podaj a: ");
        a = Double.parseDouble(br.readLine());
        if(a==0){
            System.out.println("podaj a: ");
            a = Double.parseDouble(br.readLine());
        }
        System.out.println("podaj b: ");
        b = Double.parseDouble(br.readLine());
        System.out.println("podaj c: ");
        c = Double.parseDouble(br.readLine());

        x=(c-b)/a;

        System.out.println("x = " + x);

    }
}
