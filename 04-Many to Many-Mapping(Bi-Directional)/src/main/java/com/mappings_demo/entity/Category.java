package com.mappings_demo.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {

    @Id
    private String cid;
    private  String title;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Product> productList=new ArrayList<>();


    public Category() {
    }

    public Category(String cid, String title) {
        this.cid = cid;
        this.title = title;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
