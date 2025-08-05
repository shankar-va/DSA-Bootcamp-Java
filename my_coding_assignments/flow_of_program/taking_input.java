import java.util.Scanner;
public class taking_input {

    
    // 5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int result=0;
        while(true){
            
            String a=sc.nextLine();

            if(!a.equals("x")){
                result+=Integer.parseInt(a);
            }else{
                break;
            }
        }System.out.println(result);
    }
}
