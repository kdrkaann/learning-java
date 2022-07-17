# Kafein Staj - learning java

| Gün  | Konu |
| ------------- | ------------- |
| 1  | IDE seçimi ve Java’ya başlangıç  |
| 2  | Java’da değişkenler, temel veri tipleri, temel operatörler ve control statements  |
| 3  | Java’da döngüler, diziler (arrays), string’ler, paketler (packages), kullanıcıdan veri (input) alma  |
| 4  | Java’da metotlar (fonksiyonlar), class’lar (sınıflar) ve kullanımları  |
| 5  | Yazılım prensipleri ve OOP konseptine giriş  |
| 6  | Java’da OOP - encapsulation (kapsülleme), constructors (yapıcı bloklar) ve Access Modifiers  |
| 7  | Java’da OOP – Inheritance (kalıtım) ve metot overloading (aşırı yüklenme)  |
| 8  | Java’da OOP – Polymorphism (çok biçimlilik), method overriding (metot ezme/geçersiz kılma), Abstraction ve Abstract Class’lar (soyut sınıf)  |
| 9  | Java’da OOP – Interface (arayüzler), Inner Class ve Static terimi  |
| 10 | Java’da Collections (Koleksiyonlar) – ArrayList ve Hashmap ve Java’da Exception Handling  |
| 11 | Java’da Generics ve Threading  |
| 12 | MySQL kurulumu, temel SQL sorguları ve Java’da JDBC ile database (veri tabanı) bağlantısı  |
| 13 | Java’da JDBC ile veri tabanı işlemleri (SELECT, INSERT, UPDATE, DELETE) ve verileri nesnelere aktarma   |
| 14 | Java’da dosyalar ile çalışmak  |
             
