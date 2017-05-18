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
		
		//����������û��ע�⣬
		boolean isCExist = clazz.isAnnotationPresent(Table.class);
		if (isCExist) {
			//������
			Table table = (Table) clazz.getAnnotation(Table.class);
			//��ȡע������
			System.err.println(table.value());
		}
		
		//��ȡ�����ϵ�ע��
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
		
		//��ȡ�����ϵ�ע��
		Field[] fields = clazz.getFields();
		for (Field field : fields) {
			//�ж��Ƿ����ע��
			boolean isFExist = field.isAnnotationPresent(Filed.class);
			if (isFExist) {
				//����
				Filed f = field.getAnnotation(Filed.class);
				System.err.println(f.name());
				System.err.println(f.age());
			}
		}
	}

}
