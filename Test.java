class A
{
   int a;
   int b;
   
   A(int c,int d)
   {
     a=c;
	 b=d;
   }
}
       int m1()
	   {
	     return a;
	   }
	   int m2()
	   {
	     return b;
	   }
	 class Test
	  {
	    public static void main(String [] args)
		 {
		   A r = new A(45,18);
		   System.out.println(r.m1());
		   System.out.println(r.m2());
		 }
	  }
		   