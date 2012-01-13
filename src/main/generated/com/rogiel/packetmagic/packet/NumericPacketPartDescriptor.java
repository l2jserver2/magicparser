//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.05 at 03:22:01 PM BRST 
//


package com.rogiel.packetmagic.packet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumericPacketPartDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumericPacketPartDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.rogiel.com/packetmagic/packet}DataPacketPartDescriptor">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="boolean" type="{http://schemas.rogiel.com/packetmagic/packet}BooleanReaderDescriptor"/>
 *         &lt;element name="color" type="{http://schemas.rogiel.com/packetmagic/packet}ColorReaderDescriptor"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumericPacketPartDescriptor", propOrder = {
    "reader"
})
@XmlSeeAlso({
    BytePacketPartDescriptor.class,
    FloatPacketPartDescriptor.class,
    DoublePacketPartDescriptor.class,
    LongPacketPartDescriptor.class,
    IntegerPacketPartDescriptor.class
})
public abstract class NumericPacketPartDescriptor
    extends DataPacketPartDescriptor
{

    @XmlElements({
        @XmlElement(name = "boolean", type = BooleanReaderDescriptor.class),
        @XmlElement(name = "color", type = ColorReaderDescriptor.class)
    })
    protected ReaderDescriptor reader;

    /**
     * Gets the value of the reader property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanReaderDescriptor }
     *     {@link ColorReaderDescriptor }
     *     
     */
    public ReaderDescriptor getReader() {
        return reader;
    }

    /**
     * Sets the value of the reader property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanReaderDescriptor }
     *     {@link ColorReaderDescriptor }
     *     
     */
    public void setReader(ReaderDescriptor value) {
        this.reader = value;
    }

}
