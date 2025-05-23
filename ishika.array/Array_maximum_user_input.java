import java.util.Scanner;

public class Array_maximum_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 1;
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int arr[] = new int[size];
        for (int i = 0; i <size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <size ; i++) {
            if(max <= arr[i]){
                max=arr[i];
            }
            if(min >= arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Maximum number is "+max);
        System.out.println("minimum number is "+min);
    }
}
