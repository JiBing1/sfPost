
package com.sf.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>correctedOcrDto complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="correctedOcrDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="confidence" type="{http://action.receiveserver.module.sf.com/}ocrConfidenceDto" minOccurs="0"/>
 *         &lt;element name="correction" type="{http://action.receiveserver.module.sf.com/}ocrCorrectionDto" minOccurs="0"/>
 *         &lt;element name="services" type="{http://action.receiveserver.module.sf.com/}ocrCorrectServiceDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{http://action.receiveserver.module.sf.com/}ocrCorrectTypeDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "correctedOcrDto", propOrder = {
    "confidence",
    "correction",
    "services",
    "type"
})
public class CorrectedOcrDto {

    protected OcrConfidenceDto confidence;
    protected OcrCorrectionDto correction;
    @XmlElement(nillable = true)
    protected List<OcrCorrectServiceDto> services;
    protected OcrCorrectTypeDto type;

    /**
     * 获取confidence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OcrConfidenceDto }
     *     
     */
    public OcrConfidenceDto getConfidence() {
        return confidence;
    }

    /**
     * 设置confidence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OcrConfidenceDto }
     *     
     */
    public void setConfidence(OcrConfidenceDto value) {
        this.confidence = value;
    }

    /**
     * 获取correction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OcrCorrectionDto }
     *     
     */
    public OcrCorrectionDto getCorrection() {
        return correction;
    }

    /**
     * 设置correction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OcrCorrectionDto }
     *     
     */
    public void setCorrection(OcrCorrectionDto value) {
        this.correction = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the services property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OcrCorrectServiceDto }
     * 
     * 
     */
    public List<OcrCorrectServiceDto> getServices() {
        if (services == null) {
            services = new ArrayList<OcrCorrectServiceDto>();
        }
        return this.services;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OcrCorrectTypeDto }
     *     
     */
    public OcrCorrectTypeDto getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OcrCorrectTypeDto }
     *     
     */
    public void setType(OcrCorrectTypeDto value) {
        this.type = value;
    }

}
