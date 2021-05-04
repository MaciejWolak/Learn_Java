public class TablicaDwuKwadratLiczb {
    public static void main(String[] args) {
        int n = 10, suma;
        int [][] tablica = new int[n][n];

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                if(j==0) tablica[i][j]=i;
                if(j==1) tablica[i][j]=i*i;
                if(j>1) tablica[i][j]=0;
            }
        }

        for (int[] ints : tablica) {
            for (int j = 0; j < tablica.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

        suma=0;
        for (int[] ints : tablica) {
            suma += ints[0];
        }
        System.out.println("suma pierwszej kolumny : "+ suma);
        suma=0;
        for (int[] ints : tablica) {
            suma += ints[1];
        }
        System.out.println("suma w drugiej kolumnie : " + suma);
    }
}
