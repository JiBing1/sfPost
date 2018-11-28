
package com.sf.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>waybillImage complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="waybillImage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://action.receiveserver.module.sf.com/}entity">
 *       &lt;sequence>
 *         &lt;element name="auditTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="awb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billsytle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="colorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorCodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customsBatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customsDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCodFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isDB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isHand" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isMQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isMsg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isPicInput" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isSub" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reuploadHQTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reuploadSpareTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="scanAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scanDtm" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="scanStation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scanTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="scanerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="strBoxBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeOffset" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="upLoadDtm" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="waybillId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waybillImage", propOrder = {
    "auditTime",
    "awb",
    "billsytle",
    "colorCode",
    "colorCodeResult",
    "customsBatch",
    "customsDate",
    "dataSource",
    "errorFlag",
    "fileName",
    "imageType",
    "isCodFlag",
    "isDB",
    "isHand",
    "isMQ",
    "isMsg",
    "isPicInput",
    "isSub",
    "name",
    "partition",
    "reuploadHQTime",
    "reuploadSpareTime",
    "scanAreaCode",
    "scanDtm",
    "scanStation",
    "scanTime",
    "scanerID",
    "sendDate",
    "strBoxBillNo",
    "timeOffset",
    "upLoadDtm",
    "waybillId"
})
@XmlSeeAlso({
    WaybillImageStream.class
})
public class WaybillImage
    extends Entity
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar auditTime;
    protected String awb;
    protected int billsytle;
    protected String colorCode;
    protected String colorCodeResult;
    protected String customsBatch;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar customsDate;
    protected String dataSource;
    protected String errorFlag;
    protected String fileName;
    protected String imageType;
    protected int isCodFlag;
    protected int isDB;
    protected int isHand;
    protected String isMQ;
    protected int isMsg;
    protected int isPicInput;
    protected int isSub;
    protected String name;
    protected int partition;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reuploadHQTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reuploadSpareTime;
    protected String scanAreaCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scanDtm;
    protected String scanStation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scanTime;
    protected String scanerID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendDate;
    protected String strBoxBillNo;
    protected Double timeOffset;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar upLoadDtm;
    protected String waybillId;

    /**
     * 获取auditTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuditTime() {
        return auditTime;
    }

    /**
     * 设置auditTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuditTime(XMLGregorianCalendar value) {
        this.auditTime = value;
    }

    /**
     * 获取awb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwb() {
        return awb;
    }

    /**
     * 设置awb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwb(String value) {
        this.awb = value;
    }

    /**
     * 获取billsytle属性的值。
     * 
     */
    public int getBillsytle() {
        return billsytle;
    }

    /**
     * 设置billsytle属性的值。
     * 
     */
    public void setBillsytle(int value) {
        this.billsytle = value;
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
     * 获取colorCodeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorCodeResult() {
        return colorCodeResult;
    }

    /**
     * 设置colorCodeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorCodeResult(String value) {
        this.colorCodeResult = value;
    }

    /**
     * 获取customsBatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsBatch() {
        return customsBatch;
    }

    /**
     * 设置customsBatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsBatch(String value) {
        this.customsBatch = value;
    }

    /**
     * 获取customsDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomsDate() {
        return customsDate;
    }

    /**
     * 设置customsDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomsDate(XMLGregorianCalendar value) {
        this.customsDate = value;
    }

    /**
     * 获取dataSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * 设置dataSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * 获取errorFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorFlag() {
        return errorFlag;
    }

    /**
     * 设置errorFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorFlag(String value) {
        this.errorFlag = value;
    }

    /**
     * 获取fileName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置fileName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
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
     * 获取isCodFlag属性的值。
     * 
     */
    public int getIsCodFlag() {
        return isCodFlag;
    }

    /**
     * 设置isCodFlag属性的值。
     * 
     */
    public void setIsCodFlag(int value) {
        this.isCodFlag = value;
    }

    /**
     * 获取isDB属性的值。
     * 
     */
    public int getIsDB() {
        return isDB;
    }

    /**
     * 设置isDB属性的值。
     * 
     */
    public void setIsDB(int value) {
        this.isDB = value;
    }

    /**
     * 获取isHand属性的值。
     * 
     */
    public int getIsHand() {
        return isHand;
    }

    /**
     * 设置isHand属性的值。
     * 
     */
    public void setIsHand(int value) {
        this.isHand = value;
    }

    /**
     * 获取isMQ属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMQ() {
        return isMQ;
    }

    /**
     * 设置isMQ属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMQ(String value) {
        this.isMQ = value;
    }

    /**
     * 获取isMsg属性的值。
     * 
     */
    public int getIsMsg() {
        return isMsg;
    }

    /**
     * 设置isMsg属性的值。
     * 
     */
    public void setIsMsg(int value) {
        this.isMsg = value;
    }

    /**
     * 获取isPicInput属性的值。
     * 
     */
    public int getIsPicInput() {
        return isPicInput;
    }

    /**
     * 设置isPicInput属性的值。
     * 
     */
    public void setIsPicInput(int value) {
        this.isPicInput = value;
    }

    /**
     * 获取isSub属性的值。
     * 
     */
    public int getIsSub() {
        return isSub;
    }

    /**
     * 设置isSub属性的值。
     * 
     */
    public void setIsSub(int value) {
        this.isSub = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取partition属性的值。
     * 
     */
    public int getPartition() {
        return partition;
    }

    /**
     * 设置partition属性的值。
     * 
     */
    public void setPartition(int value) {
        this.partition = value;
    }

    /**
     * 获取reuploadHQTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReuploadHQTime() {
        return reuploadHQTime;
    }

    /**
     * 设置reuploadHQTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReuploadHQTime(XMLGregorianCalendar value) {
        this.reuploadHQTime = value;
    }

    /**
     * 获取reuploadSpareTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReuploadSpareTime() {
        return reuploadSpareTime;
    }

    /**
     * 设置reuploadSpareTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReuploadSpareTime(XMLGregorianCalendar value) {
        this.reuploadSpareTime = value;
    }

    /**
     * 获取scanAreaCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanAreaCode() {
        return scanAreaCode;
    }

    /**
     * 设置scanAreaCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanAreaCode(String value) {
        this.scanAreaCode = value;
    }

    /**
     * 获取scanDtm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScanDtm() {
        return scanDtm;
    }

    /**
     * 设置scanDtm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScanDtm(XMLGregorianCalendar value) {
        this.scanDtm = value;
    }

    /**
     * 获取scanStation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanStation() {
        return scanStation;
    }

    /**
     * 设置scanStation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanStation(String value) {
        this.scanStation = value;
    }

    /**
     * 获取scanTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScanTime() {
        return scanTime;
    }

    /**
     * 设置scanTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScanTime(XMLGregorianCalendar value) {
        this.scanTime = value;
    }

    /**
     * 获取scanerID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanerID() {
        return scanerID;
    }

    /**
     * 设置scanerID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanerID(String value) {
        this.scanerID = value;
    }

    /**
     * 获取sendDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendDate() {
        return sendDate;
    }

    /**
     * 设置sendDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendDate(XMLGregorianCalendar value) {
        this.sendDate = value;
    }

    /**
     * 获取strBoxBillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrBoxBillNo() {
        return strBoxBillNo;
    }

    /**
     * 设置strBoxBillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrBoxBillNo(String value) {
        this.strBoxBillNo = value;
    }

    /**
     * 获取timeOffset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTimeOffset() {
        return timeOffset;
    }

    /**
     * 设置timeOffset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTimeOffset(Double value) {
        this.timeOffset = value;
    }

    /**
     * 获取upLoadDtm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpLoadDtm() {
        return upLoadDtm;
    }

    /**
     * 设置upLoadDtm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpLoadDtm(XMLGregorianCalendar value) {
        this.upLoadDtm = value;
    }

    /**
     * 获取waybillId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaybillId() {
        return waybillId;
    }

    /**
     * 设置waybillId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaybillId(String value) {
        this.waybillId = value;
    }

}
