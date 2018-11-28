
package com.sf.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sf.ws.client package. 
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

    private final static QName _WSException_QNAME = new QName("http://action.receiveserver.module.sf.com/", "WSException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sf.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultInfo }
     * 
     */
    public FaultInfo createFaultInfo() {
        return new FaultInfo();
    }

    /**
     * Create an instance of {@link WaybillImage }
     * 
     */
    public WaybillImage createWaybillImage() {
        return new WaybillImage();
    }

    /**
     * Create an instance of {@link CorrectedOcrDto }
     * 
     */
    public CorrectedOcrDto createCorrectedOcrDto() {
        return new CorrectedOcrDto();
    }

    /**
     * Create an instance of {@link WaybillImageStream }
     * 
     */
    public WaybillImageStream createWaybillImageStream() {
        return new WaybillImageStream();
    }

    /**
     * Create an instance of {@link OcrCorrectTypeDto }
     * 
     */
    public OcrCorrectTypeDto createOcrCorrectTypeDto() {
        return new OcrCorrectTypeDto();
    }

    /**
     * Create an instance of {@link OcrCorrectServiceDto }
     * 
     */
    public OcrCorrectServiceDto createOcrCorrectServiceDto() {
        return new OcrCorrectServiceDto();
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link OcrConfidenceDto }
     * 
     */
    public OcrConfidenceDto createOcrConfidenceDto() {
        return new OcrConfidenceDto();
    }

    /**
     * Create an instance of {@link OcrCorrectionDto }
     * 
     */
    public OcrCorrectionDto createOcrCorrectionDto() {
        return new OcrCorrectionDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.receiveserver.module.sf.com/", name = "WSException")
    public JAXBElement<FaultInfo> createWSException(FaultInfo value) {
        return new JAXBElement<FaultInfo>(_WSException_QNAME, FaultInfo.class, null, value);
    }

}
