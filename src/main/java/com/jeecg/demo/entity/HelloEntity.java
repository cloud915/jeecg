package com.jeecg.demo.entity;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.hibernate.annotations.GenericGenerator;
import org.jeecgframework.core.common.controller.CustomJsonDateDeserializer;
import org.jeecgframework.poi.excel.annotation.Excel;

import javax.persistence.*;
import java.util.Date;

/**
 * @Description
 * @Author ghy
 * @Date 2019/7/8 16:47
 */
@Entity
@Table(name = "NewTable", schema = "")
@SuppressWarnings("serial")
public class HelloEntity implements java.io.Serializable {

    @Override
    public String toString() {
        return this.sysCompanyCode;
    }

    private Long id;
    /**
     * createDate
     */
    private java.util.Date createDate;
    /**
     * 创建人id
     */
    private java.lang.String createBy;
    /**
     * 创建人
     */
    private java.lang.String createName;
    /**
     * 修改人id
     */
    private java.lang.String updateBy;
    /**
     * 修改时间
     */
    private java.util.Date updateDate;
    /**
     * 修改人
     */
    private java.lang.String updateName;

    @Excel(name = "部门编码", width = 200)
    private java.lang.String sysOrgCode;
    /**
     * 公司
     */
    private java.lang.String sysCompanyCode;
    private java.lang.String tupianPath;
    private byte[] tupian;


    @Id
    //@GeneratedValue(generator = "paymentableGenerator")
    //@GenericGenerator(name = "paymentableGenerator", strategy = "Integer")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false, length = 32)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "CREATE_DATE", nullable = true)
    public Date getCreateDate() {
        return createDate;
    }

    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "CREATE_BY", nullable = true, length = 32)
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Column(name = "CREATE_NAME", nullable = true, length = 32)
    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    @Column(name = "UPDATE_BY", nullable = true, length = 32)
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Column(name = "UPDATE_DATE", nullable = true)
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Column(name = "UPDATE_NAME", nullable = true, length = 32)
    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    @Column(name = "sys_org_code", nullable = true, length = 15)
    public String getSysOrgCode() {
        return sysOrgCode;
    }

    public void setSysOrgCode(String sysOrgCode) {
        this.sysOrgCode = sysOrgCode;
    }

    @Column(name = "sys_company_code", nullable = true, length = 15)
    public String getSysCompanyCode() {
        return sysCompanyCode;
    }

    public void setSysCompanyCode(String sysCompanyCode) {
        this.sysCompanyCode = sysCompanyCode;
    }

    @Column(name = "tupianPath", nullable = true, length = 128)
    public String getTupianPath() {
        return tupianPath;
    }

    public void setTupianPath(String tupianPath) {
        this.tupianPath = tupianPath;
    }

    @Column(name = "tupian", nullable = true)
    public byte[] getTupian() {
        return tupian;
    }

    public void setTupian(byte[] tupian) {
        this.tupian = tupian;
    }
}
