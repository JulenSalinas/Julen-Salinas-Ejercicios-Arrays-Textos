public class Ejercicio8funcion {
 // Función auxiliar para contar y mostrar nombres que empiezan por 'A' o 'a'
    static void contarYMostrarNombresQueEmpiezanConA(String[] cadenas) {
        int contadorA = 0;

        // Recorremos la tabla cadenas
        for (int i = 0; i < cadenas.length; i++) {
            if (cadenas[i].charAt(0) == 'a' || cadenas[i].charAt(0) == 'A') {
                // Mostramos los nombres que empiezan por 'A' o 'a'
                System.out.println(cadenas[i] + " comienza por 'A' o 'a'");
                contadorA++;
            }
        }

        // Mostramos la cantidad de nombres que empiezan por 'A' o 'a'
        System.out.println("Empiezan por 'A' o 'a': " + contadorA);
    }

    public static void main(String[] args) {
        // Creamos la tabla cadenas
        String cadenas[] = {"Mike", "Anna", "John", "Sue", "Antonio", "Ed", "Anaís"};

        // Llamamos a la función auxiliar para contar y mostrar nombres que empiezan por 'A' o 'a'
        contarYMostrarNombresQueEmpiezanConA(cadenas);
    }
}