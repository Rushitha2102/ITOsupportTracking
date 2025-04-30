package com.example.TicketSupport.Modules;

import jakarta.persistence.*;

@Entity
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subCategoryId;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    private String subCategoryDesc;

    public SubCategory(Long subCategoryId, Category category, String subCategoryDesc) {
        this.subCategoryId = subCategoryId;
        this.category = category;
        this.subCategoryDesc = subCategoryDesc;
    }
    public SubCategory() {

    }

    public Long getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Long subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getSubCategoryDesc() {
        return subCategoryDesc;
    }

    public void setSubCategoryDesc(String subCategoryDesc) {
        this.subCategoryDesc = subCategoryDesc;
    }
}