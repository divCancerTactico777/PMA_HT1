
package org.christiangarcia.controller;

public class Booleans {

public boolean mayorEdad(int edad) {
    return edad >= 18;
}
public boolean AND(boolean a, boolean b) {
    return a & b;
}
public boolean Or(boolean a, boolean b) {
    return a | b;
}
public boolean NOT(boolean dato) {
    return !dato;
}
public boolean parPositivo (int x) {
    return (x > 0) & (x / 2 == 0);
}
public boolean Aprobar(double nota, int asistencia) {
    return (nota >= 60) & (asistencia >= 80);
}
public boolean leapYear(int year) {
    return (year % 400 = 0) | ((year % 4 = 0) & (year % 100 != 0));
}
public boolean Acceso(boolean contraCorrecta, boolean tk) {
    return contraCorrecta | tk;
}
public boolean descuento(int edad, boolean miembro) {
    return (edad >= 65) | miembro;
}
    
}
