# Sistem Manajemen Jadwal Kegiatan Pribadi (Java Swing)

## 📌 Deskripsi Proyek

Aplikasi **Sistem Manajemen Jadwal Kegiatan Pribadi** adalah aplikasi desktop berbasis **Java Swing** yang digunakan untuk mengelola jadwal kegiatan harian. Aplikasi ini memungkinkan pengguna untuk menambahkan, melihat, memperbarui, dan menghapus jadwal kegiatan serta menampilkan laporan jumlah kegiatan yang tersimpan.

Aplikasi ini cocok digunakan sebagai:

* Tugas UAS / UTS Pemrograman Java
* Contoh implementasi CRUD Java Swing
* Latihan manajemen data sederhana

---

## 🎯 Fitur Utama

1. **Dashboard**

    * Menu Input Jadwal
    * Menu List Jadwal
    * Menu Laporan

2. **Input Jadwal**

    * Input Judul Kegiatan
    * Input Tanggal Kegiatan
    * Pilihan Kategori Kegiatan

3. **List Jadwal**

    * Menampilkan seluruh kegiatan dalam tabel
    * Update jadwal kegiatan
    * Hapus jadwal kegiatan

4. **Laporan**

    * Menampilkan jumlah total kegiatan

---

## 🗂️ Struktur File Proyek

```
📁 project-folder
│── MainApp.java        # Class utama untuk menjalankan aplikasi
│── Kegiatan.java       # Class model data kegiatan
│── FileHandler.java    # Class untuk pengelolaan file (simpan & baca data)
│── README.md           # Dokumentasi proyek
```

---

## 🧩 Penjelasan Class

### 1️⃣ MainApp.java

* Merupakan **class utama (entry point)** aplikasi
* Mengatur navigasi antar halaman (Dashboard, Input, List, Laporan)
* Menjalankan tampilan utama Java Swing

### 2️⃣ Kegiatan.java

* Class **model** yang merepresentasikan data kegiatan
* Menyimpan atribut:

    * Judul kegiatan
    * Tanggal kegiatan
    * Kategori kegiatan
* Digunakan sebagai objek data dalam aplikasi

### 3️⃣ FileHandler.java

* Mengelola penyimpanan data kegiatan
* Digunakan untuk:

    * Menyimpan data ke file
    * Membaca data dari file
* Membantu persistensi data agar tidak hilang saat aplikasi ditutup

---

## ▶️ Cara Menjalankan Aplikasi

1. Pastikan **Java JDK** sudah terinstal
2. Buka project menggunakan:

    * NetBeans / IntelliJ IDEA / VS Code
3. Compile dan jalankan file:

   ```bash
   javac MainApp.java
   java MainApp
   ```

   atau langsung klik **Run** pada IDE

---

## 🛠️ Teknologi yang Digunakan

* Bahasa Pemrograman : **Java**
* GUI Framework      : **Java Swing**
* Penyimpanan Data   : File (Text / Object / Serializable)

---

## 📸 Tampilan Aplikasi (Opsional)

> Tambahkan screenshot aplikasi di bagian ini jika diperlukan

---

## 👨‍💻 Pengembang

* Nama : **Gielbert**
* Bahasa : Java
* Jenis Aplikasi : Desktop Application

---

## 📄 Lisensi

Proyek ini dibuat untuk keperluan **pembelajaran dan akademik**. Bebas digunakan dan dikembangkan kembali.

---

✨ *Terima kasih telah menggunakan Sistem Manajemen Jadwal Kegiatan Pribadi* ✨
