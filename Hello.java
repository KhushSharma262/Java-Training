class Hello
{
    public static void main(String[] args){
        float a = 10.50f;

        int b = (int) a;
        if (a > b + 0.5){
            b = b + 1;
        }
        else if(a == b + 0.5){
            if (b % 2 != 0){
                b = b + 1;
            }
            
        }
        System.out.print(b);
    }
}