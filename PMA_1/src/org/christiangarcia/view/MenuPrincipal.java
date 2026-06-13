
package org.christiangarcia.view;

import java.util.Scanner;

public class MenuPrincipalView {
    private final Scanner scanner;

    public MenuPrincipalView() {
        this.scanner = new Scanner(System.in);
    }
    public int mostrarMenuPrincipal()
        System.out.println("            Menú Principal            ");
        System.out.println("--------------------------------------");
        System.out.println("1. Matematicas");  
        System.out.println("2. Cadenas");  
        System.out.println("3. Booleans");       
        System.out.println("4. Salir");                            
        System.out.println("--------------------------------------");
        System.out.println("Seleccione una opcion: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine(); 
        return opcion;
    }


    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
