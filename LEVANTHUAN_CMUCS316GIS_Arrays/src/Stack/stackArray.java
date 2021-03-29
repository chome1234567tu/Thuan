package Stack;

public class stackArray <E> {
	private E []a;
	private int size,top;
	public stackArray()
	{
		size=0;
		top=-1;
		a=(E[]) new Object[10];
	}
	// stack rong 
	public boolean isEmpty()
	{
		return size==0;
	}
	public E peek()
	{
		if(size==0) {
			System.out.println("Stack is empty");
			return null;
		}
		return a[top];
	}
	public E pop()
	{
		if(size==0) {
			System.out.println("Stack is empty");
			return null;
		}
		E tmp = a[top];
		a[top]=null;
		size--;
		top--;
		return tmp;
	}
	public E push(E e)
	{
		if(a.length==size )
		{
			System.out.println("Stack is full");
			return null;
		}
		top++;
		a[top]=e;
		size++;
		return e;
	}
	public String toString()
	{
		String s="";
		for(int i=0;i<size;i++)
			s+=a[i]+" ";
		return s;
	}
	// kiem tra so doi xung
	public static void isSymetic (String str)
	{
		String tmp="";
		stackArray <Character> stack1 = new stackArray <Character>();
		for(int i=0;i<str.length();i++)
		{
			stack1.push(str.charAt(i)); // push tung ki tu str vao stack
		}
		while(!stack1.isEmpty()) // neu mang khong rong 
			tmp = tmp + stack1.pop(); // pop tung ki tu cua stack vao tmp 
		if(tmp.equals(str))
			System.out.println("is Symetic");
		else
			System.out.println("is not Symetic");
	}
	// kiem tra dau ((()) dun
	public static boolean isbalanced(String str)
	{
		stackArray <Character> stack2 = new stackArray <Character>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
				stack2.push(str.charAt(i));
			else {
				if(!stack2.isEmpty()) //neu  stack con phan tu 
					stack2.pop();
				else
					return false;
			}				
		}
		if(!stack2.isEmpty()) // neu stack con phan tu 
			return false;
		return true;
	}
	// chuyen he thap phan sang nhi phan
	public static String De2Bin(int x)
	{
		int du;
		stackArray <Integer> stack3 = new stackArray <Integer>();
		while(x>0)
		{
			du=x%2;
			x=x/2;
			stack3.push(du);
		}
		String s="";
		while(!stack3.isEmpty()) // stack ! rong 
		{
			s=s+stack3.pop();		
		}
		return s;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackArray <Integer> arr = new stackArray <Integer>();
		arr.push(5);
		arr.push(6);
		arr.push(2);
		arr.push(7);
		arr.push(1);
		arr.push(1);
		arr.push(1);
		arr.push(1);
		arr.push(1);
		arr.push(1);
		arr.push(1);
		System.out.println(arr);
		System.out.println(arr.pop());
		System.out.println(arr);
		System.out.println(arr.peek());
		
//		isSymetic("abcd");
//		System.out.println(	isbalanced("(((()"));
//		System.out.println(De2Bin(6));
		
		
		
	}

}
