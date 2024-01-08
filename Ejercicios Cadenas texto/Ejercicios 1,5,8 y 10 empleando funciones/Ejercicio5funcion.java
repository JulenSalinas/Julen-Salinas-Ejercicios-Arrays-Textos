public class Ejercicio5funcion {

    // Función auxiliar para mostrar los nombres en mayúsculas
    static void mostrarNombresEnMayusculas(String[] cadenas) {
        // Recorremos la tabla cadenas
        for (int i = 0; i < cadenas.length; i++) {
            // Utilizamos toUpperCase para transformar el nombre a mayúsculas
            System.out.println(cadenas[i].toUpperCase());
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        // Creamos la tabla cadenas
        String cadenas[] = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};

        // Llamamos a la función auxiliar para mostrar los nombres en mayúsculas
        mostrarNombresEnMayusculas(cadenas);
    }
}