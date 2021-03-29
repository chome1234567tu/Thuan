package stack_linkedlist;

public class StackList <E> {
	private class Node{
		private E info;
		private Node next;
		private Node(E info)
		{
			this.info=info;
			this.next=null;
		}
		private Node(E info, Node next)
		{
			this.info = info;
			this.next = next;
		}
	}
	private int size;
	private Node top;
	public StackList()
	{
		top=null;
		size=0;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public E peek()
	{
		if(size==0)
		{
			return null;
		}
		return top.info;
	}
	public E pop()
	{
		if(size==0)
		{
			return null;
		}
		E tmp = top.info;
		top=top.next;
		size--;
		return tmp;
	}
	public E push(E e)
	{
		Node p = new Node(e);
		if(size!=0)
			p.next = top;
		top= p ;
		size++;
		return e;
	}
	public String toString()
	{
		String s="";
		Node q= top;
		while(q!=null)
		{
			s=q.info+" "+s;
			q=q.next;
		}
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackList <Integer> list = new StackList <Integer>();
	
		list.push(2);
		list.push(9);
		list.push(1);
		list.push(8);
		System.out.println( list);
	//	System.out.println(list.isEmpty()); // kiem tra Stacklist rong ko (rong thi tra ve true , nguoc lai false)
	//	System.out.println(list.peek());
		System.out.println(list.pop());
		System.out.println(list);
	
	}

}
