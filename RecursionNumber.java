class RecursionNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = factorial(a);

        System.out.println(b);
        
    }
    static int factorial (int n){
        if (n <= 1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
