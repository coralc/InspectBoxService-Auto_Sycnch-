 package webservices.services;
 
 import java.util.ArrayList;
 import java.util.List;
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlElement;
 import javax.xml.bind.annotation.XmlType;
 
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="getUtilisateursResponse", propOrder={"_return"})
 public class GetUtilisateursResponse
 {
 
   @XmlElement(name="return")
   protected List<Utilisateur> _return;
 
   public List<Utilisateur> getReturn()
   {
     if (this._return == null) {
      this._return = new ArrayList();
     }
    return this._return;
   }
 }

