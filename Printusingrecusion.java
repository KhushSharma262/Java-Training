class Printusingrecusion {
    static void OneToN(int n)
    {
        // Base case
        if(n==0) return;

        //Recursive case
        System.out.print(n + " ");
        OneToN(n-1);

    }
    public static void main(String[] args) {
    }
    
    
}
