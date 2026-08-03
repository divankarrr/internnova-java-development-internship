public class task06_elseif {
    public static void main(String args[]){
        int age=10;
        if(age<13){
            System.out.println("You are a child.");
        } else if(age>=13 && age<20){
            System.out.println("You are a teenager."); 
        }else{
            System.out.println("You are an adult.");
        }
    }
}
