public class task17_oops {
    public static void main(String args[]){
        Pen p=new Pen();
        p.setColor("blue");
        System.out.println(p.color);
        p.color="yellow";


    }
}
class Pen{
    String color;
    int tip;
    void setColor(String color){
        this.color=color;
    }
    void setTip(int tip){
        this.tip=tip;
    }
}






/*
class is group fo entities
object is real world entities
heap memory

*/