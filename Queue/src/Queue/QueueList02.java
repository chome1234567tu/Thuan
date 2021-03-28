package Queue;

public class QueueList02 <E>{
	private class Node{
		private E info;
		private Node next;
		private Node(E info)
		{
			this.info=info;
			this.next = null;
		}
		private Node(E info , Node next)
		{
			this.info=info;
			this.next = next;
		}
	}
	private int size;
	private Node head, tail;
	public QueueList02()
	{
		size = 0;
		head = tail = null;
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
		if(size == 0 )
			return null;
		E tmp = head.info;
		head= head .next;
		size -- ;
		return tmp;
	}
	public E push(E e)
	{
		Node p = new Node(e);
		if(size == 0)
		{
			head = tail= p;
		}
		else
		{
			tail.next=p;
			tail=p;
		}
		size++;
		return e;
	}
	public String toString()
	{
		String s="";
		Node q= head;
		while(q!=null) 
		{
			s= s+q.info+" ";
			q=q.next;
		}
		return s;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueList02 <Integer> arr = new QueueList02 <Integer>();
		arr.push(1);
		arr.push(2);
		arr.push(3);
		arr.push(4);
		arr.push(5);
		arr.push(6);
		System.out.println(arr);
		System.out.println(arr.pop());
		System.out.println(arr);
		
	}

}
