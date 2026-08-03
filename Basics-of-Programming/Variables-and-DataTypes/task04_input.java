import java.util.Scanner;

public class task04_input {
    public static void main(String args[]){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = sc.nextInt();
        System.out.println("You entered: " + a);

        String word=sc.next();
        System.out.println("You entered: " + word);

        String line=sc.nextLine();
        System.out.println("You entered: " + line);

        boolean flag=sc.nextBoolean();
        System.out.println("You entered: " + flag);

        float f=sc.nextFloat();
        System.out.println("You entered: " + f);

        double d=sc.nextDouble();
        System.out.println("You entered: " + d);

        byte b=sc.nextByte();
        System.out.println("You entered: " + b);

        short s=sc.nextShort();
        System.out.println("You entered: " + s);

        long l=sc.nextLong();
        System.out.println("You entered: " + l);

        sc.close();
    }
}
