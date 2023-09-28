public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector multiplicar(double num){
        Vector nuevoVector = new Vector(x*num, y*num,z*num);
        return nuevoVector;
    }

    public Vector sumar(Vector vector2) {
        if ((vector2.x == 0 && this.x == 0) && (vector2.y == 0 && this.y == 0) && (vector2.z == 0 && this.z == 0)) {
            return new Vector(this.x + vector2.x, this.y + vector2.y, this.z + vector2.z);
        }else{
            System.out.println("ERROR");
            return vector2;
        }
    }

    public String toString(){
        return "["+ x + ", " + y + ", " + z + "]";
    }


}
