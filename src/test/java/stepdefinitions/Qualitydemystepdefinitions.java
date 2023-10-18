package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QualitydemyPage;
import utilities.ConfigReader;

public class Qualitydemystepdefinitions {

    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    @Given("ilk login linkine tiklar")
    public void ilk_login_linkine_tiklar() {
    qualitydemyPage.ilkLoginLinki.click();
    }
    @Given("username kutusuna {string} yazar")
    public void username_kutusuna_yazar(String kulaniciemail) {
    qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty(kulaniciemail));
    }
    @Given("password kutusduna {string} yazar")
    public void password_kutusduna_yazar(String password) {
      qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty(password));
    }
    @Given("login butonuna basar")
    public void login_butonuna_basar() {
    qualitydemyPage.loginButonu.click();
    }
    @Then("basatili giris yaptigini test eder")
    public void basatili_giris_yaptigini_test_eder() {
        Assert.assertTrue(qualitydemyPage.basariliGirisElementi.isDisplayed());
    }

    @Then("basarili giris yapilamadigini test eder")
    public void basariliGirisYapilamadiginiTestEder() {
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
    }

    @And("username kutusuna examples'dan {string} yazar")
    public void usernameKutusunaExamplesDanYazar(String kullaniciEmail) {

        qualitydemyPage.emailKutusu.sendKeys(kullaniciEmail);
    }

    @And("password kutusuna examples'dan {string} yazar")
    public void passwordKutusunaExamplesDanYazar(String kullaniciPassword) {
        qualitydemyPage.passwordKutusu.sendKeys(kullaniciPassword);
    }
}
