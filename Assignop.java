import java.util.Scanner;
public class Assignop {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter any integer number:");
        int a=sc.nextInt();
        System.out.println("post increment of input number: "+(a++));
        System.out.println("pre increment of input number: "+(++a));
    }
}
