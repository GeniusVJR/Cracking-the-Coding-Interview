/**
 * 请实现一个算法，在不使用额外数据结构和储存空间的情况下，翻转一个给定的字符串(可以使用单个过程变量)。
	给定一个string iniString，请返回一个string，为翻转后的字符串。保证字符串的长度小于等于5000。
	测试样例：
	"This is nowcoder"
	返回："redocwon si sihT"
 * @author dream
 *
 */

/**
 * 思路，用一个Str从后往前遍历加上即可
 * @author dream
 *
 */
public class Solution {

	public String reverseString(String iniString) {
		char[] str = iniString.toCharArray();
		int len = str.length;
		String s = "";
		for(int i= len - 1; i >= 0; i--){
			s += str[i];
		}
		return s;
	}
}
