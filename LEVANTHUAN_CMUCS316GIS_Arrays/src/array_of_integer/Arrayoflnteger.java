	package array_of_integer;
	
	//moi lop trong java deu mac dinh extend thua ke tu lop object
	//oject là cha moi lop 
	public class Arrayoflnteger {
		// khai bao thuoc tinh class
		private int a[];
		private int n;
		// khoi tao ko doi so
		public            Arrayoflnteger()
		{
			a = new int [10];
			n=0;
		}
		// khoi tao 1 doi so 
		public            Arrayoflnteger(int capacity)
		{
			a= new int [capacity];
			n=0;
		}
		public void add( int element)
		{
			// xet th de chuyen thanh mang chua day 
			if(n==a.length)
			{
				// khai bao mang b
				int []b= new int [a.length*2];          
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
		public Integer get(int index)
		{
			if(index<0 || index >=n)
			{
				System.out.println("Invalid index");
				return null;
			}
			else
				return a[index];
		}
		public void set(int index,int x)
		{
			if(index<0 || index >=n)
			{
				System.out.println("Invalid index");
			}
			else
				a[index]=x;		
		}
		//ham main 
		public void add(int x,int index)
		{       
			if(index<0 || index >=n)
			{
				System.out.println("Invalid index");
			}
			else
				if(n==a.length)
				{
				// khai bao mang b
					int []b= new int [a.length*2];          
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
				for(int i=index;i<n;i++)
				{
					a[i]=a[i+1];
				}
				n--;
			}
		}
		public boolean contains(int x)
		{
			
			for(int i=0;i<n;i++)
			{
				if(a[i]!=x)
					return false;
			}
			return true;
		}	
		// return vi tri cua x  
		public int indexOf(int x)
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
		public int lastIndexOf(int x)
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
		public void swap(int a[], int start, int end)
		{
			if(start >= end)
				return;
			int tmp = a[start];
			a[start] = a[end];
			a[end] = tmp;
			swap(a,start+1,end-1);
		}
		public void swap()
		{
			swap(a,0,n-1);
		}
		public static void main( String [] args )
		{
			// khai bao xin cap phat mot doi tuong mang arr n la so ptu co trong mang
			Arrayoflnteger arr = new Arrayoflnteger();
			arr.add(8);
			arr.add(1);
			arr.add(9);
			arr.add(2);
			arr.add(7);
			arr.add(6);
			arr.add(4);
			arr.output();
			arr.swap();
			arr.output();
		
//			System.out.println( );
//			System.out.println("Gia tri index:"+arr.get(6)+"\n");
//			
//			arr.set(2,10);
//			arr.output();
//						
////			arr.add(100, 2);
////			arr.output();
//			
//			arr.remove(2);
//			arr.output();
//			
//			arr.contains(2);
//			System.out.println(arr.toString()); //goi ro rang 
//			
//			System.out.println(arr);    //goi k tuong minh java bien dich tu goi ham tostring
			
			
			
		}
	}
