public class task19_friendPairing {
    public static void main(String args[]){
        int n=3;
        int ways=findways(n);
        System.out.println(ways);

    }
    public static int findways(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return findways(n-1)+(n-1)*findways(n-2);
    }
    
}
