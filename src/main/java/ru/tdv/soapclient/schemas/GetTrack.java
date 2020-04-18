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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="schemaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviceIDs" type="{http://tempuri.org/}ArrayOfGuid" minOccurs="0"/&gt;
 *         &lt;element name="SD" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ED" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="tripSplitterIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "schemaID",
    "deviceIDs",
    "sd",
    "ed",
    "tripSplitterIndex"
})
@XmlRootElement(name = "GetTrack")
public class GetTrack {

    protected String schemaID;
    protected ArrayOfGuid deviceIDs;
    @XmlElement(name = "SD", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sd;
    @XmlElement(name = "ED", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ed;
    protected int tripSplitterIndex;

    /**
     * Gets the value of the schemaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaID() {
        return schemaID;
    }

    /**
     * Sets the value of the schemaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaID(String value) {
        this.schemaID = value;
    }

    /**
     * Gets the value of the deviceIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getDeviceIDs() {
        return deviceIDs;
    }

    /**
     * Sets the value of the deviceIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setDeviceIDs(ArrayOfGuid value) {
        this.deviceIDs = value;
    }

    /**
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSD() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSD(XMLGregorianCalendar value) {
        this.sd = value;
    }

    /**
     * Gets the value of the ed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getED() {
        return ed;
    }

    /**
     * Sets the value of the ed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setED(XMLGregorianCalendar value) {
        this.ed = value;
    }

    /**
     * Gets the value of the tripSplitterIndex property.
     * 
     */
    public int getTripSplitterIndex() {
        return tripSplitterIndex;
    }

    /**
     * Sets the value of the tripSplitterIndex property.
     * 
     */
    public void setTripSplitterIndex(int value) {
        this.tripSplitterIndex = value;
    }

}
