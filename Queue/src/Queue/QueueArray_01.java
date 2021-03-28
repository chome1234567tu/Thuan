package Queue;

public class QueueArray_01<E> {
	private E a[];
	private int head, tail, size ;
	public QueueArray_01()
	{
		head = tail = size = 0;
		a = (E[]) new Object[10];
	}
	public boolean isEmpty()
	{
		return size == 0;
	}
	public E peek()
	{
		if(size == 0 )
			return null;
		return a[head];
	}
	public E pop()
	{
		if(size == 0)
			return null;
		E tmp = a[head] ; 
		a[head] = null;
		head ++; 
		head = head % a.length;
		size --;
		return tmp;
	}
	public E push(E e)
	{
		if(size == a.length) {
			System.out.println("QueueArray is full");
			return null;
		}
		a[tail] = e;
		tail ++ ;
		tail = tail % a.length;
		size ++;
		return e;
	}
	public String toString()
	{
		String s ="";
		int q = head;
		for(int i = 0 ; i< size ; i++)
		{
			s=s+a[q] + " ";
			q++;
			q=q%a.length;
		}
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray_01<Integer> arr = new 	QueueArray_01<Integer>();
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
		arr.push(11);
		System.out.println(arr);
		arr.pop();
		arr.pop();
		System.out.println(arr);
		arr.push(11);
		arr.push(11);
		System.out.println(arr);
		
		
		
		
		
	}

}
