package webservices.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="reponseNfc", propOrder={"idNiveau", "codeErreur", "commentaire"})

public class ReponseNfc {

	 protected int idNiveau;
	    protected int codeErreur;
	    protected String commentaire;

	    public ReponseNfc()
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
