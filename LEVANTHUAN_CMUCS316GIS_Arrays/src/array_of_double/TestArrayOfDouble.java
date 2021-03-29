package array_of_double;

import array_of_integer.Arrayoflnteger;

public class TestArrayOfDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	
//		System.out.println( );
//		System.out.println("Gia tri index:"+arr.get(6)+"\n");
		
//		arr.set(2,10);
//		arr.output();
					
		arr.add(100, 2);
		arr.output();
		
//		arr.remove(2);
//		arr.output();
		
//		System.out.println(arr.lastIndexOf(9));
		
//		System.out.println(arr.toString()); //goi ro rang 
		
//		System.out.println(arr);    //goi k tuong minh java bien dich tu goi ham tostring

	}

}
