//import java.util.*;
//
//public class array {
//    public static void main(String[] args)
//        Scanner sc = new Scanner(System.in);
//        int arr[] = {12,23,6,5,2};
//        System.out.println("Original Array : ");
//        for(int i=0; i<=arr.length-1; i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        System.out.println("Reversed Array : ");
//        for(int i=arr.length-1; i>=0; i--){
//            System.out.print(arr[i]+" ");
//        }
//    }
//}
import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {12,23,6,5,2};
        System.out.println("Original Array: ");
        for (int i = 0; i <=arr.length-1 ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter a nummber:");
        int a = sc.nextInt();
        for (int i = 0; i <=arr.length-1 ; i++) {
            if(arr[i]==a)
                System.out.println(arr[i]+" Exists.");
            else
                System.out.println("Does not exists");
        }
    }
}
//import java.util.*;
//public class array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of elements of array: ");
//        int size = sc.nextInt();
//        System.out.println("Enter the elements of array: ");
//
//    }
//}
