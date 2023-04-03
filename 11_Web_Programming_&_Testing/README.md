# (11) Web Programming and Testing

## Frontend
Frontend merupakan salah satu bagian dari suatu website yang mana berfungsi untuk membuat tampilan yang menarik kepada user yang mengunjungi.

## HTML
HTML adalah singkatan dari Hypertext Markup Language, HTML ini berguna sebagai standar untuk menampilkan halaman website.

### Kegunaan HTML
- Membuat struktur dari halaman website
- Mengatur tampilan dan isi dari halaman web
- Membuat tabel dengan tag HTML table
- Membuat form HTML
- Membuat gambar dengan canvas
- Mempublikasikan halaman web secara online

## Editor HTML
- Notepad
- Notepad++
- Visual Studio Code
- DLL

## Dokumentasi HTML
- <! DOCTYPE html>, berguna untuk mendefinisikan dokumen sebagai HTML5
- <html>, berguna sebagai elemen root pada suatu halaman HTML
- <head>, berguna untuk memberi informasi meta tentang dokumen
- <title>, berguna untuk menentukan judul untuk dokumen
- <body>, berisi konten halaman yang terlihat

## Tag Heading and Paragraph
- <h1> - <h6> berguna sebagai heading pada halaman website
- <p> berguna untuk memisahkan paragraph

## Styling pada Paragraph
- <strong> untuk membuat teks tebal
- <em> untuk membuat teks miring
- <s> untuk membuat teks garis coret
- <br> untuk line break membuat garis baru

## List HTML
- Ordered List, list yang berurut (<ol>)
- Unordered List, list yang tidak berurut (<ul>)

untuk pendeklarasiannya dapat menggunakan <li>

## CSS
CSS adalah singkatan dari Cascading Style Sheet, yang berguna untuk menghias halaman web, dapat menambahkan warna, font, background, dan lainnnya, kemudian juga dapat mengatur posisi pada halaman web seperti float, align, display, dan lainnya.

## Tag Table
Tag table berguna untuk membuat tabel pada halaman website dengan menggunakan tag <table> kemudian untuk barisnya menggunakan <tr> dan kolom menggunakan <td>, dan kolom pada tabel header menggunakan <th>.

## Tag form
Berguna untuk membuat form pada laman website dengan tag <form>

## Cara menambah file CSS
1. External CSS, disisipkan dalam tag <head>
2. Internal CSS, didefinisikan dalam elemen <style>, <head>, <body>
3. Inline CSS, dapat digunakan untuk elemen tunggal pada HTML, untuk menerapkan style yang unik

## CSS Selector
Digunakan untuk memilih element yang akan distyling

## Penanda HTML
### ID (#)
- Setia
- p elemen hanya dapat memiliki satu tag id
- Dalam satu halaman tidak boleh ada dua penamaan id yang berbeda

### Class (.)
- Tag class dengan nama yang sama dapat dipakai berulang-ulang dalam halaman yang sama
- Satu elemen dapat memiliki lebih dari satu Class yang berbeda.

## CSS Grouping
Beberapa selector dapat dikelompokkan dalam satu deklarasi style

## CSS Font
Font yang digunakan untuk teks, seperti ukuran, ketebalan,kemiringan, dan lainnya. Font-font yang dapat digunakan dapat dicari pada google dan mendowloadnya.

## CSS Margin and Padding
Untuk membuat ruang di sekitar element

## CSS Background
Untuk membuat style pada background, contohnya seperti color untuk menentukan warna, image untuk menentukan gambar, size untuk menentukan ukuran gambar, dan lainnya

## CSS Link
- :hover, untuk kondisi mouse ketika terdapat pada atas elemen
- :active, style yang diberikan ketika link ditekan
- :visited, style yang diberikan ketika link sudah ditekan

## CSS Transisi
Berguna untuk mengubah value properti menjadi lebih halus dalam durasi yang ditentukan.

## CSS Display
Untuk menentukan tampilan pada elemen yang dipilih, dapat dengan block (yang selalu dimulai pada baris baru), inline-block (membutuhkan lebar sesuai yang diperlukan), dan none untuk menyembunyikan elemen untuk tidak ditampilkan

## CSS Table
Untuk membuat style pada elemen table HTML, dapat dengan menambah border, border-collapse untuk menjadi single border, dan :nth-child(even) untuk membuat backgroun stripe.

## Frontend Framework
Frontend Framework merupakan sekumpulan aturan kode yang dapat digunakan untuk mempermudah kita dalam membuat suatu tampilan website.

## Kelebihan Bootsrap
- Gratis
- Mudah untuk dipelajari
- Cepat
- Support responsive

## Class pada bootstrap
Terdapat beberapa kelas pada bootstrap seperti container, row, column, dan button.

## Sistem Grid
Sistem grid digunakan pada column yang mana dalam satu halaman terdapat sejumalah 12 kemudian dapat dipisah sesuai dengan kebutuhan.

## Architecture Serenity BDD
Serenity merupakan open source BDD framework yang membantu pengembang dalam pembuatan penulisan well-structured dan maintainable automated acceptance test.

Terdiri dari requirements, test, steps, pages, dan reports.

## Define Requirement
- Ketika menggunakan serenity harus memulai dengan kebutuhan yang akan diimplementasikan
- Sering diibaratkan sebagai user storie dengan kriteria yang membantu perjelas persyaratan.
- Terdapat stories yang serenity automate

## Automate Acceptance Criteria
- Menjelaskan acceptance criteria dalam high level business term
- Menggunakan BDD tool untuk record seperti cucumber dan lainnya, kemudian mengimplementasikannya

## Report on Test Result
Setiap test yang kita lakukan harus terdapat report hasilnya, salah satunya dengan serenity yang memberikan hasil detail pada pengujian yang dilakukan.

## BDD with Cucumber
### Steps
1. Write Story, dengan gherkin (given when then)
2. Map Steps to Java, mengonfigurasi step script dan validasinya
3. Configure Stories, menggabungkan stories dan steps
4. Run Stories, menggunakan intellij IDEA maven
5. View Reports, membuat dan melihat hasilnya dengan serenity

## Yang harus disiapkan
- Maven
- Homebrew
- Chrome
- Intellij

## Writing the Test
1. Serenity Cucumber
2. Create File Stories
3. Create File Test Class
4. Create File Test Steps
5. Create File Page Object

## Serenity Properties
- Serenity mendukung banyak properti yang dapat dimodifikasi sesuai dengan pengujian yang dijalankan
- Webdriver.driver menjelaskan browser yang akan digunakan untuk test
- Ignore.failures.in.stories untuk mengset serenity untuk melanjutkan pengujian ke skenario berikutnya walaupun skenario yang sebelumnya gagal

## Meta Filtering
- Untuk membantu memanage story scenario, dengan menggunakan tag pada fitur atau skenario
- Untuk menjalankan tag yang spesifik dapat menjalankan perintah mvn verify -Dtags="@User"

## Parameterised Scenario
- Dalam story, scenario dapat diparameterised deengan value yang sudah dikonfigurasi
- Parameterised scenario sama saja dengan multiple scenario namun dengan value yang berbeda