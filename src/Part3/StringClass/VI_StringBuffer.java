package Part3.StringClass;

public class VI_StringBuffer {

public static void main(String[] args) {
		
		//StringBuffer s="Java";//CTE//Type Mismatch Error
		
		//Creating StringBuffer //Same as StringBuilder Class
		//CONSTRUCTORS
		//1.StringBuffer()
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1);//  //StringBuffer Object created with No Characters and Initial Capacity "16"

		
		//2.StringBuffer(int capacity)
		StringBuffer sb2=new StringBuffer(100);
		System.out.println(sb2);//  //StringBuffer Object created with No Characters and with specified Initial Capacity "100"

		
		//3.StringBuffer(charSequence seq)
		StringBuffer sb3=new StringBuffer("Sequence");
		System.out.println(sb3);//Sequence//StringBuffer Object created with Specified Character sequence.
		
		//4.StringBuffer(String str)
		StringBuffer sb4=new StringBuffer("String");//String//StringBuffer Object created with Specified String.
		System.out.println(sb4);
		
		
		System.out.println(sb4.hashCode());//885284298//hashcode of sb4 StringBuilder Object

		
		//Methods in StringBuffer - //Same as StringBuilder Class
//1. capacity()-->Returns the current capacity. The capacity is the number of charactersthat can be stored (including already written characters)*/
		System.out.println("****capacity****");
		System.out.println(sb1.capacity());//16//Returns the current capacity. The capacity is the number of charactersthat can be stored (including already written characters) 
		System.out.println(sb2.capacity());//100//Here,in Constructor we passed Capacity as "100"
		System.out.println(sb3.capacity());//24//Returns Current capacity '8'+Initial capacity '16'
		
//2.length()-->Returns the length (character count)

		System.out.println("****length()****");
		System.out.println(sb1.length());//0
		System.out.println(sb2.length());//0//Capacity is "100", but still we didn't add any data. So, length is '0'
		System.out.println(sb3.length());//8//"Sequence" based on Character count it will calculate the Length
		System.out.println(sb4.length());//6//"String"contains 6 characters
		
//3.append()-->Overloaded Method-->Accepts Any Type of Data
  		 // -->It will Concat/join the "Passed data" with "Existing data"*/
		
		System.out.println("****append()****");
		System.out.println("*append(char ch)*");
		
//3a.append(char ch)-->Appends the string representation of the char argument to this sequence
		System.out.println(sb4.append('S'));//StringS//Add 'S' at the End of "String"
		//System.out.println(sb4.hashCode());//885284298//Changing the value inside same Object sb4

//3b.append(boolean b)-->
		System.out.println("*append(boolean b)*");
		StringBuilder sb5=new StringBuilder("append");
		System.out.println(sb5.append(true));//appendtrue
		
//3c.append()
		System.out.println("*append(Object o)*");
		System.out.println(sb3.append(sb5));//Sequenceappendtrue//Adding Two Objects sb5 in sb3
		System.out.println(sb2.append("append"));//append
		System.out.println(sb1.append("CharacterString"));//CharacterString
		System.out.println(sb3.append(10.5));//Sequenceappendtrue10.5
		System.out.println(sb1.append(12345678901l));//CharacterString12345678901
		//Append StringBuilder and StringBuffer//
	
		System.out.println(sb1.append("Priya", 2, 4));//CharacterString12345678901nu//"Banu" "from Index 2" "Till endindex+1"
		
//4.charAt(int index)-->Returns the char value in this sequence at the specified index.
		StringBuilder sb6=new StringBuilder("SaiDharshan");
		System.out.println(sb6.charAt(4));//u
		
//5.insert()-->Overloaded Method--->Inserts the string representation of the argument into this sequence. 
		
		System.out.println("****insert()****");
		System.out.println(sb6.insert(5, "Ranjith"));
		System.out.println(sb6.insert(11, true));
		System.out.println(sb6.insert(15, 'M'));
		System.out.println(sb6.insert(16,3.5));
		System.out.println(sb6.insert(19, "Priya"));
		System.out.println(sb6.insert(23, 9894125181l));
		
		
//6.delete()-->Removes the characters in a substring of this sequence. 
		
		System.out.println("****delete()****");
		System.out.println(sb6.delete(11, 15));
		System.out.println(sb6.deleteCharAt(11));

//7.reverse()-->Reverse the String Literal
		System.out.println("****reverse()****");
		System.out.println(sb6.reverse());
		System.out.println(sb6.reverse());


//8.replace()-->Replace the Specified String From Start Index to End Index-1
		System.out.println("****replace()****");
		System.out.println(sb6.replace(11, 14, "***"));

//9.setLength()-->Only Specified Length in the String will exist, remaining gets Removed
		System.out.println("****setLength()****");
		//System.out.println(sb6.length());
		sb6.setLength(18);
		System.out.println(sb6);

//10.trimToSize()-->Removes the unused capacity /Set the capacity till length of the String
		System.out.println("****trimToSize()****");
		System.out.println(sb6.append("  "));
		sb6.trimToSize(); 

//11.(i).substring(int index)-->Returns the Substring from Specified Index
		System.out.println("***substring()***");
		System.out.println(sb6.substring(5));
	
//  (ii).substring(int startIndex,int endIndex)-->Returns the Substring from Specified StartIndex to EndIndex
		System.out.println(sb6.substring(5, 11));
		
//12.setCharAt(int index,char newChar)-->Replace the New Character in a String of Specified index
		System.out.println("****setCharAt()****");
		
		sb6.setCharAt(4, 'a');
		System.out.println(sb6);
		
		
//13.ensureCapacity(int capacity)-->Sets the Capacity of Storing the String
		sb6.ensureCapacity(100);
	
	}

}
