package core_java_object_oriented;

import java.util.StringTokenizer;

public class String_Tokenizer_1{

	public static void main(String[] args) {
		String s ="Department of Computer Technology";
		StringTokenizer st=new StringTokenizer(s," ");
		int count =0;
		while(st.hasMoreTokens() ==true) {
			System.out.println(st.nextToken());
			count++;
		}
		System.out.println(count);
		
	}

}
