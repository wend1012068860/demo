package com.wmq.mapstruct.beans.vo;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/1/13
 * @description:
 */
public class VehicleVO {
    private Long id;
    private Double price;
    private String brandName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "VehicleVO{" +
                "id=" + id +
                ", price=" + price +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
