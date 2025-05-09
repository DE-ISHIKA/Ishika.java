import java.util.Scanner;

public class restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        int idlitotal = 0;
        int dosatotal = 0;
        while(true){
            System.out.println("Select items which you want :\n1. Dosa MRP: 150\n2. Idli Sambhar MRP: 80\n3. Exit");
            int item = sc.nextInt();
            switch (item){
                case 1:
                    System.out.println("How many plates you want?");
                    int t1 = sc.nextInt();
                    System.out.println("Dosa");
                    dosatotal = s + t1 * 150;
                    break;
                case 2:
                    System.out.println("How many plates you want?");
                    int t2 = sc.nextInt();
                    System.out.println("Idli Sambhar");
                    idlitotal = s + t2 * 80;
                    break;
                case 3:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid Item!!");
                    break;
            }
            s = s + idlitotal + dosatotal;
            System.out.println("Total : "+s);
        }
    }
}
