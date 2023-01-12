package com.wmq.mapstruct.beans.vo;

public class partVO {
    private Long partId;
    private String partName;

    public Long getPartId() {
        return partId;
    }

    public void setPartId(Long partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    @Override
    public String toString() {
        return "partVO{" +
                "partId=" + partId +
                ", partName='" + partName + '\'' +
                '}';
    }
}
