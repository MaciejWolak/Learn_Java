public class TablicaDwuwymiarowaPrzekatnaOdKonca {
    public static void main(String[] args) {
        int [][] tablica = new int[10][10];
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                if(10==i+j+1)
                    tablica[i][j] = 1;
                else
                    tablica[i][j] = 0;
            }
        }

        for (int[] ints : tablica) {
            for (int j = 0; j < tablica.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < tablica.length; i++) {
            suma+=tablica[i][10-i-1];
        }
        System.out.println("Suma: " + suma);
    }
}
