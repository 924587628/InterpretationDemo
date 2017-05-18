package com.comment;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ��ȡֵ(ElementType)�У�

��������1.CONSTRUCTOR:��������������
��������2.FIELD:����������
��������3.LOCAL_VARIABLE:���������ֲ�����
��������4.METHOD:������������
��������5.PACKAGE:����������
��������6.PARAMETER:������������
��������7.TYPE:���������ࡢ�ӿ�(����ע������) ��enum����
 */
/**
 * ȡֵ��RetentionPoicy���У�

��������1.SOURCE:��Դ�ļ�����Ч����Դ�ļ�������
��������2.CLASS:��class�ļ�����Ч����class������
��������3.RUNTIME:������ʱ��Ч��������ʱ������
*/
/**
 * ��@Documented���������������͵�annotationӦ�ñ���Ϊ����ע�ĳ����Ա�Ĺ���API��
 * ��˿��Ա�����javadoc����Ĺ����ĵ�����Documented��һ�����ע�⣬û�г�Ա��
 */
/**
 * ��@Inherited��

����@Inherited Ԫע����һ�����ע�⣬@Inherited������ĳ������ע�������Ǳ��̳еġ����һ��ʹ����@Inherited���ε�annotation���ͱ�����һ��class�������annotation�������ڸ�class�����ࡣ

����ע�⣺@Inherited annotation�����Ǳ���ע����class���������̳С��ಢ��������ʵ�ֵĽӿڼ̳�annotation�������������������صķ����̳�annotation��

������@Inherited annotation���ͱ�ע��annotation��Retention��RetentionPolicy.RUNTIME������API��ǿ�����ּ̳��ԡ��������ʹ��java.lang.reflectȥ��ѯһ��@Inherited annotation���͵�annotationʱ����������齫չ�����������class���丸�࣬
	ֱ������ָ����annotation���ͱ����֣����ߵ�����̳нṹ�Ķ��㡣
 */

/**
 * ��ע������Ŀ�֧���������ͣ�

��������1.���л����������ͣ�int,float,boolean,byte,double,char,long,short)
��������2.String����
��������3.Class����
��������4.enum����
��������5.Annotation����
��������6.�����������͵�����

����Annotation��������Ĳ�������ô�趨:
������һ,ֻ����public��Ĭ��(default)����������Ȩ����.����,String value();����ѷ�����ΪdefaulĬ�����ͣ��� ��
�����ڶ�,������Աֻ���û�������byte,short,char,int,long,float,double,boolean���ֻ����������ͺ� String,Enum,Class,annotations����������,�Լ���һЩ���͵�����.����,String value();����Ĳ�����Ա��ΪString;����
��������,���ֻ��һ��������Ա,��ðѲ���������Ϊ"value",���С����.��:���������FruitNameע���ֻ��һ��������Ա�� 
 */
@Documented
@Target(ElementType.METHOD)//ע��ֻ�����ڷ�����
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Description {

	String desc() default "";
	int age() default 0;
}
