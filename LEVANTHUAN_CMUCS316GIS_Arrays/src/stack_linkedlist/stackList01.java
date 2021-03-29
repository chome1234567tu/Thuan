package stack_linkedlist;

public class stackList01<E> {
	private class Node{
		private Node next;
		private E info;
		private Node(E info)
		{
			this.info = info;
			this.next = null;
		}
		private Node(E info , Node next)
		{
			this.info = info;
			this.next = next;
		}
	}
	private Node top ;
	private int size ;
	public stackList01()
	{
		top = null;
		size = 0;
	}
	public boolean isEmpty()
	{
		return size == 0;
	}
	public E peek()
	{
		if(size == 0)
			return null;
		return top .info ;
	}
	public E pop()
	{
		if(size == 0)
			return null;
		E tmp = top.info;
		top = top.next;
		size --;
		return tmp;
	}
	public E push(E e)
	{
		Node p = new Node(e);
		if(size == 0)
		{
			top = p;
		}
		else {
			p.next = top ;
			top = p ;
		}
		size ++;
		return e;
	}
	public String toString()
	{
		String s = "";
		Node q = top ; 
		while(q != null)
		{
			s=q.info+" "+s;
			q=q.next;
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackList01<Integer> arr = new stackList01<Integer>();
		arr.push(1);
		arr.push(2);
		arr.push(3);
		arr.push(4);
		arr.push(5);
		arr.push(6);
		arr.push(7);
		arr.push(8);
		System.out.println(arr);
		arr.pop();
		arr.pop();
		arr.pop();
		System.out.println(arr);
		arr.push(6);
		arr.push(7);
		arr.push(8);
		System.out.println(arr);
	}

}
