package stuff.patel;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Fibonacci {

    /**
     * input 7
     * Output = 0, 1, 1, 2, 3, 5, 8
     *
     *
     * @param args
     */
    public static void main(String[] args) {
      Fibonacci fibonacci= new Fibonacci();
//        String s = Arrays.stream(fibonacci.printFibonacci(1)).collect(String::new, (sb, i) -> sb.append((char) i).append(","),
//                StringBuilder::append).toString();
//        System.out.println(s);
    }

    public int[] printFibonacci(int i) {
        if(i<1){
            return null;
        }else if(i<2){
            return new int[]{0};
        }
        int[] k = new int[i];
        k[0]=0;
        k[1]=1;
        for (int j = 2; j < i; j++) {
            k[j]=k[j-1]+k[j-2];
        }
        return k;
    }

}


