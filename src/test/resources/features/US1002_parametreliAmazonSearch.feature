Feature: US1002 Kullanici parametre olarak yazdigi urunu amazonda aratir

  Scenario: TC03 parametre ile amazonda arama
    Given kullanici "amazonUrl" anasayfaya gider
    Then arama kutususuna "Java" yazip aratir
    And arama sonuclarinin "Java" icerdigini test eder
    And 2 saniye bekler
    And sayfayi kaptir

    Scenario: TC04 parametre ile apple aratir
      Given kullanici "amazonUrl" anasayfaya gider
      Then arama kutususuna "apple" yazip aratir
      And arama sonuclarinin "apple" icerdigini test eder
      Then 5 saniye bekler
      And sayfayi kaptir
