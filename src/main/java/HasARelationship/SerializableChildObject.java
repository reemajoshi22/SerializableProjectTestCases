package HasARelationship;


import java.io.Serializable;

public class SerializableChildObject implements Serializable {
     int childclassinteger=10;
    String childclassstring="reema";

    /*transient*/ SerializableBaseObject serializableBaseObject; // if this variable is not transient then we cannot
    // serialize the base class even

    // if we make this has object as transient the we are able to save the base class object and will get the
    // null pointer exception while reading the object

    public SerializableBaseObject getSerializableBaseObject() {
        return serializableBaseObject;
    }

    public void setSerializableBaseObject(SerializableBaseObject serializableBaseObject) {
        this.serializableBaseObject = serializableBaseObject;
    }


    public int getchildclassinteger() {
        return childclassinteger;
    }

    public void setchildclassinteger(int childclassinteger) {
        this.childclassinteger = childclassinteger;
    }

    public String getchildclassstring() {
        return childclassstring;
    }

    public void setchildclassstring(String childclassstring) {
        this.childclassstring = childclassstring;
    }

    /*private void writeObject(ObjectOutputStream aOutputStream)
            throws IOException {
        System.out.println("write");
        aOutputStream.writeInt(i);
        aOutputStream.writeObject(s);
    }

      private void readObject(ObjectInputStream aInputStream) throws IOException,
            ClassNotFoundException {
        i = aInputStream.readInt();
        s = (String)aInputStream.readObject();

    }*/

}
