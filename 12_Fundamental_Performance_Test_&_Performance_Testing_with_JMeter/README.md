# (12) Fundamental Performance Test and Performance Testing with JMeter

## What is Performance Test?
Performance test merupakan teknik non functional testing yang digunakan sebagai penentu parameter sistem dalam hal responsif dan stabilitas di bawah berbagai beban atau load kerja. Performance testing akan mengukur kualitas atribut dari sistem stabilitas, ketahanan (reliability), dan penggunaaan sumber daya.

## Yang Diukur dari Performance Test
- Performa suatu aplikasi sampai suatu batas tertentu
- Bukan merupakan functional test
- Bisa dalam berbagai macam bentuk untuk memahami reliability, stability, dan availability pada environtmentnya, sebagai contoh :
- Mengamati response time ketika menjalankan request dalam jumlah yang sangat banyak
- Melihat suatu sistem berinteraksi dengan jumlah data yang cukup besar

## Alasan Performance Test Jarang Dilakukan
Yang menjadi perhatian biasanya throughput dan response data

## Contoh Kasus
Sebuah sistem baru yang akan dilaunch ke production, namun sebelum masuk ke production perlu dilakukan performance test untuk mengetahui throughput dan response time dari sistem tersebut, untuk informasi endpoint yang akan ditest adalah /login, /beli-pulsa, /cek-out, dan langkah yang harus dilakukan adalah membuat test plan, membuat script test, melakukan performance test, dan menganalisa hasil performance test


## Membuat Test Plan
Endpoint yang akan ditest
1. /login
2. /beli-pulsa
3. /cek-out

Kebutuhan masing-masing endpoint
1. Username dan password untuk endpoint /login
2. Produk, denom dan nomor untuk pengetesan untuk endpoint /beli-pulsa
3. Metode pembayaran yang dipilih untuk endpoint /cek-out

## Tipe Performance Test
### Smoke Testing
Dilakukan untuk verify script yang sudah dibuat, apakah sistem tersebut dapat handle minimal load, tanpa masalah sama sekali. Biasanya hanya 1-2 VUs

### Load Testing
Load testing adalah pengujian yang paling sederhana yang dilakukan untuk memahami perilaku sistem dalam keadaan bebas tertentu. Hasil dari load test digunakan untuk mengukur kepentingan bisnis saat transaksi yang kritis dengan memonitor dampak terhadap database, application server, atau pendukung lainnya

Sederhananya load testing menentukan kelakuan sistem pada saat kondisi normal dan puncak. Idealnya, kita mengetahui jumlah traffic yang ada di prod sebagai nilai di load test

### Table Tier
Dijadikan patokan ideal suatu sistem baru yang belum pernah masuk ke production

### Stress Testing
Metode ini untuk dilakukan untuk mengamati kemampuan dan kestabilan sistem pada saat kondisi ekstrem. Dilakukan bertahap menuju load normal, puncak, dan melebihinya, lalu turun untuk melihat proses recovery

### Spike Testing
Seperti stress test, namun kenaikan langsung menuju melebihi puncak dilakukan dalam waktu singkat. Jika stress test memberikan waktu untuk scale-out, disini tidak. Salah satu contoh adalah pada saat flash sale di suatu e-commerce, yang dimana banyaknya kunjungan pengguna yang langsung memuncak saat mengakses halaman flash sale

### Soak Testing
Untuk mengetahui reliability ketika dalam tekanan di dalam puncak dalam jangka panjang lebih dari 1 jam. Dapat mengetahui apakah terdapat bug pada race condition, memory leaks, db connection, dan lainnya

## Istilah - istilah dalam performance test
- System Under Test (SUT), sebutkan untuk sistem yang sedang dilakukan test
- Load Generator, sebutkan untuk server yang digunakan untuk membuat request
- Throughput, satuan kerja dalam satuan waktu. Misalnya request per second (rps) dan request per minute (rpm)
- Performance Threshold, target maksimal nilai yang diperbolehkan, misalnya response time 2 detik, max cpu usage 70%, dan lainnya
- Saturation, kondisi dimana SUT atau load generator sudah dalam kondisi maksimum dalam merespon atau mengenerate
- Virtual Users, simulasi dari users yang melakukan pengujian, dapat melakukan satu atau lebih requests dalam satu iterasi
- Response Time, lama waktu pengiriman request hingga menerima response

## Tools yang digunakan
- Apache JMeter
- k6
- LOCUST
- BlazeMeter
- Smartbear LoadNinja

## Kenapa menggunakan JMeter
Apache JMeter merupakan perangkat lunak sumber terbuka, apliaksi desktop Java 100% murni, yang dirancang untuk memuat uji perilaku fungsional dan mengukur kinerja situs web. Awalnya dirancang untuk aplikasi web pengujian beban tetapi sejak itu diperluas ke fungsi pengujian lainnya

## Post Processor
Post Processor merupakan drive unik khusus untuk mesin, robot, atau mekanisme CNC, beberapa mesin mulai di lokasi yang berbeda atau memerlukan gerakan ekstra di antara setiap operasi



