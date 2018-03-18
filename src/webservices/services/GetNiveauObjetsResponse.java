 package webservices.services;
 
 import java.util.ArrayList;
 import java.util.List;
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlElement;
 import javax.xml.bind.annotation.XmlType;
 
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="getNiveauObjetsResponse", propOrder={"_return"})
 public class GetNiveauObjetsResponse
 {
 
   @XmlElement(name="return")
   protected List<Niveauobjet> _return;
 
   public List<Niveauobjet> getReturn()
   {
     if (this._return == null) {
       this._return = new ArrayList();
     }
    return this._return;
   }
 }

