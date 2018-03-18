 package webservices.services;
 
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlType;
 
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="reponseInspection", propOrder={"idInformation", "codeErreur", "commentaire"})
public class ReponseInspection
{

    protected String idInformation;
    protected int codeErreur;
    protected String commentaire;

    public ReponseInspection()
    {
    }

    public String getIdInformation()
    {
        return idInformation;
    }

    public void setIdInformation(String value)
    {
        idInformation = value;
    }

    public int getCodeErreur()
    {
        return codeErreur;
    }

    public void setCodeErreur(int value)
    {
        codeErreur = value;
    }

    public String getCommentaire()
    {
        return commentaire;
    }

    public void setCommentaire(String value)
    {
        commentaire = value;
    }
}
