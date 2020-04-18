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
 * <p>Java class for RDeviceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RDeviceItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}RGroupItem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Serial" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Allowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Properties" type="{http://tempuri.org/}ArrayOfRProperty" minOccurs="0"/&gt;
 *         &lt;element name="FixedLocation" type="{http://tempuri.org/}RPoint" minOccurs="0"/&gt;
 *         &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImageColored" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TripSplitters" type="{http://tempuri.org/}ArrayOfRTripSplitter" minOccurs="0"/&gt;
 *         &lt;element name="IsAreaEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RDeviceItem", propOrder = {
    "serial",
    "allowed",
    "properties",
    "fixedLocation",
    "image",
    "imageColored",
    "tripSplitters",
    "isAreaEnabled"
})
public class RDeviceItem
    extends RGroupItem
{

    @XmlElement(name = "Serial")
    protected int serial;
    @XmlElement(name = "Allowed")
    protected boolean allowed;
    @XmlElement(name = "Properties")
    protected ArrayOfRProperty properties;
    @XmlElement(name = "FixedLocation")
    protected RPoint fixedLocation;
    @XmlElement(name = "Image")
    protected String image;
    @XmlElement(name = "ImageColored")
    protected String imageColored;
    @XmlElement(name = "TripSplitters")
    protected ArrayOfRTripSplitter tripSplitters;
    @XmlElement(name = "IsAreaEnabled")
    protected boolean isAreaEnabled;

    /**
     * Gets the value of the serial property.
     * 
     */
    public int getSerial() {
        return serial;
    }

    /**
     * Sets the value of the serial property.
     * 
     */
    public void setSerial(int value) {
        this.serial = value;
    }

    /**
     * Gets the value of the allowed property.
     * 
     */
    public boolean isAllowed() {
        return allowed;
    }

    /**
     * Sets the value of the allowed property.
     * 
     */
    public void setAllowed(boolean value) {
        this.allowed = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRProperty }
     *     
     */
    public ArrayOfRProperty getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRProperty }
     *     
     */
    public void setProperties(ArrayOfRProperty value) {
        this.properties = value;
    }

    /**
     * Gets the value of the fixedLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RPoint }
     *     
     */
    public RPoint getFixedLocation() {
        return fixedLocation;
    }

    /**
     * Sets the value of the fixedLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RPoint }
     *     
     */
    public void setFixedLocation(RPoint value) {
        this.fixedLocation = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Gets the value of the imageColored property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageColored() {
        return imageColored;
    }

    /**
     * Sets the value of the imageColored property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageColored(String value) {
        this.imageColored = value;
    }

    /**
     * Gets the value of the tripSplitters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRTripSplitter }
     *     
     */
    public ArrayOfRTripSplitter getTripSplitters() {
        return tripSplitters;
    }

    /**
     * Sets the value of the tripSplitters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRTripSplitter }
     *     
     */
    public void setTripSplitters(ArrayOfRTripSplitter value) {
        this.tripSplitters = value;
    }

    /**
     * Gets the value of the isAreaEnabled property.
     * 
     */
    public boolean isIsAreaEnabled() {
        return isAreaEnabled;
    }

    /**
     * Sets the value of the isAreaEnabled property.
     * 
     */
    public void setIsAreaEnabled(boolean value) {
        this.isAreaEnabled = value;
    }

}
