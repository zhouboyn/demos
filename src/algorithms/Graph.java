package algorithms;
/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-03-30
 **/



/**
 * 用符号表为顶点的名字和0到V-1的整数值建立一一对应的关系并不困难，所以图的顶点可以用数组表示
 * 含有平行边的图称为多重图，没有平行边或者自环的图称为简单图
 *
 * 图的三种表示方法：
 * 1. 邻接矩阵 v*v的二维布尔矩阵 如果vw相连，则matrix[v][w]=true，对于点数过多的图占用空间太大，不能表示平行边。
 * 2. 边的数组 实现adj函数需要遍历所有的边
 * 3. 邻接表数组 以顶点为索引的列表数组， 列表的保存的是与索引顶点相连的顶点
 *
 *
 */
//public class Graph {
//    //verticles
//    private final int V;
//
//    //edges
//    private int E;
//
//    //邻接表
//    private Bag<Integer>[] adj;
//
//    Graph(int v) {
//
//    }
//    Graph(In in) {
//
//    }
//
//    /**
//     *
//     * @return verticle number
//     */
//    int V() {
//
//    }
//
//    /**
//     *
//     * @return edge number
//     */
//    int E() {
//
//    }
//
//
//    void addEdge(int v, int w) {
//        adj[v].add(w);
//        adj[w].add(v);
//        E++;
//    }
//
//    /**
//     *
//     * @param v an verticle
//     * @return verticles connected to v
//     */
//    Interable<Integer> adj(int v) {
//        return adj[v];
//    }
//
//    @Override
//    public String toString() {
//
//    }
//}
