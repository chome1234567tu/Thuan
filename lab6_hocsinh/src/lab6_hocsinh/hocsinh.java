package lab6_hocsinh;

import java.util.Scanner;

public class hocsinh {
	hocsinh []a;
	private String ten;
	private double id,dkt1,dkt2,dkt,ngaysinh;
	public void nhap()
	{
		Scanner kb= new Scanner (System.in);
		System.out.print("Ten: ");ten=kb.nextLine();
		System.out.print("ID hoc sinh: ");id=kb.nextInt();
		System.out.print("Ngay sinh: ");ngaysinh=kb.nextInt();
		System.out.print("Diem kt: ");dkt=kb.nextInt();
		System.out.print("Diem kt1: ");dkt1=kb.nextInt();
		System.out.print("Diem kt2: ");dkt2=kb.nextInt();	
	}
	public void in()
	{
		System.out.println("ID:"+id+" Ten:"+ten+" Ngaysinh:"+ngaysinh+" DKT="+dkt+" DKT1="+dkt1+" DKT2="+dkt2);
	}
	public double average()
	{
		return (dkt1+dkt2+dkt)/3;	
	}
	public void nhapmanghs()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("nhap n: ");int n= kb.nextInt();
		a= new hocsinh[n];
		for(int i=0;i<n;i++)
		{
			a[i]=new hocsinh();
			a[i].nhap();
		}
	}
	public void inrankhs()      
	{
		int d=0;
		for(int i=0;i<a.length;i++)
		{
			a[i].in();
			if(a[i].average()>=8)
				{
					System.out.println("Rank good ");
					d++;
				}
			else if(a[i].average()>=7)
				System.out.println("Fairly good ");
			else if(a[i].average()>=5)
				System.out.println("Average ");
			else
				System.out.println("Fail");
		}
		System.out.println("So hoc sinh pass qua: "+d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hocsinh hs= new hocsinh();
		hs.nhapmanghs();
		hs.inrankhs();
	}

}
