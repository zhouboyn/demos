package algorithms;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-06-06
 * 最大优先队列
 **/
public class MaxPriorityQueue {
    int[] pq;
    int N;


    public MaxPriorityQueue(int max) {
        pq = new int[max+1];
        N = 0;
    }

    public int size() {return N;}

    /**
     * 插入元素
     */
    public void insert(int key) {
        pq[++N] = key;
        swim(N);
    }

    private void swim(int k) {
        while (k > 1 && pq[k/2] < pq[k]) {
            exch(pq, k / 2, k);
            k = k / 2;
        }
    }
    private void exch(int[] num, int i, int j) {
        int temp = num[j];
        num[j] = num[i];
        num[i] = temp;
    }

    /**
     * 删除最大元素
     */
    public int delMax() {
        int max = pq[1];
        exch(pq, 1, N--);
        sink(1);
        return max;
    }

    private void sink(int k) {
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
}
