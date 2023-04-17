# (14) Testing in CI-CD Pipeline

## Continous Integration
Continous Integration adalah latihan dalam mengintegrasikan kode ke dalam shared repository dan membangun tiap perubahan dengan otomatis, sedini mungkin biasanya beberapa kali sehari.

## Continous Delivery / Deployment
Continous Delivery menambahkan bahwa perangkat lunak dapat dirilis ke produksi kapan saja, seringkali dengan secara otomatis mendorong perubahan pada staging system.

## Delivery vs Deployment
- Continous Delivery : Secara otomatis mempersiapkan dan melacak rilis ke produksi, hasil yang diinginkan adalah bahwa siapa pun dengan hak istimewa yang memadai untuk menyebarkan rilis baru dapat melakukannya kapan saja dalam satu atau beberapa klik. Dengan menghilangkan hampir semua tugas manual, pengembang menjadi lebih produktif. (Build --> Test --> Acceptance Test --> Deploy to staging --> deploy to production(manual)).

- Continous Deployment : Setiap perubahan dalam kode sumber diterapkan ke produksi secara otomatis, tanpa persetujuan eksplisit dari pengembang, selama melewati kontrol kualitas. (Build --> Test --> Acceptance Test --> Deploy to staging --> deploy to production(automatic)).

## What Makes for Good CI
- Decoupled Stages, setiap langkah dalam CI harus melakukan single focused task
- Repeatable, otomatis dengan cara yang dapat diulang secara konsisten, tooling juga harus berfungsi untuk pengembang lokal
- Fail fast, gagal pada tanda pertama dalam permasalahan

## CI/CD Process
Commit --> Build --> Test --> Deploy

## Benefits of Implementing CI
- Mendeteksi bug pada tahap awal
- Mengurangi jumlah bug
- Tahap development lebih transparan
- Lebih efisien

## Benefits of Implementing CI
- Mengurangi resiko
- Painless development
- Mengurangi biaya
- Otomatis dan proses yang transparan
- Rilis lebih sering

## Continous Integration Costs
- Menulis automated test
- Server untuk tiap automated test
- Menggabungkan kode sesering mungkin

## Continous Delivery/Deployment Costs
- Fondasi yang kuat dalam CI
- Membutuhkan kualitas tertinggi dalam test
- Dokumentasi harus sering diupdate

## CI/CD Tools
- Jenkins, sebuah server otomatisasi open source yang dapat digunakan untuk melakukan CI/CD pada aplikasi perangkat lunak. Jenkins memiliki kemampuan untuk membangun, menguji, dan menerapkan perubahan pada aplikasi secara otomatis, sehingga memungkinkan pengembang untuk mengirimkan perubahan dengan lebih cepat dan lebih efisien.

- Bamboo, alat otomatisasi CI/CD yang dikembangkan oleh Atlassian. Bamboo memungkinkan pengembang untuk membangun, menguji, dan menerapkan perubahan pada aplikasi dengan cepat dan mudah. Bamboo memiliki integrasi yang kuat dengan alat pengembangan Atlassian seperti JIRA, Bitbucket, dan Confluence.

- Circle CI, alat CI/CD berbasis cloud yang memungkinkan pengembang untuk membangun, menguji, dan menerapkan perubahan pada aplikasi dengan cepat dan mudah. Circle CI memiliki antarmuka yang mudah digunakan dan dapat diintegrasikan dengan berbagai platform dan bahasa pemrograman.

- AWS CodeBuild, layanan otomatisasi CI/CD yang disediakan oleh Amazon Web Services. AWS CodeBuild memungkinkan pengembang untuk membangun, menguji, dan menerapkan perubahan pada aplikasi dengan cepat dan mudah menggunakan infrastruktur cloud AWS.

- Acure DevOps, platform CI/CD lengkap yang menyediakan berbagai layanan dan alat untuk membantu pengembangan dan pengiriman aplikasi secara efisien. Azure DevOps meliputi alat untuk manajemen proyek, kontrol kode sumber, pengujian, dan pengiriman.

- CI/CD

- Travis CI, layanan otomatisasi CI/CD yang berbasis cloud. Travis CI memungkinkan pengembang untuk membangun, menguji, dan menerapkan perubahan pada aplikasi dengan cepat dan mudah. Travis CI terintegrasi dengan berbagai platform dan bahasa pemrograman.

- Github Action, layanan otomatisasi CI/CD yang disediakan oleh GitHub. GitHub Actions memungkinkan pengembang untuk membangun, menguji, dan menerapkan perubahan pada aplikasi dengan cepat dan mudah menggunakan infrastruktur cloud GitHub. GitHub Actions juga dapat diintegrasikan dengan alat pengembangan yang populer seperti Docker, Node.js, dan Ruby.

## Github Actions
Komponen :
- Workflows, serangkaian tugas yang terdiri dari beberapa job dan action. Workflows dapat diatur untuk dijalankan pada event tertentu, seperti push ke repositori atau pembukaan pull request. Workflows membantu mengotomatiskan proses pengembangan perangkat lunak dan memastikan bahwa tugas yang diperlukan dijalankan secara konsisten.

- Jobs, unit kerja dasar yang didefinisikan dalam workflow dan menentukan tugas yang harus dilakukan pada platform yang ditargetkan. Jobs terdiri dari satu atau beberapa step, yang merupakan langkah-langkah yang harus dilakukan untuk menyelesaikan tugas.

- Actions, kumpulan perintah yang dapat digunakan dalam jobs untuk menyelesaikan tugas tertentu, seperti pengujian kode, penyebaran aplikasi, atau pengecekan keamanan. Actions dapat digunakan sebagai bagian dari job atau sebagai job terpisah dalam sebuah workflow.

- Events, tindakan yang memicu workflow, seperti push ke repositori, pembukaan pull request, atau penjadwalan waktu. Event ini menentukan kapan workflow harus dijalankan dan dapat dikonfigurasi dalam file YAML di repositori.

- Runners, entitas yang menjalankan jobs dalam workflow. Runner dapat berupa mesin virtual atau fisik yang didefinisikan oleh pengguna atau platform hosting, seperti GitHub Actions. Runner dapat diatur untuk menjalankan tugas pada sistem operasi tertentu dan dapat disesuaikan untuk kebutuhan pengguna.

## Preparation
1. Java 1.8
2. Maven
3. Intellij IDEA
4. GIT