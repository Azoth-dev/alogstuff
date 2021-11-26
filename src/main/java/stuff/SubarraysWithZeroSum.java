package stuff;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithZeroSum {

    public static void main(String[] args) {

        int[] aa = {15 ,-2 ,2 ,-8 ,1 ,7 ,10 ,23,-48};
        int countOfSubArray=0;
        Map<Integer,Integer> frqMap= new HashMap<>();
        int preSum=0;
        frqMap.put(preSum,1) ;
            for(int fastPointer=0;fastPointer<aa.length;fastPointer++){
                preSum=preSum+aa[fastPointer];
                frqMap.merge(preSum,1,Integer::sum);

                if (frqMap.get(preSum) >1){
                    Integer frq = frqMap.get(preSum);
                    countOfSubArray=countOfSubArray+frq-1;
                }

        }

        System.out.println("O/P:"+countOfSubArray);

    /*
        0 -> 1
        15 -> 1
        13->1
        15>2
        7->1
        8->1
        15>3
        25->1
        48->1

   10,-8,-2
   -8,7,1
   -2,2


      1+ 2 +3
     */

    }
}
