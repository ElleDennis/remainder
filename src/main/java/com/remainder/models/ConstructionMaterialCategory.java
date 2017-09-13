package com.remainder.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.persistence.OneToMany;


/**
 * Created by lisette on 24/8/17.
 */
@Entity
public enum ConstructionMaterialCategory {

    GENERALREQUIREMENTS ("General Requirements"),
    SITECONSTRUCTION ("Site Construction"),
    CONCRETE ("Concrete"),
    MASONRY ("Masonry"),
    METALS ("Metals"),
    WOODPLASTIC ("Wood and Plastic"),
    THERMALPROTECTION ("Thermal and Moisture Protection"),
    DOORSWINDOWS ("Doors and Windows"),
    FINISHES ("Finishes"),
    SPECIALTIES ("Specialities"),
    EQUIPMENT ("Equipment"),
    SPECIALCONSTRUCTION ("Special Construction"),
    CONVEYINGSYSTEMS ("Conveying Systems"),
    MECHANICAL ("Mechanical"),
    ELECTRICAL ("Electrical");

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

    @OneToMany
    @JoinColumn(name = "constructionMaterialCategory")
    private List<ConstructionMaterial> constructionMaterials = new ArrayList<>();

    ConstructionMaterialCategory() { }

    ConstructionMaterialCategory(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ConstructionMaterial> getConstructionMaterials() {
        return constructionMaterials;
    }

    public void setConstructionMaterials(List<ConstructionMaterial> constructionMaterials) {
        this.constructionMaterials = constructionMaterials;
    }

}
