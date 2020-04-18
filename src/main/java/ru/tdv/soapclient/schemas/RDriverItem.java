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
 * <p>Java class for RDriverItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RDriverItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}RGroupItem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DriverID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Properties" type="{http://tempuri.org/}ArrayOfRProperty" minOccurs="0"/&gt;
 *         &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RDriverItem", propOrder = {
    "driverID",
    "properties",
    "image"
})
public class RDriverItem
    extends RGroupItem
{

    @XmlElement(name = "DriverID")
    protected String driverID;
    @XmlElement(name = "Properties")
    protected ArrayOfRProperty properties;
    @XmlElement(name = "Image")
    protected String image;

    /**
     * Gets the value of the driverID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverID() {
        return driverID;
    }

    /**
     * Sets the value of the driverID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverID(String value) {
        this.driverID = value;
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

}