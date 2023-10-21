
Feature: US1004 Gecersiz bilgilerle giris yapilamaz

  Scenario: TC06 gecerli email,gecersiz password ile giris yapilamaz
    Given kullanici "qdUrl" anasayfaya gider
    And ilk login linkine tiklar
    And username kutusuna "qdGecerliEmail" yazar
    And password kutusduna "qdGecersizPassword" yazar
    And login butonuna basar
    Then basarili giris yapilamadigini test eder
    And sayfayi kaptir


    Scenario: TC07 gecersiz email, gecerli password ile giris yapilamaz
      Given kullanici "qdUrl" anasayfaya gider
      And ilk login linkine tiklar
      And username kutusuna "qdGecersizEmail" yazar
      And password kutusduna "qdGecerliPassword" yazar
      And login butonuna basar
      Then basarili giris yapilamadigini test eder
      And sayfayi kaptir

      Scenario: TC08 gecersiz email, gecersiz password ile giris yapilamaz

        Given kullanici "qdUrl" anasayfaya gider
        And ilk login linkine tiklar
        And username kutusuna "qdGecersizEmail" yazar
        And password kutusduna "qdGecersizPassword" yazar
        And login butonuna basar
        Then basarili giris yapilamadigini test eder
        And sayfayi kaptir