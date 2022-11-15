package com.example.baikiemtra;

public class CaSi {
    private String tenCS, ngheDanh,quocGia, soSao;
    private int hinh;

    public CaSi(String tenCS, String ngheDanh, String quocGia, String soSao, int hinh) {
        this.tenCS = tenCS;
        this.ngheDanh = ngheDanh;
        this.quocGia = quocGia;
        this.soSao = soSao;
        this.hinh = hinh;
    }

    public String getTenCS() {
        return tenCS;
    }

    public void setTenCS(String tenCS) {
        this.tenCS = tenCS;
    }

    public String getNgheDanh() {
        return ngheDanh;
    }

    public void setNgheDanh(String ngheDanh) {
        this.ngheDanh = ngheDanh;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getSoSao() {
        return soSao;
    }

    public void setSoSao(String soSao) {
        this.soSao = soSao;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
