 package webservices.services;
 
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlElement;
 import javax.xml.bind.annotation.XmlType;
 
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="checkNewResponse", propOrder={"_return"})
 
public class CheckNewResponse
{
@XmlElement(name="return")
    protected boolean _return;

    public CheckNewResponse()
    {
    }

    public boolean isReturn()
    {
        return _return;
    }

    public void setReturn(boolean value)
    {
        _return = value;
    }
}
