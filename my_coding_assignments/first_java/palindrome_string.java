import java.util.Scanner;
public class palindrome_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        
        System.out.println(ispalindrome(a));
    }
    public static boolean ispalindrome(String a){
        int i=0,j=a.length()-1;
        while(i<j){
            if(!(a.charAt(i)==a.charAt(j)))return false;
            i++;
            j--;
        }return true;
    }
}
