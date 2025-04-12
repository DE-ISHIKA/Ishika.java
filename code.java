import java.util.Scanner;
public class code {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("ENTER FIRST NO.");
        int a=k.nextInt();
        System.out.println("ENTER SEC NO.");
        int b=k.nextInt();
        System.out.println("Addition of both the numbers:");
        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println("Subtraction of both the numbers:");
        System.out.println(a+" - "+b+"="+(a-b));
        System.out.println("Multiplication of both the numbers:");
        System.out.println(a+" * "+b+"="+(a*b));
        System.out.println("Division of both the numbers:");
        System.out.println(a+" / "+b+"="+(a/b));
        System.out.println("Modulous is:");
        System.out.println(a+" % "+b+"="+(a%b));
    }
}
