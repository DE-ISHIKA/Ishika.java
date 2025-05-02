import java.util.Scanner;

public class func_math {
    static void func(int a, int c, int b){
        int sum = a + c;
        int sq = b * b;
        System.out.println(a+" + "+c+" = "+ sum);
        System.out.println(b+" * "+b+" = "+ sq);
        fun1(sum,sq);
    }
    static void fun1(int sum , int sq){
        int diff = sum - sq;
        System.out.println(sum+" - "+sq+" = "+diff);
        func_math h = new func_math();
        h.fun2(diff);
    }
    void fun2(int diff){
        if(diff%2 == 0)
            System.out.println(diff+" IS EVEN");
        else
            System.out.println(diff+" IS ODD");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integer numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        func(a,c,b);

    }
}
