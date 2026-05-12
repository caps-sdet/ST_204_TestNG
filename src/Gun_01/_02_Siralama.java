package Gun_01;

import org.testng.annotations.Test;

public class _02_Siralama {

    @Test (priority = 1) // eger priority sazlanmasi edilmese elifba sirasina gore irelileyecek
    public void DriverStart(){
        System.out.println("Driver start edildi");
    }
    @Test (priority = 2) // priority teyin edilmese deault Sifirdir
    public void WebsaytiAch(){
        System.out.println("Websayta gedildi");
    }
    @Test (priority = 3)
    public void LoginTesti(){
        System.out.println("Login Testi edildi");
    }
    @Test(priority = 4)
    public void SebetTesti(){
        System.out.println("Sebet Testi edildi");
    }
    @Test(priority = 5)
    public void DriverClose(){
        System.out.println("Driver close edildi");
    }
}
