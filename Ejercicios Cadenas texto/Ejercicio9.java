public class Ejercicio9 {
  public static void main(String[] args) {
           //Creamos la tabla cadenas
	    	String[] cadenas = {"Ana", "Daniel", "Elena", "Christopher", "Eladio", "Elizabeth"};
           //Creamos y asignamos las siguientes variables:
	        int posicionMax = 0;
	        int longitudMax = cadenas[0].length();

           //Bucle para recorrer la tabla cadenas e iniciamos i a partir de 1 para que empiece a comparar desde esa posición con 0, sino compararía primero posicion 0 consigo misma
	        for (int i = 1; i < cadenas.length; i++) {
               //Trás asignar longitudMax, si encuentra algún texto con más longitud que el ya indicado, se intercambian los valores.
	            if (cadenas[i].length() > longitudMax) {
                   //posicionMax pasa de 0 a i y longitudMax se cambia a cadenas[i].length(); por eso, se vuelve al principio del bucle para comparar con los siguientes textos.
	                posicionMax = i;
	                longitudMax = cadenas[i].length();
	            }
	        }

           //Mostramos la posición de donde se encuentra el nombre más largo y mostramos también cúal es
	        System.out.println("La cadena con más caracteres está en la posición: " + posicionMax);
	        System.out.println("El nombre con más caracteres es: " + cadenas[posicionMax]);
	}
}
