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
 * <p>Java class for ArrayOfRTaskInfo1C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRTaskInfo1C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RTaskInfo1C" type="{http://tempuri.org/}RTaskInfo1C" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRTaskInfo1C", propOrder = {
    "rTaskInfo1C"
})
public class ArrayOfRTaskInfo1C {

    @XmlElement(name = "RTaskInfo1C", nillable = true)
    protected List<RTaskInfo1C> rTaskInfo1C;

    /**
     * Gets the value of the rTaskInfo1C property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rTaskInfo1C property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRTaskInfo1C().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RTaskInfo1C }
     * 
     * 
     */
    public List<RTaskInfo1C> getRTaskInfo1C() {
        if (rTaskInfo1C == null) {
            rTaskInfo1C = new ArrayList<RTaskInfo1C>();
        }
        return this.rTaskInfo1C;
    }

}