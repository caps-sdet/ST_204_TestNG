package Gun_01;

import org.testng.annotations.Test;

public class _02_Siralama {

    // Testlerin icrasi elifba sirasi ile deyil, ustunluk ve asiliga gore edilmesi
    // Testlerin daha dogru aparilasina komek ederdi
    // eger priority edilmezse elifba sirasina gore irelileyer
    // Priority teyin edilmezse default (0) olaraq sayilir
    // Eger priority-ler eynirdirse eliba siralamasinda birinci olani ustun tutur
    @Test (priority = 1)
    public void DriverStart(){System.out.println("Driver Start edildi");}
    @Test (priority = 2)
    public void WebsaytiAc(){System.out.println("Websayta gedildi");}
    @Test (priority = 3)
    public void LoginTesti(){System.out.println("Login Testi edildi");}
    @Test (priority = 4)
    public void SebetTesti(){System.out.println("Sebet Testi edildi");}
    @Test (priority = 5)
    public void DriverClose(){System.out.println("Driver Close edildi");}
}
