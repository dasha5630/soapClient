//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.18 at 06:19:32 PM MSK 
//


package ru.tdv.soapclient.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRObjectValue1C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRObjectValue1C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RObjectValue1C" type="{http://tempuri.org/}RObjectValue1C" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRObjectValue1C", propOrder = {
    "rObjectValue1C"
})
public class ArrayOfRObjectValue1C {

    @XmlElement(name = "RObjectValue1C", nillable = true)
    protected List<RObjectValue1C> rObjectValue1C;

    /**
     * Gets the value of the rObjectValue1C property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rObjectValue1C property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRObjectValue1C().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RObjectValue1C }
     * 
     * 
     */
    public List<RObjectValue1C> getRObjectValue1C() {
        if (rObjectValue1C == null) {
            rObjectValue1C = new ArrayList<RObjectValue1C>();
        }
        return this.rObjectValue1C;
    }

}
