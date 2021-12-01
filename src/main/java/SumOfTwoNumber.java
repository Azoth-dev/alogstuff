import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfTwoNumber
{

    public static void main(String[] args) {
        int[] numbers= new int[] {1,2,3,4,5,6,9};
        int targer =15;
        System.out.print(Arrays.toString(getTwoSum(numbers,targer)));
    }

    private static int[] getTwoSum(int[] numbers, int targer) {
        Map<Integer,Integer> visted= new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int delta=targer-numbers[i];
            if(visted.containsKey(delta)){
                return new int[] {i,visted.get(delta)};
            }
            visted.put(numbers[i],i);
        }
        return new int[]{-1,-1};
    }

}
