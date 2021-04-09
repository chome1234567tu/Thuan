
public class Student {

	public void display(String SV[], int n)
	{
		for(int i = 0 ; i<n ; i++)
		{
			if(i == n-1)
				System.out.print(SV[i]);
			else 
				System.out.print(SV[i]+", ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []SV = {"4482", "LEVANTHUAN", "01", "16/02/2001", "QuangTri", "113"};
		Student s = new Student();
		int n = SV.length;
		s.display(SV,n);
	}

}
