public class MacierzeSuma {
    public static void main(String[] args) {

        int n = 10;
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = 1;
            }
        }
        for (int[] item : a) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(item[j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = 2;
            }
        }
        for (int[] item : b) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(item[j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        for (int[] item : c) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(item[j] + " ");
            }
            System.out.println();
        }
    }
}
