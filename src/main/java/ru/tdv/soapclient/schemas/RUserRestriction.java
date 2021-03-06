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
 * <p>Java class for RUserRestriction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RUserRestriction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowedCars" type="{http://tempuri.org/}ArrayOfGuid" minOccurs="0"/&gt;
 *         &lt;element name="AllowedCarGroups" type="{http://tempuri.org/}ArrayOfGuid" minOccurs="0"/&gt;
 *         &lt;element name="EnabledFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EnabledTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CanViewFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CanViewTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RUserRestriction", propOrder = {
    "allowedCars",
    "allowedCarGroups",
    "enabledFrom",
    "enabledTo",
    "canViewFrom",
    "canViewTo"
})
public class RUserRestriction {

    @XmlElement(name = "AllowedCars")
    protected ArrayOfGuid allowedCars;
    @XmlElement(name = "AllowedCarGroups")
    protected ArrayOfGuid allowedCarGroups;
    @XmlElement(name = "EnabledFrom", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enabledFrom;
    @XmlElement(name = "EnabledTo", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enabledTo;
    @XmlElement(name = "CanViewFrom", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar canViewFrom;
    @XmlElement(name = "CanViewTo", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar canViewTo;

    /**
     * Gets the value of the allowedCars property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getAllowedCars() {
        return allowedCars;
    }

    /**
     * Sets the value of the allowedCars property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setAllowedCars(ArrayOfGuid value) {
        this.allowedCars = value;
    }

    /**
     * Gets the value of the allowedCarGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getAllowedCarGroups() {
        return allowedCarGroups;
    }

    /**
     * Sets the value of the allowedCarGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setAllowedCarGroups(ArrayOfGuid value) {
        this.allowedCarGroups = value;
    }

    /**
     * Gets the value of the enabledFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnabledFrom() {
        return enabledFrom;
    }

    /**
     * Sets the value of the enabledFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnabledFrom(XMLGregorianCalendar value) {
        this.enabledFrom = value;
    }

    /**
     * Gets the value of the enabledTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnabledTo() {
        return enabledTo;
    }

    /**
     * Sets the value of the enabledTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnabledTo(XMLGregorianCalendar value) {
        this.enabledTo = value;
    }

    /**
     * Gets the value of the canViewFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCanViewFrom() {
        return canViewFrom;
    }

    /**
     * Sets the value of the canViewFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCanViewFrom(XMLGregorianCalendar value) {
        this.canViewFrom = value;
    }

    /**
     * Gets the value of the canViewTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCanViewTo() {
        return canViewTo;
    }

    /**
     * Sets the value of the canViewTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCanViewTo(XMLGregorianCalendar value) {
        this.canViewTo = value;
    }

}
