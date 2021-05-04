public class TabliczkaMnozeniaDoWhile{
    public static void main(String[] args) {

        int i , j = 1;

        do {
            i=1;
            do {
                System.out.print(i * j + "\t");
                i++;
            }
            while (i <= 10);
            j++;
            System.out.println();

        }
        while (j <= 10);
    }
}
