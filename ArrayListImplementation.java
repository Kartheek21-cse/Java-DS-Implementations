public class MyArrayList {
		 Object[] arr=new Object[5];
		 int index=0;
		 public void add(Object ele)
		 {
			 if(index>=arr.length)increase();
			 arr[index++]=ele;
		 }
		 public  void increase() {
			 Object[] temp=new Object[arr.length+3];
			 for(int i=0;i<arr.length;i++)
			 {
				 temp[i]=arr[i];
			 }
			 arr=temp;
		 }
		 public  void add(Object e,int pos)
		 {
			 if(pos<=-1||pos>=size()) 
				 throw new IndexOutOfBoundsException();
			 if(index>=arr.length)increase();
			 for(int i=size()-1;i>=pos;i--) {
				 arr[i+1]=arr[i];
				  }
			 arr[pos]=e;
			 index++;
		 }
		 public int size() {
			 return index;
		 }
		 public void remove(int pos) {
			 if(pos<=-1||pos>=size()) {
				 throw new IndexOutOfBoundsException();
			 }
			 for(int i=pos+1;i<size();i++) {
				 arr[i-1]=arr[i];
			 }
			index--;
			arr[index]=null;
		 }
		 public Object get(int pos) {
			 if(pos<=-1||pos>=size()) 
				 throw new IndexOutOfBoundsException();
			return arr[pos];
			 }
  }
public class ArrayDrive {

	public static void main(String[] args) {
		MyArrayList m=new MyArrayList();
		m.add(10);
		m.add(20);
		m.add(30);
		m.add(40);
		m.add(50);
		m.add(60,3);
		for(int i=0;i<m.size();i++) {
			System.out.println(m.get(i));
		}
		System.out.println(m.size());
		m.remove(4);
		System.out.println(m.size());
		for(int i=0;i<m.size();i++) {
			System.out.println(m.get(i));
		}
	}

}
