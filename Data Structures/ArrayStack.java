//Question 5 of Practice Exam ArrayStack.java

public class ArrayStack {
    private int array[];
    private int top;
	//private int length = 0;

	public void push(int value) {
		int array2[];
		if(array == null){
			array2 = new int[1];
			array2[0] = value;
			array = array2;
		}else{
			array2 = new int[this.array.length + 1];
			for(int i=0; i < array.length; i++){
				array2[i] = array[i];
			}
			array2[array.length] = value;
			array = array2;
		}		
	}

	public int pop() {
		if(this.array != null && this.array.length != 0){
			top = array[array.length - 1];
			int[] array2 = new int[this.array.length - 1];
			for(int i=0; i < array.length - 1; i++){
				array2[i] = array[i];
			}
			array = array2;
			return(top);
		}else{
			return 0; //return 0 when the stack is empty or not created
		}
	}

	public int top() {
		top = array[array.length - 1];
		return(top);
	}

	public boolean isEmpty(){
		if (this.array == null || this.array.length == 0){
			return true;
		}else{
			return false;
		}
	}

	public String print() {
		String result = "[ ";
		for(int i = 0; i < array.length; i++){
			result += String.valueOf(array[i]);
			result += ", ";
		}
		result += "] ";
		return result;
	}
}