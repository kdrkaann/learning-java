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
| 15 | İleri Seviye Java - Spring Framework’e giriş  |
| 16 | İleri Seviye Java - Hibernate  |
| 17 | İleri seviye Java - Maven  |
| 18 | İleri Seviye Java - Spring Boot  |
| 19 | Katmanlı mimariler, application.properties dosyası, JPA ve örnek bir proje  |
| 20 | Staj projesi – MySQL’de proje için veri tabanı oluşturma, Java’da veri tabanı nesnesi için sınıf oluşturma  |
| 21 | Staj projesi – Projenin Data Access katmanının yazılması, application.properties dosyasının konfigürasyonu  |
| 22 | Staj Projesi – Projenin Service katmanı ve REST Api’ının yazılması  |
             
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
Ardından Java’da string sınıfında yapılabilen işlemler hakkında bilgi edindim. String sınıfı `charAt()`, `concat()`, `equals()`, `trim()`, `length()`, `substring()` ve `toLowerCase()` gibi fonksiyonlara sahip. Bu fonksiyonların işlevlerini ve kullanımlarını öğrenip uyguladım. Aşağıdaki gibi örnekler yaptım.
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
            
Java’da proje oluştururken özellikle büyük ve kapsamlı projelerde sınıflar mantıksal ve yapısal durumlarına göre farklı paketler (packages) altında tutulurlar. C++’taki kütüphaneler gibi Java’da da Paketler bulunur. Paket Yapısı kullanılması hem kodun daha düzenli olmasını hem kullanımın kolay olmasını hem de sınıfların birbirleriyle iletişimlerinde meydana gelecek sınırlandırmaların ayarlanabilmesini sağlar. Paket yapısı aslında Java içerisinde dosya yolu tanımlamaktır. Oluşturduğumuz sınıfları farklı paketler altına koymak aslında bu sınıfları farklı dosya yolları içerisine kaydetmek demektir. Bu dosya yollarıyla Java hangi sınıfa nereden erişeceğini rahat bir şekilde anlayabilir. Bir paket içinde aynı adı taşıyan iki sınıf ya da arayüz olamaz. Ama, farklı paketler altında sınıf oluştururken aynı isimler kullanılabilir.

Paket oluştururken paket adından hemen önce package anahtar sözcüğü yazılır. Genellikle sınıftan ayırmak için paket adları küçük harfle başlatılır. Paketler başka paketleri import edebilir. Bir paketi dahil edebilmek için import anahtar kelimesi kullanılır. Eğer bir paketteki belirli bir alt paketi/sınıfı import edeceksek, ana paket isminden sonra nokta koyup alt paketin/sınıfın adını yazarız. Eğer bir alt paketin içindeki her şeyi import etmek istiyorsak noktadan sonra * ekleriz. Ayrıca, static olarak tanımlanmış değişken ve metotları sanki import ettiğimiz sınıfın bir parçasıymış gibi kullanabilmek için import static deyimi kullanılır.

Paketler hakkında bilgi sahibi olduktan sonra kullanıcıdan veri (input) almak hakkında bilgi edinmeye başladım.

Java’da kullanıcıdan veri almak için Scanner sınıfı kullanılır. Ama bu sınıfı kullanmadan önce kodumuza Scanner sınıfını dahil (import) etmemiz gerekir. Ardından Scanner sınıfına ait bir nesne tanımlanır ve bu nesnenin fonksiyonlarıyla input alımı yapılır. Alınacak verinin türüne göre `nextInt()`, `nextDouble()`, `nextLine()` gibi fonksiyonlar kullanılır.

