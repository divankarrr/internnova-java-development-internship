public class task10_invertedHPyramid {
    public static void main(String args[]){
        int n=4;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    
}
//inverted half pyraamid using numbers
/*
1234
123
12
1

*/