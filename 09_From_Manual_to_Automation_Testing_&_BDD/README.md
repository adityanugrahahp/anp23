# (9) From Manual to Automation Testing & BDD
Terdapat dua cara dalam pengujian yaitu manual testing dan automation testing.

## Manual Testing 
Manual testing merupakan sebuah pengujian yang dilakukan secara manual dengan tujuan dapat mengeksplor semua fitur yang ada dalam suatu aplikasi.

- Exploratory
- Velocity
- Usability

## Kelebihan dan Kekurangan dari Manual Testing

### Kelebihan :
- Feedback diberikan secara tepat dan akurat
- Biaya yang dibutuhkan relatif rendah
- Cocok jika terdapat perubahan minor

### Kekurangan :
- Error sering terjadi
- Karena tidak dapat direkam maka harus dijalankan manual

## Automation Testing
Automation testing adalah tes yang dijalankan secara otomatis menggunakan alat otomatisasi seperti Selenium, Katalon, JMeter, dll. Otomasi sangat bagus untuk menguji banyak kasus. Dapat juga digunakan untuk mengukur properti yang diuji.  

- Flexibility
- Velocity
- Coverage
- Error-Avoidance

## Test Case yang Cocok dan Tidak Automation Testing

### Yang Cocok:

- Test case yang perlu dieksekusi secara berulang
- Test case yang dilakukan secara manual cukup rumit
- Test case yang memakan waktu cukup lama jika dilakukan secara manual

### Tidak Cocok:

- Test case yang baru dirancang dan belum dieksekusi secara manual
- Test case yang memiliki kebutuhan yang sering berubah

## Proses Automation Testing
1. Test Tool Selection Disesuaikan dengan kebutuhan
- Usability
- Simplicity
- Cost

2. Define Scope of Automation Kita mesti memastikan lingkup yang akan diotomasi dengan menentukan test case apa saja yang diperlukan pengujian otomatis.

3. Planning , design, and development Kita harus melakukan perencanaan, desain script, dan menulis atau pengembangan script untuk melakukan automation testing.

4. Test Execution Melakukan eksekusi test case yang sudah disusun

5. Maintenance Review dan melakukan perubahan jika diperlukan

## BDD (Behaviour Driven Development)
BDD dapat membantu kita untuk mengembangkan perangkat lunak menjadi efektif, dan memastikannya bahwa perangkat lunak yang dibangun sudah benar.

## BDD Format
1. User Story
2. As a (x) I want (y) So that (z)
3. Scenario
4. Given, When, Then

BDD dengan cucumber dibagi menjadi dua scenario yaitu scenario normal dan abnormal. Dapat dilihat pada scenario normal terdapat naratif sedangkan pada abnormal tidak.

## BDD With Cucumber Step
1. Write Story (Menggunakan sintaks gherkin (given, when, then))
2. Map Steps to Java (Menkonfigurasi langkah script dan validasinya)
3. Configure Stories (Menggabungkan story dan step yang ada)
4. Run Stories (Intellij IDEA, Maven)
5. View Reports