import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RekurencjaSilnia {
    public long silnia(int liczba){
        long zwrot = 1;
        if(liczba>=2){
            zwrot = liczba * silnia(liczba - 1);
        }
        return zwrot;
    }

    public static void main(String[] args) throws IOException {
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        RekurencjaSilnia rsilnia = new RekurencjaSilnia();
        n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            System.out.println(i+" ! = "+ rsilnia.silnia(i));
        }

    }

}
