import java.util.Scanner;
public class task04_circlearea {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        Float radius=sc.nextFloat();
        double area=Math.PI*radius*radius;
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
        sc.close();
    }
}
