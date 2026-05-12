package Gun_01;

import Utility.BaseDriver;
import Utility.Tools;
import org.testng.annotations.Test;

public class _05_BaseDriverTest extends BaseDriver {

    @Test
    public void Test1() {
        Tools.Wait(5);
        driver.get("https://www.facebook.com/");
    }
}
