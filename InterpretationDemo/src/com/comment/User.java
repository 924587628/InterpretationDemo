package com.comment;

@Table("sunxy")
public class User {

	@Filed(name = "����User���name����")
	public String name;
	
	@Filed(age = 98)
	public int age ;
	
	@Description(desc="����User��dance����������",age = 12)
	public void dance()
	{
		System.err.println("user's dance method running");
	}
}
