
import  java.util.*;
public class area_of_shapes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a shape to know its Area");
        String s=sc.nextLine();
        Shape sp=new Shape();
        sp.shape(s);
    }
}
class Shape{
    public  void shape(String s){
        Scanner sc=new Scanner(System.in);
        switch(s){
            
            case "Circle":
            System.out.println("Enter the radius of circle");
            int radius=sc.nextInt();
            System.out.println("The area of circle is "+(radius*radius));
            break;

            case "Rectangle":
            System.out.println("Enter the length and breath of rectangle");
            int length=sc.nextInt();
            int breath=sc.nextInt();
            System.out.println("The area of circle is "+(length*breath));
            break;

            case "Square":
            System.out.println("Enter the side of square");
            int side=sc.nextInt();
            System.out.println("The area of circle is "+(side*side));
            break;

            case "Triangle":
            System.out.println("Enter the breath and height of triangle");
            int breath_T=sc.nextInt();
            int height_t=sc.nextInt();
            System.out.println("The area of circle is "+(0.5*breath_T*height_t));
            break;

            case "Rhombus":
            System.out.println("Enter the two diagonals of circle");
            int diagonal_1=sc.nextInt();
            int diagonal_2=sc.nextInt();
            System.out.println("The area of circle is "+(diagonal_1*diagonal_2));
            break;

            case "Parallelogram":
            System.out.println("Enter the base and height of circle");
            int base=sc.nextInt();
            int height=sc.nextInt();
            System.out.println("The area of circle is "+(base*height));
            break;

            default :
            System.out.println("Enter valid shape");
        }
    }
}

