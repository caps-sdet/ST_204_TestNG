package Gun_01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _03_Annotations {

    @Test(priority = 1)
    public void Test1(){System.out.println("Test-1 icra olundu");}
    @Test (priority = 2)
    public void Test2(){System.out.println("Test-2 icra olundu");}
    @Test (priority = 3)
    public void Test3(){System.out.println("Test-3 icra olundu");}
    @BeforeClass
    public void BeforeClassim(){System.out.println("Before class icra olundu");}
    @AfterClass
    public void AfterClassim(){System.out.println("After class icra olundu");}

}
