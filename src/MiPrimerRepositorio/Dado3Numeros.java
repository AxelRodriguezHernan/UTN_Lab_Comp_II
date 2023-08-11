// Dado un conjunto de tres números ingresados por el usuario a través de la consola,
// el programa debe ordenarlos de mayor a menor y mostrar el resultado por pantalla.
package MiPrimerRepositorio;
import java.util.Scanner;

public class Dado3Numeros {
    public static void main (String[] args) {
        int a,b,c;
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresar primer numero:\n");
        a = scan.nextInt();
        System.out.print("Ingresar segundo numero:\n");
        b = scan.nextInt();
        System.out.print("Ingresar tercer numero:\n");
        c = scan.nextInt();

        if(a > b && a > c){
            if (b > c) System.out.print(a+" "+b+" "+c);
            else System.out.print(a+" "+c+" "+b);
        }else if (b > a && b > c){
            if (a > c) System.out.print(b+" "+a+" "+c);
            else System.out.print(b+" "+c+" "+a);
        }else if (c > a && c > b){
            if (a > b) System.out.print(c+" "+a+" "+b);
            else System.out.print(c+" "+b+" "+a);
        }






    }
}
