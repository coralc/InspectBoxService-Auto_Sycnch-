 package webservices.services;
 
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlType;
 
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="choix", propOrder={"idChoix", "idTypereponse", "nonConforme", "tri", "valeur"})

public class Choix
{

    protected int idChoix;
    protected int idTypereponse;
    protected boolean nonConforme;
    protected int tri;
    protected String valeur;

    public Choix()
    {
    }

    public int getIdChoix()
    {
        return idChoix;
    }

    public void setIdChoix(int value)
    {
        idChoix = value;
    }

    public int getIdTypereponse()
    {
        return idTypereponse;
    }

    public void setIdTypereponse(int value)
    {
        idTypereponse = value;
    }

    public boolean isNonConforme()
    {
        return nonConforme;
    }

    public void setNonConforme(boolean value)
    {
        nonConforme = value;
    }

    public int getTri()
    {
        return tri;
    }

    public void setTri(int value)
    {
        tri = value;
    }

    public String getValeur()
    {
        return valeur;
    }

    public void setValeur(String value)
    {
        valeur = value;
    }
}
