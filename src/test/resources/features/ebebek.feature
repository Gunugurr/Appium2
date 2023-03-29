Feature: Ebebek testi

  Scenario: Ürünün seçilmesi ve sepete eklenmesi

    Given Anasayfaya gidilir
    And Kategori bölümünden Giyim & Tekstil alanına tıklanır
    And Giyim & Tekstil sayfasına gidildiği görülür
    And Açılan sayfada Bebek Çorapları tıklanır
    And Bebek çorapları sayfası görülür
    And Stoktaki ürünler filtrelenir
    And Filtreleme sonucunda gelen ürünlerden ilk ürününün üzerine tıklanır
    And Ürün detay sayfasında bulunan ürünün ilk bedeni ve adedi seçilir
    And Sepete ekle butonuna tıklanır
    And Sepeti gör butonuna tıklanır
    And Sepet sayfasında olduğu görülür
    And Ürün sayısı bir arttırılır
    And Alışverişi tamamla bir butonuna tıklanır
    And Üye girişi sekmesine gidildiği görülür
    And Üyeliğim yok adımında e-posta ve GSM alanı doldurulur
    And Üye olmadan devam et butonuna tıklanır
    And Adres sayfasına yönlendiği görülür
    And Teslimat adresi ekleme pop-up'ında Ad, soyad, ülke, şehir, ilçe, GSM, posta kodu, adres başlığı ve adres alanları doldurulur
    And Adresi kaydet butonuna tıklanır
    And Yeni adresin kaydedildiği görülür
    And Alışverişi tamamla butonuna tıklanır
    And Ödeme detay sayfasına gidildiği görülür
    And Ödeme detay sayfasında kredi kartı - banka kartı butonuna tıklanır
    When Kredi kartı - Banka kartı ödeme sayfası, kart bilgileri ile doldurulur
    Then Ön bilgilendirme ve mesafeli satış sözleşmesini kabul ediyorum kutusu işaretlenir