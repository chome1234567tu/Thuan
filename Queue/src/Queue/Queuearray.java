package Queue;

public class Queuearray <E>{
	private int head,tail,size;
	private E a[];
	public Queuearray (){
		head = tail = size = 0;
		a = (E[]) new Object [10];
	}
	public boolean isEmpty()
	{
		return size == 0;
	}
	public E peek()
	{
		if(size == 0)
			return null;
		return a[head];
	}
	public E pop()
	{
		E tmp = a[head];
		a[head] = null;
		head ++;
		head = head % a.length;
		size --;
		return tmp;
	}
	public E push(E x)
	{
		a[tail] =x;
		tail ++ ;
		tail = tail % a.length;
		size ++;
		return x;	
	}
	public String toString()
	{
		String s="";
		int p = head;
		for(int i = 0 ; i< size ; i++)
		{
			s=s+a[p] + " ";
			p++;
			p = p %a.length;
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queuearray<Integer> arr = new Queuearray<Integer>();
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
		arr.pop();
		arr.pop();
		System.out.println(arr);
		arr.push(11);
		arr.push(11);
		arr.push(11);
		System.out.println(arr);
		
	}

}
