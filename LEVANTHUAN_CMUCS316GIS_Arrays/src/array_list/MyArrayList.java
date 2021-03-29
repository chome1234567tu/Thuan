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
		// Tính tổng các phần tử trong đối tượng ArrayList
//		long s=0;
//		for(int i=0;i<arrI.size();i++)
//		{
//			s=s+arrI.get(i);
//		}
//		System.out.println("Tong Arr: "+s);
//		
		
		System.out.println("===========================");
//		//Tạo n số nguyên ngẫu nhiên cho đối tượng ArrayList, với n nhập từ bàn phím.
//		System.out.println("Thay doi so ngau nhien trong ArrayList");
//		for(int i=0;i<arrI.size();i++)
//		{
//			int a= (int) (Math.random()*20+10);
//			arrI.set(i,a);
//		}
//		System.out.println(arrI);
		
		
//		// Đếm trong đối tượng ArrayList có bao nhiêu giá trị chẵn
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
//		// In ra các giá trị chia hết cho 2 hoặc 5 trong đối tượng ArrayList
//		System.out.println("===========================");
//		System.out.println("In ra cac gia tri chia het cho 2 or 5 cua Arrlist");
//		for(int i=0;i<arrI.size();i++)
//		{
//			if(arrI.get(i)%2==0 || arrI.get(i)%5==0)
//				System.out.print(arrI.get(i)+" ");
//		}
//		System.out.println();
//		System.out.println("===========================");
//		//Tính trung bình cộng các số nguyên tố trong đối tượng ArrayList
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
//		//Xóa các giá trị âm trong đối tượng ArrayList
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
//		//Xóa các phần tử trùng nhau (giữ lại duy nhất 1 phần tử) trong đối tượng ArrayList
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
		//Sắp xếp đối tượng ArrayList tăng (giảm) dần
		
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
		//chèn một phần tử element vào đối tượng ArrayList sao cho đối tượng
//		for(int i=0;i<arrI.size();i++)
//		{
//			if(arrI.get(i)>9)
//			{
//				arrI.add(9, i);
//				break;
//			}
//		}
//		arrI.output();
			// Đưa các số chẳn về trước và các số lẽ về sau trong đối tượng ArrayList
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
//		// Tìm tổng lớn nhất của 2 phần tử liên tiếp cuối cùng trong đối tượng ArrayList
//		long max= arrI.get(0)+arrI.get(1);
//		for(int i=1;i<arrI.size();i++)
//		{
//			if(max<arrI.get(i)+arrI.get(i+1))
//				max =arrI.get(i)+arrI.get(i+1);
//		}
//		System.out.println("Tong hai phan tu lien tiep lon nhat cua ArrayList: "+max);
		
	
		
			
			
		
		
	}

}
