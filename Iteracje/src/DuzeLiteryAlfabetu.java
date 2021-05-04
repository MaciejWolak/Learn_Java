public class DuzeLiteryAlfabetu {
    public static void main(String[] args) {
        char znak;

        for (znak  = 'A';znak <= 'Z' ; znak++) {
            System.out.print(znak+" ");

        }
        System.out.println();
        for (znak  = 'Z';znak >= 'A' ; znak--) {
            System.out.print(znak+" ");

        }

    }
}
