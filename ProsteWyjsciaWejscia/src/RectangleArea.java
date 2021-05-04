import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleArea {

    public static void main(String[] args)
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Oblicz polę prostokąta o bokach: a= ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("b= ");
        double b = Double.parseDouble(br.readLine());
        System.out.println("Pole prostokąta wynosi: " + a*b);

    }
}
