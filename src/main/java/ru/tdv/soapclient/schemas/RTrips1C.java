//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.18 at 06:19:32 PM MSK 
//


package ru.tdv.soapclient.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RTrips1C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTrips1C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_LastCoords" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="_LastData" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ID" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Serial" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="VRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Trips" type="{http://tempuri.org/}ArrayOfRTrip1C" minOccurs="0"/&gt;
 *         &lt;element name="Total" type="{http://tempuri.org/}ArrayOfRObjectValue1C" minOccurs="0"/&gt;
 *         &lt;element name="LastPosition" type="{http://tempuri.org/}RPoint" minOccurs="0"/&gt;
 *         &lt;element name="LastCoords" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTrips1C", propOrder = {
    "content"
})
public class RTrips1C {

    @XmlElementRefs({
        @XmlElementRef(name = "_LastCoords", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "_LastData", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ID", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Name", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Serial", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VRN", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Trips", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Total", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LastPosition", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LastCoords", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LastData", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "LastCoords" is used by two different parts of a schema. See: 
     * line 1713 of file:/C:/Users/fgh/IdeaProjects/SoapClient/src/main/resources/wsdl/service.wsdl
     * line 1704 of file:/C:/Users/fgh/IdeaProjects/SoapClient/src/main/resources/wsdl/service.wsdl
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrayOfRTrip1C }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrayOfRObjectValue1C }{@code >}
     * {@link JAXBElement }{@code <}{@link RPoint }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
