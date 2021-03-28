package recursion01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class Tree <E> {
	private class Node<E>{
		private Node right , left;
		private E info;
		private int level=1;
		public Node(E info)
		{
			//this.level = 1;
			this.info = info ; 
			this.left = this.right = null;
		}
		public Node (E info , Node l, Node r)
		{
			this.info = info;
			this.left = l;
			this.right = r;
		}
		
	}
	private Node noot = null;
	public Tree()
	{
		Node r8 = new Node(4);
		Node r4 = new Node(9,null,r8);
		Node r5 = new Node(2);
		Node r2 = new Node (7,r4,r5);
		Node r6 = new Node(5,new Node(3), null);
		Node r7 = new Node(6,null,new Node(19));
		Node r3 = new Node(1,r6,r7);
		noot = new Node(30,r2,r3);
	}
	 // duyet cac node theo trung tu
	private void inoder(Node r)
	{
		if(r != null )
		{   
			inoder(r.left);
			System.out.print(r.info+" ");
			inoder(r.right);	
		}
	}
	
	
	// duyet cac not theo tien tu
	private void inoder1(Node r)
	{
		if(r != null )
		{
			System.out.print(r.info+" ");
			inoder(r.left);
			inoder(r.right);	
		}
	}
	
	// duyet cac node theo hau tu
	private void inoder2(Node r)
	{
		if(r != null)
		{
			inoder2(r.left);
			inoder2(r.right);
			System.out.print(r.info+" ");
		}
	}
	// tin tong cac node trong treeee
	private int sum(Node r)
	{
		if(r != null)
		{
			return  (int)(r.info)+(int) (     sum(r.left) +   sum(r.right)      ) ;
		}
		else
			return 0;
	}
	// dem so cac node trong tree
	private int count(Node r)
	{
		if(r != null)
		{
			return 1+ (int)(count(r.left) + count(r.right));
		}
		return 0;
	}
	
	// dem la'  ko co con 
	private int count2(Node r)
	{
		if(r == null)
			return 0;
		if(r.left == null && r.right == null)
		{
			System.out.println(r.info);
			return 1;}
		return count2(r.left) + count2(r.right);
	}
	
	// dem la co 1 con 
	private int count3(Node r)
	{
		if(r == null)
			return 0;
		if((r.left == null && r.right != null )|| (r.left != null && r.right == null) ) {
			System.out.println(r.info+" ");
			return 1+ count3(r.left) + count3(r.right) ;}
		return count3(r.left) + count3(r.right);
	}
	// dem la co hai con
	private int count4(Node r)
	{
		if(r == null)
			return 0;
		if(r.left != null && r.right != null) {
			System.out.println(r.info+" ");
			return 1+count4(r.left) + count4(r.right);}
		return count4(r.left) + count4(r.right);
	}
	// chieu cao cua cay
	private int height(Node r)
	{
		if(r== null)
			return 0;
		return 1 + Math.max(height(r.left), height(r.right));
	}

	// duyet theo stack
	public void duyetStack()
	{
		Stack <Node> s = new Stack <Node> (); 
		s.push(noot);
		while(s.isEmpty() == false)
		{
			Node r = s.pop();
			System.out.print(r.info+" ");
			if(r.right != null) s.push(r.right);
			if(r.left != null) s.push(r.left);
		}
	}
	public int levelNode(int x)
	{
		Stack <Node> s = new Stack <Node> (); 
		noot.level = 1;
		s.push(noot);
		while(s.isEmpty() == false)
		{
			
			Node r = s.pop();
			//System.out.println("gia tri info la : "+r.info);
			if((int)r.info == x) {
				
				return r.level;
				}
			if(r.right != null) { s.push(r.right);
			r.right.level = r.level + 1 ;
			//System.out.println("level right: "+r.right.level );
			}
			if(r.left != null) {
				s.push(r.left);
				r.left.level = r.level + 1 ;
				//System.out.println("level left: "+	r.left.level);
			}
		}
		return -1;
	}
	public void duyetQueue()
	{
		Queue <Node> q = new LinkedList <Node>();
		q.add(noot);
		while(q.isEmpty() == false)
		{
			Node r = q.remove();
			System.out.print(r.info +" ");
			if(r.left != null) q.add(r.left);
			if(r.right != null) q.add(r.right);
		}
	}
	// tim x trong cay
	private boolean timx(Node r, int x)
	{
		if(r == null)
			return false;
		if( (int)r.info == x) 
			return true;
		return timx(r.left,x) || timx(r.right,x); // true || false == > true .
	}
	// kiem tra noot co gia tri max trong tree
	private boolean maxnoot(Node r)  // 
	{
		if(r == null)
			return true;
		if((int)(r.info) > (int)(noot.info)) // 14 > 12(noot) ==> false 
			return false;
		return maxnoot(r.left) && maxnoot(r.right);    // true && false == > false
	}
	public void timx()
	{
		System.out.println();
		Scanner kb = new Scanner(System.in);
		System.out.print("Info Node: ");
		int x = kb.nextInt();
		System.out.println("x absent in the tree? : " + timx(noot,x));
	}
	public void maxnoot()
	{
		System.out.println("Noot is max: " + maxnoot(noot));
	}
	public void height()
	{
		System.out.println("Chieu cao cua cay la: "+height(noot)
		);
	}
	public void count4()
	{
		System.out.println();
		System.out.println("dem la co hai con: "+count4(noot));
	}
	public void count3()
	{
		System.out.println();
		System.out.println("dem la co 1 con: "+count3(noot));
	}
	public void count2()
	{
		System.out.println();
		System.out.println("dem la khong co con: "+count2(noot));
	}
	public void count()
	{
		System.out.println(count(noot));
	}
	public void sum()
	{
		System.out.println(sum(noot));
	}
	public void inoder()
	{
		inoder(noot);
	}
	public void inoder1()
	{
		inoder1(noot);
	}
	public void inoder2()
	{
		inoder2(noot);
	}
	public static void main(String[] args) {
		// TODO  Auto-generated method stub
		Tree <Integer> t = new Tree <Integer>();
		t.duyetStack();
		t.timx();
	//	t.maxnoot();
		Scanner kb = new Scanner(System.in);
		System.out.print("Info Node: ");
		int x = kb.nextInt();
		
		System.out.println("Level of Node: "+t.levelNode(x));
		t.maxnoot();
	}

}
