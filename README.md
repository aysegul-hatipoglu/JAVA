# Pynar Türkçe Kod Editörü
Tübitak bünyesinde geliştirilen PyNar projesi, Python programlama için Türkçe derleme ortamı sunmayı amaçlamaktadır. 


Geliştirilen chatbotun, bulunacağı derleme ortamı içerisinde bir klavuz görevi görmesi planlanmaktadır.
## Başlarken
Kullanıcıdan alınan girdi cevapVer.py dosyasının içerisinde işlenerek kullanıcıya cevap döndürülmektedir. Bu işlem şu aşamalar ile gerçekleştirilmektedir:
1. Kullanıcının girdiği mesaj, Chatbot.py dosyasında `userinput` değişkeni ile alınıp, `Chat` sınıfı ile `cevapVer.py` dosyasına uygun cevabın verilebilmesi için gönderilmektedir. Aynı zamanda `mesaj_ekle` fonksiyonu ile arayüzden `sqlDialog.py` dosyasına veritabanına yazılmak üzere gönderilmektedir.
```
umsg = Chat(mesaj, pairs, reflections)
sql_konusma_modeli.mesaj_ekle(mesaj, umsg.__repr__())
```
2. `sqlDialog` dosyası girilen değerlerin ve verilen cevapların kaydının tutulabilmesi için veritabanı oluşturup bağlantısını sağlamakta ve ek olarak kayıtları `chat.log` dosyasının 
içerisine yazmaktadır. Aynı zamanda girilen mesajı, uygun cevabın verilebilmesi için `cevapVer.py` dosyası içerisindeki Chat sınıfına parametre olarak göndermektedir.
```
CREATE TABLE IF NOT EXISTS 'Conversations' (
            'author' TEXT NOT NULL,
            'recipient' TEXT NOT NULL,
            'timestamp' TEXT NOT NULL,
            'message' TEXT NOT NULL,
        FOREIGN KEY('author') REFERENCES Contacts ( name ),
        FOREIGN KEY('recipient') REFERENCES Contacts ( name )
        )
```
3. Chat sınıfı; girilen mesaj, pairs ve reflactions paramerelerini almaktadır.
```
class Chat(object):
    def __init__(self, mesaj, pairs, reflections={}):
```
- Pairs, kullanıcının mesajına göre verilebilecek cevapları bulunduran list yapısıdır.
```
pairs = [
    ['benim adım (.*)', ['merhaba %1']],
    ['(.*)adın (ne|nedir)?',['Ben ro-Bot. Sayın Prof. Dr. Turgay Tugay Bilgin in Tübitak projesi kapsamında geliştirilen bir chatbotum.']],
    [('merhaba|meraba|hey|hay'),['merhaba','heeey','naaber']],
    ['(.*) eğlenceli bir yer',['%1 gerçekten de çok eğlenceli bir yer']],
    ['(.*) (.*) oldukça (.*)',['%1 %2 gerçekten de çok %3']],
    ['(.*)nerede yaşıyorsun?',['İstanbul\'da yaşıyorum.']],
    ['(.*)nerelisin?',['ben bir sohbet botuyum. doğum yerim yok.']],
    ['(.*)kaç yaşındasın ?',['2020 yılı itibari ile geliştirilmekteyim.']],
    ['(.*)hava nasıl ?',['her zamanki gibi. bir değişiklik yok!']],
    ['(.*)nasılsın ?',['ben çok iyiyim. sen nasılsın?']],
    ['(.*)yardım edermisin?',['elbette yardım ederim.']],
    ['boyun kaç?',['ben bir bot olduğum için boyum tanımsız.']],
    ['tamam',['görüşmek üzere']],
    ['(.*)',['Ne dediğinizi anlayamadım']],

]
```
- Reflections ise bir dizi girdi değeri ve karşılık gelen çıktı değerlerini içeren bir sözlüktür.
```
reflections = {
    'nasılsın':'iyiyim',
    'ben':'sen',
    'benim':'senin',
    'benimki':'seninki'
}
```
## Kurulum
Program Pyton dili ile programlandığında bilgisayarınızda `Python` kurulu olmalıdır. Şu linkten indirebilirsiniz:
```
https://www.python.org/downloads/
```
Ek olarak Pyhton için platformlar arası arayüz desteği sunan `PyQt5` eklentisi kurulmalıdır:
```
pip3 install pyqt5
```
Programı çalıştırabilmek için indirdiğiniz dosyada ana dizin içerisinde komut satırını (CMD) başlatıp aşağıdaki kodu çalıştırmanız yeterlidir:
```
python chatbot.py
```
# Programın ekran görüntüsü:
![Screenshot_1](https://user-images.githubusercontent.com/43681383/93214500-ed1fc680-f76d-11ea-8af2-dbd32d5cd6e3.png)

