public class UzupelnienieTablicyOdKonca {
    public static void main(String[] args) {

        int[] tablica = new int[10];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = 10 - 1 - i;
        }

        for (int x:tablica) {
            System.out.print(x +",");
        }

    }
}
