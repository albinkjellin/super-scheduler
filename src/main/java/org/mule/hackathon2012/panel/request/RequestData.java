
package org.mule.hackathon2012.panel.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionDetailType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="universalPanelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="panelLocale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountingItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="reportDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestData", namespace = "http://researchnow.com/schema/panel/finance/extract/v1", propOrder = {
    "transactionType",
    "transactionDetailType",
    "universalPanelId",
    "panelLocale",
    "accountingItemId",
    "startDate",
    "endDate",
    "reportDate"
})
public class RequestData {

    @XmlElement(namespace = "http://researchnow.com/schema/panel/finance/extract/v1")
    protected String transactionType;
    @XmlElement(namespace = "http://researchnow.com/schema/panel/finance/extract/v1")
    protected String transactionDetailType;
    @XmlElement(namespace = "http://researchnow.com/schema/panel/finance/extract/v1")
    protected String universalPanelId;
    @XmlElement(namespace = "http://researchnow.com/schema/panel/finance/extract/v1")
    protected String panelLocale;
    @XmlElement(namespace = "http://researchnow.com/schema/panel/finance/extract/v1")
    protected String accountingItemId;
    @XmlElement(namespace = "http://researchnow.com/schema/panel/finance/extract/v1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(namespace = "http://researchnow.com/schema/panel/finance/extract/v1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(namespace = "http://researchnow.com/schema/panel/finance/extract/v1", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reportDate;

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the transactionDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDetailType() {
        return transactionDetailType;
    }

    /**
     * Sets the value of the transactionDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDetailType(String value) {
        this.transactionDetailType = value;
    }

    /**
     * Gets the value of the universalPanelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalPanelId() {
        return universalPanelId;
    }

    /**
     * Sets the value of the universalPanelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalPanelId(String value) {
        this.universalPanelId = value;
    }

    /**
     * Gets the value of the panelLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanelLocale() {
        return panelLocale;
    }

    /**
     * Sets the value of the panelLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanelLocale(String value) {
        this.panelLocale = value;
    }

    /**
     * Gets the value of the accountingItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingItemId() {
        return accountingItemId;
    }

    /**
     * Sets the value of the accountingItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingItemId(String value) {
        this.accountingItemId = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the reportDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportDate() {
        return reportDate;
    }

    /**
     * Sets the value of the reportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportDate(XMLGregorianCalendar value) {
        this.reportDate = value;
    }

}
