public class TabliczkaMnozeniaWhileWhile {
    public static void main(String[] args) {
        int i, j;

        i=1;

        while(i<=10){
            j=1;
            while(j<=10){
                System.out.print(i*j+"\t");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
