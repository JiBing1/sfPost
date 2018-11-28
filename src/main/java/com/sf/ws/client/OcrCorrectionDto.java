
package com.sf.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ocrCorrectionDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ocrCorrectionDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addresseeAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addresseeCompName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addresseeContName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addresseeMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addresseePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billHigh" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="billLong" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="billWidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cargoTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consigneeEmpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consignorAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consignorCompName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consignorContName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consignorMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consignorPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correctTm" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createTm" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customerAcctCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destZoneCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expressTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gatherZoneCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limitTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterageWeightQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="modelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ocrDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="oneselfPickupFlg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="otherFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="paymentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="realWeightQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="selfSendFlg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="services" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settlementTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="transportFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waybillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waybillRemk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ocrCorrectionDto", propOrder = {
    "addresseeAddr",
    "addresseeCompName",
    "addresseeContName",
    "addresseeMobile",
    "addresseePhone",
    "billHigh",
    "billLong",
    "billWidth",
    "cargoTypeCode",
    "colorCode",
    "consName",
    "consQty",
    "consValue",
    "consigneeEmpCode",
    "consignorAddr",
    "consignorCompName",
    "consignorContName",
    "consignorMobile",
    "consignorPhone",
    "correctTm",
    "createTm",
    "customerAcctCode",
    "destZoneCode",
    "expressTypeCode",
    "gatherZoneCode",
    "imageId",
    "imageType",
    "limitTypeCode",
    "meterageWeightQty",
    "modelType",
    "ocrDate",
    "oneselfPickupFlg",
    "otherFee",
    "paymentTypeCode",
    "quantity",
    "realWeightQty",
    "selfSendFlg",
    "services",
    "settlementTypeCode",
    "totalFee",
    "transportFee",
    "version",
    "waybillNo",
    "waybillRemk"
})
public class OcrCorrectionDto {

    protected String addresseeAddr;
    protected String addresseeCompName;
    protected String addresseeContName;
    protected String addresseeMobile;
    protected String addresseePhone;
    protected Double billHigh;
    protected Double billLong;
    protected Double billWidth;
    protected String cargoTypeCode;
    protected String colorCode;
    protected String consName;
    protected String consQty;
    protected Double consValue;
    protected String consigneeEmpCode;
    protected String consignorAddr;
    protected String consignorCompName;
    protected String consignorContName;
    protected String consignorMobile;
    protected String consignorPhone;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar correctTm;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTm;
    protected String customerAcctCode;
    protected String destZoneCode;
    protected String expressTypeCode;
    protected String gatherZoneCode;
    protected String imageId;
    protected String imageType;
    protected String limitTypeCode;
    protected Double meterageWeightQty;
    protected String modelType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ocrDate;
    protected Integer oneselfPickupFlg;
    protected Double otherFee;
    protected String paymentTypeCode;
    protected Double quantity;
    protected Double realWeightQty;
    protected Integer selfSendFlg;
    protected String services;
    protected String settlementTypeCode;
    protected Double totalFee;
    protected Double transportFee;
    protected String version;
    protected String waybillNo;
    protected String waybillRemk;

