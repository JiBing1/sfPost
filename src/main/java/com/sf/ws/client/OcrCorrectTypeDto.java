
package com.sf.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ocrCorrectTypeDto complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取addresseeAddr属性的值。
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
     * 设置addresseeAddr属性的值。
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
     * 获取addresseeCompName属性的值。
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
     * 设置addresseeCompName属性的值。
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
     * 获取addresseeContName属性的值。
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
     * 设置addresseeContName属性的值。
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
     * 获取addresseeMobile属性的值。
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
     * 设置addresseeMobile属性的值。
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
     * 获取addresseePhone属性的值。
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
     * 设置addresseePhone属性的值。
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
     * 获取billHigh属性的值。
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
     * 设置billHigh属性的值。
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
     * 获取billLong属性的值。
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
     * 设置billLong属性的值。
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
     * 获取billWidth属性的值。
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
     * 设置billWidth属性的值。
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
     * 获取cargoTypeCode属性的值。
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
     * 设置cargoTypeCode属性的值。
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
     * 获取colorCode属性的值。
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
     * 设置colorCode属性的值。
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
     * 获取consName属性的值。
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
     * 设置consName属性的值。
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
     * 获取consQty属性的值。
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
     * 设置consQty属性的值。
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
     * 获取consValue属性的值。
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
     * 设置consValue属性的值。
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
     * 获取consigneeEmpCode属性的值。
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
     * 设置consigneeEmpCode属性的值。
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
     * 获取consignorAddr属性的值。
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
     * 设置consignorAddr属性的值。
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
     * 获取consignorCompName属性的值。
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
     * 设置consignorCompName属性的值。
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
     * 获取consignorContName属性的值。
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
     * 设置consignorContName属性的值。
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
     * 获取consignorMobile属性的值。
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
     * 设置consignorMobile属性的值。
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
     * 获取consignorPhone属性的值。
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
     * 设置consignorPhone属性的值。
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
     * 获取correctTm属性的值。
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
     * 设置correctTm属性的值。
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
     * 获取createTm属性的值。
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
     * 设置createTm属性的值。
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
     * 获取customerAcctCode属性的值。
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
     * 设置customerAcctCode属性的值。
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
     * 获取destZoneCode属性的值。
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
     * 设置destZoneCode属性的值。
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
     * 获取expressTypeCode属性的值。
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
     * 设置expressTypeCode属性的值。
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
     * 获取gatherZoneCode属性的值。
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
     * 设置gatherZoneCode属性的值。
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
     * 获取imageId属性的值。
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
     * 设置imageId属性的值。
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
     * 获取imageType属性的值。
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
     * 设置imageType属性的值。
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
     * 获取limitTypeCode属性的值。
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
     * 设置limitTypeCode属性的值。
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
     * 获取meterageWeightQty属性的值。
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
     * 设置meterageWeightQty属性的值。
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
     * 获取modelType属性的值。
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
     * 设置modelType属性的值。
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
     * 获取ocrDate属性的值。
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
     * 设置ocrDate属性的值。
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
     * 获取oneselfPickupFlg属性的值。
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
     * 设置oneselfPickupFlg属性的值。
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
     * 获取otherFee属性的值。
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
     * 设置otherFee属性的值。
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
     * 获取paymentTypeCode属性的值。
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
     * 设置paymentTypeCode属性的值。
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
     * 获取quantity属性的值。
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
     * 设置quantity属性的值。
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
     * 获取realWeightQty属性的值。
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
     * 设置realWeightQty属性的值。
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
     * 获取selfSendFlg属性的值。
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
     * 设置selfSendFlg属性的值。
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
     * 获取services属性的值。
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
     * 设置services属性的值。
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
     * 获取settlementTypeCode属性的值。
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
     * 设置settlementTypeCode属性的值。
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
     * 获取totalFee属性的值。
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
     * 设置totalFee属性的值。
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
     * 获取transportFee属性的值。
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
     * 设置transportFee属性的值。
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
     * 获取version属性的值。
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
     * 设置version属性的值。
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
     * 获取waybillNo属性的值。
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
     * 设置waybillNo属性的值。
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
     * 获取waybillRemk属性的值。
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
     * 设置waybillRemk属性的值。
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
