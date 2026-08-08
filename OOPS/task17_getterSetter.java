public class task17_getterSetter {
    public static void main(String args[]){
        Pen p=new Pen();
        p.setColor("blue");
        p.setTip(1);
        System.out.println(p.getTip());
        System.out.println(p.getcolor());

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
    String getcolor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}
/*
get =return the value
set=modifiy the value;
this keyword is used to refer the current object

*/