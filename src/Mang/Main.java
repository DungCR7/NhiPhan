package Mang;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Main {
    public static int findMaxLenSubseq(int[] arr)
    {
        // construct a set out of input elements
        Set<Integer> S = IntStream.of(arr)        // Returns IntStream
                .boxed()
                .collect(Collectors.toSet());

        // initialize result by 0
        int maxLen = 0;

        // do for each element of the input sequence
        for (int e: arr)
        {
            // check if the current element `e` is a candidate for starting a sequence,
            // i.e., the previous element `e-1` doesn't exist in the set
            if (!S.contains(e - 1))
            {
                // `len` stores the length of subsequence, starting with the
                // current element
                int len = 1;

                // check for presence of elements `e+1`, `e+2`, `e+3`, … ,`e+len`
                // in the set
                while (S.contains(e + len)) {
                    len++;
                }

                // update result with the length of current consecutive subsequence
                maxLen = Math.max(maxLen, len);
            }
        }

        // return result
        return maxLen;
    }

    public static void main (String[] args)
    {
        int[] arr = { 49, 1, 2, 200, 2, 3, 4, 5, 8, 9, 10 };

        System.out.println("The length of the maximum consecutive subsequence is " +
                findMaxLenSubseq(arr));
    }
}
