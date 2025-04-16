import java.util.Scanner;
public class book {

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("<-------------Library Card System Menu------------>");

      while(true) {
         System.out.println("1.Create new library card\n2.Check out a book\n3.Return a book\n4.View card information\n5.Exit");
         System.out.println("Enter your choice: ");
         int var2 = var1.nextInt();
         switch (var2) {
            case 1:
               System.out.println("Ledger Number: ");
               String var3 = var1.next();
               System.out.println("Name: ");
               String var4 = var1.next();
               System.out.println("Roll Number:");
               String var5 = var1.next();
               System.out.println("Class: ");
               String var6 = var1.next();
               System.out.println("Session: ");
               String var7 = var1.next();
               System.out.println("New library card created");
               break;
            case 2:
               System.out.println("How many books you already borrowed: ");
               int var8 = var1.nextInt();
               if (var8 >= 4) {
                  System.out.println("You can not take another book");
               } else {
                  System.out.println("Which book you want to borrow:");
                  String var13 = var1.next();
                  System.out.println("Book is successfully borrowed.");
               }
               break;
            case 3:
               System.out.println("A fine for returning a book late after the due date as per the condition given below...");
               System.out.println("First five days = $2 per day\nSix to ten days = $5 per day\nAbove ten days = $10 per day");
               System.out.println("Enter the number of days: ");
               int var9 = var1.nextInt();
               int var10;
               if (var9 <= 5) {
                  var10 = var9 * 2;
               } else if (var9 <= 10) {
                  var10 = 10 + (var9 - 5) * 5;
               } else {
                  var10 = 35 + (var9 - 10) * 10;
               }

               System.out.println("Fine to be paid = $" + var10);
               break;
            case 4:
               int var11 = 849216;
               System.out.println("Ledger number is 849216");
               System.out.println("Enter ledger number: ");
               int var12 = var1.nextInt();
               if (var11 == var12) {
                  System.out.println("Name: Rajjo\n Roll number: 4563728348\n Class: M.com\n Session: 2024-2026");
               } else {
                  System.out.println("Invalid ledger number!!");
               }
               break;
            case 5:
               System.out.println("Exit");
               break;
            default:
               System.out.println("Invalid option!!");
               return;
         }
      }
   }
}