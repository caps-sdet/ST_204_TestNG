package Gun_03;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency {

    @Test
    public void StartCar(){
        System.out.println("Start Car");
        // Assert.fail(); //StartCar fail verib
    }
    // alwaysRun = true oldugu zaman xeta alsa bele her zaman ishlesin
    @Test (dependsOnMethods = {"StartCar"}, alwaysRun = true) // diger Testden asililiq verdik
    public void DriveCar(){
        System.out.println("Drive Car");
    }
    @Test (dependsOnMethods = {"StartCar","DriveCar"}) // birden cox asililiq vermek olar
    public void ParkCar(){
        System.out.println("Park Car");
    }
    @Test (dependsOnMethods = {"StartCar","DriveCar","ParkCar"}, alwaysRun = true)
    public void StopCar(){
        System.out.println("Stop Car");
    }

}
