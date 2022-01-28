package pkg15jan;

public class Parent 
{
	public void ParentMethod()
	{
		
		System.out.println("Default Method of Parent Class");
		this.ParentMethod(1);
	}
	public void ParentMethod(int a)
	{
		
		System.out.println("One Parametrized Method of Parent Class");
		this.ParentMethod(1, 2);
	}
	public void ParentMethod(int a, int b)
	{
		
		System.out.println("Two Parametrized Method of Parent Class");
		this.ParentMethod(1, 2, 3, 4);
	}
	public void ParentMethod(int a, int b, int c)
	{
		System.out.println("Three Parametrized Method of Parent Class");
		this.ParentMethod();
		
		
	}
	public void ParentMethod(int a, int b, int c, int d)
	{
		System.out.println("Four Parametrized Method of Parent Class");
	}
}
