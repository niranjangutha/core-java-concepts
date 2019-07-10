package StringConcepts;

public class StringDeclaration {
	public static void main(String[] args) {
	/*
	 * String is a sequence of characters
	 * String contains alphabets,numbers and special characters
	 * String variableName="value";	
	 */
		String name="niranjan";
		String a="122330";
		//********String concatination *******************
		// string concatination using + operator
		System.out.println(name+a);	//	niranjan122330
		//// string concatination using concat operator
		System.out.println(name.concat(a));//niranjan122330
		/*
		 * first evaluate the seleinum and 1 =selenium1
		 * after evaluate the selenium1+1=selenium11
		 */
		System.out.println("selenium"+1+1);//selenium11
		System.out.println(1+1+"selenium");//2selenium
		
		//********String comparision *******************
		/*
		 * 2-way comparison(true/false)
		 * 3-way comparision(0,>,<)
		 */
		

	}

}
