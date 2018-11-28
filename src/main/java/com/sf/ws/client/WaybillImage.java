
package com.sf.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>waybillImage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡauditTime���Ե�ֵ��
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
     * ����auditTime���Ե�ֵ��
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
     * ��ȡawb���Ե�ֵ��
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
     * ����awb���Ե�ֵ��
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
     * ��ȡbillsytle���Ե�ֵ��
     * 
     */
    public int getBillsytle() {
        return billsytle;
    }

    /**
     * ����billsytle���Ե�ֵ��
     * 
     */
    public void setBillsytle(int value) {
        this.billsytle = value;
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
     * ��ȡcolorCodeResult���Ե�ֵ��
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
     * ����colorCodeResult���Ե�ֵ��
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
     * ��ȡcustomsBatch���Ե�ֵ��
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
     * ����customsBatch���Ե�ֵ��
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
     * ��ȡcustomsDate���Ե�ֵ��
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
     * ����customsDate���Ե�ֵ��
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
     * ��ȡdataSource���Ե�ֵ��
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
     * ����dataSource���Ե�ֵ��
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
     * ��ȡerrorFlag���Ե�ֵ��
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
     * ����errorFlag���Ե�ֵ��
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
     * ��ȡfileName���Ե�ֵ��
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
     * ����fileName���Ե�ֵ��
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
     * ��ȡisCodFlag���Ե�ֵ��
     * 
     */
    public int getIsCodFlag() {
        return isCodFlag;
    }

    /**
     * ����isCodFlag���Ե�ֵ��
     * 
     */
    public void setIsCodFlag(int value) {
        this.isCodFlag = value;
    }

    /**
     * ��ȡisDB���Ե�ֵ��
     * 
     */
    public int getIsDB() {
        return isDB;
    }

    /**
     * ����isDB���Ե�ֵ��
     * 
     */
    public void setIsDB(int value) {
        this.isDB = value;
    }

    /**
     * ��ȡisHand���Ե�ֵ��
     * 
     */
    public int getIsHand() {
        return isHand;
    }

    /**
     * ����isHand���Ե�ֵ��
     * 
     */
    public void setIsHand(int value) {
        this.isHand = value;
    }

    /**
     * ��ȡisMQ���Ե�ֵ��
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
     * ����isMQ���Ե�ֵ��
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
     * ��ȡisMsg���Ե�ֵ��
     * 
     */
    public int getIsMsg() {
        return isMsg;
    }

    /**
     * ����isMsg���Ե�ֵ��
     * 
     */
    public void setIsMsg(int value) {
        this.isMsg = value;
    }

    /**
     * ��ȡisPicInput���Ե�ֵ��
     * 
     */
    public int getIsPicInput() {
        return isPicInput;
    }

    /**
     * ����isPicInput���Ե�ֵ��
     * 
     */
    public void setIsPicInput(int value) {
        this.isPicInput = value;
    }

    /**
     * ��ȡisSub���Ե�ֵ��
     * 
     */
    public int getIsSub() {
        return isSub;
    }

    /**
     * ����isSub���Ե�ֵ��
     * 
     */
    public void setIsSub(int value) {
        this.isSub = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
     * ��ȡpartition���Ե�ֵ��
     * 
     */
    public int getPartition() {
        return partition;
    }

    /**
     * ����partition���Ե�ֵ��
     * 
     */
    public void setPartition(int value) {
        this.partition = value;
    }

    /**
     * ��ȡreuploadHQTime���Ե�ֵ��
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
     * ����reuploadHQTime���Ե�ֵ��
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
     * ��ȡreuploadSpareTime���Ե�ֵ��
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
     * ����reuploadSpareTime���Ե�ֵ��
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
     * ��ȡscanAreaCode���Ե�ֵ��
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
     * ����scanAreaCode���Ե�ֵ��
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
     * ��ȡscanDtm���Ե�ֵ��
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
     * ����scanDtm���Ե�ֵ��
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
     * ��ȡscanStation���Ե�ֵ��
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
     * ����scanStation���Ե�ֵ��
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
     * ��ȡscanTime���Ե�ֵ��
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
     * ����scanTime���Ե�ֵ��
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
     * ��ȡscanerID���Ե�ֵ��
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
     * ����scanerID���Ե�ֵ��
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
     * ��ȡsendDate���Ե�ֵ��
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
     * ����sendDate���Ե�ֵ��
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
     * ��ȡstrBoxBillNo���Ե�ֵ��
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
     * ����strBoxBillNo���Ե�ֵ��
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
     * ��ȡtimeOffset���Ե�ֵ��
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
     * ����timeOffset���Ե�ֵ��
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
     * ��ȡupLoadDtm���Ե�ֵ��
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
     * ����upLoadDtm���Ե�ֵ��
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
     * ��ȡwaybillId���Ե�ֵ��
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
     * ����waybillId���Ե�ֵ��
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
