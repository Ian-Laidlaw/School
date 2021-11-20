public class Ch08_Pc08_Laidlaw_PoliceOfficer
{
    // name of officer
    private String name;
    // badge number of officer
    private int badgeNumber;

    Ch08_Pc08_Laidlaw_PoliceOfficer(String name, int badgeNumber)
    {
        // assign inputted name to this officer
        this.name = name;
        // assign inputted badge number to this officer
        this.badgeNumber = badgeNumber;
    }// Ch08_Pc08_Laidlaw_PoliceOfficer(String name, int badgeNumber)

    public boolean checkMeter(Ch08_Pc08_Laidlaw_ParkingMeter meter, Ch08_Pc08_Laidlaw_ParkedCar car)
    {
        // returns whether or not the car has been parked longer than the amount
        // of time purchased on the meter
        return (meter.getMinsPurchased() < car.getMinsParked());
    }// checkMeter(Ch08_Pc08_Laidlaw_ParkingMeter meter,
     // Ch08_Pc08_Laidlaw_ParkedCar car)

    public Ch08_Pc08_Laidlaw_ParkingTicket writeTicket(Ch08_Pc08_Laidlaw_ParkingMeter meter, Ch08_Pc08_Laidlaw_ParkedCar car)
    {
        // the amount of time the car has been illegally parked
        int timeOver = car.getMinsParked() - meter.getMinsPurchased();
        // creates a new ticket with the car instance, the amount of time parked
        // illegally,
        // and the officer instance that is calling this function
        return new Ch08_Pc08_Laidlaw_ParkingTicket(car, timeOver, this);
    }// writeTicket(Ch08_Pc08_Laidlaw_ParkingMeter meter,
     // Ch08_Pc08_Laidlaw_ParkedCar car)

    @Override
    public String toString()
    {
        // returns a formatted string containing the officers name and badge
        // number, both left aligned
        return String.format("%-20s Badge Number: %-5d", name, badgeNumber);
    }// toString()
}// Ch08_Pc08_Laidlaw_PoliceOfficer