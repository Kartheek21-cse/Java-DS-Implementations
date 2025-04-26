public class Node {
	Object ele;
	Node next;
	Node prev;
	Node(Object e,Node n){
		ele=e;
		next=n;
	}
 Node(Node n,Object e,Node m){
	prev=n;
	next=m;
	ele=e;
 }
}
public class DoubleLinkedList {
 Node first=null;
 int count=0;
 public void add(Object e) {
	 if(first==null) {
		 first=new Node(null,e,null);
		 count++;
		 return;
	 }
	 Node curr=first;
	 while(curr.next!=null) {
		 curr=curr.next;
	 }
	 curr.next=new Node(curr,e,null);
	 count++;
 }
 public void add(Object e,int pos) {
	 if(pos<=-1||pos>=size())
		 throw new IndexOutOfBoundsException();
	 if(pos==0) {
		 Node n=new Node(null,e,first);
		 first.prev=n;
		 first=n;
		 count++;
		 return;
	 }
	 Node curr=first;
	 for(int i=1;i<pos;i++) {
		 curr=curr.next;
	 }
	 Node n=new Node(curr,e,curr.next);
	 curr.next.prev=n;
	 curr.next=n;
	 count++;
 }
 public int size()
 {
	 return count;
 }
 public Object get(int pos) {
	 if(pos<=-1||pos>=size())
		 throw new IndexOutOfBoundsException();
	 Node curr=first;
	 for(int i=1;i<=pos;i++) {
		 curr=curr.next;
	 }
	 return curr.ele;
 }
 public void remove(int pos) {
	 if(pos<=-1||pos>=size())
		 throw new IndexOutOfBoundsException();
	 if(pos==0) {
		 first=first.next;
		 first.prev=null;
		 count--;
		 return;
	 }
	 Node curr=first;
	 for(int i=1;i<pos;i++) {
		 curr=curr.next;
	 }
	 curr.next=curr.next.next;
	 if(curr.next!=null)curr.next.prev=curr;
	 count--;
 }
 public void reverse()
 {
	 Node prev=null;
	 Node temp=null;
	 Node curr=first;
	 while(curr!=null) {
		 temp=curr.next;
		 curr.next=prev;
		 curr.prev=temp;
		 prev=curr;
		 curr=temp;
	 }
	 first=prev;
 }
 public String toString() {
	 if(count==0)return "[]";
	 Node curr=first;
	 String res="["+curr.ele;
	 while(curr.next!=null) {
		 curr=curr.next;
		 res=res+","+curr.ele;
	 }
	 res+="]";
	 return res;
 }
}
public class MyDoubleLinkedList {
	  public static void main(String[] args) {
			DoubleLinkedList m=new DoubleLinkedList();
			m.add(10);
			m.add(20);
			m.add(30);
			m.add(40);
			m.add(50);
			m.add(60,2);
			m.remove(2);
			System.out.println(m);
			m.reverse();
			System.out.println(m);
			for(int i=0;i<m.size();i++) {
				System.out.println(m.get(i));
			}
			System.out.println(m.size());


		}

	}
