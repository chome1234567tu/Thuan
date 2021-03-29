package my_linkedlist;

public class MyLinKedList     <E> 
{
	private class Node
	{
		private E info;
		private Node next;
		private Node(E info)
		{
			this.info=info;
			this.next=null;
		}
		private Node(E info, Node next)
		{
			this.info=info;
			this.next=next;
		}
	}
	private int size;
	private Node head , tail;
	private MyLinKedList<E>.Node next;
	public MyLinKedList()
	{
		size =0;
		head=tail=null;
	}
	public void addfist(E e)
	{
		Node q = new Node(e);
		if(size ==0)
		{
			head = tail = q;
		}
		else
		{
			q.next=head;
			head=q;
		}
		size++;
	}
	public void addlast(E e)
	{
		Node p = new Node(e);
			if(size ==0)
			{
				head = tail = p;
			}
			else
			{
				tail.next = p ;
				tail = p;
			}
			size++;
	}
	public E get(int index)
	{
		if(index >=size || index<0)
		{
			return null;// ngoai pham vi
		}
		Node p = head;
		for(int i=0;i<index;i++)
		{
			p=p.next;
		}
		return p.info;
	}
	public void set(int index, E x)
	{
		if(index<0 || index>= size)
		{
			return;
		}
		Node p = head;
		for(int i=0;i<index;i++)
		{
			p=p.next;
		}
		p.info= x; 
	}
	public String toString()
	{
		String s="";
		Node q=head;
		while(q!= null)
		{
			s=s+ q.info+" ";
			q=q.next;
		}
		return s;
	}
	public int tonggiatri()
	{
		int sum=0;
		Node q = head;
		while(q!= null)
		{
			sum= sum +(int )q.info;
			q=q.next;
		}
		return sum;			
	}
	public int demle()
	{
		int dem=0;
		Node q = head;
		while(q!= null)
		{
			if((int)q.info %2!=0)
				dem++;
			q=q.next;
		}
		return dem;			
	}
	public int check(int x)
	{
		if(x<2)
			return 0;
		for(int i=2;i<x;i++)
			if(x%i==0)
				return 0;
		return 1;
						
	}
	
	public void tongsnt()
	{		int s=0;
		int dem=0;
		Node q = head;
		while(q!= null)
		{
			if(check((int)q.info)==1)
				System.out.println(q.info);
			q=q.next;
		}
		
	}
	public void inNodelast()
	{
	
		Node q=head;
		while(q.next!= null)
		{
			if (q.next == null)
				System.out.println(q.info);
			q=q.next;		
		}
	}
	public void sethead(Node HEAD)
	{
		head = HEAD;
	}
	//swap 2 node dau
	public void invertfirst()
	{
		if(size==2)
		{
			tail = head;
			head=tail.next;
			tail.next=null;
			head.next=tail;
		
		}
		else
		{	
		Node temp = head;
		Node q = temp.next;
		Node p = temp.next.next;
		
		temp.next = p;
		
		q.next = temp;
		
		head = q;	
		}
	} 
		//Dao 2 node cuoi
		public void invertLast() 
		{
			 	if(size == 2)
					invertfirst();
				if(size > 2) 
				{
					Node q = head;
					while(q.next != tail)
						q = q.next;
					Node r = head;
					while(r.next != q)
						r = r.next;
					tail.next = q;
					q.next=null;
					r.next=tail;
					tail = q;
				
				}
		}
		// swap hai node dau va cuoi
		public void swap2NodeFistlast()
		{
			Node p = head,i=null;
			while(p.next != tail)
				p=p.next;
			tail.next = head.next;
			head.next =null;
			p.next = head;
			i = head;
			head= tail;
			tail = i;
			
		}
		// dao toan bo node
		public void invertLinkedList() 
		{
			if (size > 2) {
				tail = head;
				Node head1 = null;
				while (head != null) {
					Node q = head;
					head = head.next;
					q.next = head1;
					head1 = q;
				}
				head = head1;
			}
		}
		public void swap2()
		{
			Node q = head , i = null;
			while(q.next != tail)
			{
				q=q.next;
			}
			tail.next = head.next;
			q.next = head;
			head.next = null;
			i = head;
			head = tail;
			tail = i;
		}
		public void addNode(int index, E x)
		{
			Node q= head;
			Node r= head;
			Node p = new Node(x);
			for(int i=1;i<=index;i++)
			{
				r=q;
				q=q.next;
			}
			p.next=q;
			r.next=p;
			size++;
		}
		public void dao()
		{
			tail = head;
			Node head1 = null;
			while(head != null)
			{
				Node q = head;
				head = head.next;
				q.next = head1;
				head1 = q;
			}
			head = head1;
		}
		// xoa not dau
		public void removefist()
		{
			head=head.next;
			return;
		}
		// xoa not cuoi
		public void removelast()
		{
			Node q= head;
			while(q.next!=tail)
				q=q.next;
			q.next=null;
		}
		// xoa node thu k
		public void removeIndex(int index)
		{	
			if(size==0)
				removefist();
			else if(index == size -1)
				removelast();
			else {
			Node q= head ;
			for(int i=0;i<index-1;i++)
				q=q.next;
			q.next=q.next.next;}
		}
		// xoa cac node am info
		public void Deleteam()
		{
			if((int)head.info<0)
				head=head.next;
			else {
			Node q = head, r=head.next;
			while(r!=null)
			{
				if((int)r.info<0)
				{
					r=r.next;
					q.next=r;
				}
				else
				{
					r=r.next;
					q=q.next;
				}
			}
			}
		}
		public boolean contains(E x)
		{
			Node q = head; 
			while(q!=null)
			{
				if((E)q.info==x)
					return true;
				q=q.next;
			}
			return false;
		}
		public int indexof(E x)
		{
			Node q = head; 
			while(q!=null)
			{
				if((E)q.info==x)
				//	return (E)q.info;
				q=q.next;
			}
			return -1;
		}
		public void fun(Node start)
		{
			if(start == null)
				return;
			
			System.out.println("chay: "+start.info+" ");
			if(start.next != null)
				fun(start.next.next);
			System.out.println("chay1:"+start.info+" ");
		}
		public void fun()
		{
			fun(head);
		}
		public void inverlall()
		{
			if(size > 2)
			{
				tail = head;
				Node head1 = null;
				while(head != null)
				{
					Node q = head; 
					head = head.next;
					q.next = head1;
					head1 = q;
				}
				head = head1;
			}
			else {
				tail = head;
				head =tail.next;
				tail.next = null;
				head.next = tail;
			}
		}
	public void swap2node()
	{
		if(size == 2)
		{
			tail = head;
			head = tail.next ;
			tail.next = null;
			head.next = tail;
		}
		else {
			Node r = head;
			while(r.next.next.next != null)
				r=r.next;
			Node q = r.next;
			r.next = q.next;
			q.next.next = q;
			q.next = null;
		
			
			
			
//		Node q = head;
//		head = q.next;
//		q.next = head .next ;
//		head.next = q;
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinKedList <Integer> list = new MyLinKedList<Integer>();
		list.addlast(1);
		list.addlast(2);
		list.addlast(3);
		list.addlast(4);
		list.addlast(5);
		list.addlast(6);
		System.out.println(         list          );
		list.swap2();
		System.out.println(         list          );
//		System.out.println("Tong danh sach lien kiet:"+list.tonggiatri());
//		System.out.println("So pt so le :"+list.demle());
//		list.tongsnt();
//		list.inNodelast();
//		list.addNode(2,100);
//		System.out.println(list );
//		list.fun();
	}

}
