package serializeTransient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableTransientObject implements Serializable {
    transient int i=10; // it will be serialzed if we override readobject and write object method
    String s="reema";

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
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
