public class task04_typecasting {
    public static void main(String args[]){
        float a=10.5f;
        int b=(int)a; // explicit type casting
        System.out.println("The value of b is: " + b);//round off the decimal part is not done here
        char ch='A';
        int c=(int)ch; // explicit type casting
        System.out.println("The value of c is: " + c);
    }
}
