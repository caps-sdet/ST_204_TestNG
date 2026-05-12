package Gun_01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _03_Annotations {
    @Test (priority = 1)
    public void Test1(){
        System.out.println("Test 1 icra olundu");
    }
    @Test (priority = 2)
    public void Test2(){
        System.out.println("Test 2 icra olundu");
    }
    @BeforeClass // Class-in icindekilerden evvel ishlesin
    public void BeforeClassim(){
        System.out.println("Before class icra olundu");
    }
    @AfterClass // Class-in icindekilerden ishledikden sonra icra olunsun
    public void AfterClassim(){
        System.out.println("After class icra olundu");
    }
}
