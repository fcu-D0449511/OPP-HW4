package fcu.iecs.oop.password;
import java.util.Scanner;
public class PasswordEncorder {

	public static void main(String[] args) {
		
      String str1;
		
      Scanner input = new Scanner(System.in);
		
		System.out.println("½Ð¿é¤J¤@¦r¦ê : ");
		str1 = input.nextLine();
		
		String str2 = str1.replace("a,A","4");
		String str3 = str2.replace("e","3");
		String str4 = str3.replace("i,I","1");
		String str5 = str4.replace("o","0");
		String str6 = str5.replace("t","7");
		
		System.out.println("-> " +str6);
		
		input.close();
	}
	
}
