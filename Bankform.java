import java.util.*;
public class Bankform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<---------Punjab National Bank--------->");
        System.out.print("Name: ");
        String Name = sc.next();
        System.out.println("Age:");
        String age = sc.next();
        System.out.println("Address: ");
        String address = sc.next();
        System.out.println("phone number: ");
        String phonum = sc.next();
        System.out.println("Gender: ");
        String gender = sc.next();
        Random rand= new Random();
        int accnum = rand.nextInt(100000000)+1;
        System.out.println(accnum);
        System.out.println("ENTER THE ACCOUNT NUMBER: ");
        int Account = sc.nextInt();
        if(Account==accnum){
            System.out.println("ENTER THE AMOUNT: ");
            int amount = sc.nextInt();
            System.out.println("Select case: ");
            int x = sc.nextInt();
            if(amount>=100){
                switch (x) {
                    case 1:
                        if(amount>=100)
                            System.out.println("HOW MUCH AMOUNT YOU WANT TO WITHDRAW: ");
                        int with = sc.nextInt();
                        amount -= with;
                        System.out.println("Balance: "+amount);
                        break;
                    default:
                        System.out.println("Invalid Option!!");
                        return;
                }
            }
            else
                System.out.println("NOT VALID!!");
        }
    }
}