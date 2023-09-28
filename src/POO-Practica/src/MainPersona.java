public class MainPersona {
    public static void main(String args[]){

        Persona persona1 = new Persona("67890123");
        persona1.nombre = "Juan";
        System.out.print(persona1.comer());
        System.out.print(persona1.dni);

        Persona persona2 = new Persona("56789345",23);
        //persona2.nombre = "Peppe";
        System.out.print(persona2.comer());

        Persona persona3 = new Persona("76456987", 19,"Fulano De Tal");

        Empleado emple = new Empleado("42985811",23, "juan",28158,"manager",890239);



        Docente doc1 = new Docente("442888777", 30);
        System.out.print("docente esta " + doc1.comer());

        System.out.print("empleado esta " + emple.comer());

        //las clases deben extender de la misma clase a la cual pertenece el array
        Persona personas[] = new Persona[5];
        personas[0] = new Persona("456789", 42, "juan");
        personas[1] = new Docente("343454546", 32);
        personas[2] = new Empleado("44546", 43, "juanchi", 234, "montacargas", 40000000);
      //  personas[3] = new Cuenta("felpudo"); no funciona porque cuenta no hereda de persona





    }
}