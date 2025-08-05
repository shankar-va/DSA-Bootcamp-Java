import java.util.Scanner;
public class Simple_Interest {
    public static void main(String[] atg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal amount:");
        int principal=sc.nextInt();
        System.out.println("Enter Interest rate:");
        int rate=sc.nextInt();
        System.out.println("Enter period in years:");
        int period=sc.nextInt();
        double result=(double)((principal*rate*period)/100);
        System.out.printf("The simple Interest is %.2f\n",result);
        System.out.println("The Total amount is "+(result+principal));
    }
}
