 package webservices.services;
 
 import java.util.ArrayList;
 import java.util.List;
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
 
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="setInspections", propOrder={"codeAcces", "clefClient", "versionService", "idTerminal", "idUtilisateur", "inspection"})
public class SetInspections
{
@XmlElement(name="CodeAcces")
    protected String codeAcces;
@XmlElement(name="ClefClient")
    protected String clefClient;
@XmlElement(name="VersionService")
    protected String versionService;
@XmlElement(name="IdTerminal")
    protected String idTerminal;
@XmlElement(name="IdUtilisateur")
    protected int idUtilisateur;
@XmlElement(name="Inspection", required=true)
    protected List<Inspection> inspection;

    public SetInspections()
    {
    }

    public String getCodeAcces()
    {
        return codeAcces;
    }

    public void setCodeAcces(String value)
    {
        codeAcces = value;
    }

    public String getClefClient()
    {
        return clefClient;
    }

    public void setClefClient(String value)
    {
        clefClient = value;
    }

    public String getVersionService()
    {
        return versionService;
    }

    public void setVersionService(String value)
    {
        versionService = value;
    }

    public String getIdTerminal()
    {
        return idTerminal;
    }

    public void setIdTerminal(String value)
    {
        idTerminal = value;
    }

    public int getIdUtilisateur()
    {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int value)
    {
        idUtilisateur = value;
    }

   public List<Inspection> getInspection()
   {
     if (this.inspection == null) {
       this.inspection = new ArrayList();
     }
    return this.inspection;
   }
 }