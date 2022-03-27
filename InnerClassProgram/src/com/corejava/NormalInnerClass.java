
package com.corejava;

class OuterClass//outer class
{
	int i=10;
	private class InnerClass//inner class
	{
		int inner_variable;
		public InnerClass() {
			inner_variable=100;
		}
		public void innerMethod()
		{
			System.out.println("inner class method variable "+inner_variable);
			System.out.println("outer class method variable "+i);
		}
	}//inner class ending
	void outerMethod()//inner class method
	{
		InnerClass icob=new InnerClass();
		icob.innerMethod();
	}
}//ending of outer class

public class NormalInnerClass {

	public static void main(String[] args)
	{
		OuterClass ocob=new OuterClass();//object creation for outer class method
		ocob.outerMethod();

	}

}
