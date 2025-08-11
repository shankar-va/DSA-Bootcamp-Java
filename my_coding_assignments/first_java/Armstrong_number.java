import java.util.Scanner;
// An armstrong number is a number where the sum of power of the digits is equal to the same number  
public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Integer");
        int n =sc.nextInt();
        if(isArmstrong(n)){
            System.out.println("The given number is an Armstrong number" );
        }else{
        System.out.println("The given number is not an Armstrong number" );
        }
    }
    public static boolean isArmstrong(int a){
        int count_digit=0;
        int f=a;
        while(f!=0){
            count_digit++;
            f/=10;
        }
        int result=0;
        int b=a;
        while(a!=0){
            int digit=a%10;
            result+=Math.pow(digit,count_digit);
            a/=10;
        }if(result==b){
            return true;
        }return false;
    }
}
