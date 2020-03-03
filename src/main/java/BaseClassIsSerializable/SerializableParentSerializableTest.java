package BaseClassIsSerializable;

import java.io.*;

public class SerializableParentSerializableTest {
    public static void main(String[] args) {
        // write object

        File f = new File("D://Example/SerializableParentSerializable.ser");
        SerializableBaseObject map=new SerializableBaseObject();
        map.setI(100);
        map.setS("reema");

        try {
            FileOutputStream outStream=new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(outStream);
            oos.writeObject(map);
            oos.close();
            outStream.close();
            System.out.println("Serialized  data is saved in D://Example/SerializableParentSerializable.ser");




        } catch (IOException e) {
            e.printStackTrace();
        }

        // read object
        try {
            FileInputStream outStream = new FileInputStream("D://Example/SerializableParentSerializable.ser");
            ObjectInputStream ois = new ObjectInputStream(outStream);
            SerializableBaseObject o = (SerializableBaseObject) ois.readObject();
            System.out.println(o.i);
            System.out.println(o.s);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
