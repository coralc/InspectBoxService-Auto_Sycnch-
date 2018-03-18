 package webservices.services;
 
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlType;
 
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="team", propOrder={"idteam", "beginHour", "endHour", "dayOfWork", "idUser"})

public class Team
{

    protected int idteam;
    protected String beginHour;
    protected String endHour;
    protected String dayOfWork;
    protected int idUser;

    public Team()
    {
    }

	

	public int getIdteam() {
		return idteam;
	}



	public void setIdteam(int idteam) {
		this.idteam = idteam;
	}



	

	public String getBeginHour() {
		return beginHour;
	}



	public void setBeginHour(String beginHour) {
		this.beginHour = beginHour;
	}



	



	public String getEndHour() {
		return endHour;
	}



	public void setEndHour(String endHour) {
		this.endHour = endHour;
	}



	public String getDayOfWork() {
		return dayOfWork;
	}



	public void setDayOfWork(String dayOfWork) {
		this.dayOfWork = dayOfWork;
	}



	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

   
}
