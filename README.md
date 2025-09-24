Aplikasi ini mengimplementasikan konsep state untuk membuat UI yang dinamis dan interaktif. State adalah data yang mengendalikan bagaimana tampilan UI terlihat. Dalam setiap contoh, perubahan data (state) secara otomatis memicu UI untuk memperbarui dirinya sendiri melalui proses yang disebut recomposition.

Implementasi state menggunakan dua komponen utama:

1. mutableStateOf(): Ini adalah wadah yang dapat diamati (observable holder) untuk sebuah nilai. Ketika nilai di dalamnya berubah, ia akan memberi tahu Jetpack Compose agar UI diperbarui.
2. remember: Ini adalah fungsi yang menjaga agar nilai state tetap hidup melintasi recomposition, sehingga nilai tidak akan hilang saat UI digambar ulang.

Setiap mini-aplikasi menggunakan state untuk fungsionalitasnya:

1. Aplikasi Counter Plus-Minus: Menggunakan state count untuk menyimpan nilai integer. Setiap kali tombol + atau - ditekan, nilai count berubah, dan teks pada layar akan otomatis diperbarui.
2. Tombol Toggle Warna: Menggunakan state isRed yang menyimpan nilai boolean. Perubahan pada nilai ini akan memicu Box untuk mengganti warnanya dari merah ke hijau, dan sebaliknya.
3. Aplikasi Profil Interaktif: Menggunakan state isFollowed untuk menyimpan status Follow atau Unfollow. Teks pada tombol dan indikator di bawahnya akan berubah secara otomatis berdasarkan nilai isFollowed yang saat ini.

Untuk kasus-kasus interaktif sederhana seperti ini, Jetpack Compose menawarkan pendekatan yang jauh lebih sederhana dibandingkan UI tradisional berbasis XML karena beberapa alasan:
1. Pendekatan Deklaratif: Compose menggunakan paradigma UI deklaratif, di mana UI adalah representasi langsung dari state aplikasi. Ini menghilangkan kebutuhan untuk secara manual menemukan dan memanipulasi komponen UI seperti findViewById pada XML. Cukup dengan mengubah state, UI akan otomatis menyesuaikan diri.
2. Kode yang Lebih Ringkas: Logika untuk mengubah tampilan UI, seperti teks pada tombol atau warna latar belakang, dapat ditulis langsung di dalam Composable itu sendiri menggunakan logika kondisional (if/else). Ini membuat kode lebih ringkas dan mudah dibaca, karena logika dan tampilan berada di satu tempat yang sama. Sebaliknya, pada XML, logika ini harus ditulis secara terpisah di file Kotlin/Java, yang membuat kode terpecah.
3. UI Lebih Mudah Dipelihara: Dengan memisahkan data (state) dari tampilan UI, seperti yang terlihat pada konsep State Hoisting, komponen UI menjadi "stateless" dan dapat digunakan kembali di mana saja tanpa perlu membawa logikanya sendiri. Hal ini membuat kode lebih bersih, terstruktur, dan lebih mudah dipelihara di masa depan.
