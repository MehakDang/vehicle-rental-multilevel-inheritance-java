class Vehicle {
    String brand;
    String modelyear;

    void displayInfo()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + modelyear);
    }
    void start()
    {
        System.out.println("The vehicle has started successfully");
    }
}
class Car extends Vehicle
{
    int numOfDoors;

    void displayCarInfo()
    {
        System.out.println("Number of Doors: " + numOfDoors);
    }
    void drive()
    {
        System.out.println("Car is now driving");
   }
}
class ElectricCar extends Car
{
    int batteryCap;
    void charge()
    {
        System.out.println("Battery charging %age:" + batteryCap);
    }
}
public class RentalCo {
    public static void main(String[] args)
    {
        ElectricCar e1 = new ElectricCar();
        e1.brand = "Hyundai Creta";
        e1.modelyear = "2024";
        e1.numOfDoors = 4;
        e1.batteryCap = 82;
        e1.displayInfo();
        e1.start();
        e1.drive();
        e1.displayCarInfo();
        e1.charge();
    }
}
