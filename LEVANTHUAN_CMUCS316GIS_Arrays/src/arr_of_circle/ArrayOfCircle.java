package arr_of_circle;

import array_of_rectangle.Rectangle;

public class ArrayOfCircle {
	private Circle a[];
	private int n;
	// khoi tao ko doi so
	public        ArrayOfCircle ()
	{
		a=new Circle [2];
		n=0;
	}
	//khoi tao co doi so 
	public         ArrayOfCircle (int capaty)
	{
		a=new Circle [capaty];
		n=0;
	}
	public void add(Circle element)
	{
		// Xet Truong hop de chuyen thanh mang chua day
		if(n==a.length)
		{
			// khai bao 1 mang Rectangle b
			Circle b[]= new Circle[a.length*2];
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
			System.out.println("Circle thu "+(i));
			System.out.println(a[i]+" ");
		}
	}
	// get ra gia tri cua index
	public Circle get(int index)
	{
		if(index<0 || index >=n)
		{
			System.out.println("Invalid index");
			return null;
		}
		return a[index];
	}
	// thay doi gia tri index = gia tri x -- > in ra 1 mang moi 
	public void set(int index,Circle x)
	{
		if(index<0 || index >=n)
		{
			System.out.println("Invalid index");
		}
		else
			a[index]=x;
	}

	// chen them Rectangle index
	public void add(int index,Circle x)
	{
		if(index<0 || index >=n)
		{
			System.out.println("Invalid index");
		}
		else
			if(n==a.length)
			{
				Circle b[]= new  Circle[a.length*2];
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
	public boolean contains(Circle x)
	{
		
		for(int i=0;i<n;i++)
		{
			if(a[i]!=x)
				return false;
		}
		return true;
	}
	// im ra vi tri index cua x trong arr1
	public int indexOf(Circle x)
	{
		for(int i=0;i<n;i++)
			if(x.getradius()==a[i].getradius() )
				return i;
		return -1;
	}
	// im ra vi tri index cua x trong arr1 
	public int lastIndexOf(Circle x)
	{
		for(int i=n-1;i>=0;i--)
			if(x.getradius()==a[i].getradius() )
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOfCircle arr2 = new ArrayOfCircle();
		
		Circle c1= new Circle();
		c1.input();
		arr2.add(c1);
		
		Circle c2= new Circle();
		c2.input();
		arr2.add(c2);
		
		Circle c3= new Circle();
		c3.input();
		arr2.add(c3);
		
		Circle c4= new Circle();
		c4.input();
		arr2.add(c4);
		
		arr2.output();	
		
		System.out.println("Gia tri vi tri index : "+arr2.get(2));
		
//		Circle c5= new Circle();
//		c5.input();
//		arr2.set(1,c5);
//		arr2.output();
		
//		Circle c6 = new Circle();
//		c6.input();
//		arr2.add(1, r5);
//		arr2.output();
		
//		arr2.remove(2);
//		arr2.output();
		
//		Circle c7 = new Circle();
//		c7.input();
//		System.out.println(arr2.indexOf(c7));
		
//		Circle c8 = new Circle();
//		c8.input();
//		System.out.println(arr2.indexOf(c8));
		
		
		System.out.println(arr2.toString());
		
	}

}
