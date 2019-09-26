package algorithms;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-06-06
 **/
public class UnionFind {
    //数组保存每个节点的父节点的索引
    private int[] id;
    //根节点所在分量的节点数
    private int[] sz;
    //联通分量的个数
    private int count;

    /**
     *
     * 初始化，每个节点自己都是一个分量，节点的父节点是自己，每个分量的size都是1
     */
    public UnionFind(int size) {
        id = new int[size];
        sz = new int[size];
        count = size;
        for (int i = 0; i < size; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }
    //返回联通分量的个数
    public int count(){
        return count;
    }

    /**
     * 判断两个点是否联通，就是看根节点是否是同一个节点
     */
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    //查找根节点
    private int find(int p) {
        //父节点不是根节点，继续找，直到找到根节点
        while(p != id[p]) {
            p = id[p];
        }
        return p;
    }

    //连接两个点
    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if (i == j) return;

        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
        count--;
    }
}
