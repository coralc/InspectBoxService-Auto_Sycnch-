package webservices.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="cloture", propOrder={"idNiveau", "dateCloture", "debDateCloture","statutCloture","userCloture","dayCloture"})

public class Cloture {
	
	protected int idNiveau;
	
	protected String dateCloture;
	
	protected int statutCloture;
	protected String debDateCloture;
	protected int userCloture;
	protected int dayCloture;
	public int getIdNiveau() {
		return idNiveau;
	}


	public void setIdNiveau(int idNiveau) {
		this.idNiveau = idNiveau;
	}


	public String getDateCloture() {
		return dateCloture;
	}


	public void setDateCloture(String dateCloture) {
		this.dateCloture = dateCloture;
	}


	public int getStatutCloture() {
		return statutCloture;
	}


	public void setStatutCloture(int statutCloture) {
		this.statutCloture = statutCloture;
	}


	public String getDebDateCloture() {
		return debDateCloture;
	}


	public void setDebDateCloture(String debDateCloture) {
		this.debDateCloture = debDateCloture;
	}


	public int getUserCloture() {
		return userCloture;
	}


	public void setUserCloture(int userCloture) {
		this.userCloture = userCloture;
	}


	public int getDayCloture() {
		return dayCloture;
	}


	public void setDayCloture(int dayCloture) {
		this.dayCloture = dayCloture;
	}


	


	
	
	
}