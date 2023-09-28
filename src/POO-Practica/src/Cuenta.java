public class Cuenta {
    private String titular;
    private double saldo;

    public static final double SALDO_DEFECTO = 100; //constante



    public Cuenta(String nombre){
        titular = nombre;
        this.saldo = SALDO_DEFECTO;
    }

    public Cuenta(String nombre, int saldo){
        titular = nombre;
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double ingresar(double cantidad){
        if(cantidad > 0) this.saldo += cantidad;
        return this.saldo;
    }

    public double retirar(double cantidad){
        if(this.saldo < cantidad) this.saldo = 0;
        else this.saldo -= cantidad;
        return this.saldo;
    }

    public String imprimirEstado(){
        return "\nTitular: "+getTitular()+" - Saldo: "+getSaldo();
    }

    public boolean tieneMasSaldo(Cuenta c1){  //evalua si cuenta 1 tiene mas saldo que cuenta 2
        if(this.saldo > c1.saldo){
            return true;
        }else return false;
    }
}
