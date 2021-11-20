public class Ch08_Pc08_Laidlaw_ParkedCar
{
    // the make of the car
    private String make;
    // the model of the car
    private String model;
    // the color of the car
    private String color;
    // the license plate of the car
    private String licenseNumber;
    // the amount of time parked
    private int minsParked;

    Ch08_Pc08_Laidlaw_ParkedCar(String make, String model, String color, String licenseNumber, int minsParked)
    {
        // assigns inputted make to this car
        this.make = make;
        // assigns inputted model to this car
        this.model = model;
        // assigns inputted color to this car
        this.color = color;
        // assigns inputted license plate made uppercase to look like a real
        // license plate to this car
        this.licenseNumber = licenseNumber.toUpperCase();
        // assigns inputted time parked to this car
        this.minsParked = minsParked;
    }// Ch08_Pc08_Laidlaw_ParkedCar(String make, String model, String color,
     // String licenseNumber, int minsParked)

    Ch08_Pc08_Laidlaw_ParkedCar(Ch08_Pc08_Laidlaw_ParkedCar car)
    {
        // calls the above constructor with the fields of inputted car
        this(car.make, car.model, car.color, car.licenseNumber, car.getMinsParked());
    }// Ch08_Pc08_Laidlaw_ParkedCar(Ch08_Pc08_Laidlaw_ParkedCar car)

    public int getMinsParked()
    {
        // returns the amount of time parked
        return minsParked;
    }// getMinsParked()

    public String toString()
    {
        // returns formatted string with information about car
        return String.format(
                        "Make:  %-10s  Model:         %-9s\n" +
                                        "Color: %-10s  License Plate: %s\n",
                        make, model, color, licenseNumber);
    }// toString()
}// Ch08_Pc08_Laidlaw_ParkedCar