Listeler, string’ler, paketler ve input alma hakkında öğrendiklerimi bir araya getirip aşağıdaki gibi çeşitli uygulamalar oluşturdum.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Write a number to check: ");
        int num = input.nextInt();

        if(num == 1){
            System.out.println("It is not a prime number.");
            return;
        }
        else if(num <= 0){
            System.out.println("Invalid number.");
            return;
        }
        boolean isPrime = true;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("It is a prime number.");
        }
        else{
            System.out.println("It is not a prime number.");
        }
    }
}
```
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
Encapsulation ilkesi, bir sınıfa ait değişkenlerin veya niteliklerin ancak o sınıfa ait metotlar tarafından değiştirilebilmesi ve okunabilmesi ilkesidir. Bu ilke sayesinde nesnelerde oluşacak anlamsızlıkların önüne geçilebilir.

Ayrıca değişkenlere sınıfların dışından erişim olmaması ve bir sınıf içindeki değişkenlerin nasıl ve ne kadar olacağının da başka kodlardan saklanmış olması anlamına gelir. Böylelikle biz değişkenlerimizi sarmalayarak istenmeyen durumlardan korunacak bir filtre haline dönüştürebiliriz.

Bir sınıfa ait nitelik ve davranışlara erişebilmek için Access Modifiers (Erişim Belirleyiciler) kullanılır. Java’da Access Modifiers değişken metot ve sınıfların önüne yazılır ve yazıldıkları konunun erişilebilecekleri alanı belirlerler.

Java’da 3 adet Access Modifier mevucttur. Bunlar Private, Public ve Protected’dır. 

•	Private: yazıldığı öğenin sadece o sınıf tarafından erişilebilir olduğunu ve o sınıfın dışındaki kodlardan doğrudan erişim olmadığını tanımlar. 
•	Public: yazıldığı öğenin sadece ait olduğu sınıf için değil diğer sınıflar tarafından da doğrudan erişilebilir olmasını sağlar. 
•	Protected: Public ve Private arasında kalan erişim düzenleyicidir. Protected ile tanımlanan öğeler kendisi ile aynı pakette (package) bulunan sınıflar tarafından doğrudan erişilebilir.

Bir sınıfa ait private değişkenlere ulaşmak için Getter metotları kullanılır. Bir sınıfa ait private değişkenlerin değerini değiştirmek için ise Setter metotları kullanılır.
```java
public class Product {
    private String name;
    private String description;
    private double price;
    private int id;
    private int stockAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStockAmount() {
        return this.stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}
```
           
Yapıcı metotlar sınıf tasarlanırken yazılırlar. Eğer sınıf içinde hiç yapıcı metot tanımlanmazsa parametresiz boş bir yapıcı metot Java tarafından otomatik olarak tanımlanır. Yapıcı metotların isimleri Sınıf ismiyle aynı olmak zorundadır. Dönüş tipi olarak veya void olarak herhangi bir tanımlama yapılmasına gerek yoktur. Sonrasında bu sınıfa ait bir nesne oluşturulduğunda nesnenin nitelikleri(attributes) null’a eşit olur. 

Yukarıda oluşturduğum Product sınıfa bir constructor (yapıcı metot) yazılmadığı için Java otomatik tanımlanan constructor’ı kullanarak sınıf için tanımlanan niteliklere sahip bir nesne oluşturdu ve bu nitelikleri null’a eşitledi. Eğer otomatik tanımlanan yapıcı metotun (default constructor) bizim tanımladığımız bir constructor varken de kullanılabilmesini istiyorsak parametresiz ve içi boş bir constructor metodu yazmamız gerekiyor.
       
Yazdığım Product sınıfına name, description, stockAmount, price ve id niteliklerinin parametre olarak verildiği bir constructor yazdım. Default constructor’ın da kullanılabilir olması için onu da içi boş bir şekilde tanımladım.
```java
Product(){

}
Product(String name, String description, double price, int id, int stockAmount){
    this.name = name;
    this.description = description;
    this.price = price;
    this.id = id;
    this.stockAmount = stockAmount;
}    
```

## 📔 Java 7. Gün
### Java’da OOP – Inheritance (kalıtım) ve metot overloading (aşırı yüklenme)
Java’da bir metodu farklı türde, sayıda veya sırada parametre ile oluşturmak istiyorsak yani aynı metodun farklı versiyonları oluşturulmak isteniyorsa metotlara overloading (aşırı yükleme) yapılır. Metotlar aynı isme sahip olur ancak parametreleri farklılık gösterir. Farklı constructor metotları oluşturmaya benzer.

Aşağıdaki örnekte bir example fonksiyonu tanımladım ve overloading ile üç farklı versiyonunu oluşturdum.
```java
    public static int example(int a, int b){
        return a + b;
    }
    public static int example(int a, int b, int c){
        return a + b - c;
    }
    public static int example(int a, int b, int c, int d){
        return a * b + c - d;
    }
```

       
Bir sınıfın başka bir sınıftan kalıtım yapması (inheritance) demek, kalıtımı yapan sınıfın diğer sınıftaki nitelik ve davranışlarını (metotlarını) kendisine alması, kullanabilmesi demektir. Kalıtımı yapan sınıfa alt sınıf, kendisinden kalıtım yapılan sınıfa ata sınıf dersek, ata sınıfta tanımlı olan her şeyin alt sınıf için de tanımlı olduğunu söyleyebiliriz. Kalıtım Java’da “extends” kelimesi ile tanımlanır. Örneğin A sınıfının B sınıfından kalıtım yapmasını istiyorsak A sınıfını tanımlarken “public Class A extends B” şeklinde yazarız.

Kalıtımın kavramının birçok farklı türü bulunmakta:

•	Tek Yönlü Kalıtım (Single Inheritance): Bir sınıfın başka bir sınıfı genişlettiği, alt ve ata sınıf ilişkisini ifade eder.

•	Çoklu Kalıtım (Multiple Inheritance): Bir sınıfın birden fazla sınıfı miras almasını ifade eder. Yani bir alt sınıfın iki ata sınıfa sahip olduğu anlamına gelir. Java multiple inheritance’ı desteklemez.

•	Çok Seviyeli Kalıtım (Multilevel Inheritance): Bir sınıfa ait alt sınıfın başka sınıfları genişletmesine denir.

•	Hiyerarşik Kalıtım (Hierarchical Inheritance): Birden fazla sınıfın aynı sınıfı genişlettiği bir alt ve üst sınıf ilişkisini ifade eder. Yani bir ata sınıfın birden çok alt sınıfı vardır.

•	Hibrit Kalıtım (Hybrid Inheritance): Programda birden fazla kalıtım türünün kombinasyonuna denir. Örneğin, A ve B sınıfı, C sınıfını genişletir ve başka bir D sınıfı, A sınıfını genişletir, bu bir hibrit kalıtım örneğidir çünkü bu durum tek yönlü ve hiyerarşik kalıtımın bir birleşimidir.

Ek olarak, ata sınıfın tipinde tanımlanan bir parametreye, o ata sınıfın alt sınıflarının tipinde bir değişken yazılırsa kod sorunsuz çalışır çünkü alt sınıflar ata sınıfın da özelliklerini içerir.
Aşağıdaki örnekte bir A sınıfı tanımladım. Sonrasında A sınıfının alt sınıfı olan bir B sınıfı tanımladım. Sonra da B sınıfının alt sınıfı olan C sınıfı tanımladım.
```java
public class A {
    public int sum(int n, int m){
        return n + m;
    }
}
```
```java
public class B extends A{
    public int multiplication(int n, int m){
        return n * m;
    }
}
```
```java
public class C extends B{
    public int remainder(int n, int m){
        return n % m;
    }
}
```
C sınıfından oluşturduğum nesneyle A ve B sınıflarının fonksiyonlarını çalıştırabildim. Ardından B sınıfından oluşturduğum nesneyle de A sınıfının `sum()` metodunu kullanabildim. Çünkü C sınıfı B’nin, B sınıfı da A’nın alt sınıfı.

## 📔 Java 8. Gün
### Java’da OOP – Polymorphism (çok biçimlilik), method overriding (metot ezme/geçersiz kılma), Abstraction ve Abstract Class’lar (soyut sınıf)
Polymorphism bir üst sınıf referansının tüm alt sınıf nesnelerini tutabilmesidir. Yani bir üst sınıf referansına tanımlanan bir değeri, o sınıfın alt sınıflarının tipinde değişkenler yazarak çalıştırabiliriz.
	
Ayrıca Polymorphism, alt sınıfların ata sınıflardaki metotları method overriding sayesinde geçersiz kılması, çok biçimli olarak davranmasına denir. Bu sayede alt sınıf ata sınıfından gelen davranışı kendine göre şekillendirebilir.

Method overriding (metot ezme/geçersiz kılma) bir alt sınıfın içine, doğrudan ya da dolaylı olarak ata sınıflarından gelen bir yöntemin aynısının, aynı yöntem adı ve aynı parametrelere sahip olarak, kodlanmasına verilen addır. Java’da bu işlem metottan önce yazılan @Override ifadesi ile kullanılır. Eğer bir metodun override edilememesi isteniyorsa, bu metot final ifadesi kullanılarak tanımlanır.

Polymorphism sayesinde uygulamaların genişletilebilirliğini sağlarız. Ata sınıfın sunduğu yöntemleri geçersiz kılan alt sınıflar yardımı ile ata sınıfa göre kodlanmış bir kod kesimine (metot vb.) farklı davranışlar yükleme imkanımız olmaktadır. Yani, elimizde esnek bir altyapı var denebilir. 

Aşağıdaki örnekte Polymorphism ve overriding’i birlikte kullanarak bir kredi hesaplama programı yazdım. Bu programda BaseLoanManager adında bir ata sınıf ve bu sınıfın alt sınıfları olan AgricultureLoanManager, StudentLoanManager, TeacherLoanManager sınıflarını yazdım.

Base sınıfa faiz oranını 1,18 olarak tanımladım ve bir calculate (hesaplama) metodu yazdım. Diğer alt sınıflar için de hesaplama metodunu override ettim ve hesaplamaları farklı faiz oranları ile yaptım.
```java
public class BaseLoanManager {
    public double calculate(double amount){
        return amount * 1.18;
    }
}
```
```java
public class AgricultureLoanManager extends BaseLoanManager{
    @Override
    public double calculate(double amount){
        return amount * 1.15;
    }
}
```
```java
public class StudentLoanManager extends BaseLoanManager{
    @Override
    public double calculate(double amount){
        return amount * 1.10;
    }
}
```
```java
public class TeacherLoanManager extends BaseLoanManager{
    @Override
    public double calculate(double amount) {
        return amount * 1.13;
    }
}
```
        
Abstraction (soyutlama), bir sınıfa veya metoda temel görevlerin tanımlanması, detayların ise tanımlanmaması demektir. Temel olarak bir soruna ait çözüme giderken kullanılacak yöntemlerin, ilk etapta daha genel basit ve soyut bir tanımını yapmaktır. Alt sınıfların ortak özelliklerini ve işlevlerini taşıyan ancak henüz bir nesnesi olmayan bir üst sınıf oluşturmak istenirse bir abstract (soyut) üst sınıf oluşturulur. Soyutlama için Java'da iki yöntem mevcuttur: abstract sınıf tanımlamak ve interface tanımlamak.

Abstract sınıflar, "abstract" anahtar kelimesi ile tanımlanan sınıflardır. Sınıfın içinde soyut (abstract) metotlar veya normal metotlar tanımlanabilir. Abstract olarak tanımlanan metotların abstract sınıf içinde tanımı yapılmaz ve inherit eden alt sınıflarda özel olarak tanımlarının yapılması gerekir. Ayrıca soyut sınıflardan new anahtar kelimesi ile bir nesne oluşturulamaz. Abstract sınıflar da polymorphism özelliği sayesinde alt sınıflarının referansını tutabilirler.

Aşağıdaki örnekte abstract class’ları kullanarak bir prototip Database Manager örneği oluşturdum. Bunun için bir abstract BaseDatabaseManager sınıfı oluşturdum. Farklı SQL server’ların farklı kodları olabildiği için abstract olarak oluşturduğum bu üst sınıfta getData adlı bir abstract metot oluşturdum. Böylece spesifik SQL server tiplerini kullanmak için oluşturulacak alt sınıflarda, getData metodunun kodlarının o server tipi için özel olarak tanımlanması gerekecektir. Ardından bir de CustomerManager sınıfı oluşturdum. Burada amaç CustomerManager sınıfının içindeki getCustomers metodunu kullanarak SQL server’lardan müşteri verisi çeken bir prototip uygulama yapmak. Örnek alt sınıf olarak da OracleDatabaseManager ve MySqlDatabaseManager sınıflarını oluşturdum.
```java
public abstract class BaseDatabaseManager {
    public abstract void getData();
}
```
```java
public class OracleDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Getting the data - Oracle...");
        //Oracle database codes
    }
}
```
```java
public class MySqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Getting the data - MySql...");
        //MySql database codes
    }
}
```
```java
public class CustomerManager {
    BaseDatabaseManager databaseManager;

