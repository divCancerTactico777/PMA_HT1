
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
}
