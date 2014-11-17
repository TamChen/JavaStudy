package com.csust.annotation;

public class MyTargetTest
{
	@MyTarget("hello")
	public void doSomething()
	{
		System.out.println("hello world");
	}
}
