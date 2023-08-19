package RecursionIteracion;

public class SumatoriaRecursiva {
    public static void main(String[] args){
        System.out.println(clase1.sumatoria(9));
    }
}
class clase1{
// valor se suma a su valor anterior o a 1 si el valor es 1.
    public static int sumatoria(int valor){
        if(valor == 1) return 1;
        return valor + sumatoria(valor-1);
    }
}
