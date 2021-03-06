package array_list;

import java.util.ArrayList;

import array_of_integer.Arrayoflnteger;
import array_of_rectangle.ArrayOfRectangle;
import array_of_rectangle.Rectangle;

public class MyArrayList <E>
{
	// khai bao thuoc tinh class
			private E a[];
			private int n;
			private E tmp;
			// khoi tao ko doi so
			public             MyArrayList()
			{
				a= (E[])new Object [2];
				n=0;
			}
			// khoi tao 1 doi so 
			public            MyArrayList(int capacity)
			{
				a= (E[])new Object [capacity];
				n=0;
			}
			public void add( E element)
			{
				// xet th de chuyen thanh mang chua day 
				if(n==a.length)
				{
					// khai bao mang b
					E []b= (E[])new Object [a.length*2];          
					for(int i=0;i<n;i++)
					{
						b[i]=a[i];
					}
					// gan dia chi b qua  a 
					a=b;
				}
				//chen element vao cuoi 
				a[n]= element;
				n++;
			}
			//method in ra man hinh cac phan tu mang a gom n phan tu 
			public void output()
			{
				System.out.println();
				for(int i=0;i<n;i++)
				{
					System.out.print(a[i]+ " ");
				}
			}
			public E get(int index)
			{
				if(index<0 || index >=n)
				{
					System.out.println("Invalid index");
					return null;
				}
				else
					return a[index];
			}
			public void set(int index,E x)
			{
				if(index<0 || index >=n)
				{
					System.out.println("Invalid index");
				}
				else
					a[index]=x;		
			}
			//ham main 
			public void add(E x,int index)
			{       
				if(index<0 || index >=n)
				{
					System.out.println("Invalid index");
				}
				else
					if(n==a.length)
					{
					// khai bao mang b
						E[]b= (E[])new Object [a.length*2];          
						for(int i=0;i<n;i++)
						{
							b[i]=a[i];
						}
					// gan dia chi b qua  a 
						a=b;
					}
					else	
						for(int i=n;i>index;i--)
						{
							a[i]=a[i-1];
						}
				a[index]=x;
				n++;			
			}
			public void remove(int index)
			{
				if(index<0 || index >=n)
				{
					System.out.println("Invalid index");
				}
				else
				{
					for(int i=index;i<n-1;i++)
					{
						a[i]=a[i+1];
					}
					n--;
				}
			}
			public boolean contains(E x)
			{
				
				for(int i=0;i<n;i++)
				{
					if(a[i]!=x)
						return false;
				}
				return true;
			}
			// return vi tri cua x  
			public int indexOf(E x)
			{
				
				for(int i=0; i<a.length; i++)
				{
					if(a[i] == x)
					{
						return i;
					}
				}		
				return -1;
			}
			// return vi tri cua x  
			public int lastIndexOf(E x)
			{
				
				for(int i=a.length-1; i >= 0; i--)
				{
					if(a[i] == x)
					{
						return i;
					}
				}
				return -1;
			}
			public String toString ()
			{
				String s="";
				for(int i=0;i<n;i++)
				{
					s+=a[i]+ "  ";
					
				}
				return s;
			}
			public int size()
			{
				return n;
			}
			public int IsPrime(int x)
			{
				if(x<2)
					return 0;
				for(int i=2;i<x;i++)
					if(x%i==0)
						return 0;
				return 1;
			}
			public void swap(int  a, int  b)
			{
				int c=a;a=b;b=c;
			}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyArrayList<Rectangle> arrR = new MyArrayList<Rectangle>();
//		arrR.add(new Rectangle(1,2));
//		arrR.add(new Rectangle(11,22));
//		arrR.add(new Rectangle(9,8));
//		arrR.add(new Rectangle(5,2));
//		arrR.output();
		
		MyArrayList<Integer> arrI = new MyArrayList<Integer>();
		arrI.add(5);
		arrI.add(7);
		arrI.add(9);
		arrI.add(8);
		arrI.add(2);
//		arrI.add(1);
//		arrI.add(1);
//		arrI.add(9);
//		arrI.add(2);
//		arrI.add(4);
//		arrI.add(5);
//		arrI.add(3);
		arrI.output();
		// T??nh t???ng c??c ph???n t??? trong ?????i t?????ng ArrayList
//		long s=0;
//		for(int i=0;i<arrI.size();i++)
//		{
//			s=s+arrI.get(i);
//		}
//		System.out.println("Tong Arr: "+s);
//		
		
