package fr.m2i.capgemini.java.primitifs;

public class TypeEntier {

	public static void main(String[] args) {
		System.out.println("==========Type byte==========");
		
		byte unByte = -18;
		System.out.println(unByte);
		
		System.out.printf("minByte = %s\n", Byte.MIN_VALUE);
		System.out.printf("maxByte = %s\n", Byte.MAX_VALUE);

		System.out.println("==========Type short==========");
		
		short unShort = -18;
		System.out.println(unShort);
		
		System.out.printf("minShort = %s\n", Short.MIN_VALUE);
		System.out.printf("maxDhort = %s\n", Short.MAX_VALUE);

		System.out.println("==========Type int==========");
		
		int unEntier = -52;
		System.out.println(unEntier);
		
		System.out.printf("minInt = %s\n", Integer.MIN_VALUE);
		System.out.printf("maxInt = %s\n", Integer.MAX_VALUE);

		System.out.println("==========Type long==========");
		
		long unLong = 56;
		System.out.println(unLong);
		
		unLong = 214748364745L;
		System.out.println(unLong);
		
		System.out.printf("minLong = %s\n", Long.MIN_VALUE);
		System.out.printf("maxLong = %s\n", Long.MAX_VALUE);
		
	}

}
