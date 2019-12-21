package leetcode.editor.cn;

public class binarySearch {

    // while循环进行二分查找
    public static int binarySearch(int srcArray[], int key) {
        if (srcArray == null || srcArray.length == 0) {
            return -1;
        }
        int start = 0;
        int end = srcArray.length - 1;
        int mid = (start + end) / 2;
        if (srcArray[mid] == key) {
            return mid;
        }
        while (start < end) {
            mid = (start + end) / 2;
            if (srcArray[mid] > key) {
                start = mid + 1;
            } else if (srcArray[mid] < key) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }


    //递归迭代二分查找
    public static int binarySearch(int srcArray[], int start, int end, int key) {
        if (srcArray == null || srcArray.length == 0) {
            return -1;
        }

        int mid = (start + end) / 2;
        if (srcArray[mid] == key) {
            return mid;
        }

        if (key > srcArray[mid]) {
            return binarySearch(srcArray, mid + 1, end, key);
        } else if (key < srcArray[mid]) {
            return binarySearch(srcArray, start, mid - 1, key);
        }
        return -1;
    }
}
