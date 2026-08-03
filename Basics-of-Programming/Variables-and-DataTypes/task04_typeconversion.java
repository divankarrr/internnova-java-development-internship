public class task04_typeconversion {
    public static void main(String args[]){
        int a=10;
        double b=a; // implicit type conversion
        System.out.println("The value of b is: " + b);
        
        double c=9.78;
        int d=(int)c; // explicit type conversion
        System.out.println("The value of d is: " + d);
    }
}
