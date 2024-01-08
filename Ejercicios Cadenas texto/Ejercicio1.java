public class Ejercicio1 {
    public static void main(String[] args) {
    	//Creación de tablas
        String cadenas[] = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};
        int longitudes[] = new int[cadenas.length];

        // Recorre la tabla cadenas y guarda las longitudes en el array de enteros
        for (int i = 0; i < cadenas.length; i++) {
            longitudes[i] = cadenas[i].length();
        }

        // Mostramos las longitudes de las cadenas
        for (int i = 0; i < longitudes.length; i++) {
            System.out.println("Longitud de " + cadenas[i] + ": " + longitudes[i] + "\n");
        }
    }
    
}