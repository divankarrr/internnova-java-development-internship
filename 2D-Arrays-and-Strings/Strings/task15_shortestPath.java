public class task15_shortestPath {
    public static void main(String args[]){
        String path="WNEENESENNN";
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char ch=path.charAt(i);
            if(ch=='E'){
                x++;
            }else if(ch=='N'){
                y++;
            }else if(ch=='W'){
                x--;
            }else if(ch=='S'){
                y--;
            }

        }
        x=Math.abs(x);
        y=Math.abs(y);
        float dist=(float)Math.sqrt(x*x+y*y);
        System.out.println(dist);
    }
}
