 package webservices.services;
 
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlType;
 
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="typereponse", propOrder={"idTypeReponse", "libelle", "modeReponse" })
public class Typereponse
{

    protected int idTypeReponse;
    protected String libelle;
    protected String modeReponse;
    
    public Typereponse()
    {
    }

    public int getIdTypeReponse()
    {
        return idTypeReponse;
    }

    public void setIdTypeReponse(int value)
    {
        idTypeReponse = value;
    }

    public String getLibelle()
    {
        return libelle;
    }

    public void setLibelle(String value)
    {
        libelle = value;
    }

    public String getModeReponse()
    {
        return modeReponse;
    }

    public void setModeReponse(String value)
    {
        modeReponse = value;
    }

	

	
}
