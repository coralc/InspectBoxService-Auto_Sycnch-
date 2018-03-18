 package webservices.services;
 
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


 
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="objeteam", propOrder={"idField", "idTeam", "idObjet", "lun", "mar","mer", "jeu","ven","sam","dim"})

public class Objeteam
{

    protected int idTeam;
    protected int	 idField;
    protected int idObjet;
    
    protected boolean lun;
    protected boolean mar;
    protected boolean mer;
    protected boolean jeu;
    protected boolean ven;
    protected boolean sam;
    protected boolean dim;
	  

    public Objeteam()
    {
    }

	public int getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(int idTeam) {
		this.idTeam = idTeam;
	}

	public int getIdField() {
		return idField;
	}

	public void setIdField(int idField) {
		this.idField = idField;
	}

	public int getIdObjet() {
		return idObjet;
	}

	public void setIdObjet(int idObjet) {
		this.idObjet = idObjet;
	}

	public boolean isLun() {
		return lun;
	}

	public void setLun(boolean lun) {
		this.lun = lun;
	}

	public boolean isMar() {
		return mar;
	}

	public void setMar(boolean mar) {
		this.mar = mar;
	}

	public boolean isMer() {
		return mer;
	}

	public void setMer(boolean mer) {
		this.mer = mer;
	}

	public boolean isJeu() {
		return jeu;
	}

	public void setJeu(boolean jeu) {
		this.jeu = jeu;
	}

	public boolean isVen() {
		return ven;
	}

	public void setVen(boolean ven) {
		this.ven = ven;
	}

	public boolean isSam() {
		return sam;
	}

	public void setSam(boolean sam) {
		this.sam = sam;
	}

	public boolean isDim() {
		return dim;
	}

	public void setDim(boolean dim) {
		this.dim = dim;
	}

	
}
