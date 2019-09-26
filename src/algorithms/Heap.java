package algorithms;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-06-06
 **/
public class Heap {
    public void heapSort(int[] nums) {
        if (nums == null || nums.length <= 2) return;

        int N = nums.length - 1;
        //构造最大堆
        for(int k = N / 2; k >= 1; k--) {
            sink(nums, k, N);
        }
        while(N > 1) {
            exch(nums, 1, N--);
            sink(nums, 1, N);
        }
    }

    private void sink(int[] pq, int k, int N) {
        while(k*2 <= N) {
            int j = k*2;
            if (j < N && pq[j] < pq[j + 1]) {
                j++;
            }

            if (pq[k] >= pq[j]) break;
            exch(pq, k, j);
            k = j;
        }
    }
    private void exch(int[] num, int i, int j) {
        int temp = num[j];
        num[j] = num[i];
        num[i] = temp;
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        int[] nums = new int[]{0, 2,1,2, 3, 4};
        heap.heapSort(nums);
        for(int i = 1; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
