//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.05 at 03:22:01 PM BRST 
//


package com.rogiel.packetmagic.packet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtocolDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtocolDescriptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="codec" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="keyPacket" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="packet">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="client">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded">
 *                             &lt;element name="packet" type="{http://schemas.rogiel.com/packetmagic/packet}PacketDescriptor"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="server">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded">
 *                             &lt;element name="packet" type="{http://schemas.rogiel.com/packetmagic/packet}PacketDescriptor"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="headerLength" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="opcodeLength" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="endianess" default="LITTLE_ENDIAN">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="LITTLE_ENDIAN"/>
 *             &lt;enumeration value="BIG_ENDIAN"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtocolDescriptor", namespace = "http://schemas.rogiel.com/packetmagic/protocol", propOrder = {

})
public class ProtocolDescriptor {

    protected ProtocolDescriptor.Codec codec;
    @XmlElement(required = true)
    protected ProtocolDescriptor.Packet packet;
    @XmlAttribute(name = "port", required = true)
    protected int port;
    @XmlAttribute(name = "endianess")
    protected ProtocolDescriptor.ProtocolByteOrder endianess;

    /**
     * Gets the value of the codec property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolDescriptor.Codec }
     *     
     */
    public ProtocolDescriptor.Codec getCodec() {
        return codec;
    }

    /**
     * Sets the value of the codec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolDescriptor.Codec }
     *     
     */
    public void setCodec(ProtocolDescriptor.Codec value) {
        this.codec = value;
    }

    /**
     * Gets the value of the packet property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolDescriptor.Packet }
     *     
     */
    public ProtocolDescriptor.Packet getPacket() {
        return packet;
    }

    /**
     * Sets the value of the packet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolDescriptor.Packet }
     *     
     */
    public void setPacket(ProtocolDescriptor.Packet value) {
        this.packet = value;
    }

    /**
     * Gets the value of the port property.
     * 
     */
    public int getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     */
    public void setPort(int value) {
        this.port = value;
    }

    /**
     * Gets the value of the endianess property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolDescriptor.ProtocolByteOrder }
     *     
     */
    public ProtocolDescriptor.ProtocolByteOrder getEndianess() {
        if (endianess == null) {
            return ProtocolDescriptor.ProtocolByteOrder.LITTLE_ENDIAN;
        } else {
            return endianess;
        }
    }

    /**
     * Sets the value of the endianess property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolDescriptor.ProtocolByteOrder }
     *     
     */
    public void setEndianess(ProtocolDescriptor.ProtocolByteOrder value) {
        this.endianess = value;
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
     *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="keyPacket" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Codec {

        @XmlAttribute(name = "class")
        protected String clazz;
        @XmlAttribute(name = "keyPacket")
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object keyPacket;

        /**
         * Gets the value of the clazz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClazz() {
            return clazz;
        }

        /**
         * Sets the value of the clazz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClazz(String value) {
            this.clazz = value;
        }

        /**
         * Gets the value of the keyPacket property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getKeyPacket() {
            return keyPacket;
        }

        /**
         * Sets the value of the keyPacket property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setKeyPacket(Object value) {
            this.keyPacket = value;
        }

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
     *       &lt;all>
     *         &lt;element name="client">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded">
     *                   &lt;element name="packet" type="{http://schemas.rogiel.com/packetmagic/packet}PacketDescriptor"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="server">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded">
     *                   &lt;element name="packet" type="{http://schemas.rogiel.com/packetmagic/packet}PacketDescriptor"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="headerLength" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="opcodeLength" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Packet {

        @XmlElement(required = true)
        protected ProtocolDescriptor.Packet.Client client;
        @XmlElement(required = true)
        protected ProtocolDescriptor.Packet.Server server;
        @XmlAttribute(name = "headerLength", required = true)
        protected int headerLength;
        @XmlAttribute(name = "opcodeLength", required = true)
        protected int opcodeLength;

        /**
         * Gets the value of the client property.
         * 
         * @return
         *     possible object is
         *     {@link ProtocolDescriptor.Packet.Client }
         *     
         */
        public ProtocolDescriptor.Packet.Client getClient() {
            return client;
        }

        /**
         * Sets the value of the client property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProtocolDescriptor.Packet.Client }
         *     
         */
        public void setClient(ProtocolDescriptor.Packet.Client value) {
            this.client = value;
        }

        /**
         * Gets the value of the server property.
         * 
         * @return
         *     possible object is
         *     {@link ProtocolDescriptor.Packet.Server }
         *     
         */
        public ProtocolDescriptor.Packet.Server getServer() {
            return server;
        }

        /**
         * Sets the value of the server property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProtocolDescriptor.Packet.Server }
         *     
         */
        public void setServer(ProtocolDescriptor.Packet.Server value) {
            this.server = value;
        }

        /**
         * Gets the value of the headerLength property.
         * 
         */
        public int getHeaderLength() {
            return headerLength;
        }

        /**
         * Sets the value of the headerLength property.
         * 
         */
        public void setHeaderLength(int value) {
            this.headerLength = value;
        }

        /**
         * Gets the value of the opcodeLength property.
         * 
         */
        public int getOpcodeLength() {
            return opcodeLength;
        }

        /**
         * Sets the value of the opcodeLength property.
         * 
         */
        public void setOpcodeLength(int value) {
            this.opcodeLength = value;
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
         *       &lt;sequence maxOccurs="unbounded">
         *         &lt;element name="packet" type="{http://schemas.rogiel.com/packetmagic/packet}PacketDescriptor"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "packet"
        })
        public static class Client {

            @XmlElement(required = true)
            protected List<PacketDescriptor> packet;

            /**
             * Gets the value of the packet property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the packet property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPacket().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PacketDescriptor }
             * 
             * 
             */
            public List<PacketDescriptor> getPacket() {
                if (packet == null) {
                    packet = new ArrayList<PacketDescriptor>();
                }
                return this.packet;
            }

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
         *       &lt;sequence maxOccurs="unbounded">
         *         &lt;element name="packet" type="{http://schemas.rogiel.com/packetmagic/packet}PacketDescriptor"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "packet"
        })
        public static class Server {

            @XmlElement(required = true)
            protected List<PacketDescriptor> packet;

            /**
             * Gets the value of the packet property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the packet property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPacket().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PacketDescriptor }
             * 
             * 
             */
            public List<PacketDescriptor> getPacket() {
                if (packet == null) {
                    packet = new ArrayList<PacketDescriptor>();
                }
                return this.packet;
            }

        }

    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="LITTLE_ENDIAN"/>
     *     &lt;enumeration value="BIG_ENDIAN"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum ProtocolByteOrder {

        LITTLE_ENDIAN,
        BIG_ENDIAN;

        public String value() {
            return name();
        }

        public static ProtocolDescriptor.ProtocolByteOrder fromValue(String v) {
            return valueOf(v);
        }

    }

}
