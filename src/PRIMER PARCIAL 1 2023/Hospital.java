import java.io.*;
import java.util.*;

public class Hospital {
    public static void main (String[] args){

        int opcion;
        Scanner scan = new Scanner(System.in);

        //listado de doctores
        List <Doctor> listaDoctores = new ArrayList<Doctor>();
        listaDoctores.add(new Doctor("Juan Perez", 42875908, "01/09/1997", "Dermatologo"));

        //listado de pacientes
        List <Paciente> listaPacientes = new ArrayList<Paciente>();
        listaPacientes.add(new Paciente("pepe", 67453846, "04/05/2010", "6343743", 5, "inicio tratamiento"));


        do{
            System.out.println("Hospital Julio C Perrando - Av. 9 de Julio 1100 . 0362 444-2399\nMenu:");
            System.out.println("1. Listar Doctores.\n2. Registrar un nuevo paciente\n3. Actualizar  informacion personal de un paciente.\n4. Consultar el historial  medico de un paciente.\n5. Nuevo Historial para un paciente.\n6. Guardar Historial de pacientes en archivo.\n7. Cargar Historial de pacientes.\n8. Salir.");
            opcion = scan.nextInt();
        }while(opcion > 6 || opcion < 1);

        switch(opcion){
            case 1:
            case 2:
            case 3:
                int dni_buscado;
                System.out.println("Indique el DNI del paciente  a buscar:\n");
                dni_buscado = scan.nextInt();
                for(Paciente a: listaPacientes){
                    if(a.getDni() == dni_buscado){
                        System.out.println("Actualizar DNI:(DNI actual: " + a.getDni() + ")\n");
                        a.setDni(scan.nextInt());
                        System.out.println("Actualizar Nombre:(Nombre actual: " + a.getNombre() + ")\n");
                        a.setNombre(scan.next());
                        System.out.println("Actualizar Fecha de neciemiento:(Fecha actual: " + a.getFecha_nacimiento() + ")\n");
                        a.setFecha_nacimiento(scan.next());
                    }else System.out.println();
                }

            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
        }
        }

    abstract class Persona {
        protected String nombre;
        protected int dni;
        protected String fecha_nacimiento; //dd/mm/aaaa

        public Persona() {
        }

        public Persona(String nombre, int dni, String fecha_nacimiento) {
            this.nombre = nombre;
            this.dni = dni;
            this.fecha_nacimiento = fecha_nacimiento;
        }

        final int getDni(){
            return this.dni;
        }

        public String getNombre() {
            return nombre;
        }

        public String getFecha_nacimiento() {
            return fecha_nacimiento;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setDni(int dni) {
            this.dni = dni;
        }

        public void setFecha_nacimiento(String fecha_nacimiento) {
            this.fecha_nacimiento = fecha_nacimiento;
        }
    }

    class Doctor extends Persona{
        private String Especialidad;

        public Doctor(String nombre, int dni, String fecha_nacimiento, String especialidad) {
            super(nombre, dni, fecha_nacimiento);
            Especialidad = especialidad;
        }
    }

    class Paciente extends Persona implements IInformacion{
        private int nro_telefono;
        private int tipo_sangre;
        List <String> historial_medico = new ArrayList<String>(); //listado de eventos del paciente

        public Paciente(String nombre, int dni, String fecha_nacimiento, int nro_telefono, int tipo_sangre, List <String> historial_medico) {
            super(nombre, dni, fecha_nacimiento);
            this.nro_telefono = nro_telefono;
            this.tipo_sangre = tipo_sangre;
            this.historial_medico = historial_medico;
        }

        @Override
        public void verHistorialDeEventos() {
            System.out.println("Historial medico:\n");
            for(String evento : historial_medico){
                System.out.println(" " + evento + ".\n");
            }
        }



    }

    interface IInformacion
    {
        void verHistorialDeEventos();
    }
}


