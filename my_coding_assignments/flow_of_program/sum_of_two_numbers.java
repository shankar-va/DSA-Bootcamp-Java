import java.util.Scanner;
public class sum_of_two_numbers {
    public static void main(String [] args){
        // Take two input and print sum of them
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The sum of two numbers are "+(a+b));
        sc.close();
    }
}
