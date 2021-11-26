package stuff;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithKSum {
    public static void main(String[] args) {

        int[] aa =  {15 ,-2 ,2 ,-8 ,1 ,7 ,10 ,23,-48};
        int k = 8;
        int countOfSubArray = 0;
        Map<Integer, Integer> frqMap = new HashMap<>();
        int preSum = 0;
        frqMap.put(preSum, 1);
        for (int fastPointer = 0; fastPointer < aa.length; fastPointer++) {
            preSum = preSum + aa[fastPointer];
            frqMap.merge(preSum, 1, Integer::sum);

            if (frqMap.get(preSum) > 1 && frqMap.get(preSum - k) !=null) {
                Integer frq = frqMap.get(preSum);
                countOfSubArray = countOfSubArray + frq - 1;
            }else if( frqMap.get(preSum - k) !=null &&  frqMap.get(preSum - k)>0 && k>0){
                Integer frq = frqMap.get(preSum);
                countOfSubArray = countOfSubArray + frq;
            }

        }
        System.out.println("O/P:"+countOfSubArray);
    }
}

/**
 *          2
 *   1,1,1
 *
 *   0->1
 *   1->1
 *   2->1
 *   3->1
 *
 */