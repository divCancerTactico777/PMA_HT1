
package org.christiangarcia.view;
import java.util.Scanner;

public class MatematicasView {

    private final Scanner scanner;

    public MatematicasView() {
        this.scanner = new Scanner(System.in);
    }
    public int pedirInt(String mensaje) {
        System.out.println(mensaje);
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }
    public int menuMatematicas() {
        System.out.println("--- Operaciones Matemáticas ---");
        System.out.println("1. Calcular Salario");
        System.out.println("2. Area de un Triangulo");
        System.out.println("3. Promedio");
        System.out.println("4. Convertir de Temperatura");
        System.out.println("5. Perimetro de Circulo");
        System.out.println("6 Volumen de cilindro");
        System.out.println("7. Hipotenusa");
        System.out.println("8. Dias a Minutos");
        System.out.println("9. Division");
        System.out.println("10. Potencia al cubo");
        System.out.println("0. Regresar al Menu Principal");
        System.out.println("-----------------------------");
        System.out.print("Elija una opción:");
        
        int opcion = scanner.nextInt();
        scanner.nextLine(); 
        return opcion;
    }
    public double pedirDouble(String mensaje) {
        System.out.print(mensaje);
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }
    public void mostrarResultado(String mensaje) {
        System.out.println(mensaje);
    }
}
}
