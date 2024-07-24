package Aplicacion_de_desiciones;

import java.text.MessageFormat;
import java.util.Scanner;

public class calculadoraBasica {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba la operacion que desea realizar");
        System.out.println("");
        System.out.println("suma, resta, multiplicacion, division");
        String operation = sc.nextLine();

        System.out.println("Ingrese un numero entero");
        int num1 = sc.nextInt();

        System.out.println("Ingrese otro número entero");
        int num2 = sc.nextInt();

      

        int total = 0;
        if (operation.equalsIgnoreCase("suma")) {
            total = num1 + num2;
        } else if (operation.equalsIgnoreCase("resta")) {
            total = num1 - num2;
        } else if (operation.equalsIgnoreCase("multiplicacion")) {
            total = num1 * num2;
        } else if (operation.equalsIgnoreCase("division")) {
            if (num2 != 0 && num2 > 0) {
                total = num1 / num2;
            } else {
                System.out.println("Error division por cero no es posible o numero invalido");
            }
        } else {
            System.out.println("Operacion invalida");
        }

        System.out.println(MessageFormat.format("El resultado de su {0} es: {1}",operation,total));

        sc.close();
    }
}
