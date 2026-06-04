class Twopointersearch {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,7,87,23,21,1,3,43,3,65,43,2,324};
    int i = 0;
    int n = arr.length;
    int j = n-1;

    while(i<j){
        if (arr[i] != 43){
            i++;
        }

        else if (arr[j] != 43){
            j--;
        }
        else if (arr[i] == 43){
            System.out.println("I found it " + i);
            break;
        }
        else if (arr[j] == 43){
            System.out.println("I found it " + j);
            break;
        }
    }

} 
}
