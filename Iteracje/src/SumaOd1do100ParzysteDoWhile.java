public class SumaOd1do100ParzysteDoWhile {
    public static void main(String[] args) {
        int suma = 0, i = 1;

        do{
            if(i%2==0) suma += i;
                System.out.println(suma);
                i++;
        }
        while (i<=100);
    }
}
