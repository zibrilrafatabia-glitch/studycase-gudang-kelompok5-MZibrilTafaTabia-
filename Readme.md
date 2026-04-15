# studycase-crud-sederhan-kelompok-5-bintang-akbar-sutjipto
# Study Case: Sistem CRUD Data Barang (Java Console)

## 📌 Tema  
Aplikasi sederhana untuk mengelola data barang di gudang menggunakan Java berbasis console.

---

## 🎯 Tujuan Pembelajaran  
Study case ini dibuat untuk memahami konsep dasar pemrograman Java, khususnya:

- Class & Object  
- ArrayList (Struktur Data Dinamis)  
- Method & Function  
- Input/Output (Scanner)  
- Konsep CRUD (Create, Read, Update, Delete)

---

## 📁 Struktur Folder
```
pergudangan/
├── Main.java # Program utama (CRUD logic & menu)
├── Main.class # Hasil compile Java
└── README.md # Dokumentasi project
```

---

## ⚙️ Spesifikasi Program

Program memiliki fitur utama sebagai berikut:

### 1. Tambah Barang (Create)
- Input:
  - Nama barang
  - Harga
  - Stok
- Data disimpan ke dalam `ArrayList`

---

### 2. Tampilkan Barang (Read)
- Menampilkan seluruh data barang
- Setiap data memiliki index

---

### 3. Edit Barang (Update)
- Pilih barang berdasarkan index
- Ubah:
  - Nama
  - Harga
  - Stok

---

### 4. Hapus Barang (Delete)
- Pilih barang berdasarkan index
- Data akan dihapus dari list

---

## 🧠 Struktur Class

### Class `Barang`
Digunakan untuk merepresentasikan data barang.

**Atribut:**
- `String nama`
- `int harga`
- `int stok`

**Method:**
- `tampil()` → menampilkan data barang

---

### Class `Main`
Berisi:
- ArrayList untuk menyimpan data barang
- Menu interaktif
- Method CRUD:
  - `tambahBarang()`
  - `tampilBarang()`
  - `editBarang()`
  - `hapusBarang()`

---

## ▶️ Cara Menjalankan Program

1. Buka terminal / CMD
2. Masuk ke folder project: cd pergudangan
3. Compile: javac Main.java
4. Jalankan: java Main

---

## 🖥️ Contoh Tampilan Menu
=== MENU ===

1. Tambah Barang
2. Tampilkan Barang
3. Edit Barang
4. Hapus Barang
5. Keluar

---

## 🚀 Pengembangan (Opsional)

Untuk meningkatkan fitur dan nilai project, bisa ditambahkan:

- 🔍 Pencarian barang (Search)
- 💾 Penyimpanan ke file (FileWriter / FileReader)
- 🆔 ID barang otomatis
- 🎨 Versi GUI (Java Swing)

---

## 📌 Kesimpulan

Program ini merupakan implementasi sederhana dari konsep CRUD menggunakan Java.  
Dengan menggunakan ArrayList dan Class, data dapat dikelola secara dinamis dan terstruktur.

---