 package webservices.services;
 
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlElement;
 import javax.xml.bind.annotation.XmlType;
 
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="helloResponse", propOrder={"_return"})


public class HelloResponse
{
@XmlElement(name="return")
    protected String _return;

    public String get_return() {
		return _return;
	}

	public void set_return(String _return) {
		this._return = _return;
	}

	public HelloResponse()
    {
    }

    
}
