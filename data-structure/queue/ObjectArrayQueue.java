/**
  * @FileName : ObjectArrayQueue.java
  * @Date : 2020. 3. 12. 
  * @변경이력 : 클래스 구현
  * @프로그램 설명 : Object형의 배열을 사용한 queue입니다.
  */
public class ObjectArrayQueue {
	private Object[] queue;
	private int back;
	private int front;
	private int max;
	
	public ObjectArrayQueue(int max) {
		this.max = max;
		this.queue = new Object[max];
		this.front = 0;
		this.back = -1;
	}
	
	public Object enqueue(Object value) {
		if (max >= back)
			throw new ArrayIndexOutOfBoundsException();
		
		queue[++back] = value;
		
		return value;
	}
	
	
	/**
	  * @Method Name : dequeue
	  * @작성일 : 2020. 3. 12.
	  * @Method 설명 : front 데이터를 빼낸 후 빈 인덱스를 채워넣기 위해 O(n) 연산 발생.
	  * @return : Object
	  */
	public Object dequeue() {
		if (isEmpty())
			throw new ArrayIndexOutOfBoundsException();
		
		Object frontValue = queue[front];
		
		for(int i = 1; i < back + 1; i++)
			queue[i - 1] = queue[i];
		
		back--;
		
		return frontValue;
	}
	
	public Object peek() {
		if (isEmpty())
			throw new ArrayIndexOutOfBoundsException();
		
		return queue[back];
	}
	
	public int size() {
		return back + 1;
	}

	public boolean isEmpty() {
		return back == -1;
	}
	
	public void clear() {
		back = -1;
	}
	
	
}