## 📔 Java 1. Gün
### IDE seçimi ve Java’ya başlangıç
Mentörüm Hasan Bey Java için şirkette ve profesyonel hayatta genellikle IntelliJ IDEA kullanıldığını belirtti, arayüzüne de şimdiden alışmam için IDE olarak IntelliJ IDEA’yı tercih ettik. Uygulamayı bilgisayarıma indirip kurdum.
Temel bilgileri edindikten sonra `System.out.print()` ve `System.out.println()` gibi output alma fonksiyonlarının kullanımını öğrendim. Ardından aşağıdaki gibi “hello world!” benzeri ilk kodlarımı yazdım.
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("I'm Kadir Kaan.");
        System.out.println("I've finished my " + 2 + "year at Kadir Has University");
        System.out.println("I'm " + (12+8) + " years old.");
    }
}
```

## 📔 Java 2. Gün
### Java’da değişkenler, temel veri tipleri, temel operatörler ve control statements
Java’da temel veri tipleri olarak boolean, char, byte, short, int, long, float, double ve string bulunuyor. C++’ta bulunan unsigned veri tipleri bulunmuyor, ayrıca C++’ta bulunmayan byte veri tipi Java’da mevcut. Byte veri tipi tek byte’lık tam sayı değerlerini tutmak için kullanılıyor.

Temel veri tiplerinden sonra temel operatörler hakkında bilgiler edindim. Örneğin, 
== eşittir, != eşit değildir, > büyüktür, < küçüktür, >= büyük eşittir, <= küçük eşittir anlamına gelmekte. Ayrıca && ve(and), || veya(or), ! değili(not) anlamına geliyor.

Sonrasında control statements hakkında bilgi edindim. Bunlar if, else if, else ve switch-case’dir. Control statements kullanarak aşağıdaki gibi örnekler yaptım.

```java
public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        if(flag == true){
            System.out.println("Flag is true.");
        }
        else{
            System.out.println("Flag is false.");
        }

        char grade = 'A';
        switch (grade){
            case 'A':
                System.out.println("Well done!");
                break;
            case 'B':
                System.out.println("Great!");
                break;
            case 'C':
                System.out.println("Good!");
                break;
            case 'D':
                System.out.println("Enough.");
                break;
            case 'F':
                System.out.println("You should work harder!");
                break;
        }
    }
}
```

## 📔 Java 3. Gün
### Java’da döngüler, diziler (arrays), string’ler, paketler (packages), kullanıcıdan veri (input) alma
Java'da 3 tip döngü bulunuyor. Bunlar For loop, While loop ve Do-While loop. Üçünün de syntax’i C++ ile aynı olduğu için hızlıca uyum sağlayıp birkaç örnek sonrası öğrenimime diziler (arrays) ile devam ettim.

Diziler, aynı türden birden fazla değişkeni tutmamızı sağlayan hafıza birimidir. Dizi oluşturduktan sonra dizinin içerisindeki elemanlara indeks numarasıyla ulaşabilir ve değiştirebiliriz. Ayrıca, çok boyutlu diziler oluşturmak da mümkündür. İki boyutlu dizilere matris(matrix) denir. Küçük farklılıklar dışında Java’da dizi oluşturma aşamaları ve dizilerle yapılan işlemler C++ ile oldukça benzer. Aşağıdaki gibi çeşitli örneklerle öğrendiklerimi pekiştirdim.
```java
public class Main {
    public static void main(String[] args) {
        double[] arr = {1.7, 2.6, 9.3, 2.4, 8.4, 3.5};
        System.out.println(Arrays.toString(arr));
        double max = 0;
        double total = 0;
        for(double n : arr){
            if(max < n){
                max = n;
            }
            total += n;
        }
        System.out.println("Total: " + total);
        System.out.println("Max: " + max);
    }
}
```
Ardından Java’da string sınıfında yapılabilen işlemler hakkında bilgi edindim. String sınıfı charAt(), concat(), equals(), trim(), length(), substring() ve toLowerCase() gibi fonksiyonlara sahip. Bu fonksiyonların işlevlerini ve kullanımlarını öğrenip uyguladım. Aşağıdaki gibi örnekler yaptım.
```java
public class Main {
    public static void main(String[] args) {
        String str = "Cristiano Ronaldo";
        System.out.println(str);
        System.out.println(str.charAt(3));
        
        System.out.println("-------");

        str = str.concat(" Portugal");
        System.out.println(str);

        System.out.println("-------");

        System.out.println(str.startsWith("C"));
        System.out.println(str.endsWith("a"));
```       
Sonrasında Java’da paketler (packages) ve kullanıcıdan veri (input) almak hakkında bilgi edinmeye başladım.
Java’da proje oluştururken özellikle büyük ve kapsamlı projelerde sınıflar mantıksal ve yapısal durumlarına göre farklı paketler (packages) altında tutulurlar. C++’taki kütüphaneler gibi Java’da da Paketler bulunur. Paket Yapısı kullanılması hem kodun daha düzenli olmasını hem kullanımın kolay olmasını hem de sınıfların birbirleriyle iletişimlerinde meydana gelecek sınırlandırmaların ayarlanabilmesini sağlar. Paket yapısı aslında Java içerisinde dosya yolu tanımlamaktır. Oluşturduğumuz sınıfları farklı paketler altına koymak aslında bu sınıfları farklı dosya yolları içerisine kaydetmek demektir. Bu dosya yollarıyla Java hangi sınıfa nereden erişeceğini rahat bir şekilde anlayabilir. Bir paket içinde aynı adı taşıyan iki sınıf ya da arayüz olamaz. Ama, farklı paketler altında sınıf oluştururken aynı isimler kullanılabilir.

Paket oluştururken paket adından hemen önce package anahtar sözcüğü yazılır. Genellikle sınıftan ayırmak için paket adları küçük harfle başlatılır. Paketler başka paketleri import edebilir. Bir paketi dahil edebilmek için import anahtar kelimesi kullanılır. Eğer bir paketteki belirli bir alt paketi/sınıfı import edeceksek, ana paket isminden sonra nokta koyup alt paketin/sınıfın adını yazarız. Eğer bir alt paketin içindeki her şeyi import etmek istiyorsak noktadan sonra * ekleriz. Ayrıca, static olarak tanımlanmış değişken ve metotları sanki import ettiğimiz sınıfın bir parçasıymış gibi kullanabilmek için import static deyimi kullanılır.

Paketler hakkında bilgi sahibi olduktan sonra kullanıcıdan veri (input) almak hakkında bilgi edinmeye başladım.

Java’da kullanıcıdan veri almak için Scanner sınıfı kullanılır. Ama bu sınıfı kullanmadan önce kodumuza Scanner sınıfını dahil (import) etmemiz gerekir. Ardından Scanner sınıfına ait bir nesne tanımlanır ve bu nesnenin fonksiyonlarıyla input alımı yapılır. Alınacak verinin türüne göre nextInt(), nextDouble(), nextLine() gibi fonksiyonlar kullanılır.

Listeler, string’ler, paketler ve input alma hakkında öğrendiklerimi bir araya getirip çeşitli uygulamalar oluşturdum.

## 📔 Java 4. Gün
### Java’da metotlar (fonksiyonlar), class’lar (sınıflar) ve kullanımları
Java'da metotlar sadece çağrıldığında kullanılan kod bloklarıdır. Bir program içindeki main metodu çağırılarak çalıştırılır. Metotlara bir diğer adlandırma olarak fonksiyon da denilmektedir. Bunun sebebi bu kod yapısının matematikteki fonksiyon mantığına çok benzemesidir. Java'da metotlarımızın içerisine veri aktarmak için parametre girebilmekteyiz. Java’da metotlara girilen parametreler reference olarak değil value olarak aktarılıyor, yani aktarılan verinin kendisi değil otomatik oluşturulan kopyası fonksiyonun içinde işlem görüyor. Ayrıca Java metoda girilecek parametre belirtilirken C++’ta bulunmayan bir özelliğe sahip. Bu da veri tipinin yanına üç nokta koyularak (ör: int...) o tipte birden fazla değeri, kaç tane olduğundan bağımsız olarak metoda yollayabiliyoruz. Yani bu kullanımla int... olarak belirttiğimiz parametreye kaç tane integer değeri girmemiz gerektiği hakkında bir kısıtlama yok. 1 tane de girebiliriz 20 tane de. Java bu değerleri alıp bir array’e çeviriyor ve üstünde bir array gibi çalışıyor. 

Metotlar hakkında bilgi sahibi olup birkaç örnek yaptıktan sonra Class’lar üzerine çalışmaya başladım. Java Nesne Yönelimli bir programlama dilidir. Java'daki her şey, değişkenleri ve metotları ile birlikte sınıflar ve nesnelerle ilişkilidir. Örneğin: gerçek hayatta araba bir nesnedir. Arabanın ağırlık ve renk gibi değişkenleri ve sürüş ve fren gibi metotları vardır. Nesne yönelimli programlamanın amacı yazdığımız kodlara soyut bir kavrama dönüştürmektir. Sınıflara ait nitelikler ve davranışlar vardır. Programlamada nitelikler (attributes) için değişkenler (variable), davranışlar için ise metotlar tanımlanır. Java’da sınıf isimleri oluşturulan Java dosyasıyla aynı isme sahip olmalıdır. Java'da nesne üretmek için C++’ta olduğu gibi "new" anahtar kelimesini kullanırız.

Sınıflara ait niteliklere erişim sağlamak için nokta (.) kullanılır. İlgili nesnenin ismini sonuna nokta koyularak erişilmek istenilen niteliğin ismi yazılır. Aynı şekilde, sınıfa ait davranışlara yani metotlara erişmek için nokta (.) kullanılır. İlgili nesnenin ismini sonuna nokta koyularak erişilmek istenilen metodun ismi yazılır ve var ise parametreleri girilir.

Ek olarak, SOLID yazılım prensibine göre bir metodun veya sınıfın yalnızca bir sorunu çözmesi, yapması gereken sadece bir işi olması gerekir. 

C++ ile oldukça benzer olan Java class syntax’ına alışmam kolay oldu ve farklı örnek sınıflar oluşturmaya başladım. Sonrasında ise metotlar ve sınıflar hakkında öğrendiklerimi birleştirmek ve pekiştirmek için bir basit hesap makinesi sınıfı yazdım.
```java
public class Calculator {
    public int sum(int... nums){
        int result = 0;
        for(int num : nums){
            result += num;
        }
        return result;
    }
    public int subtract(int... nums){
        int result = 0;
        for(int num : nums){
            result -= num;
        }
        return result;
    }
    public int multiply(int... nums){
        int result = 1;
        for(int num : nums){
            result *= num;
        }
        return result;
    }
    public double divide(double num1, double num2){
        return num1/num2;
    }
    public int remainder(int num1, int num2){
        return num1%num2;
    }
    public int square(int num){
        return num*num;
    }
}
```

## 📔 Java 5. Gün
### Yazılım prensipleri ve OOP konseptine giriş
•	S.O.L.I.D. tasarım ilkeleri aşağıdakilerden oluşur:

S- Single Responsibility Principle (Tek Sorumluluk Prensibi): 
Her modül (sınıf, metot vb.), yazılımın sağladığı işlevselliğin tek bir parçası üzerindeki sorumluluğunu yerine getirecek şekilde tasarlanmalıdır.

O- Open/Closed Principle (Açık/Kapalı Prensibi): 
Geliştirilen yazılımdaki nesnelerin geliştirmeye açık ama değişime kapalı olması gerekir. Yazılımda herhangi bir güncelleme yapılması durumunda temel nesnenin değişime kapalı tutulması gerekir. Bir nesne ek özellik kazandıysa bu nesne genişletilebilir fakat temel nesne değiştirilmemelidir.

L- Liskov’s Substitution Principle (Liskov’un İkame “Yerine Geçme” Prensibi): 
Miras alarak türemiş olan sınıfların önce miras aldıkları nesnenin tüm özelliklerini kullanması, sonra da kendi özelliklerini barındırması gerekir. Eğer oluşturulan sınıf, miras aldığı nesnenin tüm özelliklerini kullanmazsa ortaya gereksiz kod blokları çıkar.

I- Interface Segregation Principle (Arayüz Ayrıştırma Prensibi): 
Bir arayüze (interface) gereğinden fazla iş yüklemek yerine bu işler için birden fazla arayüzler oluşturulmalıdır. Bu prensibin amacı nesnelere, ihtiyacı olmayan özellik veya fonksiyonlar içeren arayüz uygulamamaktır.

D- Dependency Inversion Principle (Bağımlılık Tersine Çevirme Prensibi): 
Alt sınıfların üst sınıfları etkilememesi, sınıflar arasındaki bağımlılıkların olabildiğince az olması gerekir. Özellikle yüksek seviyeli sınıflar, düşük seviyeli sınıflara bağlı olmamalıdır.

•	KISS — Keep It Simple, Stupid (Basit Tut, Aptal):

“Keep It Simple, Stupid” ilkesi bize tüm yazılım veya uygulama tasarımının ve dağıtımının mümkün olduğunca basit, en az karmaşıklıkla ve geliştirme prosedürlerini anlamak için anlaşılır şekilde yapılması gerektiğini hatırlatır. Bu ilke, kaynak kodun hata ayıklamasının kolay hale getirilmesini ve gelecekteki herhangi bir operasyon ve bakımın (maintenance) daha kolay olmasını sağlar.

•	DRY — Don’t Repeat Yourself (Kendini Tekrar Etme):

“Don’t Repeat Yourself” ilkesi bize, her yazılım mühendisinin, fazlalıklardan kaçınmak için çalışmalarında bilgi veya yöntemlerin tekrarını azaltmayı hedeflemesi gerektiğini söyler. Bu nedenle, tüm değerlendirme sistemini parçalara ayırmanız önerilir. Kodu daha küçük parçalara bölmek, kodu yönetmeye ve gerektiğinde arayarak herhangi bir noktada tek bir parça kullanmaya yardımcı olabilir.

Sonrasında OOP (Object Oriented Programming / Nesne Yönelimli Programlama) konsepti hakkında bilgi sahibi oldum. Nesne Yönelimli Programlama, sınıflar ve nesneler kavramına dayanan bir programlama yaklaşımıdır. Bu yaklaşımın amacı, ihtiyaç duyulan programı daha küçük parçalara bölerek, yönetilebilir ve yeniden kullanılabilir hale getirmektir. 

•	OOP, programlar için net bir yapı sağlar. DRY, KISS gibi ilkeleri uygular ve kodun bakımını, düzenlenmesini ve hata ayıklamasını kolaylaştırır.

•	OOP, daha az kod ve daha kısa geliştirme süresiyle, yeniden kullanılabilir uygulamalar oluşturmayı mümkün kılar.

•	OOP, yapıya daha sonradan yeni özellikler ekleyerek genişletilebilirlik sağlar.

•	OOP, problemleri gerçek hayattaki işlemlere göre modeller.

Nesne Yönelimli Programlama ile bizler yapacağımız her şeyi bilgisayarın anlayacağı şekilde modelleyip, “nesne” halinde aktarıyoruz. Böylelikle gerçek hayatta bizim için geçerli olan nesneleri artık bilgisayarların anlayacağı hale getirmiş oluyoruz.

## 📔 Java 6. Gün
### Java’da OOP - encapsulation (kapsülleme), constructors (yapıcı bloklar) ve Access Modifiers


