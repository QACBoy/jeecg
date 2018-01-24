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
 * @Description: wms_basic_Syscode
 * @author onlineGenerator
 * @date 2018-01-22 17:29:06
 * @version V1.0   
 *
 */
@Entity
@Table(name = "wms_basic_syscode", schema = "")
@SuppressWarnings("serial")
public class WmsBasicSyscodeEntity implements java.io.Serializable {
	/**id*/
	private java.lang.String id;
	/**pkSyscodecode*/
    @Excel(name="pkSyscodecode",width=15)
	private java.lang.String pkSyscodecode;
	/**syscodenamecn*/
    @Excel(name="syscodenamecn",width=15)
	private java.lang.String syscodenamecn;
	/**syscodenameen*/
    @Excel(name="syscodenameen",width=15)
	private java.lang.String syscodenameen;
	/**fkSyscodettypecode*/
    @Excel(name="fkSyscodettypecode",width=15)
	private java.lang.String fkSyscodettypecode;
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
	 *@return: java.lang.String  pkSyscodecode
	 */
	@Column(name ="PK_SYSCODECODE",nullable=false,length=32)
	public java.lang.String getPkSyscodecode(){
		return this.pkSyscodecode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  pkSyscodecode
	 */
	public void setPkSyscodecode(java.lang.String pkSyscodecode){
		this.pkSyscodecode = pkSyscodecode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  syscodenamecn
	 */
	@Column(name ="SYSCODENAMECN",nullable=true,length=32)
	public java.lang.String getSyscodenamecn(){
		return this.syscodenamecn;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  syscodenamecn
	 */
	public void setSyscodenamecn(java.lang.String syscodenamecn){
		this.syscodenamecn = syscodenamecn;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  syscodenameen
	 */
	@Column(name ="SYSCODENAMEEN",nullable=true,length=32)
	public java.lang.String getSyscodenameen(){
		return this.syscodenameen;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  syscodenameen
	 */
	public void setSyscodenameen(java.lang.String syscodenameen){
		this.syscodenameen = syscodenameen;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  fkSyscodettypecode
	 */
	@Column(name ="FK_SYSCODETTYPECODE",nullable=false,length=32)
	public java.lang.String getFkSyscodettypecode(){
		return this.fkSyscodettypecode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  fkSyscodettypecode
	 */
	public void setFkSyscodettypecode(java.lang.String fkSyscodettypecode){
		this.fkSyscodettypecode = fkSyscodettypecode;
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
