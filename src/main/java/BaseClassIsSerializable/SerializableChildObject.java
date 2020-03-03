package BaseClassIsSerializable;


public class SerializableChildObject extends SerializableBaseObject  {
     int i=10;
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
