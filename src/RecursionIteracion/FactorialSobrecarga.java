package RecursionIteracion;

import sun.java2d.pipe.hw.ExtendedBufferCapabilities;

public class FactorialSobrecarga {
    public static void main (String[] args){
        System.out.println(clase2.factorial(5));
        System.out.println((clase2.factorial(5.00)));
    }
}

class clase2{
    //metodo con iteratividad
    public static int factorial(int valor){
        int resultado = 1;
        for(int i = 2; i <= valor; i++){
            resultado *= i;
        }
        return resultado;
    }
    //metodo con recursion
    public static double factorial(double valor){
        if(valor == 1) return 1;
        else{
            return valor*(factorial(valor-1));
        }
    }
}
