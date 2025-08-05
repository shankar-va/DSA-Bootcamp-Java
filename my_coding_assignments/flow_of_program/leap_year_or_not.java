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
// Input a year and find whether it is a leap year or not.
// 2. Take two numbers and print the sum of both.
// 3. Take a number as input and print the multiplication table for it.
// 4. Take 2 numbers as inputs and find their HCF and LCM.
// 5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
