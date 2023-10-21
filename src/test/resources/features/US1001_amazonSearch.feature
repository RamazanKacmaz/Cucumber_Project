

Feature: US1001 Kullanici amazon anasayfada arama yapar


    Scenario: TC01 kullanici amazonda nutella aratir


      Given kullanici amazonUrl anasayfaya gider
      And  arama kutususuna Nutella yazip aratir
      Then arama sonuclarinin Nutella icerdigini test eder
      And sayfayi kaptir


    Scenario: TC02 Kullanici amazonda Java aratir
      Given kullanici amazonUrl anasayfaya gider
      And arama kutususuna Java yazip aratir
      Then arama sonuclarinin Java icerdigini test eder
      And 2 saniye bekler
      And sayfayi kaptir