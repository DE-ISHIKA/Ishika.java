import java.util.Scanner;
 class math_oprations {
    void fun1(int num) {
        int cube = num * num * num;
        System.out.println("Cube of " + num + " is " + cube);
    }
}
public class math_function  extends math_oprations{

    void fun2(int num1){
        int sq = num1*num1;
        System.out.println("Square of "+num1+" is "+sq);
    }
    void fun3(int num2){
        int tab;
        for (int i = 1; i <=10 ; i++) {
            tab = num2 * i;
            System.out.println("table of "+num2+" is "+tab);
        }
    }
    void fun4(int num3){
        int fact = 1;
        for (int i = 1; i <=num3 ; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial is "+fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("CHOOSE AN OPTION \n1.Cube\n2.Square\n3.Table\n4.Factorial\n5.Stop");
        int option = sc.nextInt();
        math_function obj = new math_function();
        switch(option){
            case 1:
                System.out.println("Enter a numbmer : ");
                int num = sc.nextInt();
                math_oprations g=new math_oprations();
                g.fun1(num);
                break;
            case 2:
                System.out.println("Enter a numbmer : ");
                int num1 = sc.nextInt();
                obj.fun2(num1);
                break;
            case 3:
                System.out.println("Enter a numbmer : ");
                int num2 = sc.nextInt();
                if (num2 >= 0) {
                obj.fun3(num2);}
                else
                    System.out.println("number should be non-negative.");
                break;
            case 4:
                System.out.println("Enter a number : ");
                int num3 = sc.nextInt();
                if(num3>=0){
                obj.fun4(num3);}
                else
                    System.out.println("number should be non-negative.");
                break;
            case 5:
                System.out.println("Stop");
                return;
            default:
                System.out.println("invalid selection!!");
                break;
        }
        }
    }
}