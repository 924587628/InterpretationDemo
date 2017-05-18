package com.comment;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	public static void test()
	{
		User t = new User();
		t.dance();
		
		//Class clazz = t.getClass();
		Class<? extends Object> clazz = t.getClass();//这个可以消除警告
		
		//看看类上有没有注解
		System.out.println("=======获取类上注解的内容=======");
		boolean isCExist = clazz.isAnnotationPresent(Table.class);
		if (isCExist) {
			//类上有
			Table table = (Table) clazz.getAnnotation(Table.class);
			//获取注解内容
			System.err.println("类上注解的内容 ： "+ table.value());
		}
		
		//获取方法上的注解
		System.out.println();
		System.out.println("=======获取方法上注解的内容=======");
		Method[] ms = clazz.getMethods();
		for (Method method : ms) {
			boolean isMExist = method.isAnnotationPresent(Description.class);
//			System.err.println("isExist  =  "+isMExist);
			if (isMExist) {
				Description d = method.getAnnotation(Description.class);
				System.err.println(d.desc());
				System.err.println(d.age());
			}
		}
		
		//获取属性上的注解
		System.out.println();
		System.out.println("=======获取属性上注解的内容=======");
		Field[] fields = clazz.getFields();
		for (Field field : fields) {
			//判断是否存在注解
			boolean isFExist = field.isAnnotationPresent(Filed.class);
			if (isFExist) {
				//存在
				Filed f = field.getAnnotation(Filed.class);
				String name = f.name();
				if (name != null && !"".equals(name)) {
					System.err.println(name);
				}
				int age = f.age();
				if (age != 0) {
					System.err.println(age);
				}
			}
		}
	}

}