    public void getCustomers(){
        databaseManager.getData();
    }
}
```

## 📔 Java 9. Gün
### Java’da OOP – Interface (arayüzler), Inner Class ve Static terimi
Java'da soyutlamayı sağlamanın bir başka yolu da interface tanımlamaktır. 
Interface'lerin abstract class’lara göre soyutlama oranı çok yüksektir. Çünkü, abstract class’larda soyut olmayan fonksiyonlar da tanımlanabilirken, interface’ler içinde sadece soyut fonksiyonlar tanımlanabiliyor. Metot gövdesi olan normal fonksiyonlar tanımlanamıyor. Bu soyut metotların implement eden sınıflar tarafından, aynı abstract class’larda olduğu gibi, özel olarak tanımlanması gerekiyor. Bir sınıf bir interface’den kalıtım alıyorsa implements anahtar kelimesi kullanılır.

Bir sınıf birden fazla interface’i inherit olarak alabilir (implement) ancak birden fazla abstract class’ı inherit alamaz (extend). Ayrıca, Abstract class’larda tüm öğelerin “public” olması zorunlu değilken Interface içerisindeki tüm nesnelerin public olması gerekir. Abstract class’larda olduğu gibi interface’lerde de new anahtar kelimesi ile nesne oluşturulamaz. Ayrıca interface’de tanımlanan değişkenler interface’i çağıran sınıf tarafından değiştirilemezler. Interface’ler de Abstract class’lar gibi polymorphism özelliği ile implement edildikleri sınıfın referansını tutabilirler.

Ek olarak, genellikle interface isimlerinin başına kodun okunurluğunun artması için I harfi yazılır. 

Interface hakkında bilgi edindikten sonra örnekler yapmaya başladım. Aşağıdaki örnekte bir firmanın çalışanlarının durumlarına göre interface implement ettiği çalışan sınıfları oluşturdum. Kafein Yazılım gibi firmalardan outsource olarak çalışan kişiler için OutsourceWorker, firmanın kendi çalışanları için Worker sınıfları oluşturdum. Sonrasında bu sınıflar için firma bünyesinde çalışıyor ise IWorkable interface’ini, yemek masrafları firma tarafından karşılanıyorsa IEatable interface’ini, maaşı firma tarafından ödeniyorsa IPayable interface’ini, ikramiye/ödüllendirme var ise IRewardable interface’ini implement ettim.
```java
public interface IWorkable {
    void work();
    void workingHours();
}
```
```java
public interface IEatable {
    void eat();
}
```
```java
public interface IPayable {
    void pay();
}
```
```java
public interface IRewardable {
    void reward();
}
```
```java
public class Worker implements IWorkable, IPayable, IEatable, IRewardable{
    @Override
    public void work() {
        //works for us
    }
    @Override
    public void workingHours() {
        System.out.println("Works 9am to 6pm");
    }
    @Override
    public void pay() {
        //we pay their salary
    }
    @Override
    public void eat() {
        //we pay for their food expenses
    }
    @Override
    public void reward() {
        //we give them rewards
    }
}
```
```java
public class OutsourceWorker implements IWorkable, IEatable {
    @Override
    public void work() {
        //works for us by outsourcing
    }
    @Override
    public void workingHours() {
        System.out.println("Works 10am to 5pm");
    }
    @Override
    public void eat() {
        //we pay for their food expenses
    }
}
```
        
Java'da Static deyimi, sınıf değişkenlerini veya sınıf metotlarını tanımlarken kullanılır. Eğer bir sınıfa ait değişkenlerin başına static yazılırsa, o değişkenler artık sınıf değişkeni olurlar. Sınıf değişkeni olarak tanımlanan değişkenler, her nesne oluşturduğumuzda ayrı ayrı oluşmazlar. Sınıfa ait ne kadar nesne olursa olsun, sınıf değişkenleri bir tanedir. Sınıfa ait herhangi bir nesne üzerinden bu değişkene ulaşılabilir. Yani, static değerler sınıfa ait iken static olmayan değerler o sınıfın nesnelerine aittir denebilir. Static değerlere sınıf isminin yanına nokta koyularak erişilirken (ör: `Class.staticVar()`), static olmayan değerlere ait oldukları nesne isminin yanına nokta koyularak erişilir (ör: `object.nonstaticVar()`). Sınıf değişkenlerinin bir diğer özelliği ise, ilgili sınıfa ait hiç nesne oluşturulmasa bile bellekte yer kaplarlar.

Öte yandan, eğer sınıfa ait metotlardan bir ya da birden fazlasının önüne static deyimi yazılırsa, o metotlar sınıf metodu olurlar. Sınıf metotlarının en önemli özelliği, ilgili sınıfa ait nesne oluşturulmadan çağırılabilir olmalarıdır. Bu durumda, nesne var olmadan çağrılabilecek olan sınıf metotlarının, nesne var olmadan bellekte var olamayan nesne değişkenlerine erişmesi olanaklı değildir. Kısaca, static değerler sadece static değerleri çağırabilir ve kullanabilir. Static olmayan değerler de sadece static olmayan değerleri çağırıp kullanabilir. Yani, new anahtar kelimesi ile oluşturulan bir nesne, ait olduğu sınıfın static metotlarına erişemez. Benzer şekilde, static olmayan metotlara da bir nesne oluşturmadan erişemeyiz.

Java’da outer class’lar static olamazken, inner class’lar (bir sınıfın içinde bulunan sınıflar) static olabilirler. İç içe tanımlanan sınıfları tabir ederken, diğerini kapsayan sınıfa dıştaki sınıf (outer class), içeride bulunan sınıfa ise içteki sınıf (inner class) denir. İç içe sınıflarda, içteki sınıfı kullanabilmemiz için dıştaki sınıfın bir örneğinin alınması gerekir.

İçteki sınıf, dıştaki sınıfın bütün alanlarına ve metotlarına erişebilir. Dıştaki sınıf tek olmasına rağmen, içteki sınıfın birden fazla örneği alınabilir; bu gibi durumlarda içteki sınıftan oluşturulan nesnelerin hepsi aynı dıştaki sınıfa erişir

## 📔 Java 10. Gün
### Java’da Collections (Koleksiyonlar) – ArrayList ve Hashmap ve Java’da Exception Handling
Java Collections (Koleksiyonlar), nesne grubunu depolamak veya işlem yapma gibi işlemleri sağlayan bir türdür. Genel itibariyle Set, List ve Map olmak üzere 3 temel türden oluşmaktadır. Bunlara Collection Framework denmektedir. Java Collections veri depolamak, veri silmek, veri ekleme ve depolanan verileri içerisinde veri aramak gibi işlemler için kullanılırlar.

List koleksiyon türünden türemiş bir alt sınıf olan ArrayList, liste halindeki verileri dinamik diziler(array) kullanarak saklar. Default boyutu 10’dur. Bu dizilere yeni eleman eklendikçe eğer boyutu yetmiyorsa, çalışma zamanında, arka tarafta var olan dizinin boyutunun 2 katı olan yeni dizi tanımlanır. Eski dizideki elemanlar index değerleri korunarak yeni diziye aktarılırlar. ArrayList sınıfını kullanabilmek için java.util.ArrayList paketini import etmemiz gerekir.

ArrayList sınıfı, C++’taki vector’lere karşılık geliyor denebilir. Ancak vector’lerden farklı olarak type-safe olmadan (non-generic) da yazılabilir. Yani, array’in hangi tipte veri alacağı belirtilmezse array her türden veriyi saklayabilir. Ayrıca, ArrayListler kendi oluşturduğumuz sınıfın türünde de değerler tutabilirler.

ArrayList sınıfı `get()`, `remove()`, `indexOf()` gibi fonksiyonlar barındırır. Bu fonksiyonların bazılarının isimleri C++’taki vector yapısının fonksiyonlarından farklı olsa da aynı işlemleri gerçekleştiriyorlar. 

Ek olarak, non-generic ArrayList’lerde for-each döngüsü yapılırken iterator’ın veri tipine Object yazılır.
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(5);
        list1.add("İstanbul");
        list1.add('a');
        list1.add(3.2);
        list1.remove(2);

        for(Object obj : list1){
            System.out.println(obj);
        }

        System.out.println("---------");

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.remove(2);

        for(int n : list2){
            System.out.println(n);
        }

        System.out.println(list2.indexOf(8));
    }
}
```
       
HashMap sınıfı, verileri key – value (anahtar – değer) çiftleri olarak saklar. Key ile value’nun aynı tipte olmasına gerek yoktur. İkisi de herhangi bir türde olabilir. Key değerleri bir index gibi çalışır diyebiliriz. Bir HashMap değerine(value) ulaşmak için anahtarını bilmemiz gerekir. HashMap, yinelenen değerlere izin verir, ancak yinelenen anahtarlara izin vermez. HashMap sınıfını kullanabilmek için java.util.HashMap paketini import etmemiz gerekir.

HashMap sınıfı keySet(), get(), containsKey(), containsValue() gibi metotlar içerir. Java’daki HashMap sınıfı C++’taki unordered_map yapısına karşılık geliyor denebilir. ArrayList sınıfındaki gibi bu fonksiyonların bazılarının isimleri C++’taki unordered_map yapısının fonksiyonlarından farklı olsa da aynı işlemleri gerçekleştiriyorlar.
```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashTable = new HashMap<>();
        hashTable.put("İstanbul", 34);
        hashTable.put("Trabzon", 61);
        hashTable.put("Sinop", 57);

        for(String n : hashTable.keySet()){
            System.out.println(hashTable.get(n));
        }
        System.out.println("------");
        System.out.println(hashTable.get("Trabzon"));

        hashTable.remove("Trabzon");
        System.out.println(hashTable);
    }
}
```
       
Java’nın Exception Handling (hata yönetimi) mekanizması şu şekilde işler: Programın çalışması sırasında istisnai bir durum oluşursa bu durumla ilgili bir nesne oluşturulur ve throws deyimiyle fırlatılır. Böyle bir durumda, programın olağan akışı durdurulur ve bu hatanın yakalanması beklenir. Hatanın yakalanabilmesi için, hataya sebep olan kodun try-catch bloğu içine yazılması gerekir. Bu durumda Java çalışma ortamı, meydana gelen hatayı yakalayabilecek bir catch bloğu arar, eğer bulursa bu catch bloğu çalıştırılır. Son olarak, eğer bir finally bloğu yazılmışsa bu blok çalıştırılır ve program normal akışına devam eder. try bloğu içindeki kod bloğu hata alsın ya da almasın "finally" bloğu her koşulda çalıştırılır ve opsiyoneldir.

Hata durumlarını yönetmek için 2 yöntem vardır. Try-catch blokları ile hatayı alınacağı tahmin edilen yerde kontrol altına alabiliriz veya hatayı throws anahtar kelimesi ile çağrıldığı bir üst noktaya fırlatarak, çözümün orada yapılmasını zorunlu hale getiririz. throws ifadesine sahip bir metodun, ya çağrıldığı zaman try-catch bloğu içerisinde çağırılmalıdır ya da çağıran metoda throws anahtar kelimesi eklenmelidir. Ayrıca Java’da Exception ata sınıfını türeterek kendi exception’larımızı yazabiliyoruz.

```java
public class BalanceInsufficientException extends Exception{
    String message;

    public BalanceInsufficientException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
```
```java
public class AccountManager {
    private double balance;

    public void deposit(double amount){
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws BalanceInsufficientException{
        if(amount < getBalance()){
           balance = getBalance() - amount;
        }
        else{
            throw new BalanceInsufficientException("Insufficient Balance!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
```

## 📔 Java 11. Gün
### Java’da Generics ve Threading

Generics (Jenerikler), kelime anlamı itibariyle parametrelendirilmiş tür anlamına gelir. Jenerikler sayesinde, sınıf, arayüz veya metot yazarken tek bir türe bağlı kalmayıp üzerinde işlem yapacağınız türü parametre olarak alabilirsiniz. Bu sayede, farklı türler üzerinde çalışan tek bir sınıf yazmak mümkündür. Bu şekilde yazılan sınıflara Generic Class, metotlara Generic Method denir.

Jenerikler, Class ve Interface’lerin tanımında kullanılırken class/interface’in isminden sonra < ve > işaretleri yazılır ve bu işaretlerin ortasına tür için bir değişken ismi yazılır. Genelde bunun için T harfi kullanılır (ör: <T>). Ardından yalnızca belirttiğimiz türün ve alt sınıflarının kullanılabilmesi isteniyorsa veya türün bir interface’i implement etmesi isteniyorsa extends anahtar sözcüğü kullanılır. Öte yandan yalnızca belirttiğimiz türün ve üst sınıflarının kullanılabilmesi isteniyorsa için super anahtar kelimesi kullanılır.

Generic metotlar tanımlanırken ise metotun Acces Modifier’ı (public vb.) yazıldıktan sonra, metodun dönüş tüpü ve isminden önce aynı yazım(<T>) kullanılır.

