package ch05.lecture.p04enum;

public class C01Enum {
	public static void main(String[] args) {
		Object o1 = new Object();
		MyEnum1 v1 = MyEnum1.CONSTANT_VALUE1;
		MyEnum1 v2 = MyEnum1.CONSTANT_VALUE2;
		
		Enum v3 = MyEnum1.CONSTANT_VALUE1;
		Object v4 = MyEnum1.CONSTANT_VALUE1;
		
		System.out.println(v1.name());
		System.out.println(v2.ordinal());
		System.out.println(v1.compareTo(v2));
		System.out.println(v2.compareTo(v1));		
		
		MyEnum1 v6 = MyEnum1.valueOf("CONSTANT_VALUE1");
		System.out.println(v1==v6);
		
		MyEnum1[] enums = MyEnum1.values();
		System.out.println(enums.length);
		System.out.println(enums[0].toString());
		System.out.println(enums[1].toString());
		System.out.println(enums[2].toString());
	}
}
