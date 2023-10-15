# Uygulamalar-Nesne-Yonelimli
Product App Uygulama Gereksinimleri
Product sınıfı name, price ve quantity alanlarına göre modellenmeli.

Nesne tanımlanmalı ve başlatılmalı. Product sınıfından nesne oluşturulurken yapıcı metot farklı parametrelere göre çağrılabilmeli.

    - Product()
    - Product("Computer")
    - Product("Computer",750)
    - Product("Computer",750, 3)
Yapıcı metot oluşturulan nesnenin adını ekrana yazdırmalı ve tarih bilgisi vermeli.

Her ürün için get_total_price() aşağıdaki formülüne göre hesaplanmalı. $$ total_{price} = item_{price} * item_{quantity} $$

Product sınıfının attribute ifadeleri kapsüllenmeli.

Ürün isim alanı (name) en az 3 ve en fazla 8 karakter olabilmeli.
Ürün fiyat (price) değeri minimum 0 olabilmeli.
Ürün adet (quantity) değeri minimum 1 olabilmeli.
Product sınıfı ekrana yazdırılırken base-super sınıfın yöntemini geçersiz kılmalı.

Product Sınıfını kullanmak üzere ProductHelper sınıfı yazılmalı.

Bir .txt dosyasından okuma yapabilen static create_item_from_text isimli bir metoda sahip olmalı.
Metin dosyasında attribute ifadeleri , ile ayrılmalı.
Her satır okunurken ilgili satırı Product nesnesine çevrilmeli.
İlgili veri tipi dönüşümleri bu metot içerisinde tanımlanmalı.
Bir ürün listesindeki toplam ödeme miktarını hesaplayan get_total_balance isimli bir static metoda sahip olmalı.
Bu metot parametre olarak aldığı Product listesindeki ürünleri dolaşmalı.
Her ürünü fiyatı ve adet ifadesine göre hesaplanmalı.
Toplam bakiye %20 KDV oranı eklenmeli.
Üretilen Product sınıfı Models klasörü altına alınmalı.

Üretilen ProductHelper sınıfı Helpers klasörü altına alınmalı.

Yukarıdaki ifadelere göre modellenmiş sınıflar Products.txt dosyasını okuyacak şekilde kullanılmalı.
