package webservices.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="nfc", propOrder={"idNiveau", "nfcTag"})

public class Nfc {
	
	protected int idNiveau;
	
	protected String nfcTag;
	
	
	
	
	public int getIdNiveau() {
		return idNiveau;
	}


	public String getNfcTag() {
		return nfcTag;
	}


	public void setNfcTag(String nfcTag) {
		this.nfcTag = nfcTag;
	}


	public void setIdNiveau(int idNiveau) {
		this.idNiveau = idNiveau;
	}


	


	


	
	
	
	
}