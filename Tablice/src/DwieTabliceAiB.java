public class DwieTabliceAiB {
    public static void main(String[] args) {
        int n = 10;
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = j;
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
                b[i][j] = 0;
            }
        }
        for (int[] value : b) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(value[j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i][j]==0) b[i][j]=i;
                if(a[i][j]>0) b[i][j]=i;
            }
        }
        for (int[] ints : b) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }


    }
}
