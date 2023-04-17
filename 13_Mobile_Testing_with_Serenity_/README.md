# (13) Mobile Testing with Serenity

## Appium
Appium merupakan framework automation mobile yang berguna untuk menjalankan pengujian otomatis pada mobile, pada appium sendiri mendukung banyak bahasa pemrograman seperti java, python, js, ruby, dan lainnya. Appium library dibuat di atas selenium library, dan juga mendukung android, iOS, dan aplikasi windows.

## Appium High Level Architecture
                                --> XCUITest
                                |
Client --> Appium Server ---------> UIAutomator2 / Espreso
                                |
                                --> WinAppDriver

## Appium Components
Pada appium terdapat 2 komponen mayor yang digunakan :
1. Appium Server, appium server digunakan sebagai penghubung untuk mengontrol devices yang diuji. Terdapat dua versi, bisa menggunakan appium desktop atau menginstallnya dengan perintah npm pada command prompt.
2. Appium Client, library ditulis dalam beberapa bahasa untuk membuat skrip uji sehingga dapat mengirim perintah ke server appium.

## Appium Java Client Version
Appium Java Client Version adalah versi klien Appium yang ditulis dalam bahasa pemrograman Java. Appium sendiri merupakan platform pengujian seluler open source yang mendukung berbagai bahasa pemrograman seperti Java, Python, Ruby dan lainnya.

Dalam konteks pengembangan aplikasi seluler, Appium Java Client Version memungkinkan pengembang menulis skrip pengujian menggunakan bahasa pemrograman Java untuk menguji aplikasi seluler di berbagai platform seperti Android dan iOS. Versi klien ini menyediakan antarmuka pemrograman aplikasi (API) untuk mengontrol dan berinteraksi dengan aplikasi seluler yang diuji.

Dalam perangkat lunak, pengujian seluler penting untuk memastikan kualitas dan fungsionalitas aplikasi sebelum diluncurkan. Appium Java Client Version adalah salah satu alat yang dapat membantu mengotomatiskan pengujian aplikasi seluler, yang mempercepat dan meningkatkan efisiensi pengujian. 

## Appium Desktop
Appium Desktop adalah aplikasi desktop sumber terbuka yang digunakan untuk menguji aplikasi seluler di berbagai platform seperti Android dan iOS. Appium Desktop menyediakan antarmuka pengguna grafis (GUI) drag-and-drop yang mudah digunakan yang memungkinkan pengguna membuat dan menjalankan skrip pengujian seluler tanpa menulis kode secara manual.

## Appium Doctor
Alat ini sangat membantu untuk memeriksa pemasangan appium, dapat memeriksa kelengkapan instalasi dependensi yang diperlukan dan opsional untuk Appium.

## Menjalankan Appium Desktop & Inspector
- Menghubungkannya dengan device, sebelum memulai pengujian harus menghubungkannya ke emulator atau devices sungguhan terlebih dulu ke komputer.
- Mengecek devices apakah sudah terhubung dengan perintah adb devices.
- Menjalankan Appium Desktop, untuk mengaktifkan appium server.
- Menggunakan Appium Inspector, untuk menginspek element locatornya.
- Menentukan kapabilitas, dengan menginputnya setelah memulai inspector.
- Mengisi kapabilitas, jika sudah bisa langsung klik start session.

## Project Initialization
Dengan menggunakan maven archetype, digunakan untuk mengenerate basic project dengan dependencies dan juga stuktur dasarnya. Kemudian menambahkan appium java client

## Cucumber Framework
Cucumber framework adalah suatu framework yang mendukung untuk melakukan pembuatan BDD, dengan sintaks gherkin, dan mendukung banyak bahasa pemrograman.

## Adding Feature Files
Feature file digunakan untuk mendefinisikan test case untuk fitur yang spesifik dengan menggunakan sintaks gherkin.

## Mapping Every Scenario Steps on Steps Class
Perlu dilakukan untuk mapping setiap step pada tiap fungsi untuk satu page object class.

## Initializing the Appium
Perlu suatu class untuk menjalankan dan memberhentikan appium session dan menyimpannya pada driver session, juga harus mengintegrasikannya dengan cucumber hooks untuk memastikan sebelum tiap skenario dijaankan, hal tersebut akan membuat appium session kemudian menghapusnya jika skenario sudah lengkap.

## Cucumber Hooks
Cucumber Hooks adalah fitur kerangka pengujian Cucumber yang memungkinkan pengguna untuk menjalankan kode sebelum atau setelah skenario berjalan. Hooks dapat digunakan untuk melakukan berbagai tugas seperti menyiapkan data pengujian, memeriksa prasyarat, memulai dan mengakhiri sesi web, dan banyak lagi.

Ada dua jenis pengait pada Cucumber, yaitu sebelum dan sesudah pengait skenario. Hook pra-skenario berjalan sebelum skenario pertama di setiap file properti, sedangkan hook pasca-skenario berjalan setelah skenario terakhir di file properti. Kedua hook dapat didefinisikan sebagai file Java, JavaScript atau Ruby tergantung pada bahasa pemrograman yang digunakan untuk pengembangan aplikasi. 

## Page Object Design Pattern
- Merepresentasikan halaman web sebagai file kelas Java tunggal
- Akan terdiri dari semua tindakan yang dapat dilakukan pada satu halaman web
- Digunakan untuk mengurangi duplikasi kode
- Membantu kode uji lebih mudah dibaca dan mudah dimengerti

