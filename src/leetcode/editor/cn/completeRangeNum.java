package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;

public class completeRangeNum {
    public static void main(String[] args) {
        ArrayList<int[]> arrayListIn = new ArrayList<>();
        arrayListIn.add(new int[]{1, 4});
        arrayListIn.add(new int[]{12, 14});
        arrayListIn.add(new int[]{2, 5});
        arrayListIn.add(new int[]{8, 9});

        getCompleteRangeNum(arrayListIn);

    }

    public static ArrayList<int[]> getCompleteRangeNum(ArrayList<int[]> numsIn) {
        //排序
        for (int i = 0; i < numsIn.size() - 1; i++) {
            for (int j = 0; j < numsIn.size() - 1 - i; j++) {
                int start;
                int end;
                if (numsIn.get(j)[0] > numsIn.get(j + 1)[0]) {
                    start = numsIn.get(j)[0];
                    numsIn.get(j)[0] = numsIn.get(j + 1)[0];
                    numsIn.get(j + 1)[0] = start;

                    end = numsIn.get(j)[1];
                    numsIn.get(j)[1] = numsIn.get(j + 1)[1];
                    numsIn.get(j + 1)[1] = end;
                }
            }
        }

        ArrayList<int[]> arrayListOut = new ArrayList<>();


        //合并
        for(int i = 0; i < numsIn.size() - 1; i++){
            int[] mergeNum = new int[]{};
            if(numsIn.get(i)[0]< numsIn.get(i+1)[0] && numsIn.get(i+1)[0]<numsIn.get(i)[1]){
                //两个数组包含，合并
//                mergeNum[0] =

            }
        }


        return numsIn;

    }


//    for 排序数组 比如 [1,4] [12,14] [2,5] [8,9] -> [1,4],[2,5] [8,9], [12,14]
//
//    准备一个ArrayList<int[]> arrayOut
//for 排序后的数组 arrayIn
//    准备一个 int[] temp
//    比较当前数组和temp,(这里可以理解为，每次数组和上次相邻数组合并之后的temp数组比较， )
//            case 1:  是 交叉关系 类似[1,4],[2,5]   arrayIn.get(i)[0]  < temp[0] < arrayIn.get(i)[1]< temp[1]
//    temp = [arrayIn.get(i)[0], temp[1]]
//            case 2:  是 包含关系[1,4],[1,5],   arrayIn.get(i)[0]  < temp[0]< temp[1] < arrayIn.get(i)[1]
//    temp = [arrayIn.get(i)[0], arrayIn.get(i)[1]]
//    比如2次后上面的 [1,4],[2,5]——>temp = 【1,5】
//
//
//    来到[1,5]跟[8,9]
//            case 3:  出现区间  temp[1]< arrayIn.get(i)[0]
//            arrayOut.add(new int[]{temp[1],arrayIn.get(i)[0]-1 })
//    此时出现区间 【5+1，8-1】 = [6,7]
//    temp重置为 = arrayIn.get(i); 即[8,9]
//
//
//    循环结束 输出 arrayOut {[6,7],[10,11]}



}
