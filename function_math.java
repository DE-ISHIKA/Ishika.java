import java.util.Scanner;

public class function_math {
    static void func(int a, int b){
        int c = a + b;
        System.out.println(a+"+"+b+" = "+c);
    }
    static void func1(int c){
        int d = c*c;
        System.out.println("Square of "+c+" is "+d);
        function_math e = new function_math();
        e.func2(d);
    }
    void func2(int y){
        int s;
        for (int i = 1; i <=10 ; i++) {
            s = y * i;
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter two integer numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        func(a,b);
        System.out.println("Enter an integer number:");
        int c = sc.nextInt();
        func1(c);
    }
}
