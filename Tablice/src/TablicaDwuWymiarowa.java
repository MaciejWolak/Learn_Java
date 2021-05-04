public class TablicaDwuWymiarowa {
    public static void main(String[] args) {
        int [][] tablica = new int[10][10];
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                if(i==j)
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
            suma+=tablica[i][i];
        }
        System.out.println("Suma: " + suma);
    }
}
