package depuracion;

import java.util.Scanner;

public class Ej4Depu {

	public static void main(String[] args) {
		int codigo;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Introduce un numero mayor que 0");
					codigo=sc.nextInt();
		}while(codigo<=0);
		System.out.println(codigo);
	}

}


