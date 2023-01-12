package com.wmq.mapstruct.beans.dto;

public class DriverDTO {
    /**
     * id
     */
    private Long id;
    /**
     * Ãû×Ö
     */
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DriverDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
