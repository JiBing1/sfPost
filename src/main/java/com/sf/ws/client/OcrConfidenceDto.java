
package com.sf.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ocrConfidenceDto complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ocrConfidenceDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addresseeAddr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="addresseeCompName" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="addresseeContName" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="addresseeMobile" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="addresseePhone" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="billHigh" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="billLong" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="billWidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cargoTypeCode" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="colorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consName" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consigneeEmpCode" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consignorAddr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consignorCompName" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consignorContName" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consignorMobile" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consignorPhone" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="correctTm" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createTm" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customerAcctCode" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="destZoneCode" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="expressTypeCode" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="gatherZoneCode" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="imageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limitTypeCode" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="meterageWeightQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="modelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ocrDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="oneselfPickupFlg" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="otherFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="paymentTypeCode" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="realWeightQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="selfSendFlg" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="services" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="settlementTypeCode" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="transportFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waybillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waybillRemk" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ocrConfidenceDto", propOrder = {
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
public class OcrConfidenceDto {

    protected Double addresseeAddr;
    protected Double addresseeCompName;
    protected Double addresseeContName;
    protected Double addresseeMobile;
    protected Double addresseePhone;
    protected Double billHigh;
    protected Double billLong;
    protected Double billWidth;
    protected Double cargoTypeCode;
    protected String colorCode;
    protected Double consName;
    protected Double consQty;
    protected Double consValue;
    protected Double consigneeEmpCode;
    protected Double consignorAddr;
    protected Double consignorCompName;
    protected Double consignorContName;
    protected Double consignorMobile;
    protected Double consignorPhone;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar correctTm;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTm;
    protected Double customerAcctCode;
    protected Double destZoneCode;
    protected Double expressTypeCode;
    protected Double gatherZoneCode;
    protected String imageId;
    protected String imageType;
    protected Double limitTypeCode;
    protected Double meterageWeightQty;
    protected String modelType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ocrDate;
    protected Double oneselfPickupFlg;
    protected Double otherFee;
    protected Double paymentTypeCode;
    protected Double quantity;
    protected Double realWeightQty;
    protected Double selfSendFlg;
    protected Double services;
    protected Double settlementTypeCode;
    protected Double totalFee;
    protected Double transportFee;
    protected String version;
    protected String waybillNo;
    protected Double waybillRemk;

    /**
     * 获取addresseeAddr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAddresseeAddr() {
        return addresseeAddr;
    }

    /**
     * 设置addresseeAddr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAddresseeAddr(Double value) {
        this.addresseeAddr = value;
    }

    /**
     * 获取addresseeCompName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAddresseeCompName() {
        return addresseeCompName;
    }

    /**
     * 设置addresseeCompName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAddresseeCompName(Double value) {
        this.addresseeCompName = value;
    }

    /**
     * 获取addresseeContName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAddresseeContName() {
        return addresseeContName;
    }

    /**
     * 设置addresseeContName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAddresseeContName(Double value) {
        this.addresseeContName = value;
    }

    /**
     * 获取addresseeMobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAddresseeMobile() {
        return addresseeMobile;
    }

    /**
     * 设置addresseeMobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAddresseeMobile(Double value) {
        this.addresseeMobile = value;
    }

    /**
     * 获取addresseePhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAddresseePhone() {
        return addresseePhone;
    }

    /**
     * 设置addresseePhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAddresseePhone(Double value) {
        this.addresseePhone = value;
    }

    /**
     * 获取billHigh属性的值。
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
     * 设置billHigh属性的值。
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
     * 获取billLong属性的值。
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
     * 设置billLong属性的值。
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
     * 获取billWidth属性的值。
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
     * 设置billWidth属性的值。
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
     * 获取cargoTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCargoTypeCode() {
        return cargoTypeCode;
    }

    /**
     * 设置cargoTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCargoTypeCode(Double value) {
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
     *     {@link Double }
     *     
     */
    public Double getConsName() {
        return consName;
    }

    /**
     * 设置consName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsName(Double value) {
        this.consName = value;
    }

    /**
     * 获取consQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsQty() {
        return consQty;
    }

    /**
     * 设置consQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsQty(Double value) {
        this.consQty = value;
    }

    /**
     * 获取consValue属性的值。
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
     * 设置consValue属性的值。
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
     * 获取consigneeEmpCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsigneeEmpCode() {
        return consigneeEmpCode;
    }

    /**
     * 设置consigneeEmpCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsigneeEmpCode(Double value) {
        this.consigneeEmpCode = value;
    }

    /**
     * 获取consignorAddr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsignorAddr() {
        return consignorAddr;
    }

    /**
     * 设置consignorAddr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsignorAddr(Double value) {
        this.consignorAddr = value;
    }

    /**
     * 获取consignorCompName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsignorCompName() {
        return consignorCompName;
    }

    /**
     * 设置consignorCompName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsignorCompName(Double value) {
        this.consignorCompName = value;
    }

    /**
     * 获取consignorContName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsignorContName() {
        return consignorContName;
    }

    /**
     * 设置consignorContName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsignorContName(Double value) {
        this.consignorContName = value;
    }

    /**
     * 获取consignorMobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsignorMobile() {
        return consignorMobile;
    }

    /**
     * 设置consignorMobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsignorMobile(Double value) {
        this.consignorMobile = value;
    }

    /**
     * 获取consignorPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsignorPhone() {
        return consignorPhone;
    }

    /**
     * 设置consignorPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsignorPhone(Double value) {
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
     *     {@link Double }
     *     
     */
    public Double getCustomerAcctCode() {
        return customerAcctCode;
    }

    /**
     * 设置customerAcctCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomerAcctCode(Double value) {
        this.customerAcctCode = value;
    }

    /**
     * 获取destZoneCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDestZoneCode() {
        return destZoneCode;
    }

    /**
     * 设置destZoneCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDestZoneCode(Double value) {
        this.destZoneCode = value;
    }

    /**
     * 获取expressTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExpressTypeCode() {
        return expressTypeCode;
    }

    /**
     * 设置expressTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpressTypeCode(Double value) {
        this.expressTypeCode = value;
    }

    /**
     * 获取gatherZoneCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGatherZoneCode() {
        return gatherZoneCode;
    }

    /**
     * 设置gatherZoneCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGatherZoneCode(Double value) {
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
     *     {@link Double }
     *     
     */
    public Double getLimitTypeCode() {
        return limitTypeCode;
    }

    /**
     * 设置limitTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLimitTypeCode(Double value) {
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
     *     {@link Double }
     *     
     */
    public Double getOneselfPickupFlg() {
        return oneselfPickupFlg;
    }

    /**
     * 设置oneselfPickupFlg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOneselfPickupFlg(Double value) {
        this.oneselfPickupFlg = value;
    }

    /**
     * 获取otherFee属性的值。
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
     * 设置otherFee属性的值。
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
     * 获取paymentTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPaymentTypeCode() {
        return paymentTypeCode;
    }

    /**
     * 设置paymentTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPaymentTypeCode(Double value) {
        this.paymentTypeCode = value;
    }

    /**
     * 获取quantity属性的值。
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
     * 设置quantity属性的值。
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
     * 获取realWeightQty属性的值。
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
     * 设置realWeightQty属性的值。
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
     * 获取selfSendFlg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSelfSendFlg() {
        return selfSendFlg;
    }

    /**
     * 设置selfSendFlg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSelfSendFlg(Double value) {
        this.selfSendFlg = value;
    }

    /**
     * 获取services属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getServices() {
        return services;
    }

    /**
     * 设置services属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setServices(Double value) {
        this.services = value;
    }

    /**
     * 获取settlementTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSettlementTypeCode() {
        return settlementTypeCode;
    }

    /**
     * 设置settlementTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSettlementTypeCode(Double value) {
        this.settlementTypeCode = value;
    }

    /**
     * 获取totalFee属性的值。
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
     * 设置totalFee属性的值。
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
     * 获取transportFee属性的值。
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
     * 设置transportFee属性的值。
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
     *     {@link Double }
     *     
     */
    public Double getWaybillRemk() {
        return waybillRemk;
    }

    /**
     * 设置waybillRemk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWaybillRemk(Double value) {
        this.waybillRemk = value;
    }

}
