import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CzyTrojkatProstokatny {
    public static void main(String[] args) throws IOException {
        int a,b,c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Wprowadz bok a: ");
        a = Integer.parseInt(br.readLine());
        System.out.print("Wprowadz bok b: ");
        b = Integer.parseInt(br.readLine());
        System.out.print("Wprowadz bok c: ");
        c = Integer.parseInt(br.readLine());
        if(a*a+b*b==c*c){
            System.out.println("Boki tworzą trojkat prostokątny");
        }
        else {
            System.out.println("Podane boki nie tworza tojkata prostokatnego");
        }


    }
}
