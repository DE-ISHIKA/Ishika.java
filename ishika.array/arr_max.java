public class arr_max {
    public static void main(String[] args) {
        int arr[] = {10,1,4,6};
        int max = 0;
        int min = 1;
        for (int i = 0; i <= 3; i++) {
            if(max <= arr[i]){
                max=arr[i];
            }
            if(min >= arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Minimum number is " +min);
        System.out.println("Maximum number is "+max);
    }
}
