package Serializacion;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{

        Persona perso = new Persona();
/*
        perso.setEdad(30);
        perso.setNombre("Juan");
        FileOutputStream fileOutputStream = new FileOutputStream("fichero.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(perso);
        objectOutputStream.close();
*/
    try {
        ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("fichero2.txt"));
        flujoSalida.writeObject(perso);
        flujoSalida.close();
    }catch(Exception e) {
        e.printStackTrace();
    }
    try {
        ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("fichero2.txt"));
        Persona[] personasEntrada = (Persona[]) flujoEntrada.readObject();
        flujoEntrada.close();

        for(Persona e : personasEntrada){
            System.out.println(e.toString());
        }
    }catch(Exception e){
        e.printStackTrace();
    }

    }


}

