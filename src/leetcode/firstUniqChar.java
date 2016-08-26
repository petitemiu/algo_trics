package leetcode;

public class firstUniqChar {
    public int firstUniqChar(String s) {
        int length = s.length();
        boolean[] unique = new boolean[length];
        for (int i = 0; i < length; ++i) {
            unique[i] = true;
        }
        for (int i = 0; i < length; ++i){
            char curr = s.charAt(i);
            if(!unique[i]) {
                continue;
            }
            for (int j = i + 1; j < length; ++j) {
                   if (s.charAt(j) == curr) {
                       unique[i] = false;
                       unique[j] = false;
                   }
            }
        }
        for(int i = 0; i < length; ++i){
            if (unique[i]){
                return i;
            }
        }
        return -1;
    }
}
