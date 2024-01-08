public class Ejercicio10 {	
  public static void main(String[] args) {
	        // Creamos la tabla cadenas y la variable hayRepetidos
	        String[] cadenas = {"Sue", "Charlotte", "Anna", "Ed", "Mike", "William", "Ed"};
	        boolean hayRepetidos = false;

	        // Iteración a través de la tabla para comparar las cadenas
	        for (int i = 0; i < cadenas.length - 1 && !hayRepetidos; i++) {
	            for (int j = i + 1; j < cadenas.length && !hayRepetidos; j++) {
	                // Verificar si las dos cadenas son iguales
	                if (cadenas[i].equals(cadenas[j])) {
	                    hayRepetidos = true; // Si hay una repetida, actualiza la variable
	                }
	            }
	        }

	        // Verificar el resultado y mostrar en pantalla este mismo
	        if (hayRepetidos) {
	            System.out.println("Hay cadenas de texto repetidas");
	        } else {
	            System.out.println("No hay cadenas de texto repetidas");
	        }
	}
}