package recursion01;

public class BST <E>{
	private class Node<E>{
		private Comparable <E> info;
		private Node left, right;
		public Node(Comparable <E> info)
		{
			this.info = info;
		}
		public Node(Comparable <E> info, Node left , Node right)
		{
			this.info = info;
			this.left=left;
			this.right= right;
		}
	}
	private Node noot = null;
	private Node add(Comparable <E> x, Node r)
	{
		if(r!= null)
		{
			if(x.compareTo((E) r.info) == 0)
			{
				System.out.println("r is exist");
				return r;
			}
			if(x.compareTo((E) r.info)< 0 )
			{
				r.left = add(x,r.left);
				return r;
			}
			r.right = add(x,r.right);
			return r;
		}
		r= new Node (x);
		return r;
	}

	private void display(Node r)
	{
		if(r != null )
		{   
		
			System.out.print(r.info+" ");
			display(r.left);
			display(r.right);	
		}
	}
	public void display()
	{
		display(noot);
	}
	private Node remove(Comparable <E> x , Node r)
	{
		if(r == null)
		{
			System.out.println("x is not exist");
			return r;
		}
		if(x.compareTo((E) r.info)< 0 )
		{
			r.left = remove(x,r.left);
			return r;
		}
		if(x.compareTo((E) r.info)> 0 )
		{
			r.right = remove(x,r.right);
			return r;
		}
		if(r.left == null && r.right == null)
		{
			r = null ; 
			return r;
		}
		if(r.left == null)
		{
			r=r.right;
			return r;
		}
		Node p = r.left;
		while(p.right != null)
			p = p .right;
		r.info = p.info;
		r.left = remove(p.info,r.left);
		return r;
	} 
	
	private boolean finx(Comparable <E> x, Node r)
	{
		if(r == null )
			return false;
		 if(x.compareTo((E)r.info) < 0)
			return finx(x,r.left);
		if(x.compareTo((E)r.info) >0)
			return finx(x,r.right);
		return true;
		
	}
	public void finx(Comparable <E> x)
	{
		System.out.println(finx(x,noot));
	}
	public void remove(Comparable <E> x )
	{
		noot = remove(x, noot);
	}
	public void add(Comparable <E> x)
	{
		noot = add(x, noot);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST <Integer> t = new 	BST <Integer>();
		t.add(3);
		t.add(15);
		t.add(4);
		t.add(8);
		t.add(10);
		t.add(9);
		t.add(20);
		t.add(45);
		t.display();
		System.out.println();
		t.remove(15);
		t.display();
		System.out.println();
		t.finx(45);
		// kiem tra cay BST --> co the kiemtra
	}

}