Jenerikler JDK 5 ile dile eklenmiştir. Buna rağmen, Java’nın en temel özelliklerinden biridir ve dili temelden etkilemiştir. Jenerikler, bir yandan farklı türler için tek bir kod yazmamızı sağlarken, diğer yandan tür güvenliğini sağlar.
```java
public interface IDatabaseManager<T extends Student> {
    void add(T item);
    void remove(T item);
    void update(T item);
    T get(int id);
}
```
```java
import java.util.ArrayList;

public class StudentDatabaseManager implements IDatabaseManager<Student>{
    @Override
    public void add(Student item) {
        //Database codes
        System.out.println("Added to the database.");
    }
    @Override
    public void remove(Student item) {
        //Database codes
        System.out.println("Removed from the database.");
    }
    @Override
    public void update(Student item) {
        //Database codes
        System.out.println("Added to the database.");
    }
    @Override
    public Student get(int id) {
        //Database codes
        ArrayList<String> testCourses = new ArrayList<String>();
        testCourses.add("Calculus");
        return new Student("Example Student", id, testCourses);
    }
}
```
  ```java
import java.util.ArrayList;

public class Student {
    private String name;
    private int id;
    ArrayList<String> courses;

    public Student(String name, int id, ArrayList<String> courses){
        this.name = name;
        this.id = id;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
```
```java
public class Validator {
    public static <T> void validate(T item){
        System.out.println("Data is valid.");
    }
}
```
        
Her bir işlemin altında çalışan işlem parçacıklarına thread adı verilir. Thread’ler bir ana işlemin içerisinde çalışan ve processlere (işlem) göre daha az kaynak tüketerek asenkron olarak çalışan yapılardır. Multithreading, işlemcinin daha efektif bir biçimde kullanılabilmesi için bir programın farklı işlemlerinin ayrı ayrı işlem parçacıklarında yapılmasıdır. Normalde işlemler sırasıyla art arda gerçekleştirilirken bu yapı sayesinde işlemler birbirlerini beklemeden kendi işlemini yapar. Java’da kodumuzun aynı anda birden fazla işlem yapmasını istediğimizde zaman Thread’leri kullanmamız gerekmektedir.

Java’da thread’leri kullanmanın iki yolu vardır: 
  
•	Thread sınıfından kalıtım alan bir alt sınıf yaratıp, onun run() fonksiyonu override edilir, ardından start() metodu ile bu sınıf çağrılır.
  
•	Runnable interface’inden kalıtım alan bir alt sınıf yaratılır ve run() fonksiyonunu override edilir ardından start() metodu ile bu sınıf çağrılır.

Java’da bir iş parçacığını belli bir süre bekletmek istersek, Thread sınıfına ait sleep() fonksiyonunu kullanabiliriz. Ancak bu yöntem senkronizasyonu sağlarken thread yapısının sağladığı avantajı ortadan kaldırır. sleep() fonksiyonu milisaniye cinsinden bir değer alır. Yani 1000 değeri girildiğinde 1 saniyeye karşılık gelmektedir. sleep() fonksiyonu hata fırlatabilen bir fonksiyon olduğundan try-catch bloğu içinde kontrol edilmelidir

Thread sınıfını extend ederek kullanma yöntemi genellikle tercih edilen bir yöntem değildir. Çünkü yazılımımızdaki iş akışı içerisinde sınıfımızın katılım gelişimini engellemiş oluyoruz. Çünkü Java’da bir sınıf birden fazla sınıftan miras alamaz. Bu sebeple Runnable’ı implement ederek kullanmayı tercih etmek daha doğru olacaktır denebilir.

Öğrendiklerimden sonra örnekler yapmaya başladım. Aşağıdaki örnekte 5’e kadar senkronize olarak sayan 2 kronometre oluşturdum. sleep() fonksiyonunu kullanarak gerçek bir kronometre gibi saniye bazlı olarak saymasını sağladım.
```java
public class ChronometerThread implements Runnable{
    private Thread thread;
    private String threadName;

    ChronometerThread(String threadName){
        this.threadName = threadName;
        System.out.println("Creating a thread: " + threadName);
    }

    @Override
    public void run() {
        try{
            for(int i = 0; i <= 5; i++){
                System.out.println(threadName + ": " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException exception){
            System.out.println("Error!");
        }

        System.out.println("Thread " + threadName + " is over.");
    }

    public void start(){
        System.out.println("Creating a thread object");
        if(thread == null){
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
```
                                 

## 📔 Java 12. Gün
### MySQL kurulumu, temel SQL sorguları ve Java’da JDBC ile database (veri tabanı) bağlantısı
SQL, ilişkisel bir veri tabanındaki verilerin alınması ve yönetimi için tasarlanmış bir veri tabanı dilidir. SQL, Yapılandırılmış Sorgu Dili anlamına gelir. Komutlar genelde büyük harfle yazılsa da SQL dili case sensitive bir dil değildir yani büyük harf - küçük harf duyarlılığı yoktur. Tüm SQL komutları SELECT, WHERE, INSERT, UPDATE, DELETE, ALTER, DROP, CREATE gibi anahtar kelimelerin herhangi biriyle başlar ve noktalı virgül ile (;) biter.

MySQL’in kurulumla beraber gelen, ülke ve şehirleri içeren world verisi ile komutları öğrendikçe örnek uygulamalarını yaptım.

**SELECT** en çok kullanılan SQL komutudur ve veri tabanından belirtilen sütunlardaki verileri çekmemizi sağlar. SELECT komutunu çoğunlukla diğer SQL komutlarıyla birlikte kullanırız. Eğer tablodaki tüm sütunlardaki verileri çekmek istersek Java paketlerinde olduğu gibi * karakterini kullanırız.

```sql
select * from country;
```
```sql
select Name,Continent,Region from country;
```

**WHERE** komutu, yalnızca belirtilen bir koşulu yerine getiren kayıtları ayıklamak için kullanılır.
```sql
SELECT * from country WHERE Continent = 'Europe' AND Population > 50000000;
```

**INSERT INTO** komutu, tabloya yeni kayıtlar eklemek için kullanılır.
```sql
INSERT INTO city (Name, CountryCode, District, Population) values('Düzce','TUR','Düzce',1000);
```
  
**UPDATE** komutu, bir tablodaki var olan kayıtları değiştirmek, güncellemek amacıyla kullanılır. Ancak şart belirtilmediğinde güncellemeden tablodaki tüm kayıtlar etkilenecektir.
```sql
UPDATE city set Population = 500000 WHERE Name = 'Düzce';
```
  
**DELETE** komutu, veri tabanından kayıt ya da kayıtları silmek için kullanılır. Ancak şart belirtilmediğinde tablodaki tüm kayıtlar silinir.
```sql
delete from city where id = 4084;
```
         
JDBC, Java diliyle veri tabanlarına bağlanıp sorgu (query) çalıştırmak, veri tabanı ile etkileşimli uygulamalar geliştirmek için ortaya çıkmış bir kütüphanedir. JDK içinde varsayılan olarak hazır kullanılabilir şekilde gelmektedir. JDBC API her veri tabanı yönetim sistemi için yazılmış olan sürücü kütüphanelerini kullanarak veri tabanı işlemlerini yapabilmeyi sağlar. Java ve veri tabanı arasında köprü görevi görür.

JDBC, Java ile veri tabanı ile etkileşimde olan kodları yazdığımızda, sürücü kütüphane örneğin MySQL’den Oracle veri tabanı sistemine geçse bile hiçbir değişiklik gerektirmeden kullanımını sağlar. Böylece, Java ile veri tabanıyla işlemler yapabilmek için yazdığınız kodları değiştirmeden istediğimiz veri tabanı sistemiyle çalışabiliriz. Böylece Java kodlarının yeniden kullanılabilirliğini artmaktadır. JDBC API ile veri tabanı bağlantısı oluşturup, tablolar üzerinde sorgu çalıştırabiliyoruz. Sorgulama, veri güncelleme, silme veya yeni kayıt ekleme işlemlerini yapabiliyoruz.

JDBC API veritabanı işlemleri için gerekli olan abstractionı sağlar, daha sonra kendisine verilen driver ile sorguları ilgili veritabanına iletir, sorgunun çalıştırılması sonucunda üretilen çıktıyı da java uygulamasına geri iletir. Burada önemli olan hangi veritabanına bağlanılacaksa ona uygun driver kullanılmasıdır. JDBC ile veri tabanı bağlantısı kurabilmek için öncelikle Intellij IDEA üzerinden MySQL ile birlikte gelen mysql-connector-java kütüphanesini bu konu için oluşturduğum projeme ekledim.
		
DriverManager sınıfında bulunan static `getConnection()` metodu, kendisine verdiğimiz parametreleri kullanarak uygulamamız ve veri tabanı arasında bir bağlantı kurulmasını sağlar. Bu metot üç tane String parametre alır. İlki veri tabanının url’si, ikincisi kullanıcı adı ve üçüncüsü ise kullanıcı şifresidir. `getConnection()` metodu geri dönüş olarak Connection arayüzünü uygulayan bir sınıf döndürür.

Bağlantı kurulduktan sonra JDBC API ile artık sorgu çalıştırabiliriz. Veri tabanına SQL ifadesi göndermek için Statement arayüzünden türetilen objeler yaratmamız gerekir. `getConnection()` metodu vasıtasıyla oluşturduğumuz Connection türündeki nesne, veri tabanı sunucusuyla uygulamamız arasındaki bağlantı nesnesidir. Bu nesne üzerinden `createStatement()` fonksiyonu ile sorgu hazırlayabileceğimiz Statement tipinde bir nesne alırız. Statik veriler kullanırken SQL sorgularımızı bu nesne tipi üzerinden yaparız. Bu nesnenin `executeQuery()` metodu SELECT sorgularını çalıştırmak için kullanılır, parametre olarak String tipinde select sorgusunu alır ve elde edilen sonuçlar ResultSet objesi olarak geri döner. Tabloda veya veri tabanında yapısal değişikliğe yol açan INSERT, UPDATE, DELETE, CREATE, ALTER, DROP gibi komutlar ise bu nesnenin `executeUpdate()` metodu ile kullanılabilir. Bu metod INSERT, UPDATE ve DELETE komutları ile çalıştırıldığı zaman bu komuttan etkilenen kayıt sayını döndürür. CREATE, ALTER, DROP komutları ile çalıştırıldığı zaman ise sıfır değeri döndürür. 

