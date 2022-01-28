package pkg15jan;


public class Child extends Parent
{
	public void ChildMethod()
	{
		
		System.out.println("Default Method of Child Class");
		this.ChildMethod(1, 2, 3, 4);
	}
	public void ChildMethod(int a)
	{
		
		System.out.println("One Parametrized Method of Child Class");
	}
	public void ChildMethod(int a, int b)
	{
		
		System.out.println("Two Parametrized Method of Child Class");
		this.ChildMethod();
	}
	public void ChildMethod(int a, int b, int c)
	{
		super.ParentMethod(1, 2, 3);
		System.out.println("Three Parametrized Nethod of Child Class");
		this.ChildMethod(1, 2);
	}
	public void ChildMethod(int a, int b, int c, int d)
	{
		System.out.println("Four Parametrized Nethod of Child Class");
		this.ChildMethod(1);
	}
	public static void main(String[] args) 
	{
		Child obj=new Child();
		//obj.ParentMethod(1,2,3);
		obj.ChildMethod(1,2,3);
		//obj.ChildMethod(1, 2);
	}	
	

}
