package lab6_4482_LEVANTHUAN;

import java.util.Scanner;

public class phanso {
	private int tu,mau;
	Scanner kb =new Scanner(System.in);
	public void nhap()
	{
		System.out.print("nhap tu: ");
		tu=kb.nextInt();
		System.out.print("nhap mau: "); mau=kb.nextInt();
	}
	public void in()
	{
		System.out.print(tu+"/"+mau);
		System.out.println();
	}
	public int getTu() {
		  return tu;
		}

		public void setTu(int tu) {
		  this.tu = tu;
		}

		public int getMau() {
		  return mau;
		}

		public void setMau(int mau) {
		  this.mau = mau;
		}
	public int ucln()
	{
		int a = Math.abs(tu);
		int b= Math.abs(mau);
		while (a!=b)
		{
			if(a<b) b=b-a;
			else a=a-b;
		}
		return a;
	}
	public void pstg()
	{
		int i= ucln();
		this.tu= this.tu/i;
		this.mau=this.mau/i;
	}
	public phanso congps(phanso p)
	{
		phanso p1= new phanso();
		p1.tu=this.tu*p.mau+this.mau*p.tu;
		p1.mau=this.mau*p.mau;
		p1.pstg();
		return p1;
	}
	public phanso trups(phanso p)
	{
		phanso p1= new phanso();
		p1.tu=this.tu*p.mau-this.mau*p.tu;
		p1.mau=this.mau*p.mau;
		p1.pstg();
		return p1;
	}
	public phanso nhanps(phanso p)
	{
		phanso p1= new phanso();
		p1.tu=this.tu*p.tu;
		p1.mau=this.mau*p.mau;
		p1.pstg();
		return p1;
	}
	public phanso chiaps(phanso p)
	{
		phanso p1= new phanso();
		p1.tu=this.tu*p.mau;
		p1.mau=this.mau*p.tu;
		p1.pstg();
		return p1;
	}
class mangphanso
{
	phanso[]a;
	public void nhapmangps()
	{
		
		Scanner kb = new Scanner (System.in);
		System.out.println("nhap so luong phan so: ");int n=kb.nextInt();
		a=new phanso[n];
		for(int i=0;i<n;i++)
		{
			a[i]=new phanso();
			System.out.println("nhap ps thu "+i+1+":");
			a[i].nhap();
		}
	}
	public void inmangps()
	{
		for(int i=0;i<a.length;i++) 
		{
			a[i].in();
			}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phanso i = new phanso(); 
		phanso j =new phanso();
		i.nhap();i.in();
		j.nhap();j.in();
		System.out.print("cong ps: ");
		phanso p1 = i.congps(j);
		p1.in();
		System.out.print("tru ps: ");
		phanso p2 = i.trups(j);
		p2.in();
		System.out.print("chia ps: ");
		phanso p3 = i.chiaps(j);
		p3.in();
		System.out.print("nhan ps: ");
		phanso p4 = i.nhanps(j);
		p4.in();
		
		
	}

}