		System.out.println("===========================");
//		//T???o n s??? nguy??n ng???u nhi??n cho ?????i t?????ng ArrayList, v???i n nh???p t??? b??n ph??m.
//		System.out.println("Thay doi so ngau nhien trong ArrayList");
//		for(int i=0;i<arrI.size();i++)
//		{
//			int a= (int) (Math.random()*20+10);
//			arrI.set(i,a);
//		}
//		System.out.println(arrI);
		
		
//		// ?????m trong ?????i t?????ng ArrayList c?? bao nhi??u gi?? tr??? ch???n
//		System.out.println("===========================");
//		int count=0;
//		for(int i=0;i<arrI.size();i++)
//		{
//			if(arrI.get(i)%2==0)
//				count++;
//		}
//		System.out.println("Dem so luong so chan trong arr: "+count);
//		
//		
//		// In ra c??c gi?? tr??? chia h???t cho 2 ho???c 5 trong ?????i t?????ng ArrayList
//		System.out.println("===========================");
//		System.out.println("In ra cac gia tri chia het cho 2 or 5 cua Arrlist");
//		for(int i=0;i<arrI.size();i++)
//		{
//			if(arrI.get(i)%2==0 || arrI.get(i)%5==0)
//				System.out.print(arrI.get(i)+" ");
//		}
//		System.out.println();
//		System.out.println("===========================");
//		//T??nh trung b??nh c???ng c??c s??? nguy??n t??? trong ?????i t?????ng ArrayList
//		double average=0,dem=0;
//		for(int i=0;i<arrI.size();i++)
//		{
//			if(arrI.IsPrime(arrI.get(i))==1)
//				{
//					average+=arrI.get(i);
//					dem++;
//				}
//		}
//		System.out.println("Trung binh cong cac so nguyen to trong ArrayList: "+average/dem);
//		
//		
//		System.out.println("===========================");
//		//X??a c??c gi?? tr??? ??m trong ?????i t?????ng ArrayList
//		for(int i=0;i<arrI.size();)
//		{
//			if(arrI.get(i)<0)
//			{
//				arrI.remove(i);	
//			}
//			else
//				i++;
//		}
//		arrI.output();
		
//		System.out.println();
//		System.out.println("===========================");
//		//X??a c??c ph???n t??? tr??ng nhau (gi??? l???i duy nh???t 1 ph???n t???) trong ?????i t?????ng ArrayList
//		for(int i=0;i<arrI.size()-1;i++)
//			for(int j=arrI.size()-1;j>i;)
//			{
//				if(arrI.get(i)==arrI.get(j))
//					arrI.remove(i);
//				else
//					j--;
//				
//			}
//		arrI.output();
//		System.out.println();
//		System.out.println("===========================");
		//S???p x???p ?????i t?????ng ArrayList t??ng (gi???m) d???n
		
//		for(int i=0;i<arrI.size()-1;i++)
//			for(int j=arrI.size()-1;j>i;j--)
//			{
//				if(arrI.get(i)>arrI.get(j))
//				{
//					int temp= arrI.get(i);
//					arrI.set(i, arrI.get(j));
//					arrI.set(j, temp);
//				}
//			}
//		arrI.output();	
		//ch??n m???t ph???n t??? element v??o ?????i t?????ng ArrayList sao cho ?????i t?????ng
//		for(int i=0;i<arrI.size();i++)
//		{
//			if(arrI.get(i)>9)
//			{
//				arrI.add(9, i);
//				break;
//			}
//		}
//		arrI.output();
			// ????a c??c s??? ch???n v??? tr?????c v?? c??c s??? l??? v??? sau trong ?????i t?????ng ArrayList
//		for(int i=0;i<arrI.size()-1;i++)
//			for(int j=arrI.size()-1;j>i;j--)
//			{
//				if(arrI.get(i)%2!=0 &&arrI.get(j)%2==0)
//				{
//					int temp= arrI.get(i);
//					arrI.set(i, arrI.get(j));
//					arrI.set(j, temp);
//				}
//			}
//		arrI.output();
//		
//		// T??m t???ng l???n nh???t c???a 2 ph???n t??? li??n ti???p cu???i c??ng trong ?????i t?????ng ArrayList
//		long max= arrI.get(0)+arrI.get(1);
//		for(int i=1;i<arrI.size();i++)
//		{
//			if(max<arrI.get(i)+arrI.get(i+1))
//				max =arrI.get(i)+arrI.get(i+1);
//		}
//		System.out.println("Tong hai phan tu lien tiep lon nhat cua ArrayList: "+max);
		
	
		
			
			
		
		
	}

}
