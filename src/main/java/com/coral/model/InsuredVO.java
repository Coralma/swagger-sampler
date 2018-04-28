package com.coral.model;

import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by ccc on 2018/4/16.
 */
@ApiModel(description= "标的数据")
public class InsuredVO implements Serializable {

    @ApiModelProperty(value = "标的ID")
    String insuredId;
    @ApiModelProperty(value = "标的名",required = true)
    String insuredName;
    @ApiModelProperty(value = "描述")
    String description;
    @ApiModelProperty(value = "价格")
    BigDecimal price;
    @ApiModelProperty(value = "利益项",required = true)
    List<InterestVO> interestVOList = Lists.newArrayList();

    public String getInsuredId() {
        return insuredId;
    }

    public void setInsuredId(String insuredId) {
        this.insuredId = insuredId;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<InterestVO> getInterestVOList() {
        return interestVOList;
    }

    public void setInterestVOList(List<InterestVO> interestVOList) {
        this.interestVOList = interestVOList;
    }
}
