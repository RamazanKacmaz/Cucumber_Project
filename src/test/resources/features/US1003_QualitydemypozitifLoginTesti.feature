Feature: US1003 Kullanici gecerli bilgiler ile sayfaya giris yapar

  Scenario: TC05 qualtydemypozitif login testi
    Given kullanici "qdUrl" anasayfaya gider
    And ilk login linkine tiklar
    And username kutusuna "qdGecerliEmail" yazar
    And password kutusduna "qdGecerliPassword" yazar
    And login butonuna basar
    Then basatili giris yaptigini test eder
    And sayfayi kaptir

