Feature: US1005 Kullanici amazonda arma ayapip ilk urunu test eder

  @amazon
  Scenario: TC09 ilk urun testi

    Given kullanici "amazonUrl" anasayfaya gider
    And arama kutususuna "Java" yazip aratir
    Then ilk urune tiklar
    And urun isminin "Nutella" icerdigini test eder
    And sayfayi kaptir