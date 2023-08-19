package RecursionIteracion;

public class DivisionConRestas {
    public static void main(String[] args){
        System.out.println(claseA.division(21,5));
        System.out.println(claseA.division(21.0,5.0));
    }
}
//clase 1 con ambos metodos iguales
class claseA{
//metodo iterativo
    //se evalua si dividendo >= divisor, si los es, se resta el divisor al dividendo y se aumenta el cociente en 1.
    public static int division(int dividendo, int divisor) {
        int cociente = 0;
        while(dividendo >= divisor){
            dividendo -= divisor;
            cociente++;
        }
        return cociente;
    }
//metodo recursivo
    //si el dividendo es menor que el divisor, devuelve 0, caso contrario, devuelve 1 + llamada al misma funcion habiendole restado el valor del
    //divisor al parametro del dividendo. (se analiza si el nuevo valor del dividendo es mayor o no al valor del divisor)
    public static int division(double dividendo, double divisor) {
        if (dividendo < divisor) return 0;
        else {
            return 1 + division((dividendo - divisor), divisor);

        }
}

}
