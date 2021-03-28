package Queue;

public class RadixSort {
	static int count ( int max)
	{
		int count = 0 ;
		while ( max !=0)
		{
			max= max /10;
			count ++ ;
		}
		return count;
	}
	static void sort(int []a)
	{
//		QueueList <Integer> Q = new QueueList<Integer>();
//		QueueList <Integer> QQ[];
//		QQ= new QueueList[10];
//		int max = a[0],k, vt, d = 1,x;
//		
//		// tao ra 9 QQ[]
//		for(int i = 0 ; i <=9 ; i++ )
//			QQ[i] = new QueueList();
//		
//		// push a[i] vao Queue
//		for(int i = 0 ; i<a.length ; i++)
//		{
//			if(max<a[i])
//				max = a[i];
//			Q.push(a[i]);
//		}
//		k = count(max);
//		
//		for(int i= 0 ; i<k ; i++)
//		{
//			while(!Q.isEmpty()) // Cho tung so trong mang a vao dung voi QQ[] 
//			{
//				x=Q.pop();
//				vt = (x/d)%10;
//				QQ[vt].push(x);
//			}
//			for(int j=0 ; j<=9 ; j++)  // lay ra tat ca cac so trong QQ[] dua vao Queue
//			{
//				while(!QQ[j].isEmpty())
//				{
//					x = QQ[j].pop();
//					Q.push(x);
//				}
//			}
//			d=d*10;
//		}
//		// lay cac so trong Queue dua vao a[] 
//		for(int i= 0 ; i<a.length ; i++ )
//			a[i] = Q.pop();
		QueueList <Integer > Q = new QueueList <Integer >();
		QueueList <Integer> []QQ;
		QQ = new QueueList[20];
		for(int i = 0 ; i <= 19  ; i ++)
		{
			
			QQ[i] = new QueueList();
		}
		int max = a[0];
		for(int i = 0 ; i < a.length ; i ++)
		{
			if(max<a[i])
				max=a[i];
			Q.push(a[i]);
		}
		int k = count(max),x,d=1,vt;
		for(int i = 0 ; i < k ; i++)
		{
			while(!Q.isEmpty())
			{
				x=Q.pop();
				if(x>0) 
				{
					vt=(x/d)%10;
					QQ[vt+10].push(x);
				}
				else
				{
					
					vt=(x*(-1)/d)%10;
					QQ[vt].push(x);
				}
			}
			
			for(int j = 9 ; j >=0 ; j --)
			{
				while(!QQ[j].isEmpty())
				{
					x=QQ[j].pop();
					Q.push(x);
				}
			}
			for(int j = 10 ; j <=19 ; j ++)
			{
				while(!QQ[j].isEmpty())
				{
					x=QQ[j].pop();
					Q.push(x);
				}
			}
			d=d*10;
		}
	//	System.out.println(Q);
		for(int i = 0 ; i < a.length ; i ++)
		{
			a[i]= Q.pop();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {
				2,12,213,45,68,94,367,9251,10,1002,-326,-985,65,-6,-852
		};		
		sort(a);
		for(int i = 0 ; i < a.length ; i ++)
			System.out.print(a[i] + " ");
		
	}

}
