import java.util.Stack;
/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @author dream
 *
 * @param <T>
 */
public class MyQueue<T> {

	Stack<T> stackNewest, stackOldest;
	
	public MyQueue(){
		stackNewest = new Stack<T>();
		stackOldest = new Stack<T>();
	}
	
	public int size(){
		return stackNewest.size() + stackOldest.size();
	}
	
	public void add(T value){
		/**
		 * 压入stackNewest，最新元素始终位于它的顶端
		 */
		stackNewest.push(value);
	}
	
	/**
	 * 将元素从stackNewest移至stackOldest，这么做通常是
	 * 为了要在stackOldest上执行操作
	 */
	private void shiftStacks(){
		if(stackOldest.isEmpty()){
			while (!stackNewest.isEmpty()) {
				stackOldest.push(stackNewest.pop());
			}
		}
	}
	
	public T peek(){
		//确保stackOldest含有当前元素
		shiftStacks();
		return stackOldest.peek();   //取回最旧元素
	}
	
	public T remove(){
		shiftStacks();
		return stackOldest.pop();
	}
}
