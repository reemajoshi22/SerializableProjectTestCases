package ImplementReadObjectAndWriteObjectInParentClass;

import java.io.*;

public class SerializableParentSerializableTest {
    public static void main(String[] args) {
        // write object

        File f = new File("D://Example/SerializableParentSerializable.ser");
        SerializableChildObject map=new SerializableChildObject();
        map.setI(100);
        map.setS("reema");
        map.setchildclassinteger(1000);
        map.setchildclassstring("joshi");


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
            SerializableChildObject o = (SerializableChildObject) ois.readObject();
            System.out.println(o.i);
            System.out.println(o.s);
            System.out.println(o.childclassinteger);
            System.out.println(o.childclassstring);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
