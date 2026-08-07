public class task14_search2Darray {
    public static void main(String args[]){
        int mat[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        
        int key=43;
        bruteForce(mat, key);
        search(mat, key);

    }
    public static void bruteForce(int mat[][],int key){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==key){
                    System.out.print("Key Found");
                    return;
                }
            }
        }
        System.out.println("Key not Found");
    }
    public static void search(int mat[][],int key){
        int low=0;
        int high=mat[0].length-1;
        while(low<mat.length && high>=0){
            if(mat[low][high]==key){
                System.out.println("Key found");
                return;
            }else if(key<mat[low][high]){
                high--;
            }else{
                low++;
            }
        }
        System.out.println("Not Found");
    }
}
/*

brute force n square solution
 
row-wise nlogn

column-wise nlogn
stairCase search o(n+m)

*/