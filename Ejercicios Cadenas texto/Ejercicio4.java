public class Ejercicio4 {

 	public static void main(String[] args) {
        //Creamos la tabla cadenas, la variable contadorMinus y la variable contadorMayus
        String cadenas[] = {"Sue", "CharLotte", "ANNa", "MiKe", "William", "Ed"};

        int contadorMayus = 0;
        int contadorMinus = 0;

        // Recorre la tabla cadenas
        for (int i = 0; i < cadenas.length; i++) {
            // Verifica cada carácter de la cadena actual
            for (int j = 0; j < cadenas[i].length(); j++) {
                // Incrementa los contadores según el tipo de carácter (mayúscula o minúscula)
                if (cadenas[i].charAt(j) >= 'A' && cadenas[i].charAt(j) <= 'Z')
                    contadorMayus++;
                if (cadenas[i].charAt(j) >= 'a' && cadenas[i].charAt(j) <= 'z')
                    contadorMinus++;
            }

            // Compara la cantidad de mayúsculas y minúsculas en la cadena actual
            if (contadorMayus > contadorMinus)
                System.out.println(cadenas[i] + " Tiene más mayúsculas que minúsculas");
            if (contadorMayus < contadorMinus)
                System.out.println(cadenas[i] + " Tiene más minúsculas que mayúsculas");
            if (contadorMayus == contadorMinus)
                System.out.println(cadenas[i] + " Tiene la misma cantidad de mayúsculas y minúsculas");

            // Reinicia los contadores para la siguiente cadena
            contadorMayus = 0;
            contadorMinus = 0;
        }
    }
}