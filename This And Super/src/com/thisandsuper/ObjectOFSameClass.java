package com.thisandsuper;

public class ObjectOFSameClass {
	int a;
	
	
	
	
	ObjectOFSameClass(int a) {
		this.a = a;
		System.out.println(b.repeat(10)+" ");
		
	
	}

	public ObjectOFSameClass display(ObjectOFSameClass obj ) {
		return obj;
	}

	@Override
	public String toString() {
		return "ObjectOFSameClass [a=" + a + "]";
	}

	public static void main(String[] args) {
		ObjectOFSameClass obj = new ObjectOFSameClass(10);

		System.out.println(obj.display(obj).toString());
	}

}
