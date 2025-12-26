package org.example;

import java.io.Serializable;

public class Kegiatan implements Serializable {
    private String judul;
    private String tanggal;
    private String kategori;

    public Kegiatan(String judul, String tanggal, String kategori) {
        this.judul = judul;
        this.tanggal = tanggal;
        this.kategori = kategori;
    }

    // Getter dan Setter
    public String getJudul() { return judul; }
    public String getTanggal() { return tanggal; }
    public String getKategori() { return kategori; }

    @Override
    public String toString() {
        return judul + "|" + tanggal + "|" + kategori;
    }
}