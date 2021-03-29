package Stack;

public class newStackArray <E> {
	private E a[];
	private int top,size;
	public newStackArray()
	{
		top = -1 ; 
		size = 0;
		a = (E []) new Object[10];
	}
	public boolean isEmpty()
	{
		return size == 0;
	}
	public E peek()
	{
		if(size == 0)
			return null;
		return a[top];
	}
	public E pop()
	{
		if(size == 0)
			return null;
		E tmp = a[top];
		a[top] = null;
		size --;
		return tmp;
	}
	public E push(E e)
	{
		if(size == a.length) {
			System.out.println("Stack is full");
			return null;
			}
		top ++;
		a[top] = e;
		size ++;
		return e;
	}
	public String toString()
	{
		String s = "";
		for(int i = 0 ; i<size ; i++)
		{
			s=s+a[i]+" ";
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newStackArray <Integer> arr = new newStackArray <Integer>();
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
//		arr.push(11);
		System.out.println(arr);
		arr.pop();
		arr.pop();
		arr.pop();
		System.out.println(arr);
		arr.push(6);
		arr.push(7);
//		System.out.println(arr);
	}

}
