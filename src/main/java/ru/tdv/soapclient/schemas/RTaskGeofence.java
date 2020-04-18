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
 * <p>Java class for RTaskGeofence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTaskGeofence"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="ArriveST" type="{http://tempuri.org/}TimeSpan"/&gt;
 *         &lt;element name="ArriveET" type="{http://tempuri.org/}TimeSpan"/&gt;
 *         &lt;element name="DepartureST" type="{http://tempuri.org/}TimeSpan"/&gt;
 *         &lt;element name="DepartureET" type="{http://tempuri.org/}TimeSpan"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTaskGeofence", propOrder = {
    "id",
    "arriveST",
    "arriveET",
    "departureST",
    "departureET"
})
public class RTaskGeofence {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "ArriveST", required = true, nillable = true)
    protected TimeSpan arriveST;
    @XmlElement(name = "ArriveET", required = true, nillable = true)
    protected TimeSpan arriveET;
    @XmlElement(name = "DepartureST", required = true, nillable = true)
    protected TimeSpan departureST;
    @XmlElement(name = "DepartureET", required = true, nillable = true)
    protected TimeSpan departureET;

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
     * Gets the value of the arriveST property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getArriveST() {
        return arriveST;
    }

    /**
     * Sets the value of the arriveST property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setArriveST(TimeSpan value) {
        this.arriveST = value;
    }

    /**
     * Gets the value of the arriveET property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getArriveET() {
        return arriveET;
    }

    /**
     * Sets the value of the arriveET property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setArriveET(TimeSpan value) {
        this.arriveET = value;
    }

    /**
     * Gets the value of the departureST property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getDepartureST() {
        return departureST;
    }

    /**
     * Sets the value of the departureST property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setDepartureST(TimeSpan value) {
        this.departureST = value;
    }

    /**
     * Gets the value of the departureET property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getDepartureET() {
        return departureET;
    }

    /**
     * Sets the value of the departureET property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setDepartureET(TimeSpan value) {
        this.departureET = value;
    }

}
