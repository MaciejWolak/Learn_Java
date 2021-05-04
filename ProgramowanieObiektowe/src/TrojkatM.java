public class TrojkatM {
    public static int trojkat(int n) {
        if (n == 1) return 1;
        else return (n + trojkat(n-1));
    }


    public static void main(String[]args){

        for(int i=1;i<=10;i++){
            System.out.println(i+" = " + trojkat(i));
        }
    }
}
