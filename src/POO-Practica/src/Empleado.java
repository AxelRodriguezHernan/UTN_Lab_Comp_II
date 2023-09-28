public class Empleado extends Persona{
        int num_legajo;
        String cargo;
        double sueldo;

        public Empleado(String datoDni, int unaEdad, String unNombre, int num_legajo, String cargo, double sueldo) {
            super(datoDni, unaEdad, unNombre);
            this.num_legajo = num_legajo;
            this.cargo = cargo;
            this.sueldo = sueldo;
        }

        public String comer(){
            return super.comer() + " con postre";
        }
    }


