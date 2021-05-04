public class SortBabelkoweTablica {
    public static void main(String[] args) {
        int[] tablica = new int[6];
        int x;
        tablica[0] = 574;
        tablica[1] = 303;
        tablica[2] = 34;
        tablica[3] = 125;
        tablica[4] = 8;
        tablica[5] = 23;

        for (int i = 0; i <=5; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();



        for (int i = 1; i <=5; i++) {
            for (int j = 5; j >= i; j--) {
                if(tablica[j-1]>tablica[j]){
                    x=tablica[j-1];
                    tablica[j-1]=tablica[j];
                    tablica[j]=x;
                }
            }
        }
        for (int i = 0; i <=5; i++) {
            System.out.print(tablica[i] + " ");
        }

    }

}
