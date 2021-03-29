package arr_of_circle;

public class TestArrayOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayOfCircle arr2 = new ArrayOfCircle();
		
		Circle c1= new Circle();
		c1.input();
		arr2.add(c1);
		
		Circle c2= new Circle();
		c2.input();
		arr2.add(c2);
		
		Circle c3= new Circle();
		c3.input();
		arr2.add(c3);
		
		Circle c4= new Circle();
		c4.input();
		arr2.add(c4);
		
		arr2.output();	
		
		System.out.println("Gia tri vi tri index : "+arr2.get(2));
		
//		Circle c5= new Circle();
//		c5.input();
//		arr2.set(1,c5);
//		arr2.output();
		
//		Circle c6 = new Circle();
//		c6.input();
//		arr2.add(1, r5);
//		arr2.output();
		
//		arr2.remove(2);
//		arr2.output();
		
//		Circle c7 = new Circle();
//		c7.input();
//		System.out.println(arr2.indexOf(c7));
		
//		Circle c8 = new Circle();
//		c8.input();
//		System.out.println(arr2.indexOf(c8));
		
		
		System.out.println(arr2.toString());
		
	}

}
