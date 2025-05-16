import java.util.Scanner;

public class UniversityRes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter University Name: ");
        String Uni = sc.next();
        System.out.println("Enter Name: ");
        String name = sc.next();
        System.out.println("Enter Age: ");
        int Age = sc.nextInt();
        System.out.println("Enter Class(1-12): ");
        int Class = sc.nextInt();
        int s = 0;
        System.out.println("Enter Physics Marks: ");
        int physics = sc.nextInt();
        System.out.println("Enter Maths Marks: ");
        int Maths = sc.nextInt();
        System.out.println("Enter Chemistry Marks: ");
        int Chemistry = sc.nextInt();
        System.out.println("Enter Science Marks: ");
        int Science = sc.nextInt();
        System.out.println("Enter History Marks: ");
        int History = sc.nextInt();
        s = s + physics + Maths + Chemistry + Science + History;
        System.out.println("Total: "+s+"/500");
        float avg = s / 5;
        if(avg>=90){
            System.out.println("Grade: A");
        }
        else if(avg>=80){
            System.out.println("Grade: B");
        }
        else if(avg>=70){
            System.out.println("Grade: C");
        }
        else if(avg>=60){
            System.out.println("Grade: D");
        }
        else if(avg>=33){
            System.out.println("Grade: E");
        }
        else{
            System.out.println("Fail");
        }
    }
}
//import java.util.Scanner;
//
//public class UniversityRes {
//    static void fun1(){
//        System.out.println("Grade: A");
//    }
//    static void fun2(){
//        System.out.println("Grade: B");
//    }
//    static void fun3(){
//        System.out.println("Grade: C");
//    }
//    static void fun4(){
//        System.out.println("Grade: D");
//    }
//    static void fun5(){
//        System.out.println("Grade: E");
//    }
//    static void fun6(){
//        System.out.println("Fail");
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter University Name: ");
//        String Uni = sc.next();
//        System.out.println("Enter Name: ");
//        String name = sc.next();
//        System.out.println("Enter Age: ");
//        int Age = sc.nextInt();
//        System.out.println("Enter Class(1-12): ");
//        int Class = sc.nextInt();
//        int s = 0;
//        System.out.println("Enter Physics Marks: ");
//        int physics = sc.nextInt();
//        System.out.println("Enter Maths Marks: ");
//        int Maths = sc.nextInt();
//        System.out.println("Enter Chemistry Marks: ");
//        int Chemistry = sc.nextInt();
//        System.out.println("Enter Science Marks: ");
//        int Science = sc.nextInt();
//        System.out.println("Enter History Marks: ");
//        int History = sc.nextInt();
//        s = s + physics + Maths + Chemistry + Science + History;
//        System.out.println("Total: "+s+"/500");
//        float avg = s / 5;
//        if(avg>=90){
//            fun1();
//        }
//        else if(avg>=80){
//            fun2();
//        }
//        else if(avg>=70){
//            fun3();
//        }
//        else if(avg>=60){
//            fun4();
//        }
//        else if(avg>=33){
//            fun5();
//        }
//        else{
//           fun6();
//        }
//    }
//}
