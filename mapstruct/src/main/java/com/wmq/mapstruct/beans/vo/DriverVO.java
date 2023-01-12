package com.wmq.mapstruct.beans.vo;

public class DriverVO {
    private Long driverId;
    private String fullName;

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "DriverVO{" +
                "driverId=" + driverId +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
