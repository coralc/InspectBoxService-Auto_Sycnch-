 package webservices.services;
 
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlType;
 
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="libelleniveau", propOrder={"idLibelleNiveau", "libelle", "num", "typeNiveau"})
public class Libelleniveau
{

    protected int idLibelleNiveau;
    protected String libelle;
    protected int num;
    protected int typeNiveau;

    public Libelleniveau()
    {
    }

    public int getIdLibelleNiveau()
    {
        return idLibelleNiveau;
    }

    public void setIdLibelleNiveau(int value)
    {
        idLibelleNiveau = value;
    }

    public String getLibelle()
    {
        return libelle;
    }

    public void setLibelle(String value)
    {
        libelle = value;
    }

    public int getNum()
    {
        return num;
    }

    public void setNum(int value)
    {
        num = value;
    }

    public int getTypeNiveau()
    {
        return typeNiveau;
    }

    public void setTypeNiveau(int value)
    {
        typeNiveau = value;
    }
}
