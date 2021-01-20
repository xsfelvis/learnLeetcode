package testjava;

import java.util.*;

public class TestMain {
    public static void main(String[] args) {
        String s1 = "misssd";
        String s2 = "sd";
        int index = new Solution().strStr(s1,s2);
        System.out.println(index);


    }

    static class Solution {
        public int strStr(String haystack, String needle) {
            // 安全性检查
            if (haystack == null || needle == null)
                return 0;
            if(needle.length()==0)
                return 0;
            if(!haystack.contains(needle)){
                return -1;
            }
            //固定窗口法
            int windowsSize = needle.length();

            Character needFirst = needle.charAt(0);
            int haystackLength = haystack.length();
            for(int index = 0; index <= haystackLength-1;index++){
                if(index+windowsSize <= haystackLength
                        && haystack.substring(index,index+windowsSize).equals(needle)){
                    return index;
                }
            }
            return -1;
        }
    }

}
