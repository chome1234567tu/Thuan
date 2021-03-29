package stack_linkedlist;

public class StackList02 <E>{
	private class Node{
		private E info;
		private Node next;
		private Node(E info)
		{
			this.info = info ; 
			this.next = null;
		}
		private Node(E info , Node next)
		{
			this.info = info ; 
			this.next = next;
		}
	}
	private Node top;
	private int size;
	public StackList02 ()
	{
		size = 0;
		top = null;
	}
	public boolean isEmpty()
	{
		return size == 0;
	}
	public E peek()
	{
		if(size == 0 )
			return null;
		return top.info;
	}
	public E pop()
	{
		if(size == 0)
			return null;
		E tmp = top.info;
		top = top.next;
		size -- ;
		return tmp;
	}
	public E push(E e)
	{
		Node p = new Node(e);
		if(size != 0)
			p.next = top;
		top = p ;
		size++;
		return e;
	}
	public String toString()
	{
		String s = "";
		Node q = top ; 
		while(q!= null)
		{
			s=q.info+" "+s;
			q=q.next;
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackList02 <Integer> arr= new StackList02 <Integer> ();
		arr.push(1);
		arr.push(2);
		arr.push(3);
		arr.push(4);
		arr.push(5);
		System.out.println(arr);
		System.out.println(arr.isEmpty());
		System.out.println(arr.peek());
		System.out.println(arr);
		System.out.println(arr.pop());
		System.out.println(arr);
	}

}
