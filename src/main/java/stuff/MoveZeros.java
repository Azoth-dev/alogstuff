package stuff;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MoveZeros {
    public static void main(String[] args) {
        int[] aa = {1,2,5,1,1,1,0,0};

        //keep the index of non-zero element from the back so that we can flip it later
        Queue queue= new LinkedList();
        for (int i = aa.length-1; i >=0 ; i--) {
             if(aa[i]!=0){
                 queue.offer(i);
             }else if(!queue.isEmpty()&& aa[i]==0){
                 int swapIndex= (int) queue.poll();
                 aa[i]= aa[swapIndex];
                 aa[swapIndex]=0;
             }
        }
        Arrays.stream(aa).forEach(System.out::println);
    }
}
