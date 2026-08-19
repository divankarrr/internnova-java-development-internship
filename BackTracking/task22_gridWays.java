public class task22_gridWays {
    public static int gridWays(int i,int j,int n,int m){
        if(i==n||j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int w1=gridWays(i+1, j, n, m);
        int w2=gridWays(i, j+1, n, m);
        return w1+w2;
    }
    public static int optimizedSolution(int n,int m){
        int r=factorial(n-1);
        int d=factorial(m-1);
        int s=factorial(n-1+m-1);
        return s/(r*d);
    }
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String args[]){
        int n=3,m=3;
        System.out.println(gridWays(0, 0, n, m));
        System.out.println(optimizedSolution(n,m));
    }
    
}
//find the number of ways to reach from(0,0) t0 (n-1,n-1) 
//allowed move right,down
/*

TC:O(2 ki power(m+n))
*/