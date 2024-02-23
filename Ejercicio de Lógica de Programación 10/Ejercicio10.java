package ejercicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       
        Map<String, String> diccionario = new HashMap<>();
        inicializarDiccionario(diccionario);

    
        juego(diccionario);
    }

    private static void inicializarDiccionario(Map<String, String> diccionario) {
        diccionario.put("en", "in");
        diccionario.put("las", "the");
        diccionario.put("noches", "nights");
        diccionario.put("claras", "clear");
        diccionario.put("resuelvo", "solve (I solve)");
        diccionario.put("el", "the");
        diccionario.put("problema", "problem");
        diccionario.put("de", "of");
        diccionario.put("la", "the");
        diccionario.put("soledad", "loneliness synonim: solitude");
        diccionario.put("del", "of");
        diccionario.put("ser", "being");
        diccionario.put("invito", "invite (I invite)");
        diccionario.put("a", "to (in the poem is omitted)");
        diccionario.put("luna", "moon");
        diccionario.put("y", "and");
        diccionario.put("con", "with");
        diccionario.put("mi", "my");
        diccionario.put("sombra", "shadow");
        diccionario.put("nosotros", "we");
        diccionario.put("somos", "are");
        diccionario.put("tres", "three");
    }

    private static void juego(Map<String, String> diccionario) {
        int totalPreguntas = 0;
        int totalAciertos = 0;
        int totalErrores = 0;

       
        String[] palabrasAleatorias = obtenerPalabrasAleatorias(diccionario);

        for (String palEsp : palabrasAleatorias) {
            System.out.println("Traduce la palabra al inglés de acuerdo al poema Las noches claras de Gloria Fuentes");
            System.out.print(palEsp + ": ");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("fin")) {
                break; 
            }

            totalPreguntas++;

            
            String palIng = diccionario.get(palEsp);

            if (palIng != null && respuesta.equalsIgnoreCase(palIng)) {
                System.out.println("Correcto");
                totalAciertos++;
            } else {
                System.out.println("Incorrecto, la traducción correcta es: " + palIng);
                totalErrores++;
            }
        }

     
       
        System.out.println("Total de preguntas: " + totalPreguntas);
        System.out.println("Respuestas correctas: " + totalAciertos);
        System.out.println("Respuestas incorrectas: " + totalErrores);
       
    }

    private static String[] obtenerPalabrasAleatorias(Map<String, String> diccionario) {
     
        String[] palabras = diccionario.keySet().toArray(new String[0]);

       
        Random random = new Random();

       
        String[] palabrasAleatorias = new String[5];

        
        for (int i = 0; i < 5; i++) {
            int indiceAleatorio = random.nextInt(palabras.length);
            palabrasAleatorias[i] = palabras[indiceAleatorio];
        }

        return palabrasAleatorias;
    }
}
	
		