Veri çekme işlemi sonrasında veri listelemek için kullanılan ResultSet sınıfı veriler üzerinde dolaşmak için `next()`, `first()`, `last()`, `previous()`, `absolute()` gibi metotlara sahiptir. `next()` fonksiyonu: bu fonksiyon çağrıldığında bir sonraki satıra ilerler. Böylece o satır üzerinde okuma yapabilmeyi sağlar. Okunacak kayıt kalmadığında “false” döner. `first()` fonksiyonu çağrıldığında sorgu sonucu kümesindeki ilk elemana erişim sağlar. `last()` fonksiyonu çağrıldığında sorgu sonucu kümesindeki son elemana erişim sağlar. `absolute()` fonksiyonu ile sorgu sonuç kümesindeki direkt olarak istenilen eleman işaret edilir. Veritabanı sütunlarında yer alan verileri almak için ise `getString()`, `getInt()` gibi metotlar kullanılır.

Ayrıca SQLException sınıfı, bir veri tabanı bağlantısı ve uygulamalarında meydana gelen hataları yönetir. JDBC kullanırken kullanılan metotlar SQLException exception’ları ürettiği için bu metotlar try-catch blokları içinde kullanılmalıdır. Ayrıca son olarak kullandığımız Connection, Statement, ResultSet vb. türlerindeki nesnelerin bağlantısını `close()` metodu ile kapatmalıyız.
  
```java
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException{
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultSet;
        DbHelper helper = new DbHelper();
        try{
            dbConnection = helper.getConnection();
            statement = dbConnection.createStatement();
            resultSet = statement.executeQuery("SELECT Code, Name, Continent, Region from country");
            int count = 0;
            while(resultSet.next()){
                System.out.println(resultSet.getString("Name") + " " + resultSet.getString("Code"));
                count++;
            }
            System.out.println("-- " + count + " countries printed --");
        }
        catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            dbConnection.close();
        }
    }
}
```
  
## 📔 Java 13. Gün
### Java’da JDBC ile veri tabanı işlemleri (SELECT, INSERT, UPDATE, DELETE) ve verileri nesnelere aktarma
Veri tabanı bağlantısı kurduğum main metodunun bazı kısımlarını DbHelper adlı başka bir class’a taşıdım. 
```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String userName = "root";
    private String password = "12345";
    private String dbUrl = "jdbc:mysql://localhost:3306/world";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, userName, password);
    }

    public void showErrorMessage(SQLException exception){
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error Code: " + exception.getErrorCode());
    }
}
```
Sonrasında SELECT sorgusu ile Java üzerinden world database’indeki tüm ülkelerin isimlerini, kodlarını, kıtalarını ve bölgelerinin verisini çektim. Ardından bu ülkelerin isim ve kodlarını ekrana bastırdım.
```java
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException{
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultSet;
        DbHelper helper = new DbHelper();
        try{
            dbConnection = helper.getConnection();
            statement = dbConnection.createStatement();
            resultSet = statement.executeQuery("SELECT Code, Name, Continent, Region from country");
            int count = 0;
            while(resultSet.next()){
                System.out.println(resultSet.getString("Name") + " " + resultSet.getString("Code"));
                count++;
            }
            System.out.println("-- " + count + " countries printed --");
        }
        catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            dbConnection.close();
        }
    }
}
```
Ardından verileri nesnelere aktarmak için bir Country sınıfı oluşturdum. Main metodunda değişiklikler yaparak veri tabanındaki ülkelerin isim, kod, kıta ve bölge verileriyle bir ArrayList’e Country nesnesi olarak ekledim.
```java
public class Country {
    private String code;
    private String name;
    private String continent;
    private String region;

    public Country(String code, String name, String continent, String region){
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
    }
}
```
```java
import java.sql.*;
import java.util.ArrayList;
  
public class Main {
    public static void main(String[] args) throws SQLException{
        DbHelper helper = new DbHelper();
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Country> countries = new ArrayList<Country>();
        try{
            dbConnection = helper.getConnection();
            statement = dbConnection.createStatement();
            resultSet = statement.executeQuery("SELECT Code, Name, Continent, Region from country");
            while(resultSet.next()){
                countries.add(new Country(resultSet.getString("Code"), resultSet.getString("Name"), resultSet.getString("Continent"), resultSet.getString("Region")));
            }
            System.out.println(countries.size() + " countries added to the ArrayList.");
        }
        catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            dbConnection.close();
        }
    }
}
```
Ardından, önceki kodumun try bloğunu değiştirerek Düzce şehrini world veri tabanının city tablosuna Java üzerinden insert ettim.
```java
try{
    dbConnection = helper.getConnection();
    statement = dbConnection.createStatement();
    statement.executeUpdate("INSERT INTO city(Name, CountryCode, District, Population) values('Düzce','TUR','Düzce','500000')");
    System.out.println("Added to database.");
}
```
         
PreparedStatement interface’i verilerin dinamik olarak gönderilebildiği parametrik SQL sorgularında kullanılır. Önce sorgu bu nesnenin `prepareStatement()` metodu ile işlenir. Sonrasında `setString()`, `setInt()` gibi, SQL sorgularında yer alan alanlara değer atamaya yarayan, metotlarla parametre sırası ve veri girilir. Bu metotlar sorgu string’ine yazılan ? simgelerinin yerlerine verilen sırayla değer atarlar. Son olarak `executeUpdate()` ve `executeQuery()` gibi metotlar ile sorgu çalıştırılır. Statement nesnesinde her sorgu ayrı ayrı derlenip kullanılırken, PreparedStatement’da sorgu bir kere derlenir ve gerekli alanlara parametre ile değer yollanır. Bu durum programımıza hız ve düşük kaynak kullanımı sağlayabilir. 

PreparedStatement hakkında bilgi edindikten sonra öğrendiklerimi pekiştirmek için örnekler yaptım. 

Aşağıdaki örnekte bir önceki kodumu PreparedStatement kullanarak oluşturdum.
```java
import java.sql.*;
import java.util.ArrayList;
  
public class Main {
    public static void main(String[] args) throws SQLException{
        DbHelper helper = new DbHelper();
        Connection dbConnection = null;
        PreparedStatement statement = null;
        try{
            dbConnection = helper.getConnection();
            statement = dbConnection.prepareStatement(
                    "INSERT INTO city(Name, CountryCode, District, Population) VALUES(?,?,?,?)");
            statement.setString(1,"Düzce");
            statement.setString(2,"TUR");
            statement.setString(3,"Düzce");
            statement.setInt(4,800000);
            statement.executeUpdate();
            System.out.println("Added to database.");
        }
        catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            dbConnection.close();
            statement.close();;
        }
    }
}
```
Ardından parametreli update işlemi yaparak Düzce’nin nüfus verisini 400000 olarak güncelledim. Ayrıca bu sefer MySQL’den edindiğim id bilgisini kullanarak güncelleme yaptım.
```java
import java.sql.*;
import java.util.ArrayList;
  
public class Main {
    public static void main(String[] args) throws SQLException{
        DbHelper helper = new DbHelper();
        Connection dbConnection = null;
        PreparedStatement statement = null;
        try{
            dbConnection = helper.getConnection();
            statement = dbConnection.prepareStatement("UPDATE city set Population = ? WHERE id = ?");
            statement.setInt(1,400000);
            statement.setInt(2,4087);
            statement.executeUpdate();
            System.out.println("Updated successfully.");
        }
        catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            dbConnection.close();
            statement.close();;
        }
    }
}
```
Ardından DELETE sorgusu ile city tablosundan yine id’sini kullanarak Düzce’yi sildim.
```java
try{
    dbConnection = helper.getConnection();
    statement = dbConnection.prepareStatement("DELETE from city WHERE id = ?");
    statement.setInt(1, 4087);
    statement.executeUpdate();
    System.out.println("Deleted successfully.");
}
```
  
## 📔 Java 14. Gün
### Java’da dosyalar ile çalışmak
Java.io paketinin File sınıfı, dosyalar ve dizinler üzerinde çeşitli işlemler gerçekleştirmek için kullanılır. Bir File nesnesi oluşturmak için, önce java.io.File paketini içe aktarmamız gerekir. Yeni bir File nesnesi oluştururken constructor metodunun içine dosya adını veya dosyanın konumunu gireriz. File sınıfı createNewFile(), delete(), getName(), canRead(), length() gibi metotlara sahiptir. Yeni bir dosya oluşturmak için createNewFile() metodunu kullanabiliriz. Eğer yeni bir dosya oluşturulursa metot true, dosya zaten belirtilen konumda mevcutsa false değerini döndürür. Belirtilen dosyayı veya dizini silmek için File sınıfının delete() metodunu kullanabiliriz. Ancak, sadece boş dizinleri silebiliriz. Java File sınıfı, yeni bir dizin oluşturmak için mkdir() metodunu sağlar. Metot geriye yeni dizin oluşturulursa true, dizin zaten mevcutsa false değerini döndürür. list() metodu ise belirtilen dizindeki dosya ve dizin adlarını bir string array içerisinde döndürür.

Dosyaları okumak için BufferedReader veya daha önce input alırken kullandığım Scanner gibi sınıfları kullanabiliyoruz. Scanner metoduyla dosya okumak için bir Scanner nesnesi oluştururken constructor metodunun içerisine “file” yazılır. Ardından nextLine() metodu ile bulunulan satır okunur. hasNext() metodu ise bulunulan satırdan sonra başka bir satır bulunuyorsa true değeri döndürür. Böylece loop kullanarak tüm dosyayı okumamız mümkün olur.

