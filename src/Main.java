import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;
public  class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int num_2;
        System.out.println("----------------------------------- \n¡Bienvenido al Trabajo Práctico 1!\n-----------------------------------");
        System.out.println("Grupo: 1 \nIntegrantes: Frankneberger Federico \n-----------------------------------");
        System.out.println("1 / Continuar \n2 / Salir");
        do {
            num = sc.nextInt();
            switch (num){
                case 1 :
                    break;
                case 2 :
                    System.out.println("Gracias!");
                    break;
                default:
                    System.out.println("- Número fuera de rango - Intente nuevamente -\n1 / Continuar \n2 / Salir");
            }
        }while ((num!=1)&&(num!=2));


    }
}

/* Probando 1,2,3,4 */