package arr_of_Fraction;

public class TestArrayOfFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOfFraction arr1= new ArrayOfFraction();
		Fraction fr1 = new Fraction();
		fr1.input();
		arr1.add(fr1);
		
		Fraction fr2 = new Fraction();
		fr2.input();
		arr1.add(fr2);
		
		Fraction fr3 = new Fraction();
		fr3.input();
		arr1.add(fr3);
		
		arr1.output();
		
//		System.out.println("get ra gia tri index: "+arr1.get(0));

//		Fraction fr4 = new Fraction();
//		fr4.input();
//		arr1.set(2,fr4 );
//		arr1.output();
//		
//		
//		Fraction fr5 = new Fraction();
//		fr5.input();
//		arr1.add(1, fr5);
//		arr1.output();
		
//		arr1.remove(2);
//		arr1.output();
		
//		Fraction fr6 = new Fraction();
//		fr6.input();
//		System.out.println(arr1.indexOf(fr6));
		
//		Fraction fr7 = new Fraction();
//		fr7.input();
//		System.out.println(arr1.indexOf(r7));
		
		
		System.out.println(arr1.toString());
	}

}
