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
 * <p>Java class for ArrayOfMRuleScheduleDay1C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMRuleScheduleDay1C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MRuleScheduleDay1C" type="{http://tempuri.org/}MRuleScheduleDay1C" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMRuleScheduleDay1C", propOrder = {
    "mRuleScheduleDay1C"
})
public class ArrayOfMRuleScheduleDay1C {

    @XmlElement(name = "MRuleScheduleDay1C", nillable = true)
    protected List<MRuleScheduleDay1C> mRuleScheduleDay1C;

    /**
     * Gets the value of the mRuleScheduleDay1C property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mRuleScheduleDay1C property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMRuleScheduleDay1C().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MRuleScheduleDay1C }
     * 
     * 
     */
    public List<MRuleScheduleDay1C> getMRuleScheduleDay1C() {
        if (mRuleScheduleDay1C == null) {
            mRuleScheduleDay1C = new ArrayList<MRuleScheduleDay1C>();
        }
        return this.mRuleScheduleDay1C;
    }

}