public class task19_tiling {
    public static void main(String args[]){
        int n=4;
        int ways=findways(n);
        System.out.println(ways);
    }
    public static int findways(int n){
        if(n==0||n==1){
            return 1;
        }
        int total=0;

        total+=findways(n-1)+findways(n-2);
        return total;

    }
    
}
