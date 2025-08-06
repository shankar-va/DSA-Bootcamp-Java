import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Select range of numbers:");
        int x=sc.nextInt();
        System.out.println(fibonaci(x));
    }
    public static int fibonaci(int a){
        int i=0,j=1;
        int iter=0;
        if(a==0)return 0;
        while(iter<=a-2){

             int temp=i+j;
             i=j;
             j=temp;
             iter++;

        }return j;
        
    }
}