Dosyalara yazmak için BufferedWriter, FileWriter gibi sınıfları kullanabiliyoruz. Bu sınıflardan nesne oluştururken constructor metodunun içerisine ilk parametre olarak yazılacak dosya için oluşturulmuş olan File nesnesi yazılır. Ardından yazıma dosyanın sonundan, mevcut verileri etkilemeyecek şekilde başlanmak isteniyorsa ikinci parametreye true değeri yazılır. Bu değer append değerine karşılık gelir. Ayrıca BufferedReader sınıfından bir nesne oluştururken constructor metodunun içerisine FileReader sınıfından bir nesneyi de direkt geçirebiliyoruz

Ek olarak, kullanılan bu nesneleri verimlilik için programın sonunda close() metotları ile kapatmamız gerekir.

Aşağıdaki örnekte FileManager adlı bir sınıf oluşturdum ve içerisinde createFile(), getFileInfo(), readFile(), writeFile() metotları oluşturdum.
```java
public class FileManager {

    public File createFile(String filePath){
        File file = new File(filePath);
        try {
            if(file.createNewFile()){
                System.out.println("File created.");
            }
            else{
                System.out.println("File already exists.");
            }
        } catch (IOException exception){
            throw new RuntimeException(exception);
        }
        return file;
    }

    public void getFileInfo(File file){
        System.out.println("File name: " + file.getName());
        System.out.println("File path: " + file.getAbsolutePath());
        System.out.println("Is it readable: " + file.canRead());
        System.out.println("Is it writable: " + file.canWrite());
        System.out.println("File size (byte): " + file.length());
    }

    public void readFile(File file){
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);
        }
    }

    public void writeFile(File file, String stringToWrite){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(stringToWrite);
            writer.newLine();
            writer.close();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
```

## 📔 Java 15. Gün
### İleri Seviye Java - Spring Framework’e giriş
Spring, Java için geliştirilmiş açık kaynak kodlu bir framework’tür. Java uygulamalarını geliştirmeyi kolaylaştırır. Spring birçok modülü ve üçüncü parti kütüphaneleri kullanıma sunarak onlarla sıkıntısız bir şekilde entegrasyon işlemi sağlar. Spring, Core Container, AOP, Data Access, Web gibi modüllerden oluşur.

1) Core Container
Spring Core Container dört modülden oluşur: Core, Beans, Context ve Expression Language. Spring Core, Spring frameworkünün uygulamalara entegre edilecek temel mekanizmaları içeren parçasıdır. Core Container içerisindeki Core ve Beans modülleri Spring Framework’unun en temel özelliği olan Inversion of Control (IoC) ve Dependency Injection (DI) ‘ı sağlamaktadır. 

IoC, kontrolün uygulamadan alınarak framework’e(Spring) aktarılmasıdır. IoC ile Java nesnelerinin oluşturulması, yaşam süreleri, nesneler arası bağımlılıklar ve tüm bunların yönetimi yazılım geliştiriciden alınıp Spring’e verilmiş olur.

DI, bağımlılıkları ortadan kaldırmak şeklinde ifade edilir. Yazılım geliştiricilerin uygulamalarında ihtiyaç duyduğu nesneleri(beans), diğer nesneler ile ilişkilendirirken, ilişki kurma işini yazılım geliştiricinin üzerinden almasıdır.

Varsayılan olarak Spring, uygulamanızda tanımladığınız nesnelerin hiçbirini bilmez. Spring'in nesnelerinizi görmesini sağlamak için onları context içine eklememiz gerekir. Spring Context'in içine eklenen objeler, context tarafından yönetilir, configure edilir ve gerektiğinde çağrılır. Bu şekilde, framework’ün sunduğu özellikleri kullanmamıza izin verir.

Spring, farklı gereksinimlere uygun farklı ApplicationContext implementasyonları sunar. Tüm bu implementasyonlar, ApplicationContext interfece'inden türemektedir. Bazı yaygın ApplicationContext türleri:

•	AnnotationConfigApplicationContext
•	AnnotationConfigWebApplicationContext
•	XmlWebApplicationContext
•	FileSystemXMLApplicationContext
•	ClassPathXmlApplicationContext

2) AOP (Aspect Oriented Programming)
Spring AOP modülü, kodu temiz bir şekilde ayırabilmek için Java dilinde implemente edilmiş Proxy tabanlı bir çatıdır. AOP ile transaction yöntemi sayesinde log ve güvenlik gibi modüller merkezi bir yerde toplanır ve lazım olduğunda projeden bağımsız olarak çağrılabilir.

3-) Data Access
Bu katmanda JDBC, ORM, OXM, JMS ve Transaction modülleri bulunur. Bu modüller database ile etkileşim kurmayı sağlar.

4) Web
Bu katmanda Web, Web-Servlet ve Web-Portlet modülleri bulunur. Bu modüller web uygulaması oluşturmayı sağlar.

5) Test
Bu katman JUnit ve TestNG modülleri ile test işlemini sağlar.

Spring framework’te Core Container modülü haricindeki modülleri kullanmak isteğe bağlıdır. Hiç kullanılmayabilir ya da arzu edilen ve benzer fonksiyonu yerine getiren diğer teknolojiler kullanılabilir.

Spring framework ve modülleri hakkında genel bilgiler edindikten sonra Spring’i yönetmeye yarayan ApplicationContext’ler hakkında daha detaylı bilgiler edinmeye başladım.

AnnotationConfigApplicationContext class’ı Spring 3.0 ile birlikte ekosisteme dahil oldu. Güncel olarak en yaygın kullanılan Application Context oluşturma metodu budur.
Input olarak @Configuration veya @Component ile annotate edilmiş sınıfları alır.

Bean, Spring context içine eklediğimiz object instance'larının her birine verilen isimdir. Kısaca, context içinde yer alan her bir nesne bean olarak adlandırılır. Spring context'e bean eklemenin birden fazla yolu vardır. Bu yöntemleri şu şekilde sıralayabiliriz:

•	XML konfigürasyonu kullanarak
•	@Bean anotasyonunu kullanarak
•	Stereotype (@Component, @Repository, @Service and @Controller) anotasyonlarını kullanarak

@Bean anotasyonunu kullanarak Spring context'e bir bean eklemek için, projeye Spring context'i yapılandırmak için kullanacağımız ve @Configuration anotasyonu ile işaretlenmiş bir yapılandırma sınıfı tanımlanır. Ardından Context'e eklemek istediğimiz nesneyi döndüren metot yapılandırma sınıfına eklenir ve @Bean anotasyonuyla bu metot işaretlenir.

Stereotype (@Component, @Repository, @Service and @Controller) anotasyonlarını kullanarak da bean'lerimizi context'e ekleyebiliriz. Önce @Component anotasyonunu kullanarak, Spring'in kendi context'ine bir instance eklemesini istediğimiz sınıflar işaretlenir. Ardından oluşturduğumuz konfigürasyon sınıfı üzerinde @ComponentScan anotasyonu kullanılarak, Spring'e işaretlediğimiz sınıfları nerede bulacağı konusunda bilgi verilir.

Ayrıca bir properties dosyasındaki değerleri uygulamamıza aktarmak istersek @Value anotasyonunu kullanabiliyoruz. Bunun için önce konfigürasyon sınıfında @PropertySource anotasyonu kullanılarak dosyanın konumu belirtilir. Sonrasında, örneğin dosyadaki user.name değerini bir değişkene aktarmak istiyorsak @Value(“${user.name}”) anotasyonunu kullanırız.

Ardından öğrendiklerimi uyguladığım örnekler yaptım.

## 📔 Java 16. Gün
### İleri Seviye Java - Hibernate
Hibernate, veri tabanındaki tablolarla Java’daki class’larımızı eşleştirip, class’lar üzerinden veri tabanındaki nesneleri map ederek (birbirleriyle ilişkilendirerek) verilere hızlı bir şekilde insert, update, delete ve select operasyonları uygulayabilmemizi sağlar. Hibernate sayesinde JDBC’ye kıyasla daha az kod ile daha hızlı şekilde veri tabanı bağlantısı ve operasyonları yapılabilmektedir. Hibernate’nin hangi veritabanına nasıl işleneceğini XML dosyasında belirtilir. Hibernate genel anlamda Java veri tiplerinden SQL veri tiplerine dönüşümü gerçekleştirir ve ayrıca veri sorgulama ve veri çekme işlemlerini de kullanıcı için sağlar.

Java sınıflarını veri tabanı nesnesi olarak kullanmak için @Entity anotasyonunu kullanırız. @Table anotasyonu ile de sınıfın hangi tablonun nesnesi olarak kullanılacağını belirtiriz. Ardından sınıfın niteliklerini, tablonun sütunları ile eşleştirmek için @Column anotasyonunu kullanırız. 

Hibernate ile veri tabanı işlemleri yapılırken SessionFactory ve Session sınıfları kullanılır. SessionFactory sınıfından oluşturacağımız nesne bizim konfigürasyon dosyamızı okur ve Session objeleri oluşturmaya yarar. Ancak SessionFactory ağır bir sınıf olduğu için uygulama çalışırken yalnızca bir tane instance oluşturulur. Daha sonra tüm Session objeleri bu instancedan oluşur. Session sınıfı ise JDBC bağlantısından sorumludur, objeleri okumak ve yazmak için temel sınıftır. SessionFactory sınıfı tarafından oluşturulur. Kısa süreli yaşam döngüsü vardır. Gereken işlem yapıldıktan sonra session’ı kapatırız. 

SessionFactory nesnesi oluşturulurken bir Configuration sınıfı new’lenir ve ardından configure() metodu ile konfigürasyon dosyası, addAnnotedClass() metodu ile veri tabanı objesi olarak kullanılacak class belirtilir. Sonrasında ise buildSessionFactory() metodu ile SessionFactory nesnesi oluşturulur.

SessionFactory nesnesinin getCurrentSession() metodu ile Session nesnesi oluşturulur. Ardından bu nesne ile veri tabanı operasyonları gerçekleştirilir.

