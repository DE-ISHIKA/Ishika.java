import java.util.Scanner;

public class compaop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter five integer numbers:");
         int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
         if(a>b && a>c && a>d && a>e)
             System.out.println(a+" is greatest");
         if(b>a && b>c && b>d && a>e)
             System.out.println(b+" is greatest");
        if(c>a && c>b && c>d && c>e)
            System.out.println(c+" is greatest");
        if(d>a && d>b && d>c && d>e)
            System.out.println(d+" is greatest");
        else
             System.out.println(e+" is greatest");
    }
}
