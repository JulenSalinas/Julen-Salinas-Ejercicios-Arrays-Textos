public class Ejercicio2 {
    public static void main(String[] args) {
    	//Creación de la tabla cadenas
        String cadenas[] = {"Sue", "Charlotte", "Azucena", "Mike", "Anteto", "Ed"};

        // Inicializamos la cadena de texto más pequeña y su índice
        String cadenaPrimera = cadenas[0];
        int posicion = 0;

        // Recorremos la tabla para encontrar la cadena más pequeña
        for (int i = 1; i < cadenas.length; i++) {
            // Comparamos la cadena actual con la más pequeña encontrada hasta ahora
            if (cadenas[i].compareTo(cadenaPrimera) < 0) {
            	cadenaPrimera = cadenas[i];
                posicion = i;
            }
        }

        // Mostramos la primera cadena alfabéticamente y su posición
        System.out.println("La cadena alfabéticamente primera es: " + cadenaPrimera);
        System.out.println("Está en la posición: " + posicion);
    }
}