public class Ch08_Pc08_Laidlaw_ParkingMeter
{
    // the amount of time purchased to park legally
    private int minsPurchased;

    Ch08_Pc08_Laidlaw_ParkingMeter(int minsPurchased)
    {
        // assigns inputted purchased time to this meter
        this.minsPurchased = minsPurchased;
    }// Ch08_Pc08_Laidlaw_ParkingMeter(int minsPurchased)

    Ch08_Pc08_Laidlaw_ParkingMeter(Ch08_Pc08_Laidlaw_ParkingMeter parkingMeter)
    {
        // copys and creates new meter
        this(parkingMeter.getMinsPurchased());
    }// Ch08_Pc08_Laidlaw_ParkingMeter(Ch08_Pc08_Laidlaw_ParkingMeter
     // parkingMeter)

    public int getMinsPurchased()
    {
        // returns time on meter
        return minsPurchased;
    }// getMinsPurchased()
}// Ch08_Pc08_Laidlaw_ParkingMeter