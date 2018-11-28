
package com.sf.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ocrCorrectTypeDto complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ocrCorrectTypeDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addresseeAddr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="addresseeCompName" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="addresseeContName" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="addresseeMobile" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="addresseePhone" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="billHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="billLong" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="billWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cargoTypeCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="colorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consName" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consigneeEmpCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consignorAddr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consignorCompName" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consignorContName" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consignorMobile" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consignorPhone" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="correctTm" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createTm" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customerAcctCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="destZoneCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="expressTypeCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="gatherZoneCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="imageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limitTypeCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="meterageWeightQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="modelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ocrDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="oneselfPickupFlg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="otherFee" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="paymentTypeCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="realWeightQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="selfSendFlg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="services" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="settlementTypeCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalFee" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="transportFee" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waybillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waybillRemk" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ocrCorrectTypeDto", propOrder = {
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
public class OcrCorrectTypeDto {

    protected Integer addresseeAddr;
    protected Integer addresseeCompName;
    protected Integer addresseeContName;
    protected Integer addresseeMobile;
    protected Integer addresseePhone;
    protected Integer billHigh;
    protected Integer billLong;
    protected Integer billWidth;
    protected Integer cargoTypeCode;
    protected String colorCode;
    protected Integer consName;
    protected Integer consQty;
    protected Integer consValue;
    protected Integer consigneeEmpCode;
    protected Integer consignorAddr;
    protected Integer consignorCompName;
    protected Integer consignorContName;
    protected Integer consignorMobile;
    protected Integer consignorPhone;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar correctTm;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTm;
    protected Integer customerAcctCode;
    protected Integer destZoneCode;
    protected Integer expressTypeCode;
    protected Integer gatherZoneCode;
    protected String imageId;
    protected String imageType;
    protected Integer limitTypeCode;
    protected Integer meterageWeightQty;
    protected String modelType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ocrDate;
    protected Integer oneselfPickupFlg;
    protected Integer otherFee;
    protected Integer paymentTypeCode;
    protected Integer quantity;
    protected Integer realWeightQty;
    protected Integer selfSendFlg;
    protected Integer services;
    protected Integer settlementTypeCode;
    protected Integer totalFee;
    protected Integer transportFee;
    protected String version;
    protected String waybillNo;
    protected Integer waybillRemk;

    /**
     * ��ȡaddresseeAddr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAddresseeAddr() {
        return addresseeAddr;
    }

    /**
     * ����addresseeAddr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAddresseeAddr(Integer value) {
        this.addresseeAddr = value;
    }

    /**
     * ��ȡaddresseeCompName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAddresseeCompName() {
        return addresseeCompName;
    }

    /**
     * ����addresseeCompName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAddresseeCompName(Integer value) {
        this.addresseeCompName = value;
    }

    /**
     * ��ȡaddresseeContName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAddresseeContName() {
        return addresseeContName;
    }

    /**
     * ����addresseeContName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAddresseeContName(Integer value) {
        this.addresseeContName = value;
    }

    /**
     * ��ȡaddresseeMobile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAddresseeMobile() {
        return addresseeMobile;
    }

    /**
     * ����addresseeMobile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAddresseeMobile(Integer value) {
        this.addresseeMobile = value;
    }

    /**
     * ��ȡaddresseePhone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAddresseePhone() {
        return addresseePhone;
    }

    /**
     * ����addresseePhone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAddresseePhone(Integer value) {
        this.addresseePhone = value;
    }

    /**
     * ��ȡbillHigh���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillHigh() {
        return billHigh;
    }

    /**
     * ����billHigh���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillHigh(Integer value) {
        this.billHigh = value;
    }

    /**
     * ��ȡbillLong���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillLong() {
        return billLong;
    }

    /**
     * ����billLong���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillLong(Integer value) {
        this.billLong = value;
    }

    /**
     * ��ȡbillWidth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillWidth() {
        return billWidth;
    }

    /**
     * ����billWidth���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillWidth(Integer value) {
        this.billWidth = value;
    }

    /**
     * ��ȡcargoTypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCargoTypeCode() {
        return cargoTypeCode;
    }

    /**
     * ����cargoTypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCargoTypeCode(Integer value) {
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
     *     {@link Integer }
     *     
     */
    public Integer getConsName() {
        return consName;
    }

    /**
     * ����consName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsName(Integer value) {
        this.consName = value;
    }

    /**
     * ��ȡconsQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsQty() {
        return consQty;
    }

    /**
     * ����consQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsQty(Integer value) {
        this.consQty = value;
    }

    /**
     * ��ȡconsValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsValue() {
        return consValue;
    }

    /**
     * ����consValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsValue(Integer value) {
        this.consValue = value;
    }

    /**
     * ��ȡconsigneeEmpCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsigneeEmpCode() {
        return consigneeEmpCode;
    }

    /**
     * ����consigneeEmpCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsigneeEmpCode(Integer value) {
        this.consigneeEmpCode = value;
    }

    /**
     * ��ȡconsignorAddr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsignorAddr() {
        return consignorAddr;
    }

    /**
     * ����consignorAddr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsignorAddr(Integer value) {
        this.consignorAddr = value;
    }

    /**
     * ��ȡconsignorCompName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsignorCompName() {
        return consignorCompName;
    }

    /**
     * ����consignorCompName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsignorCompName(Integer value) {
        this.consignorCompName = value;
    }

    /**
     * ��ȡconsignorContName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsignorContName() {
        return consignorContName;
    }

    /**
     * ����consignorContName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsignorContName(Integer value) {
        this.consignorContName = value;
    }

    /**
     * ��ȡconsignorMobile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsignorMobile() {
        return consignorMobile;
    }

    /**
     * ����consignorMobile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsignorMobile(Integer value) {
        this.consignorMobile = value;
    }

    /**
     * ��ȡconsignorPhone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsignorPhone() {
        return consignorPhone;
    }

    /**
     * ����consignorPhone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsignorPhone(Integer value) {
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
     *     {@link Integer }
     *     
     */
    public Integer getCustomerAcctCode() {
        return customerAcctCode;
    }

    /**
     * ����customerAcctCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerAcctCode(Integer value) {
        this.customerAcctCode = value;
    }

    /**
     * ��ȡdestZoneCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDestZoneCode() {
        return destZoneCode;
    }

    /**
     * ����destZoneCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDestZoneCode(Integer value) {
        this.destZoneCode = value;
    }

    /**
     * ��ȡexpressTypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpressTypeCode() {
        return expressTypeCode;
    }

    /**
     * ����expressTypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpressTypeCode(Integer value) {
        this.expressTypeCode = value;
    }

    /**
     * ��ȡgatherZoneCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGatherZoneCode() {
        return gatherZoneCode;
    }

    /**
     * ����gatherZoneCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGatherZoneCode(Integer value) {
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
     *     {@link Integer }
     *     
     */
    public Integer getLimitTypeCode() {
        return limitTypeCode;
    }

    /**
     * ����limitTypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimitTypeCode(Integer value) {
        this.limitTypeCode = value;
    }

    /**
     * ��ȡmeterageWeightQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeterageWeightQty() {
        return meterageWeightQty;
    }

    /**
     * ����meterageWeightQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeterageWeightQty(Integer value) {
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
     *     {@link Integer }
     *     
     */
    public Integer getOtherFee() {
        return otherFee;
    }

    /**
     * ����otherFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOtherFee(Integer value) {
        this.otherFee = value;
    }

    /**
     * ��ȡpaymentTypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentTypeCode() {
        return paymentTypeCode;
    }

    /**
     * ����paymentTypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentTypeCode(Integer value) {
        this.paymentTypeCode = value;
    }

    /**
     * ��ȡquantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * ����quantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * ��ȡrealWeightQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRealWeightQty() {
        return realWeightQty;
    }

    /**
     * ����realWeightQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRealWeightQty(Integer value) {
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
     *     {@link Integer }
     *     
     */
    public Integer getServices() {
        return services;
    }

    /**
     * ����services���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServices(Integer value) {
        this.services = value;
    }

    /**
     * ��ȡsettlementTypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSettlementTypeCode() {
        return settlementTypeCode;
    }

    /**
     * ����settlementTypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSettlementTypeCode(Integer value) {
        this.settlementTypeCode = value;
    }

    /**
     * ��ȡtotalFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalFee() {
        return totalFee;
    }

    /**
     * ����totalFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalFee(Integer value) {
        this.totalFee = value;
    }

    /**
     * ��ȡtransportFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransportFee() {
        return transportFee;
    }

    /**
     * ����transportFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransportFee(Integer value) {
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
     *     {@link Integer }
     *     
     */
    public Integer getWaybillRemk() {
        return waybillRemk;
    }

    /**
     * ����waybillRemk���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWaybillRemk(Integer value) {
        this.waybillRemk = value;
    }

}
