import java.util.*;
public class HCF_AND_LCM {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The LCM of two numbers "+ a+" and "+ b+ " is "+LCM(a,b));
        System.out.print("The HCF of two numbers "+ a+" and "+ b+ " is "+HCF(a,b));
        sc.close();
    }
    public static int LCM(int a ,int b){
    int iterator=Math.min(a,b);
    int result=1;
    for(int i=1;i<=iterator;i++){
     if(a%i==0 && b%i==0){
        result*=i;
        a/=i;
        b/=i;
    }
    }
    result*=a*b;
    return result;
    }
    public static int HCF(int a,int b){
        int result=1;
        int min=Math.min(a, b);
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                result=i;
            }
        }return result;
    }
}
