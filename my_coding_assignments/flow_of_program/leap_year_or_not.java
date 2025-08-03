import java.util.*;
public class leap_year_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if((a%100!=0 && a%4==0)|| (a%400==0)){
        System.out.println("The year is a leap year");
    }else System.err.println("The year is not a leap year");
    
    }
}
