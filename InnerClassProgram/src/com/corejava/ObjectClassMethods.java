package com.corejava;

class MyClass1 extends Thread
{
	int total;
	public void run()
	{
		System.out.println("inside run method");
		synchronized (this){
		for(int i=1;i<=10;i++)
		{
			total=total+i;
		}
		notify();
	}}
}

public class ObjectClassMethods 
{

	public static void main(String[] args) throws InterruptedException
	{
		 MyClass1 ob= new  MyClass1();
		 ob.start();
		synchronized(ob)
		{
			try
			{
				System.out.println("before wait method");
				ob.wait();
				System.out.println("after wait method");
				System.out.println("total="+ob.total);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}}}}
