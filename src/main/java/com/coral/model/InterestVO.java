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
@ApiModel(description= "利益项数据")
public class InterestVO implements Serializable {

    @ApiModelProperty(value = "利益项")
    String interestId;
    @ApiModelProperty(value = "利益项名",required = true)
    String interestName;
    @ApiModelProperty(value = "描述")
    String description;
    @ApiModelProperty(value = "价格",required = true)
    BigDecimal price;
    @ApiModelProperty(value = "折后价格")
    BigDecimal discountPrice;

    public String getInterestId() {
        return interestId;
    }

    public void setInterestId(String interestId) {
        this.interestId = interestId;
    }

    public String getInterestName() {
        return interestName;
    }

    public void setInterestName(String interestName) {
        this.interestName = interestName;
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

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }
}
