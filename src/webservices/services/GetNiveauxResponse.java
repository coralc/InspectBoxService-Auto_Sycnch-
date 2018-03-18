 package webservices.services;
 
 import java.util.ArrayList;
 import java.util.List;
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
 
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="getNiveauxResponse", propOrder={"_return"})
 
 public class GetNiveauxResponse
 {
 
   @XmlElement(name="return")
   protected List<Niveau> _return;
 
   public List<Niveau> getReturn()
   {
     if (this._return == null) {
       this._return = new ArrayList();
     }
     return this._return;
   }
 }
