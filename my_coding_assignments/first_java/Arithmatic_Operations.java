import java.util.*;
public class Arithmatic_Operations {
    public static void main(String[] srgs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        switch (s) {
            case "+" -> System.out.println(n+m);
            case "-" -> System.out.println(n-m);
            case "*" -> System.out.println(n*m);
            case "/" -> System.out.println((float)n/m);
            
            default -> System.out.println("Insert Valid Operator");
        }
    }
}
