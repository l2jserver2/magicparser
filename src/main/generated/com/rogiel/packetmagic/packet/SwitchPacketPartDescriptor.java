//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.05 at 03:22:01 PM BRST 
//


package com.rogiel.packetmagic.packet;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwitchPacketPartDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwitchPacketPartDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.rogiel.com/packetmagic/packet}ReferencedPacketPartDescriptor">
 *       &lt;sequence>
 *         &lt;element name="case" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{http://schemas.rogiel.com/packetmagic/packet}parts" maxOccurs="unbounded"/>
 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchPacketPartDescriptor", propOrder = {
    "switchCases"
})
public class SwitchPacketPartDescriptor
    extends ReferencedPacketPartDescriptor
{

    @XmlElement(name = "case", required = true)
    protected List<SwitchPacketPartDescriptor.Case> switchCases;

    /**
     * Gets the value of the switchCases property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the switchCases property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwitchCases().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchPacketPartDescriptor.Case }
     * 
     * 
     */
    public List<SwitchPacketPartDescriptor.Case> getSwitchCases() {
        if (switchCases == null) {
            switchCases = new ArrayList<SwitchPacketPartDescriptor.Case>();
        }
        return this.switchCases;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;group ref="{http://schemas.rogiel.com/packetmagic/packet}parts" maxOccurs="unbounded"/>
     *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "parts"
    })
    public static class Case {

        @XmlElements({
            @XmlElement(name = "string", type = StringPacketPartDescriptor.class),
            @XmlElement(name = "bytes", type = ByteArrayPacketPartDescriptor.class),
            @XmlElement(name = "byte", type = BytePacketPartDescriptor.class),
            @XmlElement(name = "integer", type = IntegerPacketPartDescriptor.class),
            @XmlElement(name = "long", type = LongPacketPartDescriptor.class),
            @XmlElement(name = "double", type = DoublePacketPartDescriptor.class),
            @XmlElement(name = "float", type = FloatPacketPartDescriptor.class),
            @XmlElement(name = "for", type = ForPacketPartDescriptor.class),
            @XmlElement(name = "switch", type = SwitchPacketPartDescriptor.class)
        })
        protected List<PacketPartDescriptor> parts;
        @XmlAttribute(name = "value")
        protected BigInteger value;

        /**
         * Gets the value of the parts property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parts property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParts().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StringPacketPartDescriptor }
         * {@link ByteArrayPacketPartDescriptor }
         * {@link BytePacketPartDescriptor }
         * {@link IntegerPacketPartDescriptor }
         * {@link LongPacketPartDescriptor }
         * {@link DoublePacketPartDescriptor }
         * {@link FloatPacketPartDescriptor }
         * {@link ForPacketPartDescriptor }
         * {@link SwitchPacketPartDescriptor }
         * 
         * 
         */
        public List<PacketPartDescriptor> getParts() {
            if (parts == null) {
                parts = new ArrayList<PacketPartDescriptor>();
            }
            return this.parts;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

    }

}
