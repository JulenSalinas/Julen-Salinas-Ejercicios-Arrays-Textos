
public class Ejercicio8 {

	public static void main(String[] args) {
		//Creamos la tabla cadenas y el contador
		String cadenas [] = {"Mike","Anna","John","Sue","Antonio","Ed","Anaís"};

		int contador = 0;

		//Recorremos la tabla cadenas y si hay algún nombre que empieze por 'A' o 'a' el contador incrementara en 1

		for (int i= 0; i<cadenas.length;i++) {

			if(cadenas[i].charAt(0)== 'a'|| cadenas[i].charAt(0)=='A') {
				contador++;
				//Mostramos los nombres que empiezan por 'A' o 'a'
				System.out.println(cadenas[i ] + " comienza por 'A' o 'a'");}

			}
		//Mostramos la cantidad de nombres que empiezan por 'A' o 'a'
		System.out.println("Empiezan por 'A' o 'a': " + contador) ;

	}

}