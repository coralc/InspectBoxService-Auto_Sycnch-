 package webservices.services;
 
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlElement;
 import javax.xml.bind.annotation.XmlType;
 
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="inspection", propOrder={"idNiveau", "idNiveauObjet", "idInformation", "idChoix", "reponse","defekt", "dateInformation","dateRemise","pause","limite"})
public class Inspection
{

    protected int idNiveau;
    protected int idNiveauObjet;
    protected String idInformation;
    protected int idChoix;
    protected String reponse;
    protected String dateRemise;
    protected String dateInformation;
protected Boolean defekt;
protected Boolean limite;
protected boolean pause;
    public Inspection()
    {
    }

    public int getIdNiveau()
    {
        return idNiveau;
    }

    public void setIdNiveau(int value)
    {
        idNiveau = value;
    }

    public int getIdNiveauObjet()
    {
        return idNiveauObjet;
    }

    public void setIdNiveauObjet(int value)
    {
        idNiveauObjet = value;
    }

    public String getIdInformation()
    {
        return idInformation;
    }

    public void setIdInformation(String value)
    {
        idInformation = value;
    }

    public int getIdChoix()
    {
        return idChoix;
    }

    public void setIdChoix(int value)
    {
        idChoix = value;
    }

    public String getReponse()
    {
        return reponse;
    }

    public void setReponse(String value)
    {
        reponse = value;
    }

    

    

	

	public String getDateInformation()
    {
        return dateInformation;
    }

    public void setDateInformation(String value)
    {
        dateInformation = value;
    }

	public Boolean getDefekt() {
		return defekt;
	}

	public void setDefekt(Boolean defekt) {
		this.defekt = defekt;
	}

	public boolean isPause() {
		return pause;
	}

	public void setPause(boolean pause) {
		this.pause = pause;
	}

	public Boolean getLimite() {
		return limite;
	}

	public void setLimite(Boolean limite) {
		this.limite = limite;
	}

	public String getDateRemise() {
		return dateRemise;
	}

	public void setDateRemise(String dateRemise) {
		this.dateRemise = dateRemise;
	}
}
