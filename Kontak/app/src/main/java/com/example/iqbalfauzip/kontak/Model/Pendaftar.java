package com.example.iqbalfauzip.kontak.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Iqbal Fauzi P on 06/12/2017.
 */

public class Pendaftar {
    @SerializedName("id_pen")
    private String id_pen;
    @SerializedName("nama")
    private String nama;
    @SerializedName("alamat")
    private String alamat;
    @SerializedName("ttl")
    private String ttl;

    public Pendaftar(){}
    public Pendaftar(String id_pen, String nama, String alamat, String ttl) {
        this.id_pen = id_pen;
        this.nama = nama;
        this.alamat = alamat;
        this.ttl = ttl;
    }

    public String getId_pen() {
        return id_pen;
    }

    public void setId_pen(String id_pen) {
        this.id_pen = id_pen;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }
}

