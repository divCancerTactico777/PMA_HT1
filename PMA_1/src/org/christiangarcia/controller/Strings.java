
package org.christiangarcia.controller;

public class Strings {

    public int longitudCadena(String texto) {
        return texto.lenght();
    }
    public int mayusculas(String texto) { 
        return texto.toUpperCase();
    }
    public int invertirString(String texto) {
        return new Stringbuilder(texto).reverse().toString();
    }
    public int minusculas(String texto) {
        return texto.toLowerCase();
    }
    public int buscarChar(String texto, char caracter) {
         return texto.indexOf(caracter);
    }
    public int contarVocales(String texto) {
        int contador = 0;
        String textoMin = texto.toLowerCase();
        for (int i = 0; i < textoMin.charAt(i);
             if (letra == 'a' | letra = 'e' | if (letra == 'i' | letra = 'o' | if (letra == 'u') {
            contador++;
        }
    }
    return contador;
}
}
