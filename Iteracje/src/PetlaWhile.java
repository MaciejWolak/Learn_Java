public class PetlaWhile {
    public static void main(String[] args) {
        int x = 0, y;

        do{
            y = 3*x;
            System.out.println("y = 3x   dla x = "+ x + "    y = "+y);
            x++;
        }
        while (x<=10);

    }
}
