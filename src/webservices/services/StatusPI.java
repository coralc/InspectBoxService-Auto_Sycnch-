package webservices.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name="statuspi", propOrder={"idTag","areaTag", "tagName","tagDescription","tagUnit","value","status","lowLimit","highLimit",
		 "lowBorder", "highBorder", "timestamp","sendTime","clientName" })

public class StatusPI {
	
	protected int idTag;
	protected String areaTag;
	protected String tagName;
	protected String tagDescription;
	protected String tagUnit;
	protected String lowLimit;
	protected String highLimit;
	protected String lowBorder;
	protected String highBorder;
	protected String sendTime;
	protected String clientName;
	protected int status;
	protected String value;
	protected String timestamp;
	
	public int getIdTag() {
		return idTag;
	}
	public void setIdTag(int idTag) {
		this.idTag = idTag;
	}
	public String getAreaTag() {
		return areaTag;
	}
	public void setAreaTag(String areaTag) {
		this.areaTag = areaTag;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getTagDescription() {
		return tagDescription;
	}
	public void setTagDescription(String tagDescription) {
		this.tagDescription = tagDescription;
	}
	public String getTagUnit() {
		return tagUnit;
	}
	public void setTagUnit(String tagUnit) {
		this.tagUnit = tagUnit;
	}
	
	public String getSendTime() {
		return sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getLowLimit() {
		return lowLimit;
	}
	public void setLowLimit(String lowLimit) {
		this.lowLimit = lowLimit;
	}
	public String getHighLimit() {
		return highLimit;
	}
	public void setHighLimit(String highLimit) {
		this.highLimit = highLimit;
	}
	public String getLowBorder() {
		return lowBorder;
	}
	public void setLowBorder(String lowBorder) {
		this.lowBorder = lowBorder;
	}
	public String getHighBorder() {
		return highBorder;
	}
	public void setHighBorder(String highBorder) {
		this.highBorder = highBorder;
	}
	
	
	
	
}