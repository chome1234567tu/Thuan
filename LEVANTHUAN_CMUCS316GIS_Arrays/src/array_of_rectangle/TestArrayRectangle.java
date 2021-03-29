package array_of_rectangle;

public class TestArrayRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOfRectangle arr2 = new ArrayOfRectangle();
		arr2.add(new Rectangle(1,2));
		arr2.add(new Rectangle(11,22));
		arr2.add(new Rectangle(9,8));
		arr2.add(new Rectangle(5,2));
		
		
		for(int i=0;i<arr2.size();i++)
		{
			System.out.println(arr2.get(i).area());
		}
	}
}
