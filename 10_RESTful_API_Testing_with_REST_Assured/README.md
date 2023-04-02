# (10) Restful API Testing with REST Assured

## Konsep API
User memberikan suatu request kepada API kemudian melanjutkannya ke application, setelah sampai di application kembali lagi mengembalikan response kepada API dan kemudian diteruskan kepada user.

## Fundamental API Integration
1. Mobile App
2. API Server
3. Ext Process
4. API Testing

## Fundamental API
### Test Process
1. Record, Define API Information
2. Parsing, Filter or Recording API Data and then Extract
3. Reconstruction API Calls, and Sent Them From a Simulate Client
4. Test Validation

## The Practical Test Pyramid
- UI (End to End), menguji interaksi antara user dan interface yang ada.
- Integration, menguji interaksi antara dua modul atau subsistem lewat kontrak API.
- Component, menguji modul yang lebih spesifik lewat API.
- Unit, menguji unit terkecil dari aplikasi melalui beberapa metode.

## BDD With Cucumber
### Steps
1. Write Story, dengan gherkin (given when then)
2. Map Steps to Java, mengonfigurasi step script dan validasinya
3. Configure Stories, menggabungkan stories dan steps
4. Run Stories, menggunakan intellij IDEA maven
5. View Reports, membuat dan melihat hasilnya dengan serenity

## REST ASSURED
- Mendukung untuk HTTP Method
- Mendukung untuk BDD Gherkin
- Penggunaan hamcrest matches untuk pengecekan (equalTo)
- Penggunaan Gpatch untuk pemilihan elemen dari respon Json

## Yang harus disiapkan
- JAVA Versi 1.8
- Maven Versi 3.5.2
- Intellij IDEA 2018

## Pembuatan Project
1. Membuat project baru dengan Intellij pastikan dengan maven
2. Membuat class story dan juga class runnernya yang nanti akan dijalankan
3. Membuat test dengan REST Assured .given() test setup -> .when() test action -> .then() test verification
4. Membuat response code 200 yang berarti HTTP response code berhasil, kemudian membuat value datanya
5. Validation JSON skema dengan JSON response

## Report Serenity
Dengan melihat dari html serenity dapat melihat overall dari pengujian yang dilakukan dan juga terdapat detail dari pengujian yang dilakukan.