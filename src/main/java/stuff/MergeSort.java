package stuff;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MergeSort {

    public static void main(String[] args) {

        int[] inputArrays= {3,6,1,7,4,8,9,5,11};

        int[] sorted=doMergeSort(inputArrays);

    }

    private static int[] doMergeSort(int[] inputArrays) {
        System.out.println("\n\n doMergeSort...........");

        if(inputArrays.length>1) {
            int[] left = leftSplit(inputArrays);
            System.out.println("Left view :" +Arrays.stream(left).mapToObj(x->String.valueOf(x)).collect(Collectors.joining(",")));
            int[] right = rightSplit(inputArrays);
            System.out.println("Right view :" +Arrays.stream(right).mapToObj(x->String.valueOf(x)).collect(Collectors.joining(",")));
            doMergeSort(left);
            doMergeSort(right);

            return doSort(inputArrays,left,right);

        }
        return inputArrays;
    }

    private static int[] doSort(int[] result, int[] left, int[] right) {
        String collect = Arrays.stream(result).mapToObj(x -> String.valueOf(x)).collect(Collectors.joining(","));
        System.out.println("......finally input of sort"+ collect);

        int t1 = 0;
        int t2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (t2 >= right.length
                    || (t1 < left.length && left[t1] <= right[t2])) {
                result[i] = left[t1];
                t1++;
            } else {
                result[i] = right[t2];
                t2++;
            }
        }

//        for (int i=0;i<left.length;i++){
//            if(left[i]<right[i]){
//                inputArrays[i]=left[i];
//                inputArrays[i+1]=right[i];
//            }else{
//                inputArrays[i]=right[i];
//                inputArrays[i+1]=left[i];
//            }
//        }
        collect = Arrays.stream(result).mapToObj(x -> String.valueOf(x)).collect(Collectors.joining(","));
        System.out.println("......finally output of sort"+ collect);
        return result;

    }

    private static int[] rightSplit(int[] inputArrays) {
        int length = inputArrays.length - (inputArrays.length / 2);
        return Arrays.copyOfRange(inputArrays,inputArrays.length / 2,inputArrays.length);
    }

    private static int[] leftSplit(int[] inputArrays) {
        int length = inputArrays.length;
        return Arrays.copyOf(inputArrays,length/2);
    }
}
