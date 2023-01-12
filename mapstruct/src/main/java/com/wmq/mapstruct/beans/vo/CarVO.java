package com.wmq.mapstruct.beans.vo;


import com.wmq.mapstruct.beans.dto.DriverDTO;
import com.wmq.mapstruct.beans.dto.PartDTO;

import java.util.Date;
import java.util.List;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/1/12
 * @description:
 */
public class CarVO {
    /**
     * id
     */
    private Long id;
    /**
     * �������
     */
    private String vin;
    /**
     * �㳵��
     */
    private Double price;
    /**
     * �ܼ�
     */
    private String totalPrice;
    /**
     * ��������
     */
    private String publishDate;
    /**
     * Ʒ��
     */
    private String brandName;
    /**
     * ��������б�
     */
    private Boolean hasPart;
    /**
     * ˾��
     */
    private DriverVO driverVO;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Boolean getHasPart() {
        return hasPart;
    }

    public void setHasPart(Boolean hasPart) {
        this.hasPart = hasPart;
    }

    public DriverVO getDriverVO() {
        return driverVO;
    }

    public void setDriverVO(DriverVO driverVO) {
        this.driverVO = driverVO;
    }

    @Override
    public String toString() {
        return "CarVO{" +
                "id=" + id +
                ", vin='" + vin + '\'' +
                ", price=" + price +
                ", totalPrice='" + totalPrice + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", brandName='" + brandName + '\'' +
                ", hasPart=" + hasPart +
                ", driverVO=" + driverVO +
                '}';
    }
}
