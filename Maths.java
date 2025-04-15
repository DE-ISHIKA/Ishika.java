import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Select one option:");
            System.out.println("1.Find Square\n 2.Create table\n 3.Subtraction\n 4.Find Cube\n 5.Exit");
            int op = sc.nextInt();
            switch (op)
            {
                case 1:
                  System.out.println("Enter any integer number: ");
                  int a = sc.nextInt();
                  int b;
                  for (b = 1; b <= a; b++) {
                    int c = b * b;
                    System.out.println("Square of " + b + " is " + c);
                  }
                  break;
                case 2:
                   System.out.println("Enter any integer number: ");
                   int tab = sc.nextInt();
                   int c;
                   for (int i = 1; i <= 10; i++) {
                      c = tab * i;
                      System.out.println(+tab + "*" + i + " = " + c);
                   }
                    break;
                case 3:
                  System.out.println("Enter two integer numbers:");
                  int sub1 = sc.nextInt();
                  int sub2 = sc.nextInt();
                  int d = sub1 - sub2;
                  System.out.println("Subtraction of " + sub1 + " and " + sub2 + " is " + d);
                  break;
                case 4:
                  System.out.println("Enter any integer number: ");
                  int e = sc.nextInt();
                  int f;
                  for (f = 1; f <= e; f++) {
                    int g = f * f * f;
                    System.out.println("Cube of " + f + " is " + g);
                  }
                  break;
                case 5:
                  System.out.println("Exit");
                  break;
                default:
                  System.out.println("Invalid Selection!!");
                  return;
            }
        }
    }
}
