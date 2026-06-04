class SumofDigit {
    public static void main(String[] args) {
        int n = 121323598;
        System.out.println(Sum(n));
    }
    static int Sum(int n){
        if (n == 0) return 0;

        return (n % 10) + Sum(n/10);
    }
}
