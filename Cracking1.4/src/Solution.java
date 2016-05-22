/**
 * 题目描述
 * 
 * 请编写一个方法，将字符串中的空格全部替换为“%20”。假定该字符串有足够的空间存放新增的字符，并且知道字符串的真实长度(小于等于1000)，
 * 同时保证字符串由大小写的英文字母组成。 给定一个string iniString 为原始的串，以及串的长度 int len, 返回替换后的string。
 * 测试样例： "Mr John Smith”,13 返回："Mr%20John%20Smith" ”Hello World”,12
 * 返回：”Hello%20%20World”
 * 
 * @author dream
 *
 */

/**
 * 解题思路：通过一个StringBuilder来根据相应的情况来添加不同的字符
 * @author dream
 *
 */
public class Solution {

	// public String replaceSpace(String iniString, int length) {
	// char[] c = iniString.toCharArray();
	// int spaceCount = 0;
	// for(int i = 0; i < length; i++){
	// if(c[i] == ' '){
	// spaceCount++;
	// }
	// }
	// int newLength = length + 2*spaceCount;
	// c[newLength] = '\0';
	// for(int i = length-1; i >= 0; i--){
	// if(c[i] == ' '){
	// c[newLength - 1] = '0';
	// c[newLength - 2] = '2';
	// c[newLength - 3] = '%';
	// newLength -= 3;
	// }else {
	// c[newLength - 1] = c[i];
	// newLength -= 1;
	// }
	// }
	// return new String(c);
	// }
	public String replaceSpace(String iniString, int length) {
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < iniString.length(); i++){
			if(iniString.charAt(i) == ' '){
				str.append("%20");
			}else {
				str.append(iniString.charAt(i));
			}
		}
		return new String(str);
	}
}