Edindiğim bilgilerin ardından Hibernate kullanarak veri tabanı işlemleri yapmaya başladım. Veri tabanı olarak daha önce de kullandığım world veri tabanının city tablosunu kullandım. Önce Hibernate kütüphanesini ve MySQL driver’ını projeye ekledim. Ardından City sınıfı oluşturdum ve bu sınıfı gerekli anotasyonları kullanarak veri tabanı nesnesi olarak kullandım. Sonrasında, Hibernate konfigürasyonu için bir XML dosyası oluşturup konfigüreasyonları yaptım. Ardından main metodu içerisinde SessionFactory ve Session nesneleri oluşturarak select, insert, update, delete işlemleri yaptım ve sorunsuz çalıştıklarını MySQL üzerinden doğruladım.

## 📔 Java 17. Gün
### İleri Seviye Java - Maven
Maven, proje geliştirirken proje içerisinde bir standart oluşturmamızı, geliştirme sürecini basitleştirmemizi, dokümantasyonumuzu etkili bir şekilde oluşturmamızı, projemizdeki kütüphane bağımlılığını (dependency) kolayca yönetmemizi sağlayan bir proje kontrol aracıdır.

Örneğin normalde el ile ekleyip yönetmemiz gereken Hibernate vb. paketleri Maven aracılığıyla projemize ekleyip yönetebiliyoruz. Maven, kütüphane dosyalarını kendi repository sunucularında barındırır. Projede kullanmak istediğimiz kütüphane dosyalarını ilk olarak bizim local repository klasörümüzde arar, eğer bulamazsa kendi sunucularında arama yapar, kütüphaneyi bizim local klasörümüze indirir ve projeniz içerisinde kullanabilmenizi sağlar. Ayrıca bir kütüphane başka kütüphanelere bağımlıysa bu bağımlı olduğu kütüphaneleri de indirir ve projemize ekler.

Maven Repository içerisinde bulunan kütüphanelere veya jar’lara ulaşmak için çeşitli adresler vardır. En çok kullanılanlardan biri https://mvnrepository.com/ sitesidir. Bu site aracılığıyla aradığımız paketi kolayca bulup Maven ile projemize ekleyebiliriz.

Maven’ın bize sağladığı bir diğer özellik de versiyon kontrolüdür. Maven ile projemizde yer alan kütüphanelerin yeni bir sürümü mevcut olduğunda kolayca o sürüme geçiş yapabiliriz.

Ayrıca, Maven bize hazır proje şablonları (archetype) sunar. Bu şablonlar bize standartlar sunar ve biz bu standartlar üzerinde projelerimizi geliştiririz.

Maven’ı POM.xml dosyası ile kontrol ederiz. Project Object Model(POM) dosyası aslında, hem proje hakkında bilgileri hemde projenin konfigürasyonu hakkında, bağımlılıkları, kaynağı, kullanılan pluginler, projeyi derlemek için gerekli komutlar vb. bilgileri içeren bir XML dosyasıdır. POM dosyasının properties bölümünden projenin özelliklerini (Java sürümü vb.) dependency bölümünden ise projenin kütüphane bağımlılıklarını (Hibernate vb.) kontrol ederiz.

Maven hakkında bilgi edindikten sonra, Maven’ın standart bir Java projesi oluşturmaya yarayan quickstart archetype’ını kullanarak kendi projemi oluşturdum. Ardından https://mvnrepository.com/ sitesini kullanarak Hibernate’i Maven ile projeye ekledim. POM dosyasının dependency bölümüne siteden kopyaladığım xml satırlarını yapıştırdım ve Maven belirtilen sürümü projeye ekledi. Kütüphaneleri dün yaptığım gibi elle eklemek yerine Maven kullanarak yüklemenin ve kontrol etmenin çok daha kullanışlı olduğunu deneyimledim. Ardından aynı şekilde MySQL connector driver’ını da elle eklemek yerine Maven ile ekledim. Ardından dün yazdığım Hibernate projesinin Main sınıfını App sınıfına aktardım ve City sınıfını da bu projeye ekledim. Dün oluşturduğum Hibernate konfigürasyon dosyasını da bu projeye ekledim. Projemi sorunsuz çalıştırabildim.

## 📔 Java 18. Gün
### İleri Seviye Java - Spring Boot
Stajdaki 19. günüme Spring Boot hakkında bilgi edinerek başladım. Spring Boot, Spring framework ile geliştirilen, güçlü varsayılan/otomatik ayarları sayesinde kolay ve hızlı Spring tabanlı uygulama yapımı için geliştirilmiş bir Spring modüldür. Spring Boot, bize bir Maven projesini istediğimiz eklentilerle ve konfigürasyonlarla beraber sunuyor, bize sadece gerekli kodları yazmak kalıyor. Bize seçeceğimiz dependency’lere (bağımlılık) göre hazır bir proje taslağı sunuyor. Spring Boot’un en önemli özelliklerinden birisi içerisinde gömülü şekilde Tomcat gibi yayınlama ortamlarını barındırmasıdır. Yani bizim ayrıca Tomcat’a veya diğer sunucu işlemlerine ihtiyacımız kalmadan, bunları Spring Boot içerisinde çözebiliyoruz. Spring Boot’un sağladığı en büyük avantajlardan biri ise bizi herhangi bir XML konfigürasyonuyla uğraşmak zorunda bırakmamasıdır. Kısacası Spring Boot bizlere Spring Framework tarafından sunulan ve işimizi oldukça kolaylaştıran bir yapıdır.

