package depuracion;

public class Ej5Depu {

	public static void main(String[] args) {
		int numeros[] = {1, 9, 23, 4, 55, 100, 1, 1, 23};
		int cont=0;
		for (int x = 0; x < numeros.length; x++) {

			for (int y = 0; y < numeros.length - 1; y++) {
				int elementoActual = numeros[y],
						elementoSiguiente = numeros[y + 1];
				cont++;
				if (elementoActual > elementoSiguiente) {

					numeros[y] = elementoSiguiente;
					numeros[y + 1] = elementoActual;
					
				}
			}
		}
		ArraysM.displayArray(numeros);
		System.out.println(cont);
	
	}
}








