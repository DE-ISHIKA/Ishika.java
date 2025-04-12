import java.util.*;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<---------Punjab National Bank--------->");
        System.out.println("Name:");
        String name = sc.next();
        System.out.println("Age:");
        int age = sc.nextInt();
        System.out.println("Address:");
        String address = sc.next();
        System.out.println("Gender:");
        String gender = sc.next();
        System.out.println("phone number: ");
        String phonum = sc.next();
        Random acc = new Random();
        int accnumber = acc.nextInt(100000000) + 1;
        System.out.println(accnumber);
        System.out.println("ENTER THE ACCOUNT NUMBER: ");
        int Account = sc.nextInt();
        if (Account == accnumber) {
            System.out.println("ENTER THE AMOUNT: ");
            int amount = sc.nextInt();
            if (amount >= 100) {
                int Pin = acc.nextInt(10000) + 1;
                System.out.println("Pin:" + Pin);
                System.out.println("Welcome to the ATM");
                System.out.println("Enter the PIN");
                int x = sc.nextInt();
                if (x == Pin) {
                    System.out.println("MATCH PIN");
                    System.out.println("Change your PIN");
                    int newpin = sc.nextInt();
                    Pin = newpin;
                    System.out.println("UPDATE PIN: " + Pin);
                    System.out.println("Enter updated pin: ");
                } else {
                    System.out.println("WRONG NUMBER!!");
                }

                int b = sc.nextInt();
                int a = amount;
                if (b == Pin) {
                    while (true) {
                        System.out.println("ATM");
                        System.out.println("1.Check");
                        System.out.println("2.Deposite");
                        System.out.println("3.Withdraw");
                        System.out.println("4.Exit");
                        System.out.println("Choose an option");
                        int count = sc.nextInt();
                        switch (count) {
                            case 1:
                                System.out.println("Amount is:" + a);
                                break;
                            case 2:
                                System.out.println("Amount is:" + a);
                                System.out.println("How much amount you want to deposite: ");
                                int dep = sc.nextInt();
                                a = a + dep;
                                System.out.println("Balance is:" + a);
                                break;
                            case 3:
                                if(amount>=100)
                                    System.out.println("HOW MUCH AMOUNT YOU WANT TO WITHDRAW: ");
                                int with = sc.nextInt();
                                a-= with;
                                System.out.println("Balance: "+a);
                                break;
                            case 4:
                                System.out.println("Exit");
                                break;
                            default:
                                System.out.println("Invalid selection");
                                return;
                        }
                    }
                } else
                    System.out.println("Wrong Number!!");
            }
        }
    }
}
