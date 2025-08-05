import java.util.Scanner;
public class even_or_odd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int result=sc.nextInt();
        if(result%2==0){
            System.out.println("The given number "+result+" is even");
        }else{
            System.out.println("The given number "+result+" is odd");
        }
    }
}
