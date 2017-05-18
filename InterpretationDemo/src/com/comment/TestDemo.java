package com.comment;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

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
		
		Class clazz = t.getClass();
		
		//看看类上有没有注解，
		boolean isCExist = clazz.isAnnotationPresent(Table.class);
		if (isCExist) {
			//类上有
			Table table = (Table) clazz.getAnnotation(Table.class);
			//获取注解内容
			System.err.println(table.value());
		}
		
		//获取方法上的注解
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
		Field[] fields = clazz.getFields();
		for (Field field : fields) {
			//判断是否存在注解
			boolean isFExist = field.isAnnotationPresent(Filed.class);
			if (isFExist) {
				//存在
				Filed f = field.getAnnotation(Filed.class);
				System.err.println(f.name());
				System.err.println(f.age());
			}
		}
	}

}
