 package webservices.services;
 
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlType;
 
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="utilisateur", propOrder={"codeAcces", "idUtilisateur", "motDePasse", "nom", "prenom", "typeUser"})
public class Utilisateur
{

    protected String codeAcces;
    protected int idUtilisateur;
    protected String motDePasse;
    protected String nom;
    protected String prenom;
    protected String typeUser;
    public Utilisateur()
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

    public int getIdUtilisateur()
    {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int value)
    {
        idUtilisateur = value;
    }

    public String getMotDePasse()
    {
        return motDePasse;
    }

    public void setMotDePasse(String value)
    {
        motDePasse = value;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String value)
    {
        nom = value;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String value)
    {
        prenom = value;
    }

	public String getTypeUser() {
		return typeUser;
	}

	public void setTypeUser(String typeUser) {
		this.typeUser = typeUser;
	}
}
