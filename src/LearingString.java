
public class LearingString {

	public static void main(String[] args) {
		String str = "My name is tom.";// initialization and defining string
		String s = new String("I am in Micigan");// Declaration of string using new operator

		System.out.println(str);
		System.out.println(s);
		
		//String Methods
		
		System.out.println("Length of String 1 :"+ str.length());
		System.out.println("Length of String 2  :"+ s.length());
		System.out.println("character at 5th index  :" + str.charAt(5));
		
		System.out.println("substring after 5th index :"  + str.substring(5));
		System.out.println("substring from 5th(i) to 5-1(j-1)  index :" +str.substring(2, 5));
		
		System.out.println("combined 2 strings : "+ str.concat(s));
		
		System.out.println("comapring two strings(this returns s1 - s2) :"+str.compareTo(s));
		
		System.out.println("print string in lowercase:" + str.toLowerCase());
		
		System.out.println("remove white spaces from begining and end :"+str.trim());
		
		System.out.println("repacing t by j:"+str.replace('t', 'j'));
		
		System.out.println("replacing tom to jhon:"+str.replace("tom","jhon"));
		
		
	}

}
