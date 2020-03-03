package serializeTransient;

import serializebasic.SerializableObject;

import java.io.*;

public class SerializableTransientTest {
    public static void main(String[] args) {
        // write object

        File f = new File("D://Example/SerializableTransient.ser");
        SerializableTransientObject map=new SerializableTransientObject();
        map.setI(100);
        map.setS("reema");

        try {
            FileOutputStream outStream=new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(outStream);
            oos.writeObject(map);
            oos.close();
            outStream.close();
            System.out.println("Serialized  data is saved in D://Example/SerializableTransient.ser");




        } catch (IOException e) {
            e.printStackTrace();
        }

        // read object
        try {
            FileInputStream outStream = new FileInputStream("D://Example/SerializableTransient.ser");
            ObjectInputStream ois = new ObjectInputStream(outStream);
            SerializableTransientObject o = (SerializableTransientObject) ois.readObject();
            System.out.println(o.i);
            System.out.println(o.s);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
