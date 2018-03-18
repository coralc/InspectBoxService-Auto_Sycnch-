 package webservices.services;
 
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
 
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="niveauobjet", propOrder={"codeBarre", "unitmeasure", "idNiveauObjetParent", "idNiveauobjet", "idTypereponse", "libelle", "lowlimit", 
		 "tri", "highlimit", "highborder", "lowborder", "highborderalert","lowborderalert" })
public class Niveauobjet
{

    protected String codeBarre;
   
    protected int idNiveauObjetParent;
    protected int idNiveauobjet;
    protected int idTypereponse;
    protected String libelle;
   
    protected int tri;
    protected String unitmeasure;
    protected Double lowlimit;
    protected Double highlimit;
    protected Double highborder;
    protected Double lowborder;
    protected String highborderalert;
    protected String lowborderalert;
    public Niveauobjet()
    {
    }

    public String getCodeBarre()
    {
        return codeBarre;
    }

    public void setCodeBarre(String value)
    {
        codeBarre = value;
    }

    

    public int getIdNiveauObjetParent()
    {
        return idNiveauObjetParent;
    }

    public void setIdNiveauObjetParent(int value)
    {
        idNiveauObjetParent = value;
    }

    public int getIdNiveauobjet()
    {
        return idNiveauobjet;
    }

    public void setIdNiveauobjet(int value)
    {
        idNiveauobjet = value;
    }

    public int getIdTypereponse()
    {
        return idTypereponse;
    }

    public void setIdTypereponse(int value)
    {
        idTypereponse = value;
    }

    public String getLibelle()
    {
        return libelle;
    }

    public void setLibelle(String value)
    {
        libelle = value;
    }

    

    public int getTri()
    {
        return tri;
    }

    public void setTri(int value)
    {
        tri = value;
    }

	public String getUnitmeasure() {
		return unitmeasure;
	}

	public void setUnitmeasure(String unitmeasure) {
		this.unitmeasure = unitmeasure;
	}



	

	public Double getHighlimit() {
		return highlimit;
	}

	public void setHighlimit(Double highlimit) {
		this.highlimit = highlimit;
	}

	public Double getLowlimit() {
		return lowlimit;
	}

	public void setLowlimit(Double lowlimit) {
		this.lowlimit = lowlimit;
	}

	public Double getHighborder() {
		return highborder;
	}

	public void setHighborder(Double highborder) {
		this.highborder = highborder;
	}

	public Double getLowborder() {
		return lowborder;
	}

	public void setLowborder(Double lowborder) {
		this.lowborder = lowborder;
	}

	public String getHighborderalert() {
		return highborderalert;
	}

	public void setHighborderalert(String highborderalert) {
		this.highborderalert = highborderalert;
	}

	public String getLowborderalert() {
		return lowborderalert;
	}

	public void setLowborderalert(String lowborderalert) {
		this.lowborderalert = lowborderalert;
	}

	
}
