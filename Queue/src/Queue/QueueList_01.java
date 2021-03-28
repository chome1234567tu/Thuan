package Queue;

public class QueueList_01<E> {
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
			this.info = info ;
			this.next = next ;
		}
	}
	private Node head , tail ;
	private int size ; 
	public QueueList_01()
	{
		head = tail = null;
		size = 0;
	}
	public boolean isEmpty()
	{
		return size == 0;
	}
	public E peek()
	{
		if(size == 0 )
			return null;
		return head.info;
	}
	public E pop()
	{
		if(size == 0)
			return null;
		E tmp = head .info ;
		head = head .next;
		size -- ;
		return tmp;
	}
	public E push(E e)
	{
		Node p = new Node (e);
		if(size == 0)
		{
			head = tail = p;
		}
		else
		{
			tail.next = p ;
			tail = p;
		}
		size ++;
		return e;
	}
	public String toString()
	{
		String s ="";
		Node q = head ; 
		while(q != null )
		{
			s = s + q.info+ " ";
			q = q.next ; 
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueList_01 <Integer> arr = new QueueList_01 <Integer>();
		arr.push(1);
		arr.push(2);
		arr.push(3);
		arr.push(4);
		arr.push(5);
		arr.push(6);
		arr.push(7);
		arr.push(8);
		arr.push(9);
		arr.push(10);
		System.out.println(arr);
		arr.pop();
		arr.pop();
		System.out.println(arr);
	}

}
