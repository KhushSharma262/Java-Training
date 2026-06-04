// import java.util.Arrays;

class Fibbonaci {
    public static void main(String[] args) {
        int a = 10;
        febo(0, 1, a);
    }

    static void febo(int a, int b, int n){
        if (n == 0) return;

        System.out.println(a);
        febo(b, a+b, n-1);
    }
}
