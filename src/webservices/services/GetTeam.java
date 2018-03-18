 package webservices.services;
 
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlElement;
 import javax.xml.bind.annotation.XmlType;
 
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="getTeam", propOrder={"codeAcces", "clefClient", "versionService"})

public class GetTeam
{
@XmlElement(name="CodeAcces")
    protected String codeAcces;
@XmlElement(name="ClefClient")
    protected String clefClient;
@XmlElement(name="VersionService")
    protected String versionService;

    public GetTeam()
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
}
