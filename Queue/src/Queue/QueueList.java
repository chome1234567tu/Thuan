package Queue;

import java.util.LinkedList;

public class QueueList <E> {
	private class Node{
		private E info;
		private Node next;
		private Node(E info)
		{
			this.info= info;
			this.next = null;
		}
		private Node(E info , Node next)
		{
			this.info= info;
			this.next = next;
		}
	}
		private int size;
		private Node head, tail;
		public QueueList()
		{
			size =0 ; 
			head = tail = null;
		}
		public boolean isEmpty()
		{
			if(size ==0)
				return true;
			return false;
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
			E tmp = head.info ;
			head= head.next;	
			size--;
			return tmp;
		}
		public boolean push(E e)
		{
			Node p = new Node(e);
			if(size == 0 )
			{
				head =tail= p;
			}
			else
			{
				tail.next = p ; 
				tail = p;
			}
			size ++;
			return true;
		}
		public String toString()
		{
			String s="";
			Node q= head;
			while(q != null)
			{
				s=s+q.info + " ";
				q=q.next;
			}
			return s;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueList <Integer> arr = new QueueList<Integer>();
	//	QueueList <Integer>arr = new LinkedList<Integer>();
		arr.push(5);
		arr.push(6);
		arr.push(1);
		arr.push(3);
		arr.push(8);
		System.out.println(arr);
		System.out.println(arr.pop());
		System.out.println(arr);
		System.out.println(arr.peek());
		System.out.println(arr);
//		System.out.println(arr.isEmpty());
	}

}
