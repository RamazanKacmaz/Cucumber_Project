Feature: US1006 verilen listedeki urunleri google ile arama


  Scenario Outline: : TC10 google da lisetdeki urunler aratabilmeli
    
    Given kullanici "googleUrl" anasayfaya gider
    And cookies kabul eder
    And 2 saniye bekler
    Then google da "<istenenKelime>" icin arama yapar
    And google arama sonuclarinin "<istenenKelime>" icerdigini test eder
    And sayfayi kaptir
    Examples:
      | istenenKelime |
      |Nutella        |
      |Java           |
      |Apple          |
      |Samsung        |

    

