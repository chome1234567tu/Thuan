package Queue;

public class QueueList03 <E>{
	private class Node{
		private E info;
		private Node next;
		private Node(E info)
		{
			this.info = info; 
			this.next = null;
		}
		private Node (E info , Node next)
		{
			this.info = info; 
			this.next = next;
		}
	}
	private Node head,tail;
	private int size ; 
	public QueueList03()
	{
		head = tail = null;
		size =0;
	}
	public boolean isEmpty()
	{
		return size == 0;
	}
	public E peek()
	{
		if(size == 0)
			return null;
		return head.info;
	}
	public E pop()
	{
		if(size == 0)
			return null;
		E tmp = head .info;
		head = head .next ;
		size --;
		return tmp;
	}
	public E push(E e)
	{
		Node p = new Node(e);
		if(size == 0)
		{
			head = tail = p;
		}
		else
		{
			tail.next = p;
			tail = p;
		}
		size ++;
		return e;
	}
	public String toString()
	{
		String s="";
		Node q= head;
		while(q!= null)
		{
			s=s+q.info+" ";
			q=q.next;
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueList03 <Integer> list = new QueueList03 <Integer> ();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list.pop());
		System.out.println(list);
		list.push(6);
		System.out.println(list);
		
	}

}
