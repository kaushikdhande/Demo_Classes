package core_java_object_oriented;

public class Strings_topic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1="args";
		//String s2="args";															//raw string will always get cp(constant  pool)
		String s1="Arhs";
		String s2="arhs";
//		String s1=new String("args");									//	object store in ncp
		
//		String s2=new String("args");										//raw string will always get cp(constant  pool)
		
		if(s1 ==s2 ) {
			System.out.println("refernce equal");
		}															//reference check 
		else {
			System.out.println("refernce not equal");

		}
		if(s1.equals(s2) ) {
			System.out.println("value equal");				// value check
		}
		else if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Ignore");		//java is case Sensittive
		}
		else {
			System.out.println("value not equal");

		}

		
//		String t1="Md";
//		String t2="Arsh";
		String t1="Md_";
		String t2="Arsh";
		 String t3=t1.concat(t2);
		 String t4="Md_Arsh";
		 if(t3 ==t4 ) {
				System.out.println("refernce equal");
			}															//reference check 
			else {
				System.out.println("refernce not equal");

			}
			if(t3.equals(t4) ) {
				System.out.println("value equal");				// value check
			}
//			else if(s1.equalsIgnoreCase(s2)) {
//				System.out.println("Ignore");		//java is case Sensittive
//			}
			else {
				System.out.println("value not equal");

			}
//		System.out.println();   	                    	// concat will be of Object type
//		System.out.println(t1);
			
			//when we concat two string by using the concat method resultant method will get the meomory on non constant pool
			
			String f1=new String ("Deep");
					String f2 =s1.intern();
					String f3=s1.intern();
					if(f2 ==f3) {
						System.out.println("yes");
					}
					
					
					
					
					//compare to value //------------------------------------------------------ complex oject ko sort karta hai compareTo
					
					String m1="SACHIN";
					String m2="SAUD";
					int res =m1.compareTo(m2);		
					int re=m2.compareTo(m1);	
					if(res >0) {
						System.out.println("s1 greater ");
					}
					else if(res <0) {
						System.out.println("s2 greater ");     //  at U break 
					}
					else {
						System.out.println("s1 == s2 ");
					}
					System.out.println(re);//18
					System.out.println(res);    //-18 

					
					
					
					
					//------------------------------------------------------------------------------
					
														//unicode value
					char c='a';
					int b=c;
					System.out.println(b);  //97
					

	}

}
