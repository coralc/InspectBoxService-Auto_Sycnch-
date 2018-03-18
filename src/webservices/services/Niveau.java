 package webservices.services;
 
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlType;
 
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="niveau", propOrder={"codeBarre", "areaTag","idNiveau", "idNiveauParent", "idNiveauobjet", "idTypereponse", "libelle", "tri","level"})
public class Niveau
{
	 protected String areaTag;
    protected String codeBarre;
    protected int idNiveau;
    protected int idNiveauParent;
    protected int idNiveauobjet;
    protected int idTypereponse;
    protected String libelle;
    protected int tri;
    protected int level;
    public Niveau()
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

    public String getAreaTag() {
		return areaTag;
	}

	public void setAreaTag(String areaTag) {
		this.areaTag = areaTag;
	}

	public int getIdNiveau()
    {
        return idNiveau;
    }

    public void setIdNiveau(int value)
    {
        idNiveau = value;
    }

    public int getIdNiveauParent()
    {
        return idNiveauParent;
    }

    public void setIdNiveauParent(int value)
    {
        idNiveauParent = value;
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

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
