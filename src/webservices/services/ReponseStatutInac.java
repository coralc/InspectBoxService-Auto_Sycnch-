package webservices.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="reponseStatutInac", propOrder={"idNiveau", "codeErreur", "commentaire"})

public class ReponseStatutInac {

	 protected int idNiveau;
	    protected int codeErreur;
	    protected String commentaire;

	    public ReponseStatutInac()
	    {
	    }

	    

	    public int getIdNiveau() {
			return idNiveau;
		}



		public void setIdNiveau(int idNiveau) {
			this.idNiveau = idNiveau;
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