## Fungsi - fungsi
- The by Object and findElement() function, digunakan untuk mencari elemen pada halaman web dengan menggunakan locator seperti ID, nama kelas, tag, XPath, dan lain-lain. Dengan menggunakan by Object dan findElement(), pengembang dapat mengidentifikasi elemen pada halaman web dan melakukan tindakan pada elemen tersebut.
- The sendKeys() and clear() function, digunakan untuk memasukkan teks ke dalam elemen pada halaman web. Fungsi sendKeys() digunakan untuk mengirim teks ke elemen, sedangkan fungsi clear() digunakan untuk membersihkan elemen dari teks yang ada di dalamnya.
- The click() function, digunakan untuk mengklik elemen pada halaman web. Dengan menggunakan fungsi click(), pengembang dapat memicu tindakan pada elemen seperti navigasi ke halaman baru, mengaktifkan fitur, atau menampilkan elemen lain.
- The getText() function, digunakan untuk mengambil teks dari elemen pada halaman web. Dengan menggunakan fungsi getText(), pengembang dapat mengambil teks yang ditampilkan pada elemen dan menggunakannya untuk melakukan tindakan lain seperti memeriksa apakah teks cocok dengan yang diharapkan.
- The isDisplayed() function, digunakan untuk memeriksa apakah elemen pada halaman web terlihat atau tidak. Dengan menggunakan fungsi isDisplayed(), pengembang dapat memeriksa apakah elemen ditampilkan atau disembunyikan dari tampilan pengguna. Fungsi ini dapat membantu pengembang dalam memastikan bahwa elemen yang diharapkan terlihat oleh pengguna dan menjalankan tindakan yang sesuai.

## Perform Assertion
- Menggunakan JUnit library untuk memvalidasi data
- Dapat membandingkan actual data itu equal, not equal, contains, not empty, dan lainnya dengan expected data

## Cucumber Tag
Cucumber tag merupakan cara yang bagus untuk mengorganisir fitur dan skenario, dapat digunakan untuk dua tujuan yaitu menjalankan subset skenario, membatasi hook ke subset skenario

## The WebdriverWait Object
Objek WebdriverWait adalah kelas Selenium WebDriver yang digunakan untuk menunggu kondisi tertentu dipenuhi pada halaman web sebelum melanjutkan eksekusi pengujian. Objek WebdriverWait dapat digunakan untuk menunggu elemen muncul di halaman web, menunggu nilai tertentu dari suatu elemen, menunggu halaman dimuat, dll.

Objek WebdriverWait memungkinkan pengembang untuk menentukan waktu tunggu maksimum yang diperbolehkan untuk kondisi tertentu yang harus dipenuhi. Jika kondisi tidak terpenuhi dalam waktu yang ditentukan, TimeOutException dilontarkan dan eksekusi uji ditangguhkan. 

## Setting Up Implicit Wait
Implicit wait akan diaplikasikan untuk setiap android element yang dibuat dengan fungsi findElement().

## Code Redundancy pada Page Class
Pada page class, dapat ditemukan banyaknya redundancy dan hal tersebut sangat kompleks jika ditulis dengan simple action. Hal tersebut tidak baik ketika menguji code yang semakin banyak.

## The BasePageObject class
BasePageObject class ditujukan untuk merangkul semua fungsi appium untuk membantu dalam membuat kode yang lebih sedikit pada page class, dapat menggunakan inheritance sehingga page class harus mengextends BasePageObject class.

## The TouchAction Class
TouchAction Class digunakan untuk melakukan suatu aksi yang kompleks seperti scroll, tap, hold, dan lainnya, dengan menggunakan builder design pattern sehingga menggunakan metode chaining dan dapat digabung untuk melakukan aksi yang spesifik. (Swipe, Long press, Tap multiple times).

## Taking ScreenShot
Dengan menambahkan cucumber.properties file :
- Cucumber.glue, untuk mengset lokasi dari tiap step dan hooks class
- Cucumber.plugin, untuk mengaktifkan cucumber plugin
- Cucumber.features, untuk mengset location dari features file
- Cucumber.publish.enabled, untuk mengaktifkan cucumber online reports
- Cucumber.publish.quite, untuk mengaktifkan dan menonaktifkan cucumber reports

## The TakesScreenshot Interface
Android driver class mengimplementasikan interface tersebut, interface digunakan untuk melakukan screenshot pada layar, dapat diterapkan pada web automation juga, dapat diletakkan pada hooks class sehingga ketika skenario gagal appium dapat melakukan screenshot.

## Configuration File
Merupakan praktik yang buruk dalam menyimpan konfigurasi di dalam implementasi kode, tiap terdapat perubahan konfigurasi, tidak perlu refactor automation codenya, yang diperlukan hanya update value dari file yang dikonfigurasi saja.

## Configuration usingg YAML format
YAML merupakan data serialization language yang sering digunakan untuk menulis file yang dikonfigurasi, YAML merupakan singkatan dari yet another markup language.

## SnakeYAML Library
Merupakan library untuk serialisasi javaobject ke YAML file atau vice versa, dapat digunakan untuk membaca konfigurasi dari YAML file, harus menambahkan dependenciesnya terlebih dulu. Menambahkan properties class, kemudian menambahkan YAML configuration file, setelah itu membuat reader class.

