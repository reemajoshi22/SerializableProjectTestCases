package ChildClassSerializable;

import java.io.*;


/**
 * If override read object and write object in the child class and save onlky child class objects then onky
 * child class objects will be serialzed and objects of base class will be given null values
 */
public class SerializableChildSerializableTest {
    public static void main(String[] args) {
        // write object

        File f = new File("D://Example/SerializableChildObject.ser");
        SerializableChildObject map=new SerializableChildObject();
        map.setI(11); // parent
        map.setS("SerializableChildObject");
        map.setchildclassinteger(1);
        map.setchildclassstring("childclassstring");


        try {
            FileOutputStream outStream=new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(outStream);
            oos.writeObject(map);
            oos.close();
            outStream.close();
            System.out.println("Serialized  data is saved in D://Example/SerializableChildObject.ser");




        } catch (IOException e) {
            e.printStackTrace();
        }

        // read object
        try {
            FileInputStream outStream = new FileInputStream("D://Example/SerializableChildObject.ser");
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
