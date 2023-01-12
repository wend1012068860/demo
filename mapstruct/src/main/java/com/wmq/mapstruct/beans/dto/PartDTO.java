package com.wmq.mapstruct.beans.dto;

public class PartDTO {
    /**
     * id
     */
    private Long id;
    /**
     * Áã¼þÃû×Ö
     */
    private String partName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    @Override
    public String toString() {
        return "PartDTO{" +
                "id=" + id +
                ", partName=" + partName +
                '}';
    }
}
