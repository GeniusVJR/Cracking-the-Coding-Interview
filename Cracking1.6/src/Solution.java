
public class Solution {
	public int[][] transformImage(int[][] mat, int n) {
		for(int layer = 0; layer < n/2; layer++){
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; i++){
				int offset = i - first;
				//存储上边
				int top = mat[first][i];
				//左到上
				mat[first][i] = mat[last-offset][first];
				//下到左
				mat[last-offset][first] = mat[last][last-offset];
				//右到下
				mat[last][last-offset] = mat[i][last];
				//上到右
				 mat[i][last] = top;
			}
		}
		return mat;
    }
}
