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
                    do {
                        System.out.println("-Seleccione-\n-- 1 a 14 para ejercicios\n-- 15 para salir");
                        num_2 = sc.nextInt();
                        switch (num_2){
                            case 1:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 1:");
                                String nombre = "Fernando";
                                System.out.println("Bienvenido " + nombre);
                                System.out.println("-------------------------------------");
                                break;
                            case 2:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 2:");
                                System.out.println("Ingrese su nombre:");
                                sc.nextLine();
                                String nombre_2 = sc.nextLine();
                                JOptionPane.showMessageDialog(null,"Bienvenido " +nombre_2 + " !");
                                System.out.println("-------------------------------------");
                                break;
                            case 3:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 3:");
                                int numero1 = 30;
                                int numero2 = 10;
                                System.out.println("La suma de los dos números es: " + (numero1+numero2));
                                System.out.println("La resta de los dos números es: " + (numero1-numero2));
                                System.out.println("La multiplicación de los dos números es: "+(numero1*numero2));
                                System.out.println("La división de los números es: "+(numero1/numero2));
                                System.out.println("El módulo de los dos números es: " +(numero1 % numero2));
                                System.out.println("-------------------------------------");
                                break;
                            case 4:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 4:");
                                System.out.println("Ingrese dos números para saber cual es más grande:");
                                System.out.println("Número 1:");
                                int numero3= sc.nextInt();
                                System.out.println("Número 2:");
                                int numero4= sc.nextInt();
                                if (numero3 == numero4){
                                    System.out.println("Los números son iguales!");
                                }else if (numero3 > numero4){
                                    System.out.println("El número " +numero3 +" es el mayor!");
                                }else {
                                    System.out.println("El número " + numero4 + " es mayor!");
                                }
                                System.out.println("-------------------------------------");
                                break;
                            case 5:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 5:");
                                System.out.println("Ingresa un número para saber si es divisible en 2:");
                                int numero5 = sc.nextInt();
                                if ((numero5 % 2)==0 ){
                                    System.out.println("El número es divisible por 2!");
                                }else {
                                    System.out.println("El número no es divisible por 2!");
                                }
                                System.out.println("-------------------------------------");
                                break;
                            case 6:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 6:");
                                double iva = 1.21;
                                System.out.println("Ingrese el precio del producto:");
                                double producto = sc.nextDouble();
                                double productoiva = producto * iva;
                                System.out.println("El final con IVA es de: $" +productoiva);
                                System.out.println("-------------------------------------");
                                break;
                            case 7:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 7:");
                                int numero_6 = 1;
                                while (numero_6<=100){
                                    System.out.println(numero_6);
                                    ++numero_6;
                                }
                                System.out.println("-------------------------------------");
                                break;
                            case 8:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 8:");
                                for (int numero_7=1;numero_7<=100;numero_7++){
                                    System.out.println(numero_7);
                                }
                                System.out.println("-------------------------------------");
                                break;
                            case 9:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 9:");
                                for (int numero_8=1;numero_8<=100;numero_8++){
                                    if (((numero_8 % 2)== 0) && ((numero_8 % 3)== 0 )){
                                        System.out.println(numero_8);
                                    }
                                }
                                System.out.println("-------------------------------------");
                                break;
                            case 10:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 10:");
                                int numero_9;
                                do{
                                    System.out.println("Ingresa un número:");
                                    numero_9 = sc.nextInt();
                                    if (numero_9 >= 0){
                                        System.out.println("El número " +numero_9 + " es mayor que 0!" );
                                    }
                                }while(numero_9 < 0);
                                System.out.println("-------------------------------------");
                                break;
                            case 11:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 11:");
                                String contrasena = "gato";
                                sc.nextLine();
                                for (int numero_10 =1;numero_10<=3;numero_10++){
                                    System.out.println("Ingrese la contraseña:");
                                    String contrasena_2 = sc.nextLine();
                                    if (Objects.equals(contrasena,contrasena_2)){
                                        System.out.println("Acceso Correcto");
                                        break;
                                    }else{
                                        System.out.println("Contraseña Incorrecta quedan " + (3 - numero_10) +" intentos.");
                                    }
                                }
                                System.out.println("-------------------------------------");
                                break;
                            case 12:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 12:");
                                System.out.println("Ingrese un día de la semana:\n1-Lunes\n2-Martes\n3-Miércoles\n4-Jueves\n5-Viernes\n6-Sábado\n7-Domingo");
                                int dia;
                                do {
                                    dia = sc.nextInt();
                                    switch (dia){
                                        case 1,2,3,4,5:
                                            System.out.println("Es un día laboral!");
                                            break;
                                        case 6,7:
                                            System.out.println("No es un día labora!");
                                            break;
                                        default:
                                            System.out.println("Valor fuera de rango, vuelva a ingresarlo!");
                                    }
                                }while(dia>7);
                                System.out.println("-------------------------------------");
                                break;
                            case 13:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 13:");
                                System.out.println("Ingrese un número para saber si es primo:");
                                int numero_11 = sc.nextInt();
                                if (numero_11<=1){
                                    System.out.println("El número no es primo!");

                                }else {
                                    double raiz = Math.sqrt(numero_11);
                                    int raiz_2 = (int) raiz;
                                    int contador = 0;
                                    for (int i = raiz_2; i > 0; i--) {
                                        if ((numero_11 % i) == 0) {
                                            contador = contador +1;
                                        }
                                    }
                                    if (contador>1){
                                        System.out.println("El número no es primo!");
                                    }else System.out.println("El número es primo!");
                                }
                                System.out.println("-------------------------------------");
                                break;
                            case 14:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 14:");
                                int x = new Double(Math.random() * 100).intValue();
                                System.out.println(x);
                                int numero_12;
                                int contador_2=0;
                                System.out.println("Ingrese un número para saber si coincide con el generado!");
                                do{
                                    numero_12 = sc.nextInt();
                                    System.out.println("Numero Ingresado: "+numero_12);
                                    if (numero_12 == x){
                                        System.out.println("Respuesta: Correcto, numero encontrado, cantidad de intentos "+(contador_2+ 1));
                                    } else if (numero_12<x) {
                                        contador_2++;
                                        System.out.println("Respuesta: Es muy bajo");
                                    } else {
                                        contador_2++;
                                        System.out.println("Respuesta: Es muy alto");
                                    }
                                }while (x != numero_12);

                                System.out.println("-------------------------------------");
                                break;
                            case 15:
                                System.out.println("-------------------------------------");
                                System.out.println("Gracias por su corección!");
                                System.out.println("-------------------------------------");
                                num = 2;
                                break;
                            default:
                                System.out.println("--------------------------------------------------");
                                System.out.println("ERROR - número fuera de rango - vuleva a intentar!");
                                System.out.println("--------------------------------------------------");
                        }

                    }while(num==1);
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