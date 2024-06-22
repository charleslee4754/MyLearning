public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int i = binarySearch(arr, 10);
        System.out.println(i);
    }

    /**
     * return the index of array that value equal target value
     * @param intArr 数组
     * @param target 查找值
     * @return index
     */
    private static int binarySearch(int[] intArr, int target) {
        int i = 0;
        int j = intArr.length - 1;
        while (true) {
            if (i > j) {
                return -1;
            }

            int m = (i + j) >>> 1;
            if (intArr[m] == target) {
                return m;
            } else if (intArr[m] > target) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
    }
}
