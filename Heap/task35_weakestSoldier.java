import java.util.*;
public class task35_weakestSoldier {
    static class Row implements Comparable<Row>{
        int count;
        int idx;
        Row(int count,int idx){
            this.count=count;
            this.idx=idx;
        }
        @Override 
        public int compareTo(Row r){
            if(this.count==r.count){
                return this.idx-r.idx;
            }else{
                return this.count-r.count;
            }
        }
    }
    public static void main(String args[]){
        int soldier[][]={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k=2;
        PriorityQueue<Row> pq=new PriorityQueue<>();
        for(int i=0;i<soldier.length;i++){
            int count=0;
            for(int j=0;j<soldier[0].length;j++){
                count+=soldier[i][j]==1?1:0;
            }
            pq.add(new Row(count,i));
        }

        for(int i=0;i<k;i++){
            System.out.println(pq.remove().idx);
        }

    }

    
}
