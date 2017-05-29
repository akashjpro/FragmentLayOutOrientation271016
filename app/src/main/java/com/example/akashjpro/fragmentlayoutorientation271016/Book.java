package com.example.akashjpro.fragmentlayoutorientation271016;

import java.io.Serializable;

/**
 * Created by Akashjpro on 10/27/2016.
 */

public class Book implements Serializable {
    private String ten;
    private Integer gia;
    private Integer soTrang;
    private String theLoai;

    public Book(String ten, Integer gia, Integer soTrang, String theLoai) {
        this.ten = ten;
        this.gia = gia;
        this.soTrang = soTrang;
        this.theLoai = theLoai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public Integer getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(Integer soTrang) {
        this.soTrang = soTrang;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }
}
