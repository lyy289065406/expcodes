package exp.libs.algorithm.spa;

/**
 * <PRE>
 * 最短路径算法: Johonson算法.
 * 适用范围: 全源最短路问题, 有向图/无向图均可, 无负权环（但可检测负权环）
 * 时间复杂度: O(V * E * lgV)
 * 空间复杂度: 
 * </PRE>
 * <B>PROJECT：</B> exp-libs
 * <B>SUPPORT：</B> EXP
 * @version   1.0 2016-07-25
 * @author    EXP: www.exp-blog.com
 * @since     jdk版本：jdk1.6
 */
public class Johonson {

	/**
	 * 先使用BellmanFord算法，使所有的边的权重变为非负值，  
	 * 然后运用dijkstra算法依次求出每个节点的最短路径  
	 */
}
