package webservices.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="reponseStatusPI", propOrder={"idTag", "codeErreur", "commentaire"})

public class ReponseStatusPI {

	 protected int idTag;
	    protected int codeErreur;
	    protected String commentaire;

	    public ReponseStatusPI()
	    {
	    }

		public int getIdTag() {
			return idTag;
		}

		public void setIdTag(int idTag) {
			this.idTag = idTag;
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
