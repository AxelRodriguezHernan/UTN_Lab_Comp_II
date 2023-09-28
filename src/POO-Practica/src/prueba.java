public class prueba {
   //atributos
    private String nombre;
    private int DNI;
    private double saldo;

    private static final double SALDO_DEFECTO = 100;

    //constructores
    public prueba(String nombre) {
        this.nombre = nombre;
        this.saldo = SALDO_DEFECTO;

    }

    //metodos
    public String comer() {
        return this.nombre + " esta comiendo";

    }

    //setters
    public void setNombre(String nombre) {
        if (nombre.length() < 15) this.nombre = nombre;
    }

    //getters
    public String getNombre(){
        return this.nombre;
    }
}



