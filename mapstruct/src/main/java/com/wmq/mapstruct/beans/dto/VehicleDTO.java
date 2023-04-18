package com.wmq.mapstruct.beans.dto;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/1/13
 * @description:
 */
public class VehicleDTO {
    private Long id;
    private Double price;
    private String brand;

    @Override
    public String toString() {
        return "VehicleDTO{" +
                "id=" + id +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
