package Part3.StringClass;

public class IV_MethodsOfStringClass 
{
	public static void main(String[] args) 
	{
	//toUpperCase():String --> Converts given String into UpperCase
		
	String U1="Priya";
	System.out.println(U1.toUpperCase());//--->1 //PRIYA
	
	U1=U1.toUpperCase();//----> 2 De-Refer (Refering Again) //String Object U1 refers to new UpperCase"PRIYA"
											//& "Priya" is Removed by Garbage Collector Since it's not referred by any Object Reference
	System.out.println(U1);//PRIYA
	
	String U2=U1.toUpperCase();//----> 3 //Storing in new String Object "s2"
	System.out.println(U2);//"PRIYA"
	
	
	//toLowerCase():String ---> Converts given String into LowerCase
	String L1="PrIYa";
	System.out.println(L1.toLowerCase());//--->1 //priya
	
	L1=L1.toLowerCase();//----> 2 deferred //String Object L1 refers to new LowerCase "priya" 
											//& "PrIYa" is Removed by Garbage Collector Since it's not referred by any Object Reference
	System.out.println(L1);//priya
	
	String L2=L1.toLowerCase();//----> 3 //Storing in new String Object "s2"
	System.out.println(L2);//priya
	
	
	//concat(String s): String ---> Joins 2 Strings
	
	String Conc1="Padma";
	String Conc2="Priya";
	System.out.println(Conc1.concat(Conc2));//PadmaPriya
	
	String Conc3=Conc1.concat(Conc2);
	System.out.println(Conc3);//PadmaPriya
	
	
	//trim() :String --->Removes Space Present Before & After the String
						//NOTE: Won't remove inbetween Space
	String Tr1="  Padma Priya  ";
	System.out.println(Tr1.trim());//Padma Priya
	
	
	//substring(int index): String --->Extracts Characters from String Object from Specified(Passed) Index to End
	String subs1="SUBSTRING";
	System.out.println(subs1.substring(3));//STRING
	
	
	//substring(int startindex,int endindex): String 
	//Extracts Characters from String Object from Specified(Passed) BeginIndex to Specified(Passed) EndIndex-1 
	//NOTE:throws IndexOutOfBoundException 1.if startIndex<zero 2.if startIndex > endIndex 3.if endIndex > length of String
	String subs2="SUBSTRING";//Length =9; StartIndex=0 ; EndIndex=8
	System.out.println(subs2.substring(0, 3));//SUB //If we want 3 letters(0,3)
	
	System.out.println(subs2.substring(0, 9));//SUBSTRING
	
	//System.out.println(subs2.substring(0, 10));//StringIndexOutOfBoundsException
												//Range [0, 10) out of bounds for length 9
	
	
	//charAt(int index) : char  ---> Returns Character of the Specified(Passed)Index from the String
	String char1="PRIYA";
	System.out.println(char1.charAt(2));//I
	//System.out.println(char1.charAt(8));//StringIndexOutOfBoundsException
										//Index 8 out of bounds for length 5
	

	//indexOf(char ch) : int  ---> Returns Index of the Specified(Passed) Character from the String else Returns -1
	String indexof1="PRIYA";
	System.out.println(indexof1.indexOf("I"));//2
	System.out.println(indexof1.indexOf("X"));//'X' not there Returns -1
	
	
	//indexOf(char ch,int Start_Index) : int 
	//Returns Index of the First Occurence of Specified(Passed) Character by Searching from Specified(Passed) Start_Index from the String 
	//else Returns -1
	String indexof2="PRIYA";
	System.out.println(indexof2.indexOf('A', 0));//4 //We can give as 'A' Char also
	System.out.println(indexof2.indexOf("A", 0));//4 //We can give as "A" String also
	
	String indexof3="PADMAPRIYA";
	System.out.println(indexof3.indexOf('A', 5));//9 //Returns First Occurence of 'A' from 5th StartIndex
	
	
	//indexOf(charSequence str) : int  --->Returns Index of the First Occurence of Specified(Passed) Substring of String else Return -1
	//i.e indexOf(String str) :int 
	String indexof4="SAIDHARSHAN";
	System.out.println(indexof4.indexOf("DHARSHAN"));//3
	System.out.println(indexof4.indexOf("IAS"));//-1 SubString "IAS" Not there in Given String
	
	//indexOf(charSequence str,int Start_Index) :int 
	//Returns Index of the First Occurence of Specified(Passed) SubString by Searching from Specified(Passed) Start_Index from the String 
	//else Returns -1
	//i.e indexOf(String str,int Start_Index) :int 
		String indexof5="SAIDHARSHANSAI";
		System.out.println(indexof5.indexOf("SAI",3));//11
		
		
	//lastIndexOf(char ch): int --->Returns the Index of the Last Occurrence of the Specified(Passed) character from String
		String lastindexof="SAIDHARSHAN";
		System.out.println(lastindexof.lastIndexOf('A'));//9
	
		
		//lastIndexOf(char ch,int Start_Index) : int 
		
		//lastIndexOf(charSequence str) : int  --->Returns Index of the First Occurence of Specified(Passed) Substring of String else Return -1
//i.e	//lastIndexOf(String str) :int 
		
		//lastIndexOf(charSequence str,int Start_Index) :int 
		//Returns Index of the First Occurence of Specified(Passed) SubString by Searching from Specified(Passed) Start_Index from the String 
		//else Returns -1
//i.e	//lastIndexOf(String str,int Start_Index) :int 
	
		
		
	//length() : int
		String len="Priya";
		System.out.println(len.length());//5 
		//refVar.length() --> Non-Static Method in String Class
	
		
	//equals(Object o) : boolean --->---> Compares 2 Strings Including Case, If Case also Same returns "true" else "false"
		String s1="SAI";
		String s2="SAI";
		System.out.println(s1.equals(s2));//true
		
		String s3="Dharshan";
		String s4="DHARSHAN";
		System.out.println(s3.equals(s4));//false //String is Case Sensitive
	
		
	//equalsIgnoreCase(String s): boolean ---> Compares 2 Strings Ignoring Case considerations, If Same returns "true" else "false"
		String str3="Dharshan";
		String str4="DHARSHAN";
		System.out.println(str3.equalsIgnoreCase(str4));//true //Ignoring Case
	
	
	//contains(String str): boolean --->Returns "true" if and only if Specified String Present in the String else "false" 
		String contains="SAIDHARSHAN";
		System.out.println(contains.contains("SAID"));//true
		System.out.println(contains.contains("Said"));//false
	
		
	//isEmpty() : boolean --->Returns "true" if length() is 0
		String emp="";
		System.out.println(emp.isEmpty());//true
		
		System.out.println(emp.isBlank());//true //Empty & Blank(White Spaces)
		
	//isBlank() : boolean --->Returns "true" if String is Empty or Blank (White Spaces)	
		String blank=" ";
		System.out.println(blank.isBlank());//true
		
		
	
	//toCharArray() :char[] --->Converts this String to a new Character Array.
		String charArray="SAI"; //'S''A''I'
		System.out.println(charArray.toCharArray());//SAI
	
	
	//split(String str): String[]
//i.e//split(String RegularExpression): String[]		
		String split="SAIDHARSHAN";
		String[] str=split.split("A");//Removes "A" & Splits the String
		System.out.println(str);//[Ljava.lang.String;@76ed5528 -Returns String Array Address
		
		//To Print
		for(int i=0;i<str.length;i++) 
		{
			System.out.println(str[i]); //Return Type -> String[]
										//S
										//IDH
										//RSH
										//N
		}
	
		
		
	//getBytes() : byte[] --->Converts the String into a sequence of bytes, storing the result into a new Byte array. 
		String getbyte="SAI";
		byte[] barray=getbyte.getBytes();
		System.out.println(barray);//[B@76ed5528 -Returns byte Array Address
		//To Print
				for(int i=0;i<barray.length;i++) 
				{
					System.out.println(barray[i]); //Return Type -> byte[]
					//Prints byte values(ASCII)	//S-83
												//A-65
												//I-73
												
				}
	
	}
}
