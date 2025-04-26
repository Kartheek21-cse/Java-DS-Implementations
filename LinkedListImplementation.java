public class Node {
	Object ele;
	Node next;
	Node(Object e,Node n){
		ele=e;
		next=n;
	}
}
public class LinkedListImp {
 	private Node first=null;
 	private Node last=null;
 	int count=0;
 	public void add(Object e) {
 		if(first==null) {
 			first=new Node(e,null);
 			last=first;
 			count++;
 			return;
 		}
 		last.next=new Node(e,null);
 		last=last.next;
 		count++;
 	}
 	public void add(Object e,int pos) {
 		if(pos<=-1||pos>=size()) 
 			 throw new IndexOutOfBoundsException();
 		if(pos==0) {
 			first=new Node(e,first);
 			count++;
 			return;
 		}
 		Node curr=first;
 		for(int i=1;i<pos;i++) {
 			curr=curr.next;
 		}
 		curr.next=new Node(e,curr.next);
 		count++;
 	}
   public int size()
   {
 	  return count;
   }
   public void remove(int pos) {
 	  if(pos<=-1||pos>=size()) 
 			 throw new IndexOutOfBoundsException();
 	  if(pos==0) {
 		  first=first.next;
 		  count--;
 		  return;
 	  }
 	  Node curr=first;
 	  for(int i=1;i<pos;i++)
 	  {
 		  curr=curr.next;
 	  }
 	 curr.next=curr.next.next;
 	 count--;
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
   public String toString()
   {
 	  if(first==null) return "[]";
 	  Node curr=first;
 	  String res="["+curr.ele;
 	  while(curr.next!=null) {
 		  curr=curr.next;
 		  res=res+","+curr.ele;
 	  }
 	  res+="]";
 	  return res;
   }
   public void reverse() {
 	  Node curr=first;
 	  Node temp=null;
 	  Node prev=null;
 	  while(curr!=null) {
 		  temp=curr.next;
 		  curr.next=prev;
 		  prev=curr;
 		  curr=temp;
 	  }
 	  
 	  first=prev;
   }
 }
public class MyLinkedList {

	public static void main(String[] args) {
		LinkedListImp l=new LinkedListImp();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60,2);
		l.add(70,5);
		System.out.println(l);
		l.reverse();
		System.out.println(l);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println(l.size());

	}

}
