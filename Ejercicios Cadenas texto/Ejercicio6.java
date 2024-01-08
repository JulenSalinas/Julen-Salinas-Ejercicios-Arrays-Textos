
public class Ejercicio6 {
	public static void main(String[] args) {
//Creamos la tabla y la variable capicua
		String cadenas[]={"Ana","Siris","Lucia","Otto","Federico","Azpiazu","Emilio"};
	    boolean capicua;
	    //Creamos un bucle que recorra el array
	    for(int i = 0;i<cadenas.length;i++) {
	    	capicua = true;
	    	//Segundo bucle para la cadena de texto de array
	    	for(int j = 0;j<cadenas[i].length()/2;j++) {
	    		//Ponemos cada cadena en mayúscula para que detecte capicúa
	    		String cadenaMayus=cadenas[i].toUpperCase();
			  if(cadenaMayus.charAt(j)!=cadenaMayus.charAt(cadenas[i].length()-1-j))
	                capicua=false;
		}
		//Mostramos los resultados
		  if(capicua)
		        System.out.println(cadenas[i] + " Es capicúa");
		  else
		        System.out.println(cadenas[i] + " No es capicúa");
	    }
	
	}
}