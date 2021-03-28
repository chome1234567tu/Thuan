	package recursion01;
	
	public class Recursion {
		// danh thua 1 so
		public static long factorial(int n)
		{
			if(n == 0)
				return 1;
			return n * factorial(n-1);
		}
		// uc hai so 
		public static int UCLN(int a, int b)
		{
			if(a == b)
				return a;
			if(a > b)
				return UCLN(a-b,b);
			return UCLN(a, b-a);				
		}
		// chia lay thuong
		public static int Thuong(int a, int b)
		{
			if(  a<b )
				return 0;
			return 1+Thuong(a-b, b);
		}
		// chia lay du
		public static int du(int a, int b)
		{
			if(a<b)
				return a;
			return du(a-b,b);
		}
		// hai mu n 
		public static long HaimuN(int n)
		{
			if(n==0)
				return 1;
			return HaimuN(n-1) +  HaimuN(n-1);
		}
		// tim so fibonacci thu n 
		public static int Fibonacci(int n)
		{
		    if (n == 1 || n == 2)
		        return 1;
		    return Fibonacci(n - 1) + Fibonacci(n - 2);
		}
		// nhi phan cua mot so 
		static void divide(int n,int k) {
			if(n>0)
			{
				divide(n/k,k);
				if(n%k>=10)
					System.out.print((char)(n%k+55)+" ");
				else
					System.out.print(n %k+" ");
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(factorial(5));
//		System.out.println(UCLN(4, 2));
//		System.out.println(Thuong(15,5));
//		System.out.println(du(3,7));
//		System.out.println(HaimuN(5));
//		System.out.println(Fibonacci(5));
		divide(8,2);
	}

}
