import java.util.Scanner;
public class pruebamain {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        prueba[] persona = new prueba[5];
        persona[0] = new prueba("pepe");
        System.out.printf(persona[0].getNombre());
        persona[0].setNombre(scan.next());
        System.out.printf(persona[0].getNombre());

    }
}
