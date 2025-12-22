package core_java_object_oriented;

public class Mutable_String {

	public static void main(String[] args) {			//same for both String Buffer(tread-safe ,Syncronize) and String Builder(tread-safe no)
		
		StringBuilder ss=new StringBuilder();
		ss.append("Ronaldo");							// it StringBulder  and StringBuffer initial 
															//although the intial default capacity of StringBuffe and Stringbuilder is  16... but we as a programmer can define (set) our own intial capactiy 
		System.out.println(ss.capacity());
		ss.append("is a greater football");
		System.out.println(ss.capacity());
		StringBuffer sb=new StringBuffer();
		sb.append("ronaldo");
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(31);					//ensurecapacity increase it capacity to 34 max( round of 31)
		System.out.println(sb.capacity());
		
		// -------------------------------trim to size
		StringBuffer sm=new StringBuffer();
		System.out.println(sm.capacity()); 
		sm.append("ronaldo");		//length of ronaldo  // 7
		sm.trimToSize();		
		System.out.println(sm.capacity());
;	}

}