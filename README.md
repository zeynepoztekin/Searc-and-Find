# Search-and-Find

1. İlk kısmında verilen bir dosyada arama yapan bir program yazılmıştır. Program kullanıcıdan dosya konumu ve aranacak kelimeyi alır. Kelimede boşluk olmadığını düşünülebilir. Dosyada bulunan her eşleşme için ayrı bir satıra satır numarasıyla birlikte aranan kelimeden önceki kelime, aranan kelime ve aranan kelimeden sonraki kelime ekrana basılmaktadır. Kelime satırdaki ilk kelimeyse aranan kelimeden önceki, son kelimeyse aranan kelimeden sonraki kelime ekrana basılmaz. Dosyada hiç eşleşme olmamışsa ekrana bir şey basılmaz. Aranan kelimeden arka arkaya iki tane varsa ayrı ayrı bulunmuş sayılır. Örneğin “iki iki” içeriğine sahip bir dosyada “iki” kelimesi aranıyorsa her “iki” için de sonuç ekrana basılır. “ara” kelimesi, “arara” kelimesi içeren bir dosyada arandığında iki kere değil, bir kere bulunur.

Ara metodu dosya adı (String) ve aranacak kelimeyi (String) alır.

Örnek dosya içeriği

Aranan kelime: bir 

Evvel zaman icinde

kalbur saman icinde

develer tellal iken

pireler berber iken

Ben bir bagda uzum bekler 

derede odun yukler iken 

bir varmis bir yokmus 

Masalin yalani mi olurmus

Örnek çıktı:

5: Ben bir bagda 

7: bir varmis

7: varmis bir yokmus


2.	6 harften oluşan bir alfabe düşünün. Bu harﬂer a, b, c, d, e, f olsun. Bu harﬂeri klasik biçimde binary olarak depolamak için a: 000, b: 001, c: 010, d: 011, e: 100, f: 101 eşleştirmesi yapabilirdik. Tüm harﬂere eşit ağırlık vermek yerine kullanılan metinde ya da dilde daha çok geçen harﬂere daha kısa sayısal karşılık atamak, depolama alanından tasarruf etmemizi sağlar. Örneğin ‘a’ harﬁnin diğer harﬂere kıyasla çok daha fazla geçtiği
bir metinde a: 1, b: 000, c: 001, d: 010, e: 0110, f: 0111 ataması yapabilirdik. Verili metin dosyasını a: 1, b: 000, c: 001, d: 010, e: 0110, f: 0111 atamasını takip ederek kodlanmış halini yeni bir dosyaya yazılmış ve kodlanmış halde verilen metni okunabilir şekilde ekrana basacak bir program yazılmıştır.

Kodlama ve çözme yapan metotlar okunacak dosya konumunu String olarak alır. Kodlama yapan metot dosya adının sonunda “_coded” eklediği dosyaya sonucu yazar. Örneğin kodlanacak dosya text.txt ise, sonuç text_coded.txt dosyasına yazılır. Program main metodunda test verilen dosyayı alır, ekrana basar, yazdığınız metotla kodlar, kodlama sonucunun yazıldığı dosyayı ekrana basar, kodlama sonucunun yazıldığı dosyayı yazdığınız metotla çözerek ekrana basar. Okunan dosya birden fazla satır içerebilir.


Örnek orijinal dosyanın içeriği 

abcdaeaf

Örnek kodlanmış dosya 

10000010101011010111

Örnek kodlanmış dosyanın çözülmüş hali 

abcdaeaf

Örnek dosya verildiğinde programınızın vereceği çıktı 

abcdaeaf

10000010101011010111

abcdaeaf
