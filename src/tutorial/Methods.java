package tutorial;

public class Methods {

    public static void main(String[] args) {
        doMath(5, 7);
    }

    static int doMath(int x, int y)
    {
        x += y;
        print(x);
        return x;
    }

    static void print(int x)
    {
        System.out.println(x);
    }
}
