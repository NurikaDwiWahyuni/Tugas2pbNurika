package com.example.tugas2pb;

public class Model {
    private String namaM;
    private int fotoM;

    public Model(String namaM, int fotoM) {
        this.namaM = namaM;
        this.fotoM = fotoM;
    }

    public String getNamaM() {
        return namaM;
    }

    public void setNamaM(String namaM) {
        this.namaM = namaM;
    }

    public int getFotoM() {
        return fotoM;
    }

    public void setFotoM(int fotoM) {
        this.fotoM = fotoM;
    }
}
