public class task17_interface {
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();
    }
    
}
interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("left,right,up,down ,diagonal(in all the directions)");
    }
}
class Rook implements chessPlayer{
    public void moves(){
        System.out.println("left,right,up,down (in all the directions)");
    }
}
interface grass{

}
interface meat{

}
class Bear implements grass,meat{
    
}

/*

interface is a blueprint of class
in abstraction there is 0-100% abstraction
but in interfaces there is 100% abstraction
interfaces
    all methods are public ,abstract and without implementation
    used to acheive total abstraction
    variables in interface are final,public static
*/
