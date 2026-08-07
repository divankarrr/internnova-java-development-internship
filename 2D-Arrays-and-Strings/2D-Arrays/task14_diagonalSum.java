public class task14_diagonalSum {
    public static void main(String args[]){
        int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n=mat.length;
        int m=mat[0].length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j || i+j==n-1){
                    sum+=mat[i][j];
                }
            }
        }
        System.out.println(sum);

        //optimal Solution
        sum=0;
        for(int i=0;i<m;i++){
            sum+=mat[i][i];
            if(i!=m-1-i)
            sum+=mat[i][m-1-i];
        }
        System.out.println(sum);
        
    }
}
/*
primary diagonal i==j
secondary diagonal i+j=n-1

*/
