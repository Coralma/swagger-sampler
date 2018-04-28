package com.coral.model;

import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by ccc on 2018/4/16.
 */
@ApiModel(description= "保单数据")
public class PolicyVO implements Serializable {

    @ApiModelProperty(value = "保单ID")
    String policyId;
    @ApiModelProperty(value = "保单号",required = true)
    String policyNo;
    @ApiModelProperty(value = "到期日期",required = true)
    Date dueDate;
    @ApiModelProperty(value = "版本",required = true)
    Integer version;
    @ApiModelProperty(value = "标的列表",required = true)
    List<InsuredVO> insuredVOList = Lists.newArrayList();

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public List<InsuredVO> getInsuredVOList() {
        return insuredVOList;
    }

    public void setInsuredVOList(List<InsuredVO> insuredVOList) {
        this.insuredVOList = insuredVOList;
    }
}
