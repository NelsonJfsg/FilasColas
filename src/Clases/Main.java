package Clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    //Clase para leer teclado.
    public static BufferedReader Lec = new BufferedReader(new InputStreamReader(System.in));

    //Main de la aplicacion.
    public static void main(String[] args) throws IOException {

        //Variables
        String palabra;
        String mensaje;

        //Objeto
        Operacion oP = new Operacion();

        System.out.println("~~~ COMPROBAR SI UNA PALABRA ES PALINDROME ~~~");
        System.out.print("Palabra: ");
        palabra = Lec.readLine();
        oP.palindrome(palabra);

        System.out.println("~~~ DECODIFICADOR DE MENSAJE ~~~");
        System.out.print("Mensaje: ");

        mensaje = Lec.readLine();
        mensaje = oP.codificar(mensaje.toUpperCase());
        System.out.println(mensaje);
        
        System.out.print("Introduzca el mensaje anteriormente codificado: ");
        mensaje = Lec.readLine();
        mensaje = oP.codificar(mensaje);
        System.out.println(mensaje);
    }
}
