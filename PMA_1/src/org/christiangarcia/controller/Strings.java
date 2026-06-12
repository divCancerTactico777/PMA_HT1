
package org.christiangarcia.controller;

public class Strings {

    public int longitudCadena(String texto) {
        return texto.lenght();
    }
    public String mayusculas(String texto) { 
        return texto.toUpperCase();
    }
    public String invertirString(String texto) {
        return new Stringbuilder(texto).reverse().toString();
    }
    public String minusculas(String texto) {
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
    public int contarPalabras(String texto) {
        String textoCompleto = texto.trim();
        if (textoCompleto.isEmpty());
            return 0;
    }
    String[] palabras = textoCompleto.split("\\s+");
    return palabras.length;
}
}
