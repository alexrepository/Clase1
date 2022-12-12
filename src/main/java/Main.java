
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author adplascencia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//estoy probando una nueva característica
        int n;
//leer datos
        Scanner entrada = new Scanner(System.in);
//Escribir 
        System.out.println("Ingrese un número");
        n = entrada.nextInt();
//segun
switch (n) {
            case 1:
                System.out.println("Lunes");
                break;
case 2:
    System.out.println("Martes");
break;
case 3:
    System.out.println("Miércoles");
break;
case 4:
    System.out.println("Jueves");
break;
case 5:
    System.out.println("Viernes");
break;
            default:
              System.out.println("El numero ingresado no es válido");
        }
        //sino
/*        
if (n == 1) {
            System.out.println("Lunes");
        } else {
            if (n == 2) {
                System.out.println("Lunes");
            } else {
                if (n == 3) {
                    System.out.println("miercoles");
                } else {
                    if (n==4) {
                        System.out.println("jueves");
                    } else {
                        System.out.println("viernes");
                    }
                }
            }
        }
*/

    }

}
