import java.util.Scanner;
public class compop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter teo integer numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
            System.out.println(a+" is greater than "+b);
        else
            System.out.println(b+" is greaer than "+a);
    }
}
