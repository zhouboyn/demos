package algorithms;

import java.util.Random;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-06-06
 **/
public class Quick {
    public void sort(int[] num) {
        if (num == null || num.length <= 1) return;
        shuffle(num);
        quickSort(num, 0, num.length - 1);
    }
    public void quickSort(int[] num, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(num, lo, hi);
        quickSort(num, lo, j - 1);
        quickSort(num, j + 1, hi);
    }

    private void shuffle(int[] num) {
        for (int i = num.length - 1; i >= 0; i--) {
            int j = new Random().nextInt(i+1);
            exch(num, i, j);
        }
    }

    private int partition(int[] num, int lo, int hi) {
        int v = num[lo];
        int i = lo;
        int j = hi + 1;
        while (true) {
            while(num[++i] < v) {
                if (i == hi)
                    break;
            }
            while(num[--j] > v) {
                if (j == lo)
                break;
            }

            if (i >= j) break;

            exch(num, i, j);
        }
        exch(num, lo, j);
        return j;
    }


    private void exch(int[] num, int i, int j) {
        int temp = num[j];
        num[j] = num[i];
        num[i] = temp;
    }

    public static void main(String[] args) {
        Quick quick = new Quick();
        int[] num = new int[]{2, 1, 2, 4, 3, 2};
        quick.sort(num);
        for (int k: num) {
            System.out.println(k);
        }
    }
}
