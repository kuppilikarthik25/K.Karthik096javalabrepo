class A
{
  int i=10;
  int j=20;
  void m1()
  {
    System.out.println("hello");
  }
}
  class B extends A
  {
   void m2()
   {
      System.out.println("hello");
	}
  }
	class Overriding
	{
	  public static void main(String[] args)
	  {
	   A a = new B();
	   System.out.println(a.i);
	   System.out.println(a.j);
	   a.m1();
	  }
	}