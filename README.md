Praktikum 3 - State (Jetpack Compose)
📌 Deskripsi

Proyek ini merupakan implementasi State Management di Android Jetpack Compose.
Aplikasi ini menampilkan tiga contoh utama penggunaan remember dan mutableStateOf untuk mengelola perubahan state secara real-time di UI, yaitu:

Counter Plus-Minus

Penghitung sederhana dengan tombol + dan -.

Tombol - akan nonaktif jika nilai counter sudah 0 (tidak bisa negatif).

Color Toggle Button

Sebuah kotak yang dapat berganti warna antara merah dan hijau ketika tombol ditekan.

Interactive Profile

Menampilkan foto profil, nama, dan deskripsi.

Tombol Follow/Unfollow yang berubah sesuai interaksi pengguna.

Indikator teks akan menampilkan status: “Anda mengikuti akun ini” atau “Anda belum mengikuti akun ini”.

📂 Struktur Utama

MainActivity.kt → Berisi setContent dan pemanggilan TugasPraktikumScreen.

TugasPraktikumScreen → Mengatur tata letak utama dan memanggil tiga fitur:

CounterPlusMinusApp()

ColorToggleButtonApp()

InteractiveProfileApp()

🚀 Cara Menjalankan

Clone atau ekstrak proyek.

Buka dengan Android Studio (Arctic Fox atau lebih baru).

Jalankan pada emulator atau perangkat fisik Android dengan minSdk 24+.

🛠️ Teknologi yang Digunakan

Kotlin

Jetpack Compose (Material 3)

State Management (remember, mutableStateOf)

👨‍💻 Identitas

Nama: Hanidura Ayatulloh

NIM: 225150207111005

Praktikum: Pemrograman Mobile - Praktikum 3 (State)
