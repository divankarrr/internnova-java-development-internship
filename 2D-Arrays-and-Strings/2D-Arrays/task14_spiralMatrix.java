public class task14_spiralMatrix {
    public static void main(String args[]){
        int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n=mat.length;
        int m=mat[0].length;
        int ans[][]=new int[n][m];
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=m-1;
        int r=0,l=0;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                ans[r][l++]=mat[top][i];
                if(l == m) { l = 0; r++;}
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans[r][l++]=mat[i][right];
                if(l == m) { l = 0; r++;}
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans[r][l++]=mat[bottom][i];
                    if(l == m) { l = 0; r++;}
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans[r][l++]=mat[i][left];
                    if(l == m) { l = 0; r++;}
                }
                left++;
            }
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
        }
    }
}
//1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 