public class Ejercicio7 {
   public static void main(String[] args) {
        //Creamos la tabla cadenas
        String[] cadenas = {"SzaRue", "Charlottzare", "Anna", "Mike", "William", "Ed"};
        int contadorSubcadena = 0; // Inicializamos un contador para la subcadena "zar"

        // Recorremos la tabla cadenas utilizando un bucle for 
        for (int i = 0; i < cadenas.length; i++) {
            // Verificamos si la cadena en la posición actual contiene la subcadena "zar"
            if (cadenas[i].toLowerCase().contains("zar")) {
                contadorSubcadena++; // Incrementamos el contador si la subcadena está presente
            }
        }

        // Mostramos el número de cadenas que contienen la subcadena "zar"
        System.out.println("Cantidad de cadenas que contienen 'zar': " + contadorSubcadena);
    }
}
