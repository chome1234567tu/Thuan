package arr_of_Fraction;

import java.util.Scanner;

public class Fraction {

	private int tu;
	private int mau;
	public Fraction()
	{
		mau=tu=0;
	}
	
	public			Fraction(int tu, int mau) {
		this.tu=tu;
		this.mau=mau;
	}
	
	public  void input() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter tu:");
		tu = kb.nextInt();
		System.out.println("Enter mau:");
		mau = kb.nextInt();
	}
	public int gettu()
	{
		return tu;
	}
	public void settu(int TU)
	{
		tu=TU;
	}
	public int getmau()
	{
		return mau;
	}
	public void setmau(int MAU)
	{
		mau=MAU;
	}
	public void output() {
		System.out.println(this.tu+"/"+this.mau);
	}
	public String toString() {
		return "Phan Tu: "+tu + "   " +  "Phan Mau:" + mau;
	}
	// congps
	public Fraction plus(Fraction ps)
	{
		Fraction p=new Fraction();
		p.tu=ps.tu*this.mau+ps.mau*this.tu;
		p.mau=ps.mau*this.mau;
		return p;
	}
	//trups
	public Fraction minus(Fraction ps)
	{
		Fraction p=new Fraction();
		p.tu=ps.tu*this.mau- ps.mau*this.tu;
		p.mau=ps.mau*this.mau;
		return p;
	}
	//nhanps
	public Fraction multiply(Fraction ps)
	{
		Fraction p=new Fraction();
		p.tu=ps.tu*this.tu;
		p.mau=ps.mau*this.mau;
		return p;
	}
	//chiaps
	public Fraction divide(Fraction ps)
	{
		Fraction p=new Fraction();
		p.tu=ps.tu*ps.mau;
		p.mau=ps.mau*this.tu;
		return p;
	}
	public double divide()
	{
		return (double)this.tu/this.mau;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction fr= new Fraction();
		fr.input();
		fr.output();
		
		Fraction fr1=new Fraction();
		fr1.input();
		fr1.output();
		
		System.out.println("====Cong hai phan so=====");
		Fraction ps = new Fraction();
		ps=fr.plus(fr1);
		ps.output();
		
		System.out.println(ps.divide());
		
	}

}
