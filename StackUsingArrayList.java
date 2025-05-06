public class StackUsingAL {
		 private Object[] arr=new Object[5];
		 int index=0;
		 public void push(Object ele)
		 {
			 if(index>=arr.length)increase();
			 arr[index++]=ele;
		 }
		private void increase() {
			 Object[] temp=new Object[arr.length+3];
			 for(int i=0;i<arr.length;i++)
			 {
				 temp[i]=arr[i];
			 }
			 arr=temp;
		 }
		 public int size() {
			 return index;
		 }
		 public boolean isEmpty() {
			 return index==0;
		 }
		 public Object pop() {
			 if(isEmpty())
				 throw new EmptyStackException();
			 index--;
			 Object temp=arr[index];
			 arr[index]=null;
			 return temp;
					 }
		 public Object peek() {
			 if(index==0)return null;
			 return arr[index-1];
			 }
}
public class StackDrive {

	public static void main(String[] args) {
		StackUsingAL m=new StackUsingAL();
		m.push(10);
		m.push(20);
		m.push(30);
		m.push(40);
		m.push(50);
		m.push(60);
		while(!m.isEmpty()) {
			System.out.println(m.pop());
		}
		System.out.println(m.pop());//all elements pop from stack so exception
	}

}
