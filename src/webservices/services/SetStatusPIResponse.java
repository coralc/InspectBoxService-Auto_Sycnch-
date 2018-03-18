package webservices.services;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="setStatusPIResponse", propOrder={"_return"})

public class SetStatusPIResponse {
	@XmlElement(name="return", required=true)
	   protected List<ReponseStatusPI> _return;
	 
	   public List<ReponseStatusPI> getReturn()
	   {
	     if (this._return == null) {
	       this._return = new ArrayList();
	     }
	    return this._return;
	   }
	 }