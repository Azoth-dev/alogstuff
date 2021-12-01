package stuff.patel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class IsPermutation {
    public static void main(String[] args) {
        System.out.println(isPermutation("hello", "lloeh"));
        System.out.println(isPermutation("hello", "bye"));
        System.out.println(isPermutation("", ""));
        System.out.println(isPermutation("", "sscs"));
        System.out.println(isPermutation("hello", "hello"));
        System.out.println(isPermutation("helloo", "llloeh"));

    }

    private static boolean isPermutation(String s1, String s2) {

        Map<Character,Integer> s1Map=getCharMap(s1);
        System.out.println("S1 map"+s1Map);
        Map<Character, Integer> s2Map = getCharMap(s2);
        System.out.println("S1 map"+s2Map);
        if(s1Map.equals(s2Map)){
            return true;
        }

        return false;
    }

    private static Map<Character, Integer> getCharMap(String s1) {
        Map<Character, Integer> map= new HashMap<>();
        for(char val:s1.toCharArray()){
            map.merge(Character.valueOf(val),1,Integer::sum);
        }
        return map;
    }
}
