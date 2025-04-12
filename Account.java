import java.util.*;
public class Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        String name = sc.next();
        System.out.println("Age:");
        int age = sc.nextInt();
        System.out.println("Address:");
        String address = sc.next();
        System.out.println("Gender:");
        String gender = sc.next();
        Random acc = new Random();
        int number = acc.nextInt(100000) + 1;
        System.out.println("Account number:"+number);
        System.out.println("Enter your account number:");
        int Pin = acc.nextInt(10000)+1;
        System.out.println("Pin:"+Pin);
        System.out.println("Welcome to the ATM");
        System.out.println("Enter the PIN");
        int x=sc.nextInt();
        if(x==Pin){
            System.out.println("MATCH PIN");
            System.out.println("Chane your PIN");
            int newpin=sc.nextInt();
            Pin=newpin;
            System.out.println("UPDATE PIN"+Pin);
        }
        else
            System.out.println("NO MATCH!!");
    }
}
