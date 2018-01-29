package com.example.iqbalfauzip.kontak.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Iqbal Fauzi P on 06/12/2017.
 */

public class Lomba {
    @SerializedName("id")
    private String id;
    @SerializedName("pid")
    private String pid;
    @SerializedName("id_pen")
    private String id_pen;
    @SerializedName("nama")
    private String nama;
    @SerializedName("cabang")
    private String cabang;
    @SerializedName("tgl")
    private String tgl;

    public Lomba(){}
    public Lomba(String id, String pid, String id_pen, String nama, String cabang, String tgl) {
        this.id = id;
        this.pid = pid;
        this.id_pen = id_pen;
        this.nama = nama;
        this.cabang = cabang;
        this.tgl = tgl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
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

    public String getCabang() {
        return cabang;
    }

    public void setCabang(String cabang) {
        this.cabang = cabang;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }
}
