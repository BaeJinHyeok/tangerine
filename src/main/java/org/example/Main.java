package org.example;
import java.util.*;
import java.util.Map.*;
public class Main {
    public static void main(String[] args) {

        int k = 6;
        int l = 4;
        int j = 2;
        int[] tangerine  = {1, 3, 2, 5, 4, 5, 2, 3};
        int[] tangerine2 = {1, 3, 2, 5, 4, 5, 2, 3};
        int[] tangerine3 = {1, 1, 1, 1, 2, 2, 2, 3};

        Solution sol = new Solution();

        int answer = sol.Choice(k,tangerine);
        int answer2 = sol.Choice(l,tangerine2);
        int answer3 = sol.Choice(j,tangerine3);

        System.out.println(answer);
        System.out.println(answer2);
        System.out.println(answer3);
    }

}
