// numero legajo*,nombre*,comicilio, apellido
public class Alumno {

    //atributos
    private String nombre;      //obligatorio  //private=modificadores de acceso, no permite modificacion hechas afuera
    private String apellido;    //obligaotrio   // alumno1.legajo = "765324" no seria posible en main con atributo private
    private String legajo;          //opcional
    private String domicilio;      //opcional

    //constructores
    public Alumno(String nombre, String legajo){
        this.nombre = nombre;       //this.nombre hace referencia al atributo llamado nombre
        this.legajo = legajo;
    }

    public Alumno(String nombre, String legajo, String apellido){
        this.nombre = nombre;
        this.legajo = legajo;
        this.apellido = apellido;
}

    public Alumno(String nombre, String legajo,String apellido,String domicilio){
        this.nombre = nombre;
        this.legajo = legajo;
        this.apellido = apellido;
        this.domicilio = domicilio;
}

//alt + insert para desplegar menu para crear metodos


    //metodos

    public String imprimirAlumno(){
        return "Nombre: "+this.nombre+"- Nro legajo: "+this.legajo;
    }

    //get y set
    //setters
    //metodos para modificar atributos
    public void setlegajo(String legajo){  //acepta nuevo valor de lgajo si cumple condicion
        if(legajo.length() > 5){
            this.legajo = legajo;
        }
    }

    //getters
    //devuelve valores de atributos
    public String getnombre(){
        return this.nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getLegajo() {
        return legajo;
    }

    public String getDomicilio() {
        return domicilio;
    }



}