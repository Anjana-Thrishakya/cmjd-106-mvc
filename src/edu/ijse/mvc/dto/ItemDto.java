/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author anjan
 */
public class ItemDto {
    
    private String code;
    private String description;
    private String packSize;
    private double unitPrice;
    private int qoh;

    public ItemDto() {
    }

    public ItemDto(String code, String description, String packSize, double unitPrice, int qoh) {
        this.code = code;
        this.description = description;
        this.packSize = packSize;
        this.unitPrice = unitPrice;
        this.qoh = qoh;
    }

    

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the packSize
     */
    public String getPackSize() {
        return packSize;
    }

    /**
     * @param packSize the packSize to set
     */
    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the qoh
     */
    public int getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(int qoh) {
        this.qoh = qoh;
    }

    @Override
    public String toString() {
        return "ItemDto{" + "code=" + code + ", description=" + description + ", packSize=" + packSize + ", unitPrice=" + unitPrice + ", qoh=" + qoh + '}';
    }

    
}
