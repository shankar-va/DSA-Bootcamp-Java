import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Select position of numbers:");
        int x=sc.nextInt();
        System.out.println(Fibonacci(x));
    }
    public static int Fibonacci(int a){
        int i=0,j=1;
        int iter=0;
        if(a<=0)return 0;
        else if (a==1)return 1;
        while(iter<=a-2){

             int temp=i+j;
             i=j;
             j=temp;
             iter++;

        }return j;
        
    }
}
