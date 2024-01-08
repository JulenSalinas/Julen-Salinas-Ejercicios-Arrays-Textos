  public class Ejercicio1funcion { 
   // Función auxiliar para obtener las longitudes de las cadenas
    static int[] obtenerLongitudes(String[] cadenas) {
        int[] longitudes = new int[cadenas.length];

        // Recorre la tabla cadenas y guarda las longitudes en el array de enteros
        for (int i = 0; i < cadenas.length; i++) {
            longitudes[i] = cadenas[i].length();
        }

        return longitudes;
    }

    public static void main(String[] args) {
        // Creamos la tabla cadenas
        String cadenas[] = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};

        // Llamamos a la función auxiliar para obtener las longitudes
        int[] longitudes = obtenerLongitudes(cadenas);

        // Mostramos las longitudes de las cadenas
        for (int i = 0; i < longitudes.length; i++) {
            System.out.println("Longitud de " + cadenas[i] + ": " + longitudes[i] + "\n");
        }
    }
}