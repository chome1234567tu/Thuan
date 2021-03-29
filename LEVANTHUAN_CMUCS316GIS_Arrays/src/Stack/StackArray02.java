package Stack;

public class StackArray02 <E> {
	private int size, top;
	private E a[];
	public StackArray02()
	{
		size = 0; 
		 top = - 1 ;
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
		return a[top];
	}
	public E pop()
	{
		if(size == 0 )
			return null;
		E tmp = a[top];
		a[top] = null ; 
		top -- ; 
		size --; 
		return tmp;
	}
	public E  push(E e)
	{
		if(size == a.length)
		{
			System.out.println("Stack is full");
			return null;
		}
		top ++;
		a[top] = e;
		size ++ ;
		return e;
	}
	public String toString()
	{
		String s = "";
		for(int i = 0 ; i < size ; i ++ )
		{
			s=s+a[i] + " ";
		}
		return s;
	}
	public static void isSymmetric(String str)
	{
		StackArray02 <Character> arr01 = new StackArray02 <Character> ();
		String QQ="";
		for(int i = 0 ; i < str.length() ; i ++ )
		{
			arr01.push(str.charAt(i));
		}
		while(!arr01.isEmpty())
		{
			QQ=QQ+arr01.pop();
		}
		if(QQ.equals(str)) 
			System.out.println("is Symetric");
		else
			System.out.println("not is Sysmetric");	
	}
	public static  boolean isbalanced(String str)
	{
		StackArray02 <Character> arr02 = new StackArray02 <Character> ();
		for(int i = 0 ; i < str.length() ; i++)
		{
			if(str.charAt(i)== '(')
				arr02.push(str.charAt(i));
			else
			{
				if(!arr02.isEmpty())
					arr02.pop();
				else
					return false;
			}
		}
		if(!arr02.isEmpty())
			return false;
		return true;
	}
	public static String  chuyenhe10(int x,int heso)
	{
		StackArray02 <Integer> arr = new StackArray02 <Integer>();
		String s="a";
//		while(x>0)
//		{
//			arr.push(x%heso);
//			x=x/heso;	
//		}
//		while(!arr.isEmpty())
//		{
//			if(arr.peek()>=10 )
//				s+=(char)(arr.pop()+55);
//			else 
//				s+=arr.pop();
//		}
		System.out.println((s.charAt(0)-32));
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArray02 <Integer> arr = new StackArray02 <Integer>();
		arr.push(1);
		arr.push(2);
		arr.push(4);
		arr.push(7);
		arr.push(5);
	//	isSymmetric("acccca");
	//System.out.println(isbalanced("(()))"));
		System.out.println(chuyenhe10(77,16));	
	}

}
