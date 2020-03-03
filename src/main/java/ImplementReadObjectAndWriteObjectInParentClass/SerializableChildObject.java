package ImplementReadObjectAndWriteObjectInParentClass;


import java.io.Serializable;

public class SerializableChildObject extends SerializableBaseObject implements Serializable {
    int childclassinteger = 10;
    String childclassstring = "reema";

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
}