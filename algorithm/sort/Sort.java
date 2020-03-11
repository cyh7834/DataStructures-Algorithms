/**
  * @FileName : Sort.java
  * @Date : 2020. 3. 11. 
  * @변경이력 : selectionSort, insertionSort, bubbleSort 함수 추가.
  * @프로그램 설명 : 배열을 오름차순으로 정렬할 수 있는 여러 함수를 제공한다.
  */
public class Sort {
	public int[] selectionSort(int[] arr) {
		int arrLength = arr.length;
		int temp, minIndex = 0;
		
		for (int i = 0; i < arrLength - 1; i++) {
			for (int j = i; j < arrLength; j++) {
				if (arr[minIndex] > arr[j])
					minIndex = j;
			}
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		return arr;
	}
	
	public int[] insertionSort(int[] arr) {
		int arrLength = arr.length;
		int currentValue;
		
		for (int i = 1; i < arrLength; i++) {
			currentValue = arr[i];
			int j = i - 1;
			
			while((j >= 0) && (arr[j] > currentValue)) {
				arr[j + 1] = arr[j];
				j--;
			}
			
			arr[j + 1] = currentValue;
		}
		
		return arr;
	}
	
	public int[] bubbleSort(int[] arr) {
		int arrLength = arr.length;
		int temp;
		
		for (int i = arrLength; i > 2; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		return arr;
	}
}