    /**
     * ��ȡaddresseeAddr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresseeAddr() {
        return addresseeAddr;
    }

    /**
     * ����addresseeAddr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresseeAddr(String value) {
        this.addresseeAddr = value;
    }

    /**
     * ��ȡaddresseeCompName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresseeCompName() {
        return addresseeCompName;
    }

    /**
     * ����addresseeCompName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresseeCompName(String value) {
        this.addresseeCompName = value;
    }

    /**
     * ��ȡaddresseeContName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresseeContName() {
        return addresseeContName;
    }

    /**
     * ����addresseeContName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresseeContName(String value) {
        this.addresseeContName = value;
    }

    /**
     * ��ȡaddresseeMobile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresseeMobile() {
        return addresseeMobile;
    }

    /**
     * ����addresseeMobile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresseeMobile(String value) {
        this.addresseeMobile = value;
    }

    /**
     * ��ȡaddresseePhone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresseePhone() {
        return addresseePhone;
    }

    /**
     * ����addresseePhone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresseePhone(String value) {
        this.addresseePhone = value;
    }

    /**
     * ��ȡbillHigh���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBillHigh() {
        return billHigh;
    }

    /**
     * ����billHigh���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBillHigh(Double value) {
        this.billHigh = value;
    }

    /**
     * ��ȡbillLong���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBillLong() {
        return billLong;
    }

    /**
     * ����billLong���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBillLong(Double value) {
        this.billLong = value;
    }

    /**
     * ��ȡbillWidth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBillWidth() {
        return billWidth;
    }

    /**
     * ����billWidth���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBillWidth(Double value) {
        this.billWidth = value;
    }

    /**
     * ��ȡcargoTypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoTypeCode() {
        return cargoTypeCode;
    }

    /**
     * ����cargoTypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoTypeCode(String value) {
        this.cargoTypeCode = value;
    }

    /**
     * ��ȡcolorCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorCode() {
        return colorCode;
    }

    /**
     * ����colorCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorCode(String value) {
        this.colorCode = value;
    }

    /**
     * ��ȡconsName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsName() {
        return consName;
    }

    /**
     * ����consName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsName(String value) {
        this.consName = value;
    }

    /**
     * ��ȡconsQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsQty() {
        return consQty;
    }

    /**
     * ����consQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsQty(String value) {
        this.consQty = value;
    }

    /**
     * ��ȡconsValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsValue() {
        return consValue;
    }

    /**
     * ����consValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsValue(Double value) {
        this.consValue = value;
    }

    /**
     * ��ȡconsigneeEmpCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeEmpCode() {
        return consigneeEmpCode;
    }

    /**
     * ����consigneeEmpCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeEmpCode(String value) {
        this.consigneeEmpCode = value;
    }

    /**
     * ��ȡconsignorAddr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignorAddr() {
        return consignorAddr;
    }

    /**
     * ����consignorAddr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignorAddr(String value) {
        this.consignorAddr = value;
    }

    /**
     * ��ȡconsignorCompName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignorCompName() {
        return consignorCompName;
    }

    /**
     * ����consignorCompName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignorCompName(String value) {
        this.consignorCompName = value;
    }

    /**
     * ��ȡconsignorContName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignorContName() {
        return consignorContName;
    }

    /**
     * ����consignorContName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignorContName(String value) {
        this.consignorContName = value;
    }

    /**
     * ��ȡconsignorMobile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignorMobile() {
        return consignorMobile;
    }

    /**
     * ����consignorMobile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignorMobile(String value) {
        this.consignorMobile = value;
    }

    /**
     * ��ȡconsignorPhone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignorPhone() {
        return consignorPhone;
    }

    /**
     * ����consignorPhone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignorPhone(String value) {
        this.consignorPhone = value;
    }

    /**
     * ��ȡcorrectTm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCorrectTm() {
        return correctTm;
    }

    /**
     * ����correctTm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCorrectTm(XMLGregorianCalendar value) {
        this.correctTm = value;
    }

    /**
     * ��ȡcreateTm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTm() {
        return createTm;
    }

    /**
     * ����createTm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTm(XMLGregorianCalendar value) {
        this.createTm = value;
    }

    /**
     * ��ȡcustomerAcctCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAcctCode() {
        return customerAcctCode;
    }

    /**
     * ����customerAcctCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAcctCode(String value) {
        this.customerAcctCode = value;
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
     * ��ȡexpressTypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressTypeCode() {
        return expressTypeCode;
    }

    /**
     * ����expressTypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressTypeCode(String value) {
        this.expressTypeCode = value;
    }

    /**
     * ��ȡgatherZoneCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatherZoneCode() {
        return gatherZoneCode;
    }

    /**
     * ����gatherZoneCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatherZoneCode(String value) {
        this.gatherZoneCode = value;
    }

    /**
     * ��ȡimageId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * ����imageId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageId(String value) {
        this.imageId = value;
    }

    /**
     * ��ȡimageType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * ����imageType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageType(String value) {
        this.imageType = value;
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
     * ��ȡmodelType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelType() {
        return modelType;
    }

    /**
     * ����modelType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelType(String value) {
        this.modelType = value;
    }

    /**
     * ��ȡocrDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOcrDate() {
        return ocrDate;
    }

    /**
     * ����ocrDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOcrDate(XMLGregorianCalendar value) {
        this.ocrDate = value;
    }

    /**
     * ��ȡoneselfPickupFlg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOneselfPickupFlg() {
        return oneselfPickupFlg;
    }

    /**
     * ����oneselfPickupFlg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOneselfPickupFlg(Integer value) {
        this.oneselfPickupFlg = value;
    }

    /**
     * ��ȡotherFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOtherFee() {
        return otherFee;
    }

    /**
     * ����otherFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOtherFee(Double value) {
        this.otherFee = value;
    }

    /**
     * ��ȡpaymentTypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeCode() {
        return paymentTypeCode;
    }

    /**
     * ����paymentTypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTypeCode(String value) {
        this.paymentTypeCode = value;
    }

    /**
     * ��ȡquantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * ����quantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity(Double value) {
        this.quantity = value;
    }

    /**
     * ��ȡrealWeightQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRealWeightQty() {
        return realWeightQty;
    }

    /**
     * ����realWeightQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRealWeightQty(Double value) {
        this.realWeightQty = value;
    }

    /**
     * ��ȡselfSendFlg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSelfSendFlg() {
        return selfSendFlg;
    }

    /**
     * ����selfSendFlg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSelfSendFlg(Integer value) {
        this.selfSendFlg = value;
    }

    /**
     * ��ȡservices���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServices() {
        return services;
    }

    /**
     * ����services���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServices(String value) {
        this.services = value;
    }

    /**
     * ��ȡsettlementTypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementTypeCode() {
        return settlementTypeCode;
    }

    /**
     * ����settlementTypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementTypeCode(String value) {
        this.settlementTypeCode = value;
    }

    /**
     * ��ȡtotalFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalFee() {
        return totalFee;
    }

    /**
     * ����totalFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalFee(Double value) {
        this.totalFee = value;
    }

    /**
     * ��ȡtransportFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTransportFee() {
        return transportFee;
    }

    /**
     * ����transportFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTransportFee(Double value) {
        this.transportFee = value;
    }

    /**
     * ��ȡversion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * ����version���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * ��ȡwaybillNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaybillNo() {
        return waybillNo;
    }

    /**
     * ����waybillNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaybillNo(String value) {
        this.waybillNo = value;
    }

    /**
     * ��ȡwaybillRemk���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaybillRemk() {
        return waybillRemk;
    }

    /**
     * ����waybillRemk���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaybillRemk(String value) {
        this.waybillRemk = value;
    }

}
