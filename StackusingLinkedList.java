public class StackUsingLinkedList {
	public class Node {
		Object ele;
		Node next;
		
		Node(Object e,Node n){
			ele=e;
			next=n;
		}
}
	private Node first=null;
 	int count=0;
 	public void push(Object e) {
 		if(first==null) {
 			first=new Node(e,null);
 		}
 		else {
 		first=new Node(e,first);
 	}
 		count++;
 	}
   public int size()
   {
 	  return count;
   }
   public Object pop() {
 	 if(first==null)return null;
 	 Object temp=first.ele;
 	 first=first.next;
 	 count--;
 	 return temp;
   }
   public boolean isEmpty() {
 	  
 	 return count==0;
   }
   public Object peek() {
	   return first.ele;
   }
}
public class StackLLDrive {

	public static void main(String[] args) {
		StackUsingLinkedList m=new StackUsingLinkedList();
		m.push(10);
		m.push(20);
		m.push(30);
		m.push(40);
		m.push(50);
		m.push(60);
		System.out.println(m.size());
		while(!m.isEmpty()) {
		System.out.println(m.pop());
		}
		System.out.println(m.size());
	}

}
