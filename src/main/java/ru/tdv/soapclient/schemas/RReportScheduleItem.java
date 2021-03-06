//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.18 at 06:19:32 PM MSK 
//


package ru.tdv.soapclient.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RReportScheduleItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RReportScheduleItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="Reports" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="SplitToTrips" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PeriodType" type="{http://tempuri.org/}RSchedulePeriodType"/&gt;
 *         &lt;element name="From" type="{http://tempuri.org/}TimeSpan"/&gt;
 *         &lt;element name="To" type="{http://tempuri.org/}TimeSpan"/&gt;
 *         &lt;element name="OutFormat" type="{http://tempuri.org/}RScheduleOutFormat"/&gt;
 *         &lt;element name="PackToZip" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PackToZipPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TargetUsers" type="{http://tempuri.org/}ArrayOfGuid" minOccurs="0"/&gt;
 *         &lt;element name="TargetMails" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="SaveToDB" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ValidUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="MailSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RReportScheduleItem", propOrder = {
    "id",
    "reports",
    "splitToTrips",
    "periodType",
    "from",
    "to",
    "outFormat",
    "packToZip",
    "packToZipPassword",
    "startFrom",
    "targetUsers",
    "targetMails",
    "saveToDB",
    "validUntil",
    "mailSubject",
    "state"
})
public class RReportScheduleItem {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "Reports")
    protected ArrayOfString reports;
    @XmlElement(name = "SplitToTrips")
    protected boolean splitToTrips;
    @XmlElement(name = "PeriodType", required = true)
    @XmlSchemaType(name = "string")
    protected RSchedulePeriodType periodType;
    @XmlElement(name = "From", required = true)
    protected TimeSpan from;
    @XmlElement(name = "To", required = true)
    protected TimeSpan to;
    @XmlElement(name = "OutFormat", required = true)
    @XmlSchemaType(name = "string")
    protected RScheduleOutFormat outFormat;
    @XmlElement(name = "PackToZip")
    protected boolean packToZip;
    @XmlElement(name = "PackToZipPassword")
    protected String packToZipPassword;
    @XmlElement(name = "StartFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startFrom;
    @XmlElement(name = "TargetUsers")
    protected ArrayOfGuid targetUsers;
    @XmlElement(name = "TargetMails")
    protected ArrayOfString targetMails;
    @XmlElement(name = "SaveToDB")
    protected boolean saveToDB;
    @XmlElement(name = "ValidUntil", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validUntil;
    @XmlElement(name = "MailSubject")
    protected String mailSubject;
    @XmlElement(name = "State")
    protected boolean state;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the reports property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getReports() {
        return reports;
    }

    /**
     * Sets the value of the reports property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setReports(ArrayOfString value) {
        this.reports = value;
    }

    /**
     * Gets the value of the splitToTrips property.
     * 
     */
    public boolean isSplitToTrips() {
        return splitToTrips;
    }

    /**
     * Sets the value of the splitToTrips property.
     * 
     */
    public void setSplitToTrips(boolean value) {
        this.splitToTrips = value;
    }

    /**
     * Gets the value of the periodType property.
     * 
     * @return
     *     possible object is
     *     {@link RSchedulePeriodType }
     *     
     */
    public RSchedulePeriodType getPeriodType() {
        return periodType;
    }

    /**
     * Sets the value of the periodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSchedulePeriodType }
     *     
     */
    public void setPeriodType(RSchedulePeriodType value) {
        this.periodType = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setFrom(TimeSpan value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setTo(TimeSpan value) {
        this.to = value;
    }

    /**
     * Gets the value of the outFormat property.
     * 
     * @return
     *     possible object is
     *     {@link RScheduleOutFormat }
     *     
     */
    public RScheduleOutFormat getOutFormat() {
        return outFormat;
    }

    /**
     * Sets the value of the outFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link RScheduleOutFormat }
     *     
     */
    public void setOutFormat(RScheduleOutFormat value) {
        this.outFormat = value;
    }

    /**
     * Gets the value of the packToZip property.
     * 
     */
    public boolean isPackToZip() {
        return packToZip;
    }

    /**
     * Sets the value of the packToZip property.
     * 
     */
    public void setPackToZip(boolean value) {
        this.packToZip = value;
    }

    /**
     * Gets the value of the packToZipPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackToZipPassword() {
        return packToZipPassword;
    }

    /**
     * Sets the value of the packToZipPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackToZipPassword(String value) {
        this.packToZipPassword = value;
    }

    /**
     * Gets the value of the startFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartFrom() {
        return startFrom;
    }

    /**
     * Sets the value of the startFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartFrom(XMLGregorianCalendar value) {
        this.startFrom = value;
    }

    /**
     * Gets the value of the targetUsers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getTargetUsers() {
        return targetUsers;
    }

    /**
     * Sets the value of the targetUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setTargetUsers(ArrayOfGuid value) {
        this.targetUsers = value;
    }

    /**
     * Gets the value of the targetMails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getTargetMails() {
        return targetMails;
    }

    /**
     * Sets the value of the targetMails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setTargetMails(ArrayOfString value) {
        this.targetMails = value;
    }

    /**
     * Gets the value of the saveToDB property.
     * 
     */
    public boolean isSaveToDB() {
        return saveToDB;
    }

    /**
     * Sets the value of the saveToDB property.
     * 
     */
    public void setSaveToDB(boolean value) {
        this.saveToDB = value;
    }

    /**
     * Gets the value of the validUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidUntil() {
        return validUntil;
    }

    /**
     * Sets the value of the validUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidUntil(XMLGregorianCalendar value) {
        this.validUntil = value;
    }

    /**
     * Gets the value of the mailSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailSubject() {
        return mailSubject;
    }

    /**
     * Sets the value of the mailSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailSubject(String value) {
        this.mailSubject = value;
    }

    /**
     * Gets the value of the state property.
     * 
     */
    public boolean isState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     */
    public void setState(boolean value) {
        this.state = value;
    }

}
