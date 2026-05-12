# ST_204_TestNG

Bu repository CAPS Academy-də keçirilən TestNG dərslərinin praktiki materiallarını ehtiva edir.

Repository-də yalnız source kodlar (src/) mövcuddur. IntelliJ layihə faylları və build faylları saxlanılmır.

---

## Başlanğıc Addımları

Repository-ni IntelliJ IDEA üzərindən klonlayın:

1. IntelliJ IDEA-nı açın
2. **New Project** → **From Version Control** seçin
3. Repository URL-ni daxil edin:

   ```
   https://github.com/caps-sdet/ST_203_TestNG.git
   ```
4. **Clone** düyməsini basın

---

## Lazım Olan Kitabxanalar

Aşağıdakı dependency-lər TestNG testlərinin yazılması və icrası üçün istifadə olunur:

1. org.testng:testng:7.12.0
   - Test framework. Test case-lərin yazılması, icrası, prioritet, group və assertion mexanizmlərini təmin edir.

2. org.seleniumhq.selenium:selenium-java:4.43.0
   - UI test avtomatlaşdırması üçün istifadə olunur. Brauzerlərlə qarşılıqlı əlaqə yaratmağa imkan verir.

3. commons-io:commons-io:2.22.0
   - Fayl oxuma/yazma və Input/Output əməliyyatlarını sadələşdirir (məsələn, screenshot saxlamaq və fayl kopyalamaq üçün).

4. org.slf4j:slf4j-nop:2.0.17
   - Loglama tələb edən kitabxanaların problemsiz işləməsi üçün istifadə olunur. 
   - Real log yazmadan warning və error mesajlarının qarşısını alır.

---

## Dərs Materiallarının Strukturu

Dərsləri görmək üçün src/ qovluğuna daxil olun:

```
src/
 ├─ Gun_01/
 ├─ Gun_02/
 └─ ...
```

Hər qovluq müvafiq günün dərs materiallarını ehtiva edir. Fayl adları dərsdə keçilən mövzuları göstərir:

```
_00_Girish.java
_01_Siralama.java
```

---

## IntelliJ IDEA ilə İşləmək

* src/Gun_XX qovluğunu **Open Project** ilə açın
* Repository IDE-spesifik fayllar saxlamır
* Tələbələr öz lokal konfiqurasiyalarından istifadə edə bilərlər

---

## Yenilikləri Almaq

Yeni dərslər əlavə edildikdə aşağıdakı üsullardan birini istifadə edə bilərsiniz:

* IntelliJ IDEA üzərindən: **Update Project** və ya **Git → Pull**
* Terminal vasitəsilə:

  ```
  git pull
  ```

Qeyd: Repository-ni fork etmisinizsə, dəyişiklikləri upstream repository-dən pull və ya fetch etməlisiniz.

---

## Qaydalar və Müəllif Hüquqları

Bu repository yalnız CAPS Academy tələbələri üçün nəzərdə tutulub.

* Tələbələr materialları yalnız pull və ya fetch yolu ilə əldə edə bilərlər
* Push icazəsi yalnız müəllimlərə məxsusdur
* Materialların üçüncü şəxslərlə paylaşılması, yayılması, satılması və ya digər platformalarda yerləşdirilməsi qadağandır
* Bütün hüquqlar CAPS Academy-yə məxsusdur və müəllif hüquqları qorunur

Repository-dən istifadə edən şəxslər bu qaydalara əməl etməyi qəbul etmiş sayılırlar.
