import java.util.*;
        public class hospital_mngt {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int k =1;
                System.out.println("<----------CITY HOSPITAL------------>");
                System.out.println("WELCOME TO CITY HOSPITAL");
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Address: ");
                String address = sc.next();
                System.out.println("Phone number: ");
                String phnum = sc.next();
                while(true)
                {
                    Random rand = new Random();
                    int id = rand.nextInt(10000)+1;
                    System.out.println("ID is: "+id);
                    System.out.println("ENTITIES....");
                    System.out.println("1.PATIENT\n2.DOCTOR\n3.APPOINTMENT\n4.ROOM\n5.BILLING\n6.EXIT\nChoose option...");
                    int option = sc.nextInt();
                    switch (option){
                        case (1):
                            while(k!=0){
                                System.out.println("PATIENT RELATED...");
                                System.out.println("1.ADD PATIENT\n2.VIEW PATIENT\n3.EXIT\nChoose option...");
                                int patient = sc.nextInt();
                                switch (patient)
                                {
                                    case 1:
                                        System.out.println("ID");
                                        int id1 = sc.nextInt();
                                        System.out.println("Name: ");
                                        name = sc.next();
                                        System.out.println("Age: ");
                                        int age = sc.nextInt();
                                        System.out.println("Address: ");
                                        address = sc.next();
                                        System.out.println("Phone number: ");
                                        phnum = sc.next();
                                        System.out.println("Now you may consult doctor.");
                                        break;
                                    case 2:
                                        System.out.println("Visiting Hours: 1PM to 6PM");
                                        System.out.println("Enter Visiting time: ");
                                        int visit = sc.nextInt();
                                        if(visit>=1 && visit<=6){
                                            System.out.println("Enter ID: ");
                                            int ID = sc.nextInt();
                                            if(id==ID)
                                                System.out.println("Permission Granted.");
                                            else
                                                System.out.println("You cannot visit.");
                                        }
                                        else
                                            System.out.println("Come in visiting hours.");
                                        break;
                                    case 3:
                                        System.out.println("Exit");
                                        k += -1;
                                    default:
                                        System.out.println("Invalid option!!");
                                        break;
                                }
                            }
                            break;

                        case 2:
                            while(k!=0){
                                System.out.println("DOCTOR RELATED...");
                                System.out.println("Doctor's Name: ");
                                String doc = sc.next();
                                System.out.println("SPECIALIZATION: \n1.ONCOLOGIST\n2.DERMATOLOGIST\n3.NEUROLOGIST\n4.CARDIOLOGIST\n5.PEDIATRICIAN\n6.GYNECOLOGIST\n7.EXIT\nCHOOSE OPTION:");
                                int opt = sc.nextInt();
                                switch (opt) {
                                    case 1:
                                        System.out.println("An Oncologist specializes in diagonosing and treating cancer.");
                                        System.out.println("Doctor's Name: Harsh Verma");
                                        System.out.println("Room number: 1");
                                        break;
                                    case 2:
                                        System.out.println("A Dermatologist specializes in treating skin issues.\nDoctor's Name: Nitin Ranjan\nRoom number: 2");
                                        break;
                                    case 3:
                                        System.out.println("A Neurologist specializes in the evalution and treatment of all types of disease or impared function of the brain, spinal coard,peripheral nerves as well as the blood vessels that relate to these structures.");
                                        System.out.println("Doctor's Name: Anuj Gupta");
                                        System.out.println("Room number: 3");
                                        break;
                                    case 4:
                                        System.out.println("A Cardiologist is a physician who's an expert in the care of your heart and blood vessels.");
                                        System.out.println("Doctor's Name: A.K. Singhal");
                                        System.out.println("Room number: 4");
                                        break;
                                    case 5:
                                        System.out.println("A Pediatrician is a doctor who focuses on the health of infants,children,adolescents and young adults.");
                                        System.out.println("Doctor's Name: Rajeev Singhal");
                                        System.out.println("Room number: 5");
                                        break;
                                    case 6:
                                        System.out.println("A Gynecologist is a doctor who specializes in female reproductive health.");
                                        System.out.println("Doctor's Name: Anjula Bhargav");
                                        System.out.println("Room number: 6");
                                        break;
                                    case 7:
                                        System.out.println("EXIT");
                                        k += -1;
                                    default:
                                        System.out.println("Invalid Option!!");
                                        break;
                                }
                            }
                            break;
                        case 3:
                            while(k!=0){
                                System.out.println("Patient Name: ");
                                name = sc.next();
                                System.out.println("Doctor's Name: ");
                                String doc = sc.next();
                                System.out.println("timings are:\n1.12PM TO 1PM\n2.3PM TO 4PM\n3.5PM TO 6PM\n4.EXIT\nChoose Option...");
                                int opti = sc.nextInt();
                                switch (opti) {
                                    case 1:
                                        System.out.println("Appointment done for 12PM to 1PM.");
                                        break;
                                    case 2:
                                        System.out.println("Appointment done for 3PM to 4PM.");
                                        break;
                                    case 3:
                                        System.out.println("Appointment done for 5PM to 6PM.");
                                        break;
                                    case 4:
                                        System.out.println("EXIT");
                                        k += -1;
                                    default:
                                        System.out.println("Invalid Option!!");
                                       break;
                                }
                            }
                            break;
                        case 4:
                            System.out.println("ROOM");
                            System.out.print("Patient Name: ");
                            name = sc.next();
                            System.out.print("Age: ");
                            int age = sc.nextInt();
                            System.out.println("Doctor Name: ");
                            String doc = sc.next();
                            System.out.print("Enter id: ");
                            int id3 = sc.nextInt();
                            if(id==id3)
                            {
                                System.out.println("1.Private Ward\n 2.General Ward");
                                System.out.print("What kind of Room you wants: ");
                                int Ward = sc.nextInt();
                                if(Ward==1)
                                {
                                    System.out.println("Charge of Private Ward is 1500 rpy per day");
                                    System.out.print("For how many days you need room? ");
                                    int days = sc.nextInt();
                                    int s = 0;
                                    s = (s + 1500)*days;
                                    System.out.println("Total Charges is: "+s);
                                }
                                else
                                {
                                    System.out.println("Charge of Private Ward is 500 rpy per day");
                                    System.out.print("For how many days you need room? ");
                                    int days = sc.nextInt();
                                    int s = 0;
                                    s = (s + 500)*days;
                                    System.out.println("Total Charges is: "+s);
                                }
                            }
                            break;
                        case 5:
                            while (k!=0) {
                                System.out.println("Billing");
                                System.out.println("Pateint Name: ");
                                String Name = sc.next();
                                System.out.println("Address: ");
                                String Add = sc.next();
                                System.out.println("Medicines & their prices  are below- ");
                                int med = 0;
                                int t;
                                int t1 = 0;
                                int t2 = 0;
                                int t3 = 0;
                                while (true) {
                                System.out.println("1.Paracetamol:50\n2.Antibiotic:150\n3.Vitamin D:100 \n4. Exit");
                                med = sc.nextInt();
                                switch (med) {
                                        case 1:
                                            System.out.println("how many paracetamol you want");
                                            int v = sc.nextInt();
                                            t1 = t1 + 50 * v;
                                            break;
                                        case 2:
                                            System.out.println("how many antibiotic you want");
                                            v = sc.nextInt();
                                            t2 = t2 + 150 * v;
                                            break;
                                        case 3:
                                            System.out.println("how many paracetamol you want");
                                            v = sc.nextInt();
                                            t3 = t3 + 100 * v;
                                            break;
                                        case 4:
                                            System.out.println("Exit");
                                            k += -1;
                                    t = t1 + t2 + t3;
                                    System.out.println(t);
                                        default:
                                            System.out.println("Invalid Selection!!");
                                            break;
                                    }
                                }
                            }
                            break;
                        case 6:
                            System.out.println("Exit");
                            k += -1;
                        default:
                            System.out.println("Invalid Selection!!");
                            break;
                    }
                }
            }
        }
