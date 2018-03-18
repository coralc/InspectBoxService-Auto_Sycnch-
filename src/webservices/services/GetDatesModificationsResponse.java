 package webservices.services;
 
 import java.util.ArrayList;
 import java.util.List;
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
 
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="getDatesModificationsResponse", propOrder={"_return"})


 public class GetDatesModificationsResponse
 {
 
   @XmlElement(name="return")
   protected List<ClefTimestamp> _return;
 
   public List<ClefTimestamp> getReturn()
   {
     if (this._return == null) {
       this._return = new ArrayList();
     }
    return this._return;
   }
 }
