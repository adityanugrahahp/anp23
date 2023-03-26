# (8) Restful API Introduction and Testing

## API
API adalah singkatan dari Application Programming Interface, yang memungkinkan aplikasi untuk berkomunikasi dan bertukar data antara dua atau lebih program perangkat lunak yang terpisah. 

## REST API
REST atau Representational State Transfer adalah arsitektur pemrograman berbasis web standar yang biasanya menggunakan HTTP sebagai protokol transfer data. REST juga merupakan implementasi dari web service sebagai standar pertukaran data. Jika API bersifat binding, maka REST membuat aturan sesuai keinginan developer saat mendesain web service. 

## HTTP METHOD
Resource Endpoint : URL 
GET, untuk membaca Data 
PUT, untuk mengganti data 
POST, untuk membuat data baru
DELETE, untuk menghapus data yang ada

## REST API Component
- Method
- URL
- Header
- Body

## JSON
Biasanya API memiliki JSON, JSON atau Notasi Objek JavaScript adalah format data yang digunakan untuk bertukar dan menyimpan data. JSON dapat dibaca oleh beberapa bahasa pemrograman seperti C, C++, Java, Python, dll. 

## HTTP Response Code
- 200 OK : menandakan request yang dikirim success
- 201 Created : menandakan request yang dikirim success dan resources yang dikirim berhasil dibuat, biasanya dipakai method POST dan PUT
- 400 Bad Request : data tidak sesuai dengan format saat request POST atau PUT
- 404 Not Found : terjadi ketika resource tidak ditemukan
- 401 Unauthorized : terjadi karena tidak melakukan autentikasi
- 405 Method : salah menggunakan method
- 500 Internal : kesalah di server

## API Testing
Pengujian API adalah pengujian yang dilakukan pada tingkat di mana fungsionalitas API yang direncanakan dapat diverifikasi. API diharapkan dapat memberikan gambaran umum tentang respons aplikasi web sebelum UI siap. 

### Contoh Testing
- Functionality, untuk memvalidasi suatu fitur sudah berfungsi apa belum
- Load Test, untuk menguji kekuatan suatu sistem
- Security, untuk menguji keamanan suatu sistem

### Tools
- Postman
- JMeter
- frisby.js
- REST-assured

## Perbedaan API dan Unit Test
### Unit Test:
- Dilakukan oleh Developer
- Fungsi - fungsi terpisah
- Developer bisa mengakses source code
- Hanya dasar functionality yang ditest
- Scopenya terbatas
- Biasanya dilakukan sebelum build

### API Test:
- Dilakukan oleh Software Tester
- End to End
- Tidak bisa mengakses source code
- Hanya fungsi API saja
- Semua functional issue
- Scopenya lebih luas
- Dilakukan setelah build

### Manfaat
- Waktu yang lebih efisien
- Dapat menghemat biaya
- Mengurangi risiko