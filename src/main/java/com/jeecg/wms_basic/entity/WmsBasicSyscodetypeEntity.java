package com.jeecg.wms_basic.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity  
 * @Description: wms_basic_SyscodeType
 * @author onlineGenerator
 * @date 2018-01-22 17:25:22
 * @version V1.0   
 *
 */
@Entity
@Table(name = "wms_basic_syscodetype", schema = "")
@SuppressWarnings("serial")
public class WmsBasicSyscodetypeEntity implements java.io.Serializable {
	/**id*/
	private java.lang.String id;
	/**pkSyscodetypecode*/
    @Excel(name="pkSyscodetypecode",width=15)
	private java.lang.String pkSyscodetypecode;
	/**syscodetypenamecn*/
    @Excel(name="syscodetypenamecn",width=15)
	private java.lang.String syscodetypenamecn;
	/**syscodetypenameen*/
    @Excel(name="syscodetypenameen",width=15)
	private java.lang.String syscodetypenameen;
	/**codelength*/
    @Excel(name="codelength",width=15)
	private java.lang.Integer codelength;
	/**variant1*/
    @Excel(name="variant1",width=15)
	private java.lang.String variant1;
	/**variant2*/
    @Excel(name="variant2",width=15)
	private java.lang.String variant2;
	/**variant3*/
    @Excel(name="variant3",width=15)
	private java.lang.String variant3;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  id
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="ID",nullable=false,length=32)
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  id
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  pkSyscodetypecode
	 */
	@Column(name ="PK_SYSCODETYPECODE",nullable=false,length=32)
	public java.lang.String getPkSyscodetypecode(){
		return this.pkSyscodetypecode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  pkSyscodetypecode
	 */
	public void setPkSyscodetypecode(java.lang.String pkSyscodetypecode){
		this.pkSyscodetypecode = pkSyscodetypecode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  syscodetypenamecn
	 */
	@Column(name ="SYSCODETYPENAMECN",nullable=true,length=32)
	public java.lang.String getSyscodetypenamecn(){
		return this.syscodetypenamecn;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  syscodetypenamecn
	 */
	public void setSyscodetypenamecn(java.lang.String syscodetypenamecn){
		this.syscodetypenamecn = syscodetypenamecn;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  syscodetypenameen
	 */
	@Column(name ="SYSCODETYPENAMEEN",nullable=true,length=32)
	public java.lang.String getSyscodetypenameen(){
		return this.syscodetypenameen;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  syscodetypenameen
	 */
	public void setSyscodetypenameen(java.lang.String syscodetypenameen){
		this.syscodetypenameen = syscodetypenameen;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  codelength
	 */
	@Column(name ="CODELENGTH",nullable=true,length=4)
	public java.lang.Integer getCodelength(){
		return this.codelength;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  codelength
	 */
	public void setCodelength(java.lang.Integer codelength){
		this.codelength = codelength;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  variant1
	 */
	@Column(name ="VARIANT1",nullable=true,length=32)
	public java.lang.String getVariant1(){
		return this.variant1;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  variant1
	 */
	public void setVariant1(java.lang.String variant1){
		this.variant1 = variant1;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  variant2
	 */
	@Column(name ="VARIANT2",nullable=true,length=32)
	public java.lang.String getVariant2(){
		return this.variant2;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  variant2
	 */
	public void setVariant2(java.lang.String variant2){
		this.variant2 = variant2;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  variant3
	 */
	@Column(name ="VARIANT3",nullable=true,length=32)
	public java.lang.String getVariant3(){
		return this.variant3;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  variant3
	 */
	public void setVariant3(java.lang.String variant3){
		this.variant3 = variant3;
	}
}
