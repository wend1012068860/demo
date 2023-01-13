package com.wmq.mapstruct.beans.dto;

import java.util.Date;
import java.util.List;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/1/12
 * @description:
 */
public class CarDTO {

    private Long id;

    private String vin;

    private double price;

    private double totalPrice;

    private Date publishDate;

    private String brand;

    private List<PartDTO> partDTOS;

    private DriverDTO driverDTO;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<PartDTO> getPartDTOS() {
        return partDTOS;
    }

    public void setPartDTOS(List<PartDTO> partDTOS) {
        this.partDTOS = partDTOS;
    }

    public DriverDTO getDriverDTO() {
        return driverDTO;
    }

    public void setDriverDTO(DriverDTO driverDTO) {
        this.driverDTO = driverDTO;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "id=" + id +
                ", vin='" + vin + '\'' +
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                ", publishDate=" + publishDate +
                ", brand='" + brand + '\'' +
                ", partDTOS=" + partDTOS +
                ", driverDTO=" + driverDTO +
                '}';
    }
}
