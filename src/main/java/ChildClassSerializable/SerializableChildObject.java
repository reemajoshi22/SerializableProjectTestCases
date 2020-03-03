package ChildClassSerializable;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableChildObject extends  SerializableBaseObject implements Serializable {
     int childclassinteger=10;
    String childclassstring="reema";

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
