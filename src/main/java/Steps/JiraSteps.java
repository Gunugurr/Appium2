package Steps;

import Token.BearerToken;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.App;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class JiraSteps extends App {

        BearerToken requestSender = new BearerToken();
        public static String text1;
        public static String text2;
        public static String text3;
        public static String text4;
        public static String text5;
        public static String text6;
        public static String text7;
        public static String text8;



        @Before
        public void open() throws MalformedURLException {
            setUp();
        }
        @Given("Anasayfaya gidilir")
        public void anasayfaya_gidilir() throws InterruptedException, IOException {
            try{
                driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Kategoriler\"]/android.widget.ImageView")).click();
                requestSender.changeResult("DEN1-2",true);
            }catch (Exception e){
                requestSender.changeResult("DEN1-2",false);
                System.out.println(e.getMessage());
                tearDown();
                System.exit(0);
            }
        }
        @Given("Kategori bölümünden Giyim & Tekstil alanına tıklanır")
        public void kategori_bolumunden_giyim_tekstil_alanina_tiklanir() throws InterruptedException,IOException{
            TimeUnit.SECONDS.sleep(2);
            try{
                driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView")).click();
                requestSender.changeResult("DEN1-3",true);
            }catch (Exception e){
                requestSender.changeResult("DEN1-3",false);
                System.out.println(e.getMessage());
                tearDown();
                System.exit(0);
            }

        }
        @Given("Giyim & Tekstil sayfasına gidildiği görülür")
        public void giyim_tekstil_sayfasina_gidildigi_gorulur() throws InterruptedException {

            try{
                Steps.JiraSteps.text1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).getText();
                requestSender.changeResult("DEN1-4",true);
            }catch (Exception e){
                requestSender.changeResult("DEN1-4",false);
                System.out.println(e.getMessage());
                tearDown();
                System.exit(0);
            }

            Assert.assertEquals(text1,"Giyim & Tekstil");
            System.out.println("Doğru sayfa (Giyim & Tekstil)");


        }
        @Given("Açılan sayfada Bebek Çorapları tıklanır")
        public void acilan_sayfada_bebek_coraplari_tiklanir() throws InterruptedException {
            TimeUnit.SECONDS.sleep(2);
            try {
                driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView")).click();
                requestSender.changeResult("DEN1-5",true);
            }
            catch (Exception e){
                requestSender.changeResult("DEN1-5",false);
                System.out.println(e.getMessage());
                tearDown();
                System.exit(0);
            }
        }
        @Given("Bebek çorapları sayfası görülür")
        public void bebek_coraplari_sayfasi_gorulur() {

            try {
                Steps.JiraSteps.text2 = driver.findElement(By.id("com.solidict.ebebek:id/tvTitle")).getText();
                requestSender.changeResult("DEN1-6",true);
                Assert.assertEquals(text2, "Bebek Çorapları");
                System.out.println("Doğru sayfa (Bebek çorapları)");
            }
            catch (Exception e){
                requestSender.changeResult("DEN1-6",false);
                System.out.println(e.getMessage());
                tearDown();
                System.exit(0);
            }
        }
        @Given("Stoktaki ürünler filtrelenir")
        public void stoktaki_urunler_filtrelenir() throws InterruptedException {
            try {
                TimeUnit.SECONDS.sleep(2);
                driver.findElement(By.id("com.solidict.ebebek:id/linearLayout_ProductFilter")).click();
                TimeUnit.SECONDS.sleep(2);
                driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout")).click();
                driver.findElement(By.id("com.solidict.ebebek:id/cbFilter")).click();
                driver.findElement(By.id("com.solidict.ebebek:id/btApplyFilter")).click(); //filtre apply
                TimeUnit.SECONDS.sleep(2);
                driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")).click(); //ürünleri gör butonu
                requestSender.changeResult("DEN1-7",true);
            }
            catch (Exception e) {
                requestSender.changeResult("DEN1-7",false);
                tearDown();
                System.exit(0);
            }
        }
        @Given("Filtreleme sonucunda gelen ürünlerden ilk ürününün üzerine tıklanır")
        public void filtreleme_sonucunda_gelen_urunlerden_ilk_urununun_uzerine_tiklanir() throws InterruptedException {
            TimeUnit.SECONDS.sleep(2);
            try {
                driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button")).click();
                requestSender.changeResult("DEN1-8",true);
            }
            catch (Exception e) {
                requestSender.changeResult("DEN1-8",false);
                tearDown();
                System.exit(0);
            }
        }
        @Given("Ürün detay sayfasında bulunan ürünün ilk bedeni ve adedi seçilir")
        public void urun_detay_sayfasinda_bulunan_urunun_ilk_bedeni_ve_adedi_2_secilir() throws InterruptedException {

            TimeUnit.SECONDS.sleep(2);
            try {
                driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout")).click(); //ilk bedeni seç
                TimeUnit.SECONDS.sleep(2);
                driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.ImageView[2]")).click();
                requestSender.changeResult("DEN1-9",true);
            }
            catch (Exception e) {
                requestSender.changeResult("DEN1-9",false);
                tearDown();
                System.exit(0);
            }

        }
        @Given("Sepete ekle butonuna tıklanır")
        public void sepete_ekle_butonuna_tiklanir() throws InterruptedException{

            try {
                TimeUnit.SECONDS.sleep(2);
                driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).click(); //sepete ekle
                requestSender.changeResult("DEN1-10",true);
            }
            catch (Exception e) {
                requestSender.changeResult("DEN1-10",false);
                tearDown();
                System.exit(0);
            }
        }
        @Given("Sepeti gör butonuna tıklanır")
        public void sepeti_gor_butonuna_tiklanir() throws InterruptedException{
            TimeUnit.SECONDS.sleep(2);
            try {
                driver.findElement(By.id("com.solidict.ebebek:id/navMyCarts")).click();
                requestSender.changeResult("DEN1-11",true);
            }
            catch (Exception e) {
                requestSender.changeResult("DEN1-11",false);
                tearDown();
                System.exit(0);
            }
        }
        @Given("Sepet sayfasında olduğu görülür")
        public void sepet_sayfasinda_oldugu_gorulur() throws InterruptedException{

            try {
                TimeUnit.SECONDS.sleep(2);
                Steps.JiraSteps.text3 = driver.findElement(By.id("com.solidict.ebebek:id/tvCompleteOrder")).getText();
                Assert.assertEquals(text3, "Alışverişi Tamamla");
                System.out.println("Doğru sayfa (Sepet)");
                TimeUnit.SECONDS.sleep(1);
                requestSender.changeResult("DEN1-12",true);
            }
            catch (Exception e) {
                requestSender.changeResult("DEN1-12",false);
                tearDown();
                System.exit(0);
            }
        }
        @Given("Ürün sayısı bir arttırılır")
        public void urun_sayisi_arttirilir() throws InterruptedException {
            try{
                TimeUnit.SECONDS.sleep(2);
                driver.findElement(By.id("com.solidict.ebebek:id/lytPlusQuantity")).click();
                requestSender.changeResult("DEN1-13",true);
            }
            catch (Exception e) {
                requestSender.changeResult("DEN1-13",false);
                tearDown();
                System.exit(0);
            }
        }
        @Given("Alışverişi tamamla bir butonuna tıklanır")
        public void alisverisi_tamamla_butonuna_tiklanir1() throws InterruptedException{
            try{
                TimeUnit.SECONDS.sleep(2);
                driver.findElement(By.id("com.solidict.ebebek:id/tvCompleteOrder")).click();
                requestSender.changeResult("DEN1-14",true);
            }
            catch (Exception e) {
                requestSender.changeResult("DEN1-14",false);
                tearDown();
                System.exit(0);
            }
        }

        @Given("Üye girişi sekmesine gidildiği görülür")
        public void uye_girisi_sekmesine_gidildigi_gorulur() throws InterruptedException {
            try{
                Steps.JiraSteps.text4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView")).getText();
                Assert.assertEquals(text4, "Üye Girişi");
                System.out.println("Doğru sayfa (Üye girişi)");
                requestSender.changeResult("DEN1-15",true);
            }
            catch (Exception e) {
                requestSender.changeResult("DEN1-15",false);
                tearDown();
                System.exit(0);
            }
        }
        @Given("Üyeliğim yok adımında e-posta ve GSM alanı doldurulur")
        public void uyeligim_yok_adiminda_e_posta_ve_gsm_alani_doldurulur() throws InterruptedException{
            try{
                TimeUnit.SECONDS.sleep(2);
                driver.findElement(By.id("com.solidict.ebebek:id/ivGuestArrow")).click();
                TimeUnit.SECONDS.sleep(2);
                TouchAction swipe_1 = new TouchAction<>((PerformsTouchActions) driver)
                        .press(PointOption.point(740, 1927))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                        .moveTo(PointOption.point(740, 1076))
                        .release()
                        .perform();

                TimeUnit.SECONDS.sleep(2);
                driver.findElement(By.id("com.solidict.ebebek:id/etPhoneGuest")).sendKeys("457807339");

                TimeUnit.SECONDS.sleep(2);
                driver.findElement(By.id("com.solidict.ebebek:id/etMailGuest")).sendKeys("gunugur2000@gmail.com");
                requestSender.changeResult("DEN1-16",true);
            }
            catch (Exception e) {
                requestSender.changeResult("DEN1-16",false);
                tearDown();
                System.exit(0);
            }

        }
        @Given("Üye olmadan devam et butonuna tıklanır")
        public void uye_olmadan_devam_et_butonuna_tiklanir() throws InterruptedException {
            try{
                TimeUnit.SECONDS.sleep(2);
                driver.findElement(By.id("com.solidict.ebebek:id/tvCheckoutLogin")).click();
                requestSender.changeResult("DEN1-17",true);
            }
            catch (Exception e) {
                requestSender.changeResult("DEN1-17",false);
                tearDown();
                System.exit(0);
            }
        }

        @Given("Adres sayfasına yönlendiği görülür")
        public void adres_sayfasina_yonlendigi_gorulur() throws InterruptedException {
            try{
                TimeUnit.SECONDS.sleep(2);
                Steps.JiraSteps.text5 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")).getText();

                Assert.assertEquals(text5,"Fatura Bilgileri");
                System.out.println("Doğru sayfa (Adres)");
                requestSender.changeResult("DEN1-18",true);
            }
            catch (Exception e) {
                requestSender.changeResult("DEN1-18",false);
                tearDown();
                System.exit(0);
            }

        }
        @Given("Teslimat adresi ekleme pop-up'ında Ad, soyad, ülke, şehir, ilçe, GSM, posta kodu, adres başlığı ve adres alanları doldurulur")
        public void teslimat_adresi_ekleme_pop_up_inda_ad_soyad_ulke_sehir_ilce_gsm_posta_kodu_adres_basligi_ve_adres_alanlari_doldurulur() throws InterruptedException {
            try{
                TimeUnit.SECONDS.sleep(3);
                driver.findElement(By.id("com.solidict.ebebek:id/linearLayout_AddDeliveryAddress")).click();

                driver.findElement(By.id("com.solidict.ebebek:id/etFirstName")).sendKeys("Günuğur");
                driver.findElement(By.id("com.solidict.ebebek:id/etLastName")).sendKeys("Uzunköprü");
                driver.findElement(By.id("com.solidict.ebebek:id/etCellphone")).sendKeys("457807339");
                driver.findElement(By.id("com.solidict.ebebek:id/etTitle")).sendKeys("Ev");
                TimeUnit.SECONDS.sleep(1);
                Steps.JiraSteps.text7 = driver.findElement(By.id("com.solidict.ebebek:id/etTitle")).getText();
                driver.findElement(By.id("com.solidict.ebebek:id/tvCity")).click();
                driver.findElement(By.id("com.solidict.ebebek:id/etSearch")).sendKeys("Edirne");
                driver.findElement(By.id("com.solidict.ebebek:id/tvLocationName")).click();
                TimeUnit.SECONDS.sleep(1);
                driver.findElement(By.id("com.solidict.ebebek:id/tvCounty")).click();
                driver.findElement(By.id("com.solidict.ebebek:id/etSearch")).sendKeys("Merkez");
                driver.findElement(By.id("com.solidict.ebebek:id/tvLocationName")).click();
                TimeUnit.SECONDS.sleep(1);
                driver.findElement(By.id("com.solidict.ebebek:id/tvNeighbourhood")).click();
                TimeUnit.SECONDS.sleep(1);
                driver.findElement(By.id("com.solidict.ebebek:id/etSearch")).sendKeys("Koca Sinan");
                driver.findElement(By.id("com.solidict.ebebek:id/tvLocationName")).click();
                TimeUnit.SECONDS.sleep(1);
                driver.findElement(By.id("com.solidict.ebebek:id/etLine1")).sendKeys("Ev");

                TouchAction swipe_2 = new TouchAction<>((PerformsTouchActions) driver)
                        .press(PointOption.point(740, 1800))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                        .moveTo(PointOption.point(740, 900))
                        .release()
                        .perform();
                requestSender.changeResult("DEN1-19",true);
            }
            catch (Exception e) {
                requestSender.changeResult("DEN1-19",false);
                tearDown();
                System.exit(0);
            }

        }

        @Given("Adresi kaydet butonuna tıklanır")
        public void adresi_kaydet_butonuna_tiklanir() throws InterruptedException{
            try{
                TimeUnit.SECONDS.sleep(2);
                driver.findElement(By.id("com.solidict.ebebek:id/btSave")).click();
                requestSender.changeResult("DEN1-20",true);
            }
            catch (Exception e) {
                requestSender.changeResult("DEN1-20",false);
                tearDown();
                System.exit(0);
            }
        }
        @Given("Yeni adresin kaydedildiği görülür")
        public void yeni_adresin_kaydedildigi_gorulur() throws InterruptedException{
            try{
                TimeUnit.SECONDS.sleep(2);
                Steps.JiraSteps.text6 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")).getText();

                Assert.assertEquals(text6,text7);
                System.out.println("Yeni adres eklenmiş");
                requestSender.changeResult("DEN1-21",true);
            }
            catch (Exception e) {
                requestSender.changeResult("DEN1-21",false);
                tearDown();
                System.exit(0);
            }
        }
        @Given("Alışverişi tamamla butonuna tıklanır")
        public void alisverisi_tamamla_butonuna_tiklanir2() throws InterruptedException{
            try{
                TimeUnit.SECONDS.sleep(2);
                driver.findElement(By.id("com.solidict.ebebek:id/checkBox_SendPaymentToDeliveryAddress")).click();

                TouchAction swipe_3 = new TouchAction<>((PerformsTouchActions) driver)
                        .press(PointOption.point(868, 1981))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                        .moveTo(PointOption.point(868, 692))
                        .release()
                        .perform();

                TimeUnit.SECONDS.sleep(2);
                driver.findElement(By.id("com.solidict.ebebek:id/tvContinue")).click();
                requestSender.changeResult("DEN1-22",true);
            }
            catch (Exception e) {
                requestSender.changeResult("DEN1-22",false);
                tearDown();
                System.exit(0);
            }
        }

        @Given("Ödeme detay sayfasına gidildiği görülür")
        public void odeme_detay_sayfasina_gidildigi_gorulur() throws InterruptedException {
            try{
                TimeUnit.SECONDS.sleep(2);
                Steps.JiraSteps.text8 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView")).getText();
                TimeUnit.SECONDS.sleep(2);
                Assert.assertEquals(text8,"Ödeme Yöntemleri");
                System.out.println("Doğru sayfa (Ödeme detay)");
                requestSender.changeResult("DEN1-23",true);
            }
            catch (Exception e) {
                requestSender.changeResult("DEN1-23",false);
                tearDown();
                System.exit(0);
            }
        }
        @Given("Ödeme detay sayfasında kredi kartı - banka kartı butonuna tıklanır")
        public void odeme_detay_sayfasinda_kredi_karti_banka_karti_butonuna_tiklanir() throws InterruptedException {
            try{
                TimeUnit.SECONDS.sleep(2);
                driver.findElement(By.id("com.solidict.ebebek:id/imageView_CreditATMCardArrow")).click();
                requestSender.changeResult("DEN1-24",true);
            }
            catch (Exception e) {
                requestSender.changeResult("DEN1-24",false);
                tearDown();
                System.exit(0);
            }
        }

        @When("Kredi kartı - Banka kartı ödeme sayfası, kart bilgileri ile doldurulur")
        public void kredi_karti_banka_karti_odeme_sayfasi_kart_bilgileri_ile_doldurulur() throws InterruptedException{
            try{
                TimeUnit.SECONDS.sleep(2);
                driver.findElement(By.id("com.solidict.ebebek:id/etCardNumber")).click();
                String command = "adb shell input text '4242 4242 4242 4242'";
                try {
                    Process process = Runtime.getRuntime().exec(command);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                driver.findElement(By.id("com.solidict.ebebek:id/editText_NameOnCard")).sendKeys("gunugur");

                TouchAction swipe_3 = new TouchAction<>((PerformsTouchActions) driver)
                        .press(PointOption.point(755, 1127))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                        .moveTo(PointOption.point(755, 596))
                        .release()
                        .perform();

                driver.findElement(By.id("com.solidict.ebebek:id/editText_CardExpiryMonthAndYear")).sendKeys("09/27");

                TimeUnit.SECONDS.sleep(2);

                driver.findElement(By.id("com.solidict.ebebek:id/editText_CardSecurityCode")).click();
                String command_2 = "adb shell input text '123'";
                try {
                    Process process = Runtime.getRuntime().exec(command_2);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                TimeUnit.SECONDS.sleep(2);

                TouchAction swipe_4 = new TouchAction<>((PerformsTouchActions) driver)
                        .press(PointOption.point(755, 1371))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                        .moveTo(PointOption.point(755, 104))
                        .release()
                        .perform();
                TimeUnit.SECONDS.sleep(2);
                requestSender.changeResult("DEN1-25",true);
            }
            catch (Exception e) {
                requestSender.changeResult("DEN1-25",false);
                tearDown();
                System.exit(0);
            }
        }
        @Then("Ön bilgilendirme ve mesafeli satış sözleşmesini kabul ediyorum kutusu işaretlenir")
        public void on_bilgilendirme_ve_mesafeli_satis_sozlesmesini_kabul_ediyorum_kutusu_isaretlenir() throws InterruptedException {
            TimeUnit.SECONDS.sleep(2);
            try{
                TimeUnit.SECONDS.sleep(2);
                driver.findElement(By.id("com.solidict.ebebek:id/cbAgreement")).click();

                driver.findElement(By.id("com.solidict.ebebek:id/tvButtonPayment")).click();
                requestSender.changeResult("DEN1-26",true);
            }
            catch (Exception e) {
                requestSender.changeResult("DEN1-26",false);
                tearDown();
                System.exit(0);
            }
        }

        @After
        public void tearDown() {
            // Close the driver and send test results
            if (driver != null) {
                driver.quit();
            }
            try {
                requestSender.sendTestResults();
            } catch (IOException e) {
                System.out.println("Error sending test results: " + e.getMessage());
            }

        }
    }

