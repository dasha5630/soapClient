//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.18 at 06:19:32 PM MSK 
//


package ru.tdv.soapclient.schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RTareTableApproximation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RTareTableApproximation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Linear"/&gt;
 *     &lt;enumeration value="Polynomial"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RTareTableApproximation")
@XmlEnum
public enum RTareTableApproximation {

    @XmlEnumValue("Linear")
    LINEAR("Linear"),
    @XmlEnumValue("Polynomial")
    POLYNOMIAL("Polynomial");
    private final String value;

    RTareTableApproximation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RTareTableApproximation fromValue(String v) {
        for (RTareTableApproximation c: RTareTableApproximation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
