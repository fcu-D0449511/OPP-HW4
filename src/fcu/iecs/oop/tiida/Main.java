package fcu.iecs.oop.tiida;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int x;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		x = input.nextInt();
		input.close();
		NissanTiida z = new NissanTiida();
		z.tiida(x);
		}
		
	}
