package com.comment;

@Table("sunxy")
public class User {

	@Filed(name = "这是User类的name属性")
	public String name;
	
	@Filed(age = 98)
	public int age ;
	
	@Description(desc="这是User的dance方法的描述",age = 12)
	public void dance()
	{
		System.err.println("user's dance method running");
	}
}
