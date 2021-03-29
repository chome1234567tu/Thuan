package array_of_rectangle;

public class ArrayOfRectangle {
	private Rectangle a[];
	private int n;
	// khoi tao ko doi so
	public        ArrayOfRectangle()
	{
		a=new Rectangle [2];
		n=0;
	}
	//khoi tao co doi so 
	public         ArrayOfRectangle(int capaty)
	{
		a=new Rectangle [capaty];
		n=0;
	}
	public void add(Rectangle element)
	{
		// Xet Truong hop de chuyen thanh mang chua day
		if(n==a.length)
		{
			// khai bao 1 mang Rectangle b
			Rectangle b[]= new Rectangle[a.length*2];
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
			System.out.println("Arectangle thu "+(i));
			System.out.println(a[i]+" ");
		}
	}
	// get ra gia tri cua index
	public Rectangle get(int index)
	{
		if(index<0 || index >=n)
		{
			System.out.println("Invalid index");
			return null;
		}
		return a[index];
	}
	// thay doi gia tri index = gia tri x -- > in ra 1 mang moi 
	public void set(int index,Rectangle x)
	{
		if(index<0 || index >=n)
		{
			System.out.println("Invalid index");
		}
		else
			a[index]=x;
	}

	// chen them Rectangle index
	public void add(int index,Rectangle x)
	{
		if(index<0 || index >=n)
		{
			System.out.println("Invalid index");
		}
		else
			if(n==a.length)
			{
				Rectangle b[]= new  Rectangle[a.length*2];
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
	public boolean contains(Rectangle x)
	{
		
		for(int i=0;i<n;i++)
		{
			if(a[i]!=x)
				return false;
		}
		return true;
	}
	// im ra vi tri index cua x trong arr1
	public int indexOf(Rectangle x)
	{
		for(int i=0;i<n;i++)
			if(x.getlength()==a[i].getlength() && x.getwidth()==a[i].getwidth())
				return i;
		return -1;
	}
	// im ra vi tri index cua x trong arr1 
	public int lastIndexOf(Rectangle x)
	{
		for(int i=n-1;i>=0;i--)
			if(x.getlength()==a[i].getlength() && x.getwidth()==a[i].getwidth())
				return i;
		return -1;					
	}
	// copy arr1 cho s
	public String toString()
	{
		String s="";
		for(int i=0;i<n;i++)
		{
			s+=a[i].toString()+"   "; // a[i] 1 rectengle , goi tostring rectangle 
		}
		return s;
	}
	public int size()
	{
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Rectangle  rec1 = new Rectangle (6,7);//rec1 = @1
//		rec1.output();
//		System.out.println(    rec1   );
//		System.out.println(    rec1.area()   );
//		System.out.println(    rec1.perimeter()    );
//		
//		Rectangle  rec2 = new Rectangle (16,7);// rec2 = @2
//		rec2.output();
//		System.out.println(    rec2   );
//		System.out.println(    rec2.area()   );
//		System.out.println(    rec2.perimeter()    );
//		
//		Rectangle  rec3 = new Rectangle (8,10);// rec3=@3
//		rec1.output();
//		System.out.println(    rec3   );
//		System.out.println(    rec3.area()   );
//		System.out.println(    rec3.perimeter()    );
//		
//		Rectangle  rec4 = new Rectangle (56,77);//rec4=@4
//		rec1.output();
//		System.out.println(    rec4   );
//		System.out.println(    rec4.area()   );
//		System.out.println(    rec4.perimeter()    );
		
		ArrayOfRectangle arr2 = new ArrayOfRectangle();
		arr2.add(new Rectangle(1,2));
		arr2.add(new Rectangle(11,22));
		arr2.add(new Rectangle(9,8));
		arr2.add(new Rectangle(5,2));
//		
//		System.out.println(arr2.a[0].area());
//		System.out.println(arr2.a[1].area());
//		System.out.println(arr2.a[2].area());
		for(int i=0;i<arr2.n;i++)
		{
			System.out.println(arr2.a[i].area());
		}

		
		
//		ArrayOfRectangle arr1= new ArrayOfRectangle();
//		Rectangle r1 = new Rectangle();
//		r1.input();
//		arr1.add(r1);
//		
//		Rectangle r2 = new Rectangle();
//		r2.input();
//		arr1.add(r2);
//		
//		Rectangle r3 = new Rectangle();
//		r3.input();
//		arr1.add(r3);
//		
//		arr1.output();
//		
//		
//		System.out.println("get ra gia tri index: "+arr1.get(0));
//		

//		Rectangle r4 = new Rectangle();
//		r4.input();
//		arr1.set(2,r4 );
//		arr1.output();
		
		
//		Rectangle r5 = new Rectangle();
//		r5.input();
//		arr1.add(1, r5);
//		arr1.output();
		
//		arr1.remove(2);
//		arr1.output();
		
//		Rectangle r6 = new Rectangle();
//		r6.input();
//		System.out.println(arr1.indexOf(r6));
		
//		Rectangle r7 = new Rectangle();
//		r7.input();
//		System.out.println(arr1.indexOf(r7));
		
		
	
		
		
	}

}
