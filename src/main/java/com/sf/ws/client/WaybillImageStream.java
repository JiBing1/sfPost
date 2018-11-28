
package com.sf.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>waybillImageStream complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcorrectedOcrDto���Ե�ֵ��
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
     * ����correctedOcrDto���Ե�ֵ��
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
     * ��ȡcvsCode���Ե�ֵ��
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
     * ����cvsCode���Ե�ֵ��
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
     * ��ȡdestZoneCode���Ե�ֵ��
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
     * ����destZoneCode���Ե�ֵ��
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
     * ��ȡimageStream���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImageStream() {
        return imageStream;
    }

    /**
     * ����imageStream���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImageStream(byte[] value) {
        this.imageStream = value;
    }

    /**
     * ��ȡlimitTypeCode���Ե�ֵ��
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
     * ����limitTypeCode���Ե�ֵ��
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
     * ��ȡmeterageWeightQty���Ե�ֵ��
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
     * ����meterageWeightQty���Ե�ֵ��
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
     * ��ȡocrFlag���Ե�ֵ��
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
     * ����ocrFlag���Ե�ֵ��
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
     * ��ȡserialNo���Ե�ֵ��
     * 
     */
    public long getSerialNo() {
        return serialNo;
    }

    /**
     * ����serialNo���Ե�ֵ��
     * 
     */
    public void setSerialNo(long value) {
        this.serialNo = value;
    }

    /**
     * ��ȡsubFileName���Ե�ֵ��
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
     * ����subFileName���Ե�ֵ��
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
     * ��ȡsubImageStream���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSubImageStream() {
        return subImageStream;
    }

    /**
     * ����subImageStream���Ե�ֵ��
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