Spring Boot projesi oluştururken genelde Spring Initializr (https://start.spring.io/) kullanılır. Spring Initializr, proje oluştururken inşa aracını (Maven vb.), JVM dilini (Java, Kotlin vb.), Spring Boot sürümünü, Java sürümünü, Projede kullanılacak olan kütüphaneleri / bağımlılıkları dinamik olarak belirlemeyi sağlar. IntelliJ IDEA’da Spring Initializr bulunduğu için direkt olarak ide’nin içinden proje oluşturulabiliyor. (Editörler Spring Boot projesini üretirken Spring Initializr sayfasını (https://start.spring.io/) kullanır.)

Spring Boot projesi oluştururken, Dependencies bölümü altında projenin şablonunu belirtiyoruz. Örneğin bir web projesi oluşturmak istediğimizde Spring Web paketini seçiyoruz. Burada arama yaparak ihtiyacımıza göre istediğimiz paketleri kullanabiliyoruz.

Spring Boot hakkında bilgi edindikten sonra, Spring Boot ile bir Web uygulaması oluşturmak için REST Api hakkında bilgi edinmeye başladım. REST, client - server (istemci – sunucu) arasındaki haberleşmeyi sağlayan, HTTP protokolü üzerinden çalışan bir mimaridir. İstemci ve sunucu arasında XML/JSON verilerini taşıyarak uygulamanın haberleşmesini sağlar. REST mimarisini kullanan servislere ise RESTful servis (RESTful API) denir.
 REST ile yazılmış bir servisle çalışmak için ihtiyacımız olan tek şey URL’dir. Bir URL’e istek attığımızda, URL bize JSON veya XML formatında bir cevap döndürür, dönen cevap parse edilir ve servis entegrasyonu tamamlanır. REST servisler; client ve server arasındaki ayrım sayesinde, REST protokolü, bir projenin farklı alanlarındaki geliştirmelerin bağımsız olarak gerçekleşmesini kolaylaştırır.

Spring Boot ile Rest Api yazarken @RestController anotasyonunu kullanmamız gerekir. Yazdığımız servisler için çeşitli HTTP istek (request) tipleri mevcuttur (GET, POST, PUT vb.). 

•	@GetMapping anotasyonu, GET isteği için kullanılır. İçine parametre olarak string tipinde url girilir.	
•	@PostMapping anotasyonu, POST isteği için kullanılır. İçine parametre olarak string tipinde url girilir.

Bu anotasyonlara parametre olarak “/” girilir ise, uygulama çalıştığında uygulama sunucumuzun ana sayfasında bu anotasyonla tanımladığımız metot çalışır.

Eğer @GetMapping anotasyonunda url kısmına parametre yollamak istiyorsak { ve } sembollerinin arasına parametrenin adını yazarız. Ardından ilgili metoda @PathVariable anotasyonu ile bir parametre tanımlayarak bu iki değişkeni eşleştiririz. Ancak bu iki parametrenin adının aynı olması gerekir.

Ayrıca, @RequestMapping anotasyonu sınıf üzerinde kullanıldığı zaman, o sınıfın belirtilen url ile ilgili tüm işleri yapması sağlanır. Api’lar genellikle standart olarak domain isminden sonra /api şeklinde url’lere sahip olurlar. REST Api olarak kullanacağımız sınıfa @RequestMapping(“/api”) anotasyonunu eklediğimizde, bu sınıf içinde tanımlanan request metotlarını kullanabilmek için url’lerinin başına /api yazmamız gerekir. Bu şekilde uygulamamız daha düzenli olur.

Ek olarak, Spring Boot ile uygulama geliştirirken her değişiklikte, değişikliğin çıktılara yansıması için kodun tekrar derlenmesi; yani bizim uygulamamızı tekrar çalıştırmamız gerekir. Zaman kazanmak adına burada Spring Boot Dev Tools devreye giriyor. Dev Tools dependency’sini (bağımlılık) projeye eklediğimizde, her kaydetme işleminde otomatik olarak kodu tekrar derliyor ve çıktılarımızı güncelliyor. Böylece uygulamayı tekrar başlatmamıza gerek kalmıyor.

Öğrendiğim bilgiler sonrası ilk Spring Boot Web projemi oluşturdum ve örneklerle öğrendiklerimi uyguladım.

## 📔 Java 19. Gün
### İleri Seviye Java - Spring Boot
Temel katmanlı mimariler Data Access(DAL), Business, Service ve User Interface(UI) katmanlarından oluşur. 

En alt katmanımız Data Access(DAL, DAO) katmanıdır. Data Access katmanı bizim veri erişim katmanımızdır. Örneğin, temel JDBC, Hibernate vb. kodlarımızı bu katmanda yazarız. 

Business katmanı, bizim iş katmanımızdır. İş kuralları buraya yazılır. Belirlenen algoritmalara göre verilerin şekillenmesini sağlayan logic dediğimiz işlemlerin yapıldığı katmandır. Örnek olarak veri tabanından belirli bir kurala göre verileri çekmek istiyorsak, o kuralı bu iş katmanı içerisinde uygulayarak istediğimiz veriyi elde etmiş oluruz.

Service katmanı, RESTful servisler gibi servislerin kodlarının yazıldığı katmandır. Bazı geliştiriciler bu katmanı Business katmanıyla iç içe yazıyor olsa da ayrı olması daha sağlıklı olacaktır.

User Interface(UI) katmanı, bizim kullanıcı arayüzü katmanımızdır. Uygulamamızın front-end kısmı arayüz katmanında bulunur. Bu katmanda kullanıcılara bir ara yüz sunulur ve kullanıcılar bu ara yüz ile beraber oluşturmuş olduğumuz proje ile etkileşime geçer.

Bu katmanlar birbirleriyle interface’ler aracılığıyla, yani Polymorphism ile, bağlantı kurarlar.

Uygulamalarımızı bu şekilde katmanlara ayırmamız uygulama içindeki bağımlılıkları azaltır ve bize avantaj sağlar. (SOLID yazılımın Single Responsibility prensibi). Örneğin Business katmanı ile Data Access katmanını beraber yazdığımız bir durumda, Data Access için Hibernate kullandığımızı varsayalım. Sonrasında Hibernate dışında farklı bir teknolojiye geçmek istediğimizde bu iki katman iç içe olduğu için tüm kodları yeniden yazmamız gerekebilir. Ancak kodlarımızı katmanlara ayırırsak, bu durumda sadece gerekli katmanın (Data Access) kodlarını değiştirmemiz gerekir ve bu da bize avantaj sağlar. 

Katmanlı mimariler hakkında bilgi edindikten sonra Spring Boot Projemizin yönetimsel ayarlamalarını yapmak için gerekli olan application.properties dosyası hakkında bilgi edinmeye başladım. application.properties dosyası, projemizin tüm bağımlılıklarının, değiştirilebilir property’lerine değer atamamıza ve sonrasında da gerektiğinde kolaylıkla değiştirebilmemize olanak sağlar. Örneğin kullanacağımız veri tabanının bağlantı metnini, kullanıcı adı, şifre gibi değerlerini bu dosyada saklayıp kullanabiliriz. application.properties dosyası, varsayılan olarak projemizde src/main/resources yolunda bulunmaktadır.

Veri tabanı bağlantı metni için spring.datasource.url, kullanıcı adı için spring.datasource.username, şifresi için spring.datasource.password parametreleri kullanılır.

application.properties dosyası hakkında bilgi sahibi olduktan sonra JPA hakkında bilgi edinmeye başladım.

JPA (Java Persistence API), Java programlama dilinde Java sınıfları ile ilişkisel veri tabanı tablolarını ilişkilendirmek için ortaya çıkmış bir standarttır. Burada amaç sınıf değişkenleri ile tablonun kolonlarını eşleştirmek ve SQL yazmadan nesneler üzerinden doğrudan veri tabanı işlemlerini yapmaktır. Bu noktada JPA sadece bir standart ortaya koyar ve veri üzerinde kendisi bir işlem yapmaz. Bunun için bu standartları implemente eden ayrı bir araca ihtiyaç vardır, JPA implementasyonu yapan başlıca araçlar olarak Hibernate, TopLink, EclipseLink ve OpenJPA sayılabilir.

JPA spesifikasyonunda obje-tablo ilişkisini yönetmek için iki tane araç bulunur; anotasyonlar ve XML konfigürasyon dosyaları. Bu iki araçtan birini kullanarak JPA için gerekli olan meta bilgisini oluşturabiliriz.

Hibernate kullanırken, SessionFactory ve Session nesnelerinin yönetimini JPA sayesinde daha kolay bir şekilde yapabiliyoruz. Bunun için EntityManager nesnesi oluşturup unwrap() metodu ile Session nesnesi oluşturuyoruz. Burada, unwrap() metoduna Session.class ifadesini yazıp, Hibernate için olan sınıfı seçiyoruz. Hibernate kullanırken oluşturduğumuz Session nesnesi ile session açıp kapatma işlemini de JPA bizim için hallediyor. Böylece JPA sayesinde daha az kod yazarak Hibernate’i kullanabiliyoruz. Bunun için bu işlemin gerçekleşeceği metoda @Transactional anotasyonu eklememiz gerekiyor. 

Ek olarak, Spring’in JPA için gerekli bağlantıları kurabilmesi için (Hibernate vb.) bu metotlarda @Autowired anotasyonunu kullanmamız gerekiyor.

Böylece staj projemi yapabilmek için hazır hale geldim. Katmanlı mimariye sahip örnek bir proje yazdım ve günü tamamladım.

## 📔 Java 20. Gün
### Staj projesi – MySQL’de proje için veri tabanı oluşturma, Java’da veri tabanı nesnesi için sınıf oluşturma
Stajımın son haftasında staj projeme başladım. Projem bir blog sitesinin back-end tarafında veri tabanı bağlantısını kurma, veri ekleme/silme/güncelleme/görüntüleme işlemleri üzerine. Kullanıcıların kullanıcı adı, şifre ve blog yazılarını da ayrı değerler olarak veri tabanında saklamam istendi. Ayrıca, katmanlı mimariye sahip olması istendi.

Öncelikle MySQL üzerinden projem için veri tabanı oluşturarak başladım. ID, Username, Password ve BlogPost sütünlarına sahip bir veri tabanı tablosu oluşturdum. Username değerini unique(eşsiz) olarak tanımladım. Username ve Password değerlerini de not null (boş bırakılamaz) olarak tanımladım.

Ardından projem için Web, JPA, Dev Tools ve MySQL Connector dependency’lerine (bağımlılık) sahip bir Spring Boot projesi oluşturdum.

Sonrasında veri tabanı nesnesi olarak kullanılacak User sınıfını yazdım.
```java
package com.kafein.project.Entities;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;

    @Column(name="Username")
    private String username;

    @Column(name="Password")
    private String password;

    @Column(name="BlogPost")
    private String blogPost;

    public User(int userID, String username, String password, String blogPost) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.blogPost = blogPost;
    }

    public User(){

    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBlogPost() {
        return blogPost;
    }

    public void setBlogPost(String blogPost) {
        this.blogPost = blogPost;
    }
}
```

## 📔 Java 21. Gün
### Staj projesi – Projenin Data Access katmanının yazılması, application.properties dosyasının konfigürasyonu
Staj projem üzerine çalışmaya devam ettim. Data Access katmanı için IUserDal interface’ini yazdım. Ardından bu interface’i implement eden HibernateUserDal sınıfını yazdım.
```java
package com.kafein.project.DataAccess;

import com.kafein.project.Entities.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateUserDal implements IUserDal{

    private EntityManager entityManager;

    @Autowired
    public HibernateUserDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<User> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<User> users = session.createQuery("from User", User.class).getResultList();
        return users;
    }

    @Override
    @Transactional
    public void add(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(user);
    }

    @Override
    @Transactional
    public void update(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(user);
    }

    @Override
    @Transactional
    public void delete(User user) {
        Session session = entityManager.unwrap(Session.class);
        User userToDelete = session.get(User.class, user.getUserID());
        session.delete(userToDelete);
    }

    @Override
    @Transactional
    public User getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        User user = session.get(User.class, id);
        return user;
    }
}
```
Böylece Data Access katmanını tamamlamış oldum. JPA ile Hibernate’i daha pratik bir şekilde yazabildim.

Ardından veri tabanı bağlantısı için application.properties dosyasının konfigürasyonunu yaptım.

## 📔 Java 22. Gün
### Staj Projesi – Projenin Service katmanı ve REST Api’ının yazılması
Projemin Service katmanı için IUserService interface’ini yazdım ve ardından bu interface’i implement eden UserManager sınıfını yazdım. Katmanlar arasındaki bağlantıyı interface’ler aracılığıyla sağladım; UserManager sınıfı için IUserDal tipinde userDal niteliği oluşturdum.
```java
package com.kafein.project.Service;

import com.kafein.project.Entities.User;
import com.kafein.project.DataAccess.IUserDal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class UserManager implements IUserService{

    private IUserDal userDal;

    @Autowired
    public UserManager(IUserDal userDal) {
        this.userDal = userDal;
    }

    @Override
    @Transactional
    public List<User> getAll() {
        return this.userDal.getAll();
    }

    @Override
    @Transactional
    public void add(User user) {
        this.userDal.add(user);
    }

    @Override
    @Transactional
    public void update(User user) {
        this.userDal.update(user);
    }

    @Override
    @Transactional
    public void delete(User user) {
        this.userDal.delete(user);
    }

    @Override
    @Transactional
    public User getById(int id) {
        return this.userDal.getById(id);
    }
}
```
Ardından projem için bir REST Api yazdım.
```java
package com.kafein.project.RestApi;

import com.kafein.project.Entities.User;
import com.kafein.project.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> get(){
        return this.userService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody User user){
        this.userService.add(user);
    }

    @PostMapping("/update")
    public void update(@RequestBody User user){
        this.userService.update(user);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody User user){
        this.userService.delete(user);
    }

    @GetMapping("/users/{id}")
    public User getById(@PathVariable int id){
        return this.userService.getById(id);
    }

    @RequestMapping("/users/{id}/blog")
    @ResponseBody
    public String readPost(@PathVariable int id) {
        User user = this.userService.getById(id);
        return String.format(user.getUsername() + "'s Blog: " + user.getBlogPost());
    }
}
```
