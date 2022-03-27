package com.corejava;
//class creation
class OuterClasss
{
	//outer class method
	void outerclass_Method()
	{
		System.out.println("outer class method");
		class InnerClass
		{
			int i=10;
			void innerclass_Method()
			{
				System.out.println("inner class method");
				System.out.println("i value is"+i);
			}
			
		}
		//inner class object
		InnerClass icob=new InnerClass();
		icob.innerclass_Method();
	}
}

public class MethodLocalInnerClass {

	public static void main(String[] args)
	{
		OuterClasss ocob=new OuterClasss();
		ocob.outerclass_Method();

	}

}
