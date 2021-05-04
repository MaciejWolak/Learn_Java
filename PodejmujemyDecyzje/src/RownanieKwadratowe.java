import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RownanieKwadratowe {
    public static void main(String[] args) throws IOException {
       /* System.out.println("ax2+bx+c=0");
        System.out.println("delta=b2-4ac");
        System.out.println("delta < 0 brak rozwiazan");
        System.out.println("delta = 0  x1 = -b/2a");
        System.out.println("delta > 0 x1=(-b-sqrt(delta))/2a x2=(-b+sqrt(delta))/2a");*/

        double a, b, c, delta, x1, x2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Podaj a: ");
        a = Double.parseDouble(br.readLine());
        if(a==0){
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

        if (delta < 0) {
            System.out.println("Brak rozwiązan");
        } else {
            if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.printf("Jedno miejsce zerowe : x1 = " + "%2.2f\n",x1);
                //System.out.println(a*x1*x1+b*x1+c);
            } else {
                System.out.println("Dwa miesjca zerowe");
                x1 = (-b - Math.sqrt(delta)) / 2 * a;
                System.out.printf("piersze: x1 = " + "%2.2f\n",x1);
                //System.out.println(a*x1*x1+b*x1+c);
                x2 = (-b + Math.sqrt(delta)) / 2 * a;
                System.out.printf("drugie: x2 = "+ "%2.2f\n",x2);
                //System.out.println(a*x2*x2+b*x2+c);
            }
        }
    }
}

