public class Ejercicio11 {

	public static void main(String[] args) {

		//Creamos la tabla cadenas, y las variables max,posMax y una nueva tabla llamada cantidad
		String cadenas [] = {"Mike","Anna","John","Sue","Charlotte","Ed","William"};
		int cantidad [] = new int [cadenas.length];
		int max = 0;
		int posmax = 0;

	
		// Guardar el array cantidad vocales en array de cada nombre 
		for (int i = 0; i<cadenas.length;i++)

			for (int j = 0; j<cadenas[i].length();j++)

				if (cadenas [i].charAt(j)== 'a'|| cadenas [i].charAt(j)== 'e'||cadenas [i].charAt(j)== 'i'||cadenas [i].charAt(j)== 'o'||cadenas [i].charAt(j)== 'u'|| 

				    cadenas [i].charAt(j)== 'A'|| cadenas [i].charAt(j)== 'E'||cadenas [i].charAt(j)== 'I'||cadenas [i].charAt(j)== 'O'||cadenas [i].charAt(j)== 'U')

					cantidad[i]++;

	
		// Mostrar en pantalla la tabla cantidad
		for (int i = 0; i<cadenas.length;i++)

			 System.out.println(cadenas[i]+ ": "+ cantidad[i] + " vocales");

	
		// Busacar max y posmax en la tabla cantidad

	
		for (int i = 0; i<cadenas.length;i++)

			if (cantidad[i]>max) {

				posmax = i;

				max = cantidad[i];

			}
		//Mostramos en pantalla cúal es el nombre con más vocales y en que posición está
		System.out.println("El nombre con más vocales es : "+ cadenas[posmax] + " en la posición del array " + posmax);
	}

}