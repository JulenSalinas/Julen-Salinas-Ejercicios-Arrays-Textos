public class Ejercicio3 {

    public static void main(String[] args) {

        // Creamos la tabla cadenas
        String[] cadenas = {"SuE","ChaRLOtte","ANna","MIke","WiLLiam","Ed"};

        // Contadores para las mayúsculas y minúsculas
        int contadorMayus = 0;
        int contadorMinus = 0;
		
        // Recorremos la tabla de cadenas
        for(int i = 0; i < cadenas.length; i++) {
            // Recorremos cada carácter en la cadena actual
            for(int j = 0; j < cadenas[i].length(); j++) {
                // Verificamos si el carácter actual es una mayúscula
                if(cadenas[i].charAt(j) >= 'A' && cadenas[i].charAt(j) <= 'Z')
                    contadorMayus++; // Incrementamos el contador de mayúsculas

                // Verificamos si el carácter actual es una minúscula
                if(cadenas[i].charAt(j) >= 'a' && cadenas[i].charAt(j) <= 'z')
                    contadorMinus++; // Incrementamos el contador de minúsculas
            }

            // Mostramos el conteo de mayúsculas y minúsculas para la cadena actual
            System.out.println("\n");
            System.out.println(cadenas[i] + " tiene : " + contadorMayus + " cantidad de mayúsculas" + "\n" + cadenas[i] +  " tiene : "  + contadorMinus + " cantidad de minúsculas");

            // Reiniciamos los contadores para la próxima cadena
            contadorMayus = 0;
            contadorMinus = 0;
        }
    }
}