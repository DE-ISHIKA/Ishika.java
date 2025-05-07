import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class function_switch {
    static void fan1(){
        System.out.println("FAN1");
    }
    static void fan2(){
        System.out.println("FAN2");
    }
    static void fan3(){
        System.out.println("FAN3");
    }
    static void light1(){
        System.out.println("LIGHT1");
    }

    static void light2(){
        System.out.println("LIGHT2");
    }

    static void light3(){
        System.out.println("LIGHT3");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("enter choice: ");
            System.out.println("1.fan1\n2.fan2\n3.fan3\n4.light1\n5.light2\n6.light3\n7.exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    fan1();
                    break;
                case 2:
                    fan2();
                    break;
                case 3:
                    fan3();
                    break;
                case 4:
                    light1();
                    break;
                case 5:
                    light2();
                    break;
                case 6:
                    light3();
                    break;
                default:
                    System.out.println("Exit");
                    return;
            }
        }
    }
}
