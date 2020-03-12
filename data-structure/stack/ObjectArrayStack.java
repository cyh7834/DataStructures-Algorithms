/**
  * @FileName : ObjectArrayStack.java
  * @Date : 2020. 3. 12. 
  * @변경이력 : top 계산 오류 수정
  * @프로그램 설명 : Object형의 배열을 사용한 Stack입니다.
  */
public class ObjectArrayStack {
	private Object[] stack;
	private int max;
	private int top;
	
	public ObjectArrayStack (int max) {
		this.max = max;
		this.stack = new Object[max];
		this.top = -1;
	}
	
	public Object push(Object value) {
		if (top >= max)
			throw new ArrayIndexOutOfBoundsException();
		
		stack[++top] = value;
		
		return value;
	}
	
	public Object pop() {
		if (isEmpty())
			throw new ArrayIndexOutOfBoundsException();

		return stack[top--];
	}
	
	public Object peek() {
		if (isEmpty())
			throw new ArrayIndexOutOfBoundsException();

		return stack[top];
	}
	
	public int size() {
		return top + 1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void clear() {
		top = -1;
	}
	
}
