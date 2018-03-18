 package webservices.services;
 
 import java.util.ArrayList;
 import java.util.List;
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
 
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="getTeamResponse", propOrder={"_return"})


 public class GetTeamResponse
 {
 
   @XmlElement(name="return")
   protected List<Team> _return;
 
   public List<Team> getReturn()
   {
    if (this._return == null) {
      this._return = new ArrayList();
     }
     return this._return;
   }
 }
