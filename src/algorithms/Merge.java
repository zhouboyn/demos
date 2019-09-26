package algorithms;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-06-06
 **/
public class Merge {
    int[] aux;
    public void sort(int[] a) {
        aux = new int[a.length];
        mergeSort(a, 0, a.length - 1);
    }
    public void mergeSort(int[] a, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        mergeSort(a, lo, mid);
        mergeSort(a, mid + 1, hi);

        merge(a, lo, mid, hi);
    }

    public void merge(int[] a, int lo, int mid, int hi) {
        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }
        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (aux[i] < aux[j]) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }

    }

    public static void main(String[] args) {
        Merge merge = new Merge();
        int[] num = new int[]{2, 1, 2, 4, 3};
        merge.sort(num);
        for (int k: num) {
            System.out.println(k);
        }
    }
}
