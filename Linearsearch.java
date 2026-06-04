class Linearsearch{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3,21,};
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if (arr[i] == 21){
                System.out.println(i);
                break;
            }
        }
    }
}