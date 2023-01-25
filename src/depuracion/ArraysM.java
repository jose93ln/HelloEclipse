package depuracion;

import java.util.Random;
import java.util.Scanner;

// void no devuelve nada, pow por ejemplo tiene un dobule o int porque devuelve un int o dobule no se

import java.util.Random;
import java.util.Scanner;

public class ArraysM {
	private static Scanner k = new Scanner(System.in);
	public static void displayArray(int []v) {
		for (int elem : v) {
			System.out.print(elem + "\t");
		}
	}
	public static void displayArray(double []v) {
		for (double elem : v) {
			System.out.print(elem + "\t");
		}
	}
	public static void displayArray(String []v) {
		for (String elem : v) {
			System.out.print(elem + "\t");
		}
	}


	public static void fillArray(int []v) {
		System.out.println("Type " + v.length + " int's: ");
		for (int i = 0; i < v.length; i++) {
			v[i]=k.nextInt(); k.nextLine();
		}
	}
	public static void fillArray(double []v) {
		System.out.println("Type " + v.length + " double's: ");
		for (int i = 0; i < v.length; i++) {
			v[i]=k.nextDouble(); k.nextLine();
		}
	}
	public static void fillArray(String []v) {
		System.out.println("Type " + v.length + " String's: ");
		for (int i = 0; i < v.length; i++) {
			v[i]= k.nextLine();
		}
	}
	public static void fillArrayRandom(int []v) {
		Random r = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i]=r.nextInt(51); 
		}
	}
	public static void fillArrayRandom(double []v) {
		Random r = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i]=r.nextDouble(51); 
		}
	}
}