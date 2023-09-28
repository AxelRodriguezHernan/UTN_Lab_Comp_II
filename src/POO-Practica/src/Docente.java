public class Docente extends Persona{

    private int hsTrabajadas;

    public Docente(String datoDni, int hsTrabajadas) {
        super(datoDni);
        this.hsTrabajadas = hsTrabajadas;
    }

    public String comer()
            {

               int newComer;
               if (hsTrabajadas > 20){
                   return "si come";
               }else return "no come";
            }
    }
