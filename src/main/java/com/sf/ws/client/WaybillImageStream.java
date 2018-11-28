
package com.sf.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>waybillImageStream complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="waybillImageStream">
 *   &lt;complexContent>
 *     &lt;extension base="{http://action.receiveserver.module.sf.com/}waybillImage">
 *       &lt;sequence>
 *         &lt;element name="correctedOcrDto" type="{http://action.receiveserver.module.sf.com/}correctedOcrDto" minOccurs="0"/>
 *         &lt;element name="cvsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destZoneCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageStream" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="limitTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterageWeightQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ocrFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="subFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subImageStream" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="subWaybillNo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waybillImageStream", propOrder = {
    "correctedOcrDto",
    "cvsCode",
    "destZoneCode",
    "imageStream",
    "limitTypeCode",
    "meterageWeightQty",
    "ocrFlag",
    "serialNo",
    "subFileName",
    "subImageStream",
    "subWaybillNo"
})
public class WaybillImageStream
    extends WaybillImage
{

    protected CorrectedOcrDto correctedOcrDto;
    protected String cvsCode;
    protected String destZoneCode;
    protected byte[] imageStream;
    protected String limitTypeCode;
    protected Double meterageWeightQty;
    protected Integer ocrFlag;
    protected long serialNo;
    protected String subFileName;
    protected byte[] subImageStream;
    @XmlElement(nillable = true)
    protected List<String> subWaybillNo;

    /**
     * 获取correctedOcrDto属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CorrectedOcrDto }
     *     
     */
    public CorrectedOcrDto getCorrectedOcrDto() {
        return correctedOcrDto;
    }

    /**
     * 设置correctedOcrDto属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectedOcrDto }
     *     
     */
    public void setCorrectedOcrDto(CorrectedOcrDto value) {
        this.correctedOcrDto = value;
    }

    /**
     * 获取cvsCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvsCode() {
        return cvsCode;
    }

    /**
     * 设置cvsCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvsCode(String value) {
        this.cvsCode = value;
    }

    /**
     * 获取destZoneCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestZoneCode() {
        return destZoneCode;
    }

    /**
     * 设置destZoneCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestZoneCode(String value) {
        this.destZoneCode = value;
    }

    /**
     * 获取imageStream属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImageStream() {
        return imageStream;
    }

    /**
     * 设置imageStream属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImageStream(byte[] value) {
        this.imageStream = value;
    }

    /**
     * 获取limitTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitTypeCode() {
        return limitTypeCode;
    }

    /**
     * 设置limitTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitTypeCode(String value) {
        this.limitTypeCode = value;
    }

    /**
     * 获取meterageWeightQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMeterageWeightQty() {
        return meterageWeightQty;
    }

    /**
     * 设置meterageWeightQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMeterageWeightQty(Double value) {
        this.meterageWeightQty = value;
    }

    /**
     * 获取ocrFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOcrFlag() {
        return ocrFlag;
    }

    /**
     * 设置ocrFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOcrFlag(Integer value) {
        this.ocrFlag = value;
    }

    /**
     * 获取serialNo属性的值。
     * 
     */
    public long getSerialNo() {
        return serialNo;
    }

    /**
     * 设置serialNo属性的值。
     * 
     */
    public void setSerialNo(long value) {
        this.serialNo = value;
    }

    /**
     * 获取subFileName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubFileName() {
        return subFileName;
    }

    /**
     * 设置subFileName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubFileName(String value) {
        this.subFileName = value;
    }

    /**
     * 获取subImageStream属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSubImageStream() {
        return subImageStream;
    }

    /**
     * 设置subImageStream属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSubImageStream(byte[] value) {
        this.subImageStream = value;
    }

    /**
     * Gets the value of the subWaybillNo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subWaybillNo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubWaybillNo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubWaybillNo() {
        if (subWaybillNo == null) {
            subWaybillNo = new ArrayList<String>();
        }
        return this.subWaybillNo;
    }

}
