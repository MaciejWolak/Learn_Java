public class CiagFibonaciego {
    public static int ciagF(int n){
        switch (n){
            case 0: return 0;
            case 1: return 1;
            default:return ciagF(n-1)+ciagF(n-2);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i+" = "+ciagF(i));
        }
    }
}

