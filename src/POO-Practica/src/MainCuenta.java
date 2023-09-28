public class MainCuenta {
    public static void main(String args[]){
        Cuenta cuenta1 = new Cuenta("Fulano de Tal");
        Cuenta cuenta2 = new Cuenta("Ana Banana");

        double saldoActual = cuenta1.retirar(25);
        System.out.println("\nEl saldo acutal es de "+cuenta1.getSaldo());
        System.out.println(cuenta1.imprimirEstado());

        boolean masSaldo = cuenta1.tieneMasSaldo(cuenta2);
        System.out.println(masSaldo);
    }
}
