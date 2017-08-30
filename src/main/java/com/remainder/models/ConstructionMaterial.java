package com.remainder.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by lisette on 8/8/17.
 */
@Entity
public class ConstructionMaterial {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String materialName;

    @NotNull
    @Size(min=3, max=15)
    private String quantity;

    @NotNull
    @Size(min=3, max=15)
    private String owner;

    @NotNull
    @Size(min=3, max=15)
    private String pickupAddress;

    @NotNull
    @Size(min=5, max=15)
    private String zipcode;

    @ManyToOne
    private ConstructionMaterialCategory constructionMaterialCategory;

    public ConstructionMaterial(String materialName, String quantity, String owner, String pickupAddress, String zipcode, ConstructionMaterialCategory constructionMaterialCategory) {
        this.materialName = materialName;
        this.quantity = quantity;
        this.owner = owner;
        this.pickupAddress = pickupAddress;
        this.zipcode = zipcode;
        this.constructionMaterialCategory = constructionMaterialCategory;
    }

    public ConstructionMaterial() {}

    public int getId() {
        return id;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPickupAddress() {
        return pickupAddress;
    }

    public void setPickupAddress(String pickupAddress) {
        this.pickupAddress = pickupAddress;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public ConstructionMaterialCategory getConstructionMaterialCategory() {
        return constructionMaterialCategory;
    }

    public void setConstructionMaterialCategory(ConstructionMaterialCategory constructionMaterialCategory) {
        this.constructionMaterialCategory = constructionMaterialCategory; }

}
