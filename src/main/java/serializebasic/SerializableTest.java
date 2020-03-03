package serializebasic;

import java.io.*;

public class SerializableTest {
    public static void main(String[] args) {
        // write object

        File f = new File("D://Example/SerializableBasic.ser");
        SerializableObject map=new SerializableObject();
        map.setI(100);
        map.setS("reema");

        try {
            FileOutputStream outStream=new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(outStream);
            oos.writeObject(map);
            oos.close();
            outStream.close();
            System.out.println("Serialized  data is saved in D://Example/SerializableBasic.ser");




        } catch (IOException e) {
            e.printStackTrace();
        }

        // read object
        try {
            FileInputStream outStream = new FileInputStream("D://Example/SerializableBasic.ser");
            ObjectInputStream ois = new ObjectInputStream(outStream);
            SerializableObject o = (SerializableObject) ois.readObject();
            System.out.println(o.i);
            System.out.println(o.s);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
