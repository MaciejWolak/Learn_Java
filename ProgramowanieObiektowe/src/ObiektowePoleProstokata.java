public class ObiektowePoleProstokata {
    int a;
    int b;

    public ObiektowePoleProstokata(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int pole(){
        return a*b;
    }

    public static void main(String[] args) {
        ObiektowePoleProstokata prostokat = new ObiektowePoleProstokata(5,4);
        int x = prostokat.pole();
        System.out.println(x);

    }
}
