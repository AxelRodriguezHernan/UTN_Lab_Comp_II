
    public class Electrodomestico {
        protected double precioBase;
        protected String color;
        protected char consumoEnergetico;
        protected int peso;

        private static final char CONSUMO_ENERGETICO_DEFECTO = 'F';
        private static final String COLOR_DEFECTO = "Blanco";
        private static final int PESO_DEFECTO = 5;
        private  static final double PRECIO_DEFECTO = 100.00;

        private char[] consumos = {'A','B','C','D','E','F'};
        private String[] colores = {"blanco", "BLANCO", "negro", "NEGRO", "rojo", "ROJO", "azul", "AZUL", "gris", "GRIS"};

        public Electrodomestico(){
            this.color = COLOR_DEFECTO;
            this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
            this.precioBase = PRECIO_DEFECTO;
            this.peso = PESO_DEFECTO;
        }

        public Electrodomestico(String color, double precioBase, char consumoEnergetico, int peso){
            this.precioBase = precioBase;
            this.peso = peso;
            comprobarConsumoEnergetico(consumoEnergetico);

        }

        public Electrodomestico(double precioBase, int peso){
            this.precioBase = precioBase;
            this.peso = peso;
            this.color = COLOR_DEFECTO;
            this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
        }

       public double getPrecioBase(){
            return this.precioBase;
       }

        public String getColor() {
            return this.color;
        }

        public char getConsumoEnergetico() {
            return this.consumoEnergetico;
        }

        public int getPeso() {
            return this.peso;
        }

        //privado porque el metodo oslo se ocupa en la misma clase
        //metodo contain()
        private void comprobarConsumoEnergetico(char letra){
            if (letra >= 'A' && letra <= 'F'){
                this.consumoEnergetico = letra;
            }else{
                this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
            }
        }
     /*   private void comprobarColor(String color){
            if (color => "blanco" && color =< "GRIS"){
                this.color = color;
            }else{
                this.color = COLOR_DEFECTO;
            }
        }

      */

    }

