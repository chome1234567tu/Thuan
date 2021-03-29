package arr_of_Fraction;



public class ArrayOfFraction {

	private Fraction a[];
	private int n;
	// khoi tao ko doi so
	public        ArrayOfFraction()
	{
		a=new Fraction [2];
		n=0;
	}
	//khoi tao co doi so 
	public         ArrayOfFraction(int capaty)
	{
		a=new Fraction [capaty];
		n=0;
	}
	public void add(Fraction element)
	{
		// Xet Truong hop de chuyen thanh mang chua day
		if(n==a.length)
		{
			// khai bao 1 mang Rectangle b
			Fraction b[]= new Fraction[a.length*2];
			for(int i=0;i<n;i++)
			{
				b[i]=a[i];
			}
			//gan dia chi b qua a
			a=b;
		}
		a[n]=element;
		n++;
	}
	public void output()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("Fraction thu "+(i));
			System.out.println(a[i]+" ");
		}
	}
	// get ra gia tri cua index
	public Fraction get(int index)
	{
		if(index<0 || index >=n)
		{
			System.out.println("Invalid index");
			return null;
		}
		return a[index];
	}
	// thay doi gia tri index = gia tri x -- > in ra 1 mang moi 
	public void set(int index,Fraction x)
	{
		if(index<0 || index >=n)
		{
			System.out.println("Invalid index");
		}
		else
			a[index]=x;
	}

	// chen them Rectangle index
	public void add(int index,Fraction x)
	{
		if(index<0 || index >=n)
		{
			System.out.println("Invalid index");
		}
		else
			if(n==a.length)
			{
				Fraction b[]= new  Fraction[a.length*2];
				for(int i=0;i<n;i++)
				{
					b[i]=a[i];
				}
				a=b;
			}
			else
				for(int i= n;i>index;i--)
				{
					a[i]=a[i-1];
				}
		a[index]=x;
		n++;
	} 
	// xoa di 1 Rectangle tai vi tri index
	public void remove(int index)
	{
		if(index<0 || index >=n)
		{
			System.out.println("Invalid index");
		}
		else
		{
			for(int i=index;i<n;i++)
			{
				a[i]=a[i+1];
			}
			n--;
		}		
	}
	// tim Rectangle co ton tai trong arr1 k
	public boolean contains(Fraction x)
	{
		
		for(int i=0;i<n;i++)
		{
			if(a[i]!=x)
				return false;
		}
		return true;
	}
	// im ra vi tri index cua x trong arr1
	public int indexOf(Fraction x)
	{
		for(int i=0;i<n;i++)
			if(x.gettu()==a[i].gettu() && x.getmau()==a[i].getmau())
				return i;
		return -1;
	}
	// im ra vi tri index cua x trong arr1 
	public int lastIndexOf(Fraction x)
	{
		for(int i=n-1;i>=0;i--)
			if(x.gettu()==a[i].gettu() && x.getmau()==a[i].getmau())
				return i;
		return -1;					
	}
	// copy arr1 cho s
	public String toString()
	{
		String s="";
		for(int i=0;i<n;i++)
		{
			s+=a[i]+"   ";
		}
		return s;
	}
	public int size()
	{
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayOfFraction arr1= new ArrayOfFraction();
		arr1.add(new Fraction(3,1));
		arr1.add(new Fraction(4,2));
		arr1.add(new Fraction(5,3));
		arr1.add(new Fraction(6,7));
		
		for(int i=0;i<arr1.size();i++)
		{
			System.out.println(arr1.a[i].divide());
		}
//		Fraction fr1 = new Fraction();
//		fr1.input();
//		arr1.add(fr1);
//		
//		Fraction fr2 = new Fraction();
//		fr2.input();
//		arr1.add(fr2);
//		
//		Fraction fr3 = new Fraction();
//		fr3.input();
//		arr1.add(fr3);
//		
//		arr1.output();
		
//		System.out.println("get ra gia tri index: "+arr1.get(0));

//		Fraction fr4 = new Fraction();
//		fr4.input();
//		arr1.set(2,fr4 );
//		arr1.output();
//		
//		
//		Fraction fr5 = new Fraction();
//		fr5.input();
//		arr1.add(1, fr5);
//		arr1.output();
		
//		arr1.remove(2);
//		arr1.output();
		
//		Fraction fr6 = new Fraction();
//		fr6.input();
//		System.out.println(arr1.indexOf(fr6));
		
//		Fraction fr7 = new Fraction();
//		fr7.input();
//		System.out.println(arr1.indexOf(r7));
		
		
//		System.out.println(arr1.toString());
		
	}

}
