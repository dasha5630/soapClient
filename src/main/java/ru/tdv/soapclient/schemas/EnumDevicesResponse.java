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
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="EnumDevicesResult" type="{http://tempuri.org/}REnumDevices" minOccurs="0"/&gt;
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
    "enumDevicesResult"
})
@XmlRootElement(name = "EnumDevicesResponse")
public class EnumDevicesResponse {

    @XmlElement(name = "EnumDevicesResult")
    protected REnumDevices enumDevicesResult;

    /**
     * Gets the value of the enumDevicesResult property.
     * 
     * @return
     *     possible object is
     *     {@link REnumDevices }
     *     
     */
    public REnumDevices getEnumDevicesResult() {
        return enumDevicesResult;
    }

    /**
     * Sets the value of the enumDevicesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link REnumDevices }
     *     
     */
    public void setEnumDevicesResult(REnumDevices value) {
        this.enumDevicesResult = value;
    }

}
