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
 *         &lt;element name="GetDriverPropertyResult" type="{http://tempuri.org/}ArrayOfRPropertyItem1C" minOccurs="0"/&gt;
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
    "getDriverPropertyResult"
})
@XmlRootElement(name = "GetDriverPropertyResponse")
public class GetDriverPropertyResponse {

    @XmlElement(name = "GetDriverPropertyResult")
    protected ArrayOfRPropertyItem1C getDriverPropertyResult;

    /**
     * Gets the value of the getDriverPropertyResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRPropertyItem1C }
     *     
     */
    public ArrayOfRPropertyItem1C getGetDriverPropertyResult() {
        return getDriverPropertyResult;
    }

    /**
     * Sets the value of the getDriverPropertyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRPropertyItem1C }
     *     
     */
    public void setGetDriverPropertyResult(ArrayOfRPropertyItem1C value) {
        this.getDriverPropertyResult = value;
    }

}
