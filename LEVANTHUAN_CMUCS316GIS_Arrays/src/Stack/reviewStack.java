package Stack;

public class reviewStack<E> {
	private E a[];
	private int size,top;
	public reviewStack()
	{
		a = (E[]) new Object[10];
		size = 0;
		top = -1;
	}
	public boolean isEmpty()
	{
		return size == 0;
	}
	public E peek()
	{
		if(size ==0)
			return null;
		return a[top];
	}
	public E pop()
	{
		if(size ==0)
			return null;
		E tmp = a[top];
		a[top] = null;
		size --;
		top--;
		return tmp;
	}
	public E push(E e)
	{
		if(a.length == size)
			return null;
		top++;
		a[top] = e;
		size++;
		return e;
	}
	public String toString()
	{
		String s = "";
		for(int i = 0 ; i < size ; i ++ )
			s=s+" "+a[i];
		return s;
	}
	static public void isSymetic(String str)
	{
		String s="";
		reviewStack<Character> stack = new reviewStack<Character>();
		for(int i = 0 ; i< str.length() ; i++)
			stack.push(str.charAt(i));
		while(stack.isEmpty() == false)
		{
			s= s+ stack.pop();
		}
		if(s.contentEquals(str))
			System.out.println("is Symetic");
		else
			System.out.println("not is Sysmetic");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		reviewStack<Integer> stack = new reviewStack<Integer>();
//		stack.push(2);
//		stack.push(4);
//		stack.push(3);
//		System.out.println(stack.isEmpty());
//		System.out.println(stack);
//		stack.pop();
//		System.out.println(stack);
//		System.out.println(stack.peek());
		isSymetic("12321");
	}

}
