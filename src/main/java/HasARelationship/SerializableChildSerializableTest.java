package HasARelationship;

import java.io.*;


/**
 * If override read object and write object in the child class and save onlky child class objects then onky
 * child class objects will be serialzed and objects of base class will be given null values
 */
public class SerializableChildSerializableTest {
    public static void main(String[] args) {
        // write object

        File f = new File("D://Example/SerializableHasAObject.ser");
        SerializableChildObject map=new SerializableChildObject();
        SerializableBaseObject serializableBaseObject=new SerializableBaseObject();
        serializableBaseObject.setI(11); // parent
        serializableBaseObject.setS("SerializableChildObject");

        map.setchildclassinteger(1);
        map.setchildclassstring("childclassstring");
        map.setSerializableBaseObject(serializableBaseObject);


        try {
            FileOutputStream outStream=new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(outStream);
            oos.writeObject(map);
            oos.close();
            outStream.close();
            System.out.println("Serialized  data is saved in D://Example/SerializableHasAObject.ser");




        } catch (IOException e) {
            e.printStackTrace();
        }

        // read object
        try {
            FileInputStream outStream = new FileInputStream("D://Example/SerializableHasAObject.ser");
            ObjectInputStream ois = new ObjectInputStream(outStream);
            SerializableChildObject o = (SerializableChildObject) ois.readObject();
            System.out.println(o.getchildclassinteger());
            System.out.println(o.getchildclassstring());
            System.out.println(o.getSerializableBaseObject().getI());
            System.out.println(o.getSerializableBaseObject().getS());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
