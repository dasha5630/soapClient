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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="Login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IDRoles" type="{http://tempuri.org/}ArrayOfGuid" minOccurs="0"/&gt;
 *         &lt;element name="IDGlobalRoles" type="{http://tempuri.org/}ArrayOfGuid" minOccurs="0"/&gt;
 *         &lt;element name="Mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ICQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Jabber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Skype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telegram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Facebook" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Viber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Whatsapp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Restrictions" type="{http://tempuri.org/}RUserRestriction" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RUser", propOrder = {
    "id",
    "login",
    "state",
    "idRoles",
    "idGlobalRoles",
    "mail",
    "icq",
    "jabber",
    "skype",
    "phone",
    "telegram",
    "facebook",
    "viber",
    "whatsapp",
    "restrictions"
})
public class RUser {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "Login")
    protected String login;
    @XmlElement(name = "State")
    protected boolean state;
    @XmlElement(name = "IDRoles")
    protected ArrayOfGuid idRoles;
    @XmlElement(name = "IDGlobalRoles")
    protected ArrayOfGuid idGlobalRoles;
    @XmlElement(name = "Mail")
    protected String mail;
    @XmlElement(name = "ICQ")
    protected String icq;
    @XmlElement(name = "Jabber")
    protected String jabber;
    @XmlElement(name = "Skype")
    protected String skype;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Telegram")
    protected String telegram;
    @XmlElement(name = "Facebook")
    protected String facebook;
    @XmlElement(name = "Viber")
    protected String viber;
    @XmlElement(name = "Whatsapp")
    protected String whatsapp;
    @XmlElement(name = "Restrictions")
    protected RUserRestriction restrictions;

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
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
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

    /**
     * Gets the value of the idRoles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getIDRoles() {
        return idRoles;
    }

    /**
     * Sets the value of the idRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setIDRoles(ArrayOfGuid value) {
        this.idRoles = value;
    }

    /**
     * Gets the value of the idGlobalRoles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getIDGlobalRoles() {
        return idGlobalRoles;
    }

    /**
     * Sets the value of the idGlobalRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setIDGlobalRoles(ArrayOfGuid value) {
        this.idGlobalRoles = value;
    }

    /**
     * Gets the value of the mail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMail() {
        return mail;
    }

    /**
     * Sets the value of the mail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMail(String value) {
        this.mail = value;
    }

    /**
     * Gets the value of the icq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICQ() {
        return icq;
    }

    /**
     * Sets the value of the icq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICQ(String value) {
        this.icq = value;
    }

    /**
     * Gets the value of the jabber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJabber() {
        return jabber;
    }

    /**
     * Sets the value of the jabber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJabber(String value) {
        this.jabber = value;
    }

    /**
     * Gets the value of the skype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkype() {
        return skype;
    }

    /**
     * Sets the value of the skype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkype(String value) {
        this.skype = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the telegram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelegram() {
        return telegram;
    }

    /**
     * Sets the value of the telegram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelegram(String value) {
        this.telegram = value;
    }

    /**
     * Gets the value of the facebook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * Sets the value of the facebook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacebook(String value) {
        this.facebook = value;
    }

    /**
     * Gets the value of the viber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViber() {
        return viber;
    }

    /**
     * Sets the value of the viber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViber(String value) {
        this.viber = value;
    }

    /**
     * Gets the value of the whatsapp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhatsapp() {
        return whatsapp;
    }

    /**
     * Sets the value of the whatsapp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhatsapp(String value) {
        this.whatsapp = value;
    }

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link RUserRestriction }
     *     
     */
    public RUserRestriction getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RUserRestriction }
     *     
     */
    public void setRestrictions(RUserRestriction value) {
        this.restrictions = value;
    }

}