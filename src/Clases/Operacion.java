package Clases;

import java.util.Arrays;

public class Operacion {

    public boolean palindrome(String palabra) {

        //Variables
        int cont = 0;

        //Palabra nueva.
        char[] newPalabra = palabra.toLowerCase().toCharArray();

        //Palabra original.
        char[] listaPalabra = palabra.toLowerCase().toCharArray();

        //Recorrer la palabra y guardarla en un nuevo array invertida.
        for (int i = listaPalabra.length; i > 0; i--) {
            newPalabra[cont] = listaPalabra[i - 1];
            cont++;
        }
        
        //Si los arrays son iguales entonces es una palabra palindrome.
        if (Arrays.equals(listaPalabra, newPalabra)) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

    public String codificar(String mensaje) {

        //Variables
        int pos = 0;
        String nuevoMensaje = ""; 
        String codificado;

        //Buscar si la oracion tiene alguna vocal o signo.
        for (int i = 0; i < mensaje.length(); i++) {
            if ((mensaje.charAt(i) == 'A') || (mensaje.charAt(i) == 'E') || (mensaje.charAt(i) == 'I') || (mensaje.charAt(i) == 'O') || (mensaje.charAt(i) == 'U') || (mensaje.charAt(i) == ' '|| (mensaje.charAt(i) == '!') || (mensaje.charAt(i) == '?'))) {
                nuevoMensaje = nuevoMensaje + Invertir(mensaje.substring(pos, i)) + mensaje.charAt(i);
                pos = i + 1;
            }
        }
        
        nuevoMensaje = nuevoMensaje + Invertir(mensaje.substring(pos, mensaje.length()));
        codificado = Invertir(nuevoMensaje);
        
        return codificado;
        
        
        
        
    }

    public static String Invertir(String palabra) {
        
        //Variables
        String palabraInv = "";
        
        // anidacion de caracter anterior.
        for (int i = 0; i < palabra.length(); i++) {
            palabraInv = palabra.charAt(i) + palabraInv;
        }
        
        return palabraInv;
    }
}
