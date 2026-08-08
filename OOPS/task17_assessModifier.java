public class task17_assessModifier {
    public static void main(String args[]){
        Bank user=new Bank();
        user.username="divankar";
        user.setPassword("DEV@122");
        String p=user.getPassWord();
        System.out.println(p);

    }
}
class Bank{
    public String username;
    private String password;
    void setPassword(String password){
        this.password=password;
    }
    String getPassWord(){
        return password;
    }
    //default
    //private
    //public
    //protected
}
