public class Ejercicio10funcion {

    // Función auxiliar para verificar si hay cadenas repetidas
    static boolean hayCadenasRepetidas(String[] cadenas) {
        for (int i = 0; i < cadenas.length - 1; i++) {
            for (int j = i + 1; j < cadenas.length; j++) {
                // Verificar si las dos cadenas son iguales
                if (cadenas[i].equals(cadenas[j])) {
                    return true;
                }
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        // Creamos la tabla cadenas
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Ed", "Mike", "William", "Ed"};

        // Llamamos a la función auxiliar para verificar si hay cadenas repetidas
        boolean hayRepetidos = hayCadenasRepetidas(cadenas);

        // Mostramos el resultado en pantalla
        if (hayRepetidos) {
            System.out.println("Hay cadenas de texto repetidas");
        } else {
            System.out.println("No hay cadenas de texto repetidas");
        }
    }
}