package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public int Choice(int k, int[] tangerine) {

        int answer = 0;
        Map<Integer, Integer> sizeMap = new HashMap<Integer, Integer>();

        for (int size : tangerine){
            sizeMap.put(size, sizeMap.getOrDefault(size,0) + 1 );
        }

        List<Integer> keyList = new ArrayList<>(sizeMap.keySet());

        keyList.sort((o1,o2) -> sizeMap.get(o2) - sizeMap.get(o1));

        int i = 0;
        while( k > 0 ){
            k -= sizeMap.get(keyList.get(i));
            answer++;
            i++;
        }

        return answer;
    }

}
