/**
 * 题目描述

	给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。这里规定大小写为不同字符，且考虑字符串重点空格。
	给定一个string stringA和一个string stringB，请返回一个bool，代表两串是否重新排列后可相同。保证两串的长度都小于等于5000。
	测试样例：
	"This is nowcoder","is This nowcoder"
	返回：true
	"Here you are","Are you here"
	返回：false
 * @author dream
 *
 */

/**
 * 解题思路：申请两个额外的空间，ASCAII码值是256，通过int数组来增加值，然后减掉值，如果有数组元素不同，则返回false.
 * 注/**内代码为错误代码
 * @author dream
 *
 */
public class Solution {
//	public static boolean checkSam(String stringA, String stringB) {
//		if(stringA.length() != stringB.length()){
//			return false;
//		}
//		char[] c = new char[256];
//		for(int i = 0; i < stringA.length(); i++){
//			char chr = stringA.charAt(i);
//			c[chr]++;
//		}
//		for(int j = 0; j < stringB.length(); j++){
//			char ch = stringB.charAt(j);
//			c[ch]--;
//			if(c[ch] < 0){
//				return false;
//			}
//		}
//		return true;
//    }
	public boolean checkSam(String stringA, String stringB) {
		if(stringA.length() != stringB.length()){
			return false;
		}
		int[] strA = new int[256];
		int[] strB = new int[256];
		for(int i = 0; i <stringA.length(); i++){
			strA[stringA.charAt(i)]++;
			strB[stringB.charAt(i)]++;
		}
		for(int i = 0; i < 256; i++){
			if(strA[i] != strB[i]){
				return false;
			}
		}
		return true;
    }
	
	

}
