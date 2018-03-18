package webservices.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="statutInac", propOrder={"idNiveau", "dateinacc", "objet","statutValue"})

public class StatutInac {
	
	protected int idNiveau;
	
	protected String dateinacc;
	
	protected Boolean statutValue;
	
	protected int objet;

	public int getIdNiveau() {
		return idNiveau;
	}

	public void setIdNiveau(int idNiveau) {
		this.idNiveau = idNiveau;
	}

	public String getDateinacc() {
		return dateinacc;
	}

	public void setDateinacc(String dateinacc) {
		this.dateinacc = dateinacc;
	}

	public Boolean getStatutValue() {
		return statutValue;
	}

	public void setStatutValue(Boolean statutValue) {
		statutValue = statutValue;
	}

	public int getObjet() {
		return objet;
	}

	public void setObjet(int objet) {
		this.objet = objet;
	}
	

	


	
	
	
}