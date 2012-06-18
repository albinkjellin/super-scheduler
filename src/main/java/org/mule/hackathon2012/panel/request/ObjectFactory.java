
package org.mule.hackathon2012.panel.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import org.mule.hackathon2012.header.MessageHeader;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mule.hackathon2012.panel.request package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PanelDataExtractRequest_QNAME = new QName("http://researchnow.com/schema/panel/finance/extract/v1", "PanelDataExtractRequest");
    private final static QName _MessageHeader_QNAME = new QName("http://researchnow.com/schema/icc", "MessageHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mule.hackathon2012.panel.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MessageHeader }
     * 
     */
    public MessageHeader createMessageHeader() {
        return new MessageHeader();
    }

    /**
     * Create an instance of {@link RequestData }
     * 
     */
    public RequestData createRequestData() {
        return new RequestData();
    }

    /**
     * Create an instance of {@link PanelDataExtractRequest.RequestDataList }
     * 
     */
    public PanelDataExtractRequest.RequestDataList createPanelDataExtractRequestRequestDataList() {
        return new PanelDataExtractRequest.RequestDataList();
    }

    /**
     * Create an instance of {@link PanelDataExtractRequest }
     * 
     */
    public PanelDataExtractRequest createPanelDataExtractRequest() {
        return new PanelDataExtractRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PanelDataExtractRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://researchnow.com/schema/panel/finance/extract/v1", name = "PanelDataExtractRequest")
    public JAXBElement<PanelDataExtractRequest> createPanelDataExtractRequest(PanelDataExtractRequest value) {
        return new JAXBElement<PanelDataExtractRequest>(_PanelDataExtractRequest_QNAME, PanelDataExtractRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://researchnow.com/schema/icc", name = "MessageHeader")
    public JAXBElement<MessageHeader> createMessageHeader(MessageHeader value) {
        return new JAXBElement<MessageHeader>(_MessageHeader_QNAME, MessageHeader.class, null, value);
    }

}
