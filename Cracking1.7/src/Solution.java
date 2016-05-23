/**
 * 题目描述

	请编写一个算法，若MxN矩阵中某个元素为0，则将其所在的行与列清零。
	给定一个MxN的int[][]矩阵(C++中为vector>)mat和矩阵的阶数n，请返回完成操作后的int[][]矩阵(C++中为vector>)，保证n小于等于300，矩阵中的元素为int范围内。
	测试样例：
	[[1,2,3],[0,1,2],[0,0,1]]
	返回：[[0,0,3],[0,0,0],[0,0,0]]
 * @author dream
 *
 */

/**
 * 解题思路
 * 用两个数组分别纪录包含0元素的所有行和列，第二次遍历矩阵时，
 * 若所在行或列标记为0，则将元素清0
 * @author dream
 *
 */
public class Solution {

	public int[][] clearZero(int[][] mat, int n) {
		boolean[] raw = new boolean[n];
		boolean[] column = new boolean[n];
		
		//纪录值为0的元素所在行索引和列索引
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(mat[i][j] == 0){
					raw[i] = true;
					column[j] = true;
				}
			}
		}
		//若行i或列i有个元素为0，则将arr[i][j]置为0
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(raw[i] || column[j]){
					mat[i][j] = 0;
				}
			}
		}
		return mat;
	}
}
