# katalon-finalweb-Rayhan Nabhan Lukmansyah

Proyek ini merupakan automation testing framework yang dikembangkan menggunakan **Katalon Studio** (v9.x/2026) untuk menguji platform e-commerce **Advantage Online Shopping**. Pengujian difokuskan pada keandalan fungsionalitas utama seperti manajemen akun dan validasi formulir interaktif.

## 📝 Deskripsi Proyek
Tujuan utama proyek ini adalah untuk melakukan verifikasi end-to-end pada website Advantage Shopping, memastikan alur bisnis mulai dari pendaftaran pengguna hingga layanan bantuan pelanggan (Contact Us) berjalan tanpa kendala secara otomatis.

## 📁 Struktur Pengujian (Test Suites)

Proyek ini dibagi menjadi dua suite utama untuk pengorganisasian yang lebih baik:

### 1. Test Suite 1: Registration and Login
Suite ini fokus pada alur identitas pengguna:
*   **Registration**: Validasi pembuatan akun baru, pengisian detail user, hingga verifikasi keberhasilan pembuatan akun.
*   **Login**: Pengujian autentikasi standar untuk memastikan user dapat masuk ke sistem setelah mendaftar.

### 2. Test Suite 2: Data Test (Login & Contact Us Form)
Suite ini menggunakan pendekatan *Data-Driven Testing* untuk mencakup berbagai skenario:
*   **Login Form Data Test**: Pengujian login dengan berbagai kombinasi data (valid, invalid, dan empty fields) untuk memastikan pesan error muncul dengan benar.
*   **Contact Us Form**: 
    *   Verifikasi pemilihan produk yang dinamis (dependent dropdown).
    *   Pengiriman pesan bantuan.
    *   Validasi pesan error dan sukses dengan mekanisme *Wait for Text* untuk menangani delay asinkron pada UI.

## 🛠️ Teknologi yang Digunakan
*   **Katalon Studio**: Versi 10.x (Januari 2026).
*   **Bahasa Pemrograman**: Groovy/Java.
*   **Teknik Spesial**: 
    *   Implementasi **Enum** untuk navigasi menu yang rapi.
    *   **Dynamic XPath** menggunakan parameterisasi variabel.
    *   **Smart Wait** & **Conditional Waits** untuk sinkronisasi elemen yang stabil.

## ⚙️ Cara Menjalankan
1. Clone atau download repository ini.
2. Buka **Katalon Studio** dan pilih **Open Project**.
3. Pilih direktori `katalon-finalweb-Rayhan Nabhan Lukmansyah`.
4. Pastikan browser **Chrome** Anda sudah ter-update.
5. Jalankan Test Suite melalui folder `Test Suites` > Pilih Suite > Klik tombol **Run**.

## 📊 Pelaporan
Setiap hasil eksekusi akan tersimpan secara otomatis di folder `Reports`. Laporan mencakup:
*   Status kelulusan tiap *Test Step*.
*   Waktu eksekusi.
*   *Screenshots* otomatis jika terjadi kegagalan (Failure).

## 👤 Penulis
**Rayhan Nabhan Lukmansyah**
*Final Project - Web Automation Testing*