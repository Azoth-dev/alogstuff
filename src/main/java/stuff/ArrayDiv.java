package stuff;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ArrayDiv {

    public static void main(String[] args) {

        int[] main= {10,20, 71,89,22,88,55,45};
        int div=10;

        Map<Integer,Integer> freqMap= new HashMap<>();

        //create frequency map
        for (int i = 0; i < main.length; i++) {
            freqMap.merge(main[i]%div,1,(k,v)->v+1);
        }

        freqMap.forEach((k,v) -> System.out.println("reminder is :"+k+"with Frequency:"+v));

        if(freqMap.get(0)%2!=0){

        }

    }
}
