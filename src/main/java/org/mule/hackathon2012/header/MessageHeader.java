
package org.mule.hackathon2012.header;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MessageHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="headerVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceFunctionalArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceInstance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trackingId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originationTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceProgram" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replyUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageHeader", namespace = "http://researchnow.com/schema/icc", propOrder = {
    "headerVersion",
    "serviceFunctionalArea",
    "serviceInstance",
    "messageName",
    "messageVersion",
    "trackingId",
    "originationTimestamp",
    "locale",
    "sourceProgram",
    "endUserId",
    "replyUrl"
})
public class MessageHeader {

    @XmlElement(namespace = "http://researchnow.com/schema/icc", required = true)
    protected String headerVersion;
    @XmlElement(namespace = "http://researchnow.com/schema/icc", required = true)
    protected String serviceFunctionalArea;
    @XmlElement(namespace = "http://researchnow.com/schema/icc")
    protected String serviceInstance;
    @XmlElement(namespace = "http://researchnow.com/schema/icc")
    protected String messageName;
    @XmlElement(namespace = "http://researchnow.com/schema/icc")
    protected String messageVersion;
    @XmlElement(namespace = "http://researchnow.com/schema/icc", required = true)
    protected String trackingId;
    @XmlElement(namespace = "http://researchnow.com/schema/icc", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originationTimestamp;
    @XmlElement(namespace = "http://researchnow.com/schema/icc")
    protected String locale;
    @XmlElement(namespace = "http://researchnow.com/schema/icc", required = true)
    protected String sourceProgram;
    @XmlElement(namespace = "http://researchnow.com/schema/icc")
    protected String endUserId;
    @XmlElement(namespace = "http://researchnow.com/schema/icc")
    protected String replyUrl;

    /**
     * Gets the value of the headerVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderVersion() {
        return headerVersion;
    }

    /**
     * Sets the value of the headerVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderVersion(String value) {
        this.headerVersion = value;
    }

    /**
     * Gets the value of the serviceFunctionalArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFunctionalArea() {
        return serviceFunctionalArea;
    }

    /**
     * Sets the value of the serviceFunctionalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFunctionalArea(String value) {
        this.serviceFunctionalArea = value;
    }

    /**
     * Gets the value of the serviceInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInstance() {
        return serviceInstance;
    }

    /**
     * Sets the value of the serviceInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInstance(String value) {
        this.serviceInstance = value;
    }

    /**
     * Gets the value of the messageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageName() {
        return messageName;
    }

    /**
     * Sets the value of the messageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageName(String value) {
        this.messageName = value;
    }

    /**
     * Gets the value of the messageVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageVersion() {
        return messageVersion;
    }

    /**
     * Sets the value of the messageVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageVersion(String value) {
        this.messageVersion = value;
    }

    /**
     * Gets the value of the trackingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingId() {
        return trackingId;
    }

    /**
     * Sets the value of the trackingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingId(String value) {
        this.trackingId = value;
    }

    /**
     * Gets the value of the originationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginationTimestamp() {
        return originationTimestamp;
    }

    /**
     * Sets the value of the originationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginationTimestamp(XMLGregorianCalendar value) {
        this.originationTimestamp = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the sourceProgram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceProgram() {
        return sourceProgram;
    }

    /**
     * Sets the value of the sourceProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceProgram(String value) {
        this.sourceProgram = value;
    }

    /**
     * Gets the value of the endUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndUserId() {
        return endUserId;
    }

    /**
     * Sets the value of the endUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndUserId(String value) {
        this.endUserId = value;
    }

    /**
     * Gets the value of the replyUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyUrl() {
        return replyUrl;
    }

    /**
     * Sets the value of the replyUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyUrl(String value) {
        this.replyUrl = value;
    }

}
