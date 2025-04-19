import java.sql.SQLOutput;
import java.util.*;
public class hospital_mngt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<----------CITY HOSPITAL------------>");
        System.out.println("WELCOME TO CITY HOSPITAL");
        System.out.println("Name: ");
        String name = sc.next();
        System.out.println("Address: ");
        String address = sc.next();
        System.out.println("Phone number: ");
        int phnum = sc.nextInt();
        while(true)
        {
            System.out.println("ENTITIES....");
            System.out.println("1.PATIENT\n2.DOCTOR\n3.APPOINTMENT\n4.ROOM\n5.BILLING\n6.EXIT\nChoose option...");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("PATIENT RELATED...");
                    System.out.println("1.ADD PATIENT\n2.VIEW PATIENT\n3.EXIT\nChoose option...");
                    int patient = sc.nextInt();
                    switch (patient){
                        case 1:
                            System.out.println("ID");
                            int id = sc.nextInt();
                            System.out.println("Name: ");
                            name = sc.next();
                            System.out.println("Age: ");
                            int age = sc.nextInt();
                            System.out.println("Address: ");
                            address = sc.next();
                            System.out.println("Phone number: ");
                            phnum = sc.nextInt();
                            System.out.println("Now you may consult doctor.");
                            break;
                        case 2:
                            System.out.println("Enter Visiting time: ");
                            int visit = sc.nextInt();
                            if(visit>=1 && visit<=6){

                            }
                    }
            }
        }
    }
}
