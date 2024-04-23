# Cucumber Selenium Projesi
Bu proje, Maven kullanılarak Java'da yazılmış bir Cucumber Selenium test projesidir. Proje, web uygulamalarının otomatik test edilmesi için kullanılabilir.

## Gereksinimler:

Java JDK (versiyon 8 veya sonrası)

Maven

## Kurulum

### Projeyi klonlayın:

Copy code
"git clone https://github.com/fuatokanakyol/WikipediaCucumberSeleniumProject"

### Proje dizinine gidin:
cd proje dizini

### Projeyi derleyin:

mvn compile

## Projeyi Test Edin:

### Tüm senaryoları koşmak için :

mvn test

### Geçerli taga sahip senaryyoyu koşmak için 

mvn test -Dcucumber.filter.tags="@debug"

Kullanım
Proje, üç farklı özellik dosyası içerir:

Homepage Feature: Ana sayfa özelliklerini test eder.

Projeniin verilen urlde çalıştığına bakar ome page açılıyor mu kontrol eder

Login Feature: Kullanıcı işlevselliğini test eder.

Geçerli ve geçersiz verilerle siteye kullanıcının girişi kontrol edilir.

Search Feature: Arama işlevselliğini test eder.

Kullanıcının arama yaptığına ve arama sonucunu test eder

Her bir özellik dosyası, karşılık gelen sayfaların veya işlevlerin test senaryolarını içerir.

Testleri çalıştırmak için terminalde şu komutu kullanın:

mvn test

Bu komut, tüm Cucumber senaryolarını yürütecek ve sonuçları raporlayacaktır.

