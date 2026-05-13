package Gun_02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Assertions {

    @Test
    public void EqualsNumune(){
        String soz1 = "Salam";
        String soz2 = "Salam";

        // Expected(Gozlenilen) ile Actual(Faktiki) qarsilasdirma edirik. Uygun olmazsa Xeta mesaji
        Assert.assertEquals(soz1, soz2,"Actual ile Expected uygun gelmir");
    }

    @Test
    public void NotEqualsNumune(){
        String soz1 = "Salam";
        String soz2 = "SALAM";
        // Dogrulamamiz tekrar etmediyi yonunde oldugu ucun, ferqli oldugunu tesdiq etmeliyik
        // Meselen Negativ testlerde istifade oluna biler
        Assert.assertNotEquals(soz1, soz2,"Actual ile Expected eynidir");
    }

    @Test
    public void TrueNumune(){
        String soz1 = "Salam";
        String soz2 = "Salam";
        String soz3 = "SALAM";

        Assert.assertTrue(soz1.equals(soz2), "Actual ile Expected uygun gelmir");
        Assert.assertTrue(soz1.equalsIgnoreCase(soz3), "Actual ile Expected uygun gelmir");
    }

    @Test
    public void TrueNumuneInt(){
        int eded1 = 3;
        int eded2 = 3;

        Assert.assertTrue(eded1 == eded2,"Actual ile Expected uygun gelmir");
    }

    @Test
    public void FalseNumune(){
        String soz1 = "Salam";
        String soz2 = "SALAM";
        String soz3 = "DUNYA";

        Assert.assertFalse(soz1.equals(soz2),"Actual ile Expected eynidir"); // bire bir eynilik
        // Meselen Luget tetbiqinde tekrarlanmayan sozleri axtaririq, Bezi yerlerde case ferqi olsa da
        // Eyni sozler yer alib. Bu zaman ignoreCase ederek eyni olan sozleri tapib Bug qeyd edirik
        Assert.assertFalse(soz1.equalsIgnoreCase(soz3),"Actual ile Expected eynidir");
        // Daha deqiq Eyni sozleri tapdiq
    }


    @Test
    public void NullNumune(){
        String soz1 = null;
        Assert.assertNull(soz1,"Deyer Null deyil"); // True gozleyir
    }

    @Test
    public void NotNullNumune(){
        String soz1 = "Salam";
        Assert.assertNotNull(soz1,"Deyer Null-dir "); // False gozleyir
    }

     @Test
    public void BirbashaFail(){
        int eded1 = 21; // Actual
        // Shert ucun mecburi Fail vermek
        if (eded1!=21){ // Expected
            Assert.fail();
        }
    }

    // Todo : Assert cagiraraq daha hansi dogrulamalarin oldugunu arashdirin. Teqdimetme lazim deyil. Self Learning


}
