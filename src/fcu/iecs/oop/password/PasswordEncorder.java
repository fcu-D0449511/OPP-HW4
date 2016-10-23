package fcu.iecs.oop.password;
public class PasswordEncorder {
   
	public static String encode(String password){
	String str1=password;
	String str2 = str1.replace("a","4");
	String str3 = str2.replace("A","4");
	String str4 = str3.replace("e","3");
	String str5 = str4.replace("E","3");
	String str6 = str5.replace("i","1");
	String str7 = str6.replace("I","1");
	String str8 = str7.replace("o","0");
	String str9 = str8.replace("O","0");
	String str10 = str9.replace("t","7");
	String str11= str10.replace("T","7");
	return str11;
}
}

