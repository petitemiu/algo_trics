package algo_trics;

public class Solution {
    public int[] countBits(int num) {
        int[] arr = new int[num + 1];
        arr[0] = 0;
        int curr_pow = 0;
        int plus = 0;
        int next = 1;
        for (int i = 1; i <= num; ++i){
            if (i == next){
                plus = 0;
                ++curr_pow;
                next = (int)Math.pow(2, curr_pow);
            }
            arr[i] = arr[plus] + 1;
            ++plus;
        }
        return arr;
    }
}
