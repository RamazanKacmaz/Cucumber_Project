package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinitions {
    AmazonPage amazonPage;

    @Given("kullanici amazonUrl anasayfaya gider")
    public void kullanici_amazon_url_anasayfaya_gider() {
        amazonPage = new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @Given("arama kutususuna Nutella yazip aratir")
    public void arama_kutususuna_nutella_yazip_aratir() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }

    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        String expected = "Nutella";
        String actual = amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actual.contains(expected));

    }

    @Then("sayfayi kaptir")
    public void sayfayi_kaptir() {
        Driver.closeDriver();
    }

    @Given("arama kutususuna Java yazip aratir")
    public void arama_kutususuna_java_yazip_aratir() {
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);
    }

    @Then("arama sonuclarinin Java icerdigini test eder")
    public void arama_sonuclarinin_java_icerdigini_test_eder() {
        String expected = "Java";
        String actual = amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actual.contains(expected));

    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("arama kutususuna {string} yazip aratir")
    public void arama_kutususuna_yazip_aratir(String arananUrun) {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(arananUrun + Keys.ENTER);
    }

    @Then("arama sonuclarinin {string} icerdigini test eder")
    public void arama_sonuclarinin_icerdigini_test_eder(String arananUrun) {
        String actual = amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actual.contains(arananUrun));
    }
}
