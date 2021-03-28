package Queue;

public class QueueArray03 <E>{
	private int head, tail, size;
	private E a[];
	public QueueArray03()
	{
		head= tail = size = 0;
		a= (E[])new Object[10];
	}
	public boolean isEmpty()
	{
		return size ==0;
	}
	public E element()
	{
		if(size == 0)
			return null;
		return a[head];
	}
	public E remove()
	{
		E tmp = a[head];
		a[head]= null;
		head++;
		head = head % a.length;
		size --;
		return tmp;
	}
	public E add(E e)
	{
		if(size == a.length)
			return null;
		a[tail] = e;
		tail ++ ; 
		tail = tail% a.length;
		size ++;
		return e;
	}
	public String toString()
	{
		String s="";
		int q= head;
		for(int i = 0  ; i< size ; i++)
		{
			s=s+a[q]+" ";
			q++;
			q=q%a.length;
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray03 <Integer> arr = new QueueArray03 <Integer> ();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		arr.add(9);
		arr.add(10);
		System.out.println(arr);
		arr.remove();
		arr.remove();
		arr.remove();
		System.out.println(arr);
		
	}

}
