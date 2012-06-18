
package org.mule.hackathon2012.panel.request;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PanelDataExtractRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanelDataExtractRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interfaceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RequestDataList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RequestData" type="{http://researchnow.com/schema/panel/finance/extract/v1}RequestData" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanelDataExtractRequest", namespace = "http://researchnow.com/schema/panel/finance/extract/v1", propOrder = {
    "interfaceId",
    "requestDataList"
})
public class PanelDataExtractRequest {

    @XmlElement(namespace = "http://researchnow.com/schema/panel/finance/extract/v1", required = true)
    protected String interfaceId;
    @XmlElement(name = "RequestDataList", namespace = "http://researchnow.com/schema/panel/finance/extract/v1", required = true)
    protected PanelDataExtractRequest.RequestDataList requestDataList;

    /**
     * Gets the value of the interfaceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceId() {
        return interfaceId;
    }

    /**
     * Sets the value of the interfaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceId(String value) {
        this.interfaceId = value;
    }

    /**
     * Gets the value of the requestDataList property.
     * 
     * @return
     *     possible object is
     *     {@link PanelDataExtractRequest.RequestDataList }
     *     
     */
    public PanelDataExtractRequest.RequestDataList getRequestDataList() {
        return requestDataList;
    }

    /**
     * Sets the value of the requestDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PanelDataExtractRequest.RequestDataList }
     *     
     */
    public void setRequestDataList(PanelDataExtractRequest.RequestDataList value) {
        this.requestDataList = value;
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
     *       &lt;sequence>
     *         &lt;element name="RequestData" type="{http://researchnow.com/schema/panel/finance/extract/v1}RequestData" maxOccurs="unbounded"/>
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
        "requestData"
    })
    public static class RequestDataList {

        @XmlElement(name = "RequestData", namespace = "http://researchnow.com/schema/panel/finance/extract/v1", required = true)
        protected List<RequestData> requestData;

        /**
         * Gets the value of the requestData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requestData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequestData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequestData }
         * 
         * 
         */
        public List<RequestData> getRequestData() {
            if (requestData == null) {
                requestData = new ArrayList<RequestData>();
            }
            return this.requestData;
        }

    }

}
