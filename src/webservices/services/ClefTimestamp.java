 package webservices.services;
 
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlType;
 
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="clefTimestamp", propOrder={"nomTable", "timestamp"})


public class ClefTimestamp
{

    protected String nomTable;
    protected String timestamp;

    public ClefTimestamp()
    {
    }

    public String getNomTable()
    {
        return nomTable;
    }

    public void setNomTable(String value)
    {
        nomTable = value;
    }

    public String getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(String value)
    {
        timestamp = value;
    }
}
