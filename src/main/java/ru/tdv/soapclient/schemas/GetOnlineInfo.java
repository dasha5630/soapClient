//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.18 at 06:19:32 PM MSK 
//


package ru.tdv.soapclient.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="schemaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviceIDs" type="{http://tempuri.org/}ArrayOfGuid" minOccurs="0"/&gt;
 *         &lt;element name="finalParams" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="mchp" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "finalParams",
    "mchp"
})
@XmlRootElement(name = "GetOnlineInfo")
public class GetOnlineInfo {

    protected String schemaID;
    protected ArrayOfGuid deviceIDs;
    protected ArrayOfString finalParams;
    protected boolean mchp;

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
     * Gets the value of the finalParams property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getFinalParams() {
        return finalParams;
    }

    /**
     * Sets the value of the finalParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setFinalParams(ArrayOfString value) {
        this.finalParams = value;
    }

    /**
     * Gets the value of the mchp property.
     * 
     */
    public boolean isMchp() {
        return mchp;
    }

    /**
     * Sets the value of the mchp property.
     * 
     */
    public void setMchp(boolean value) {
        this.mchp = value;
    }

}