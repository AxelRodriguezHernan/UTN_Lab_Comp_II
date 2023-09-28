public class MainAlumno {
    public static void main(String args[]){
        Alumno alumno1 = new Alumno("Juan","321657");
        Alumno alumno2 = new Alumno( "Fulano","327614");

        System.out.print(alumno1.imprimirAlumno());

        //alumno1.legajo = "874567";  no permite modificacion porque atributo legajo es privvate

        alumno1.setlegajo("41414");

        System.out.print(alumno1.imprimirAlumno());
        System.out.print(alumno1.getnombre());
        System.out.print(alumno1.imprimirAlumno());
        System.out.println("-------------------------\n");




    }
}
