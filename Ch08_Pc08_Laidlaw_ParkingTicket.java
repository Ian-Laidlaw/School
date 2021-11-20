public class Ch08_Pc08_Laidlaw_ParkingTicket
{
    // illegally parked car
    private Ch08_Pc08_Laidlaw_ParkedCar car;
    // the fine amount
    private int fine;
    // amount of time spent illegally parked
    private int timeOver;
    // the officer writing the ticket
    private Ch08_Pc08_Laidlaw_PoliceOfficer officer;

    Ch08_Pc08_Laidlaw_ParkingTicket(Ch08_Pc08_Laidlaw_ParkedCar car, int timeOver,
                    Ch08_Pc08_Laidlaw_PoliceOfficer officer)
    {
        // assigns inputted car to this ticket
        this.car = car;
        // calculates fine amount based on inputted time
        this.fine = calculateFine(timeOver);
        // assigns inputted time to this ticket
        this.timeOver = timeOver;
        // assigns inputted officer to this ticket
        this.officer = officer;
    }// Ch08_Pc08_Laidlaw_ParkingTicket(Ch08_Pc08_Laidlaw_ParkedCar car, int
     // timeOver,
     // Ch08_Pc08_Laidlaw_PoliceOfficer officer)

    private int calculateFine(int timeOver)
    {
        // fine is $25 for the first hour, for each hour after, fine increases
        // by $10
        if (timeOver <= 60)
        {
            // return 25 if only up to 1 hour was spent illegally parked
            return 25;
        }
        // finds the number of hours after the first and charges $10 for each of
        // those hours
        int numHourFine = ((timeOver / 60) - 1) * 10;
        // finds if any time was spent illegally parked that wasn't a full hour
        // and charges $10
        numHourFine += (timeOver % 60 > 0) ? 10 : 0;
        // adds $25 to the number of whole or partial hours spent illegally
        // parked
        return 25 + numHourFine;
    }// calculateFine(int timeOver)

    @Override
    public String toString()
    {
        // the string for the ticket outpt
        final String ticketFormat = "Java City Police Department Parking Ticket:\n%s\n" +
                        "Your fine for parking %d minutes over purchased minutes is: $%d\n\n" +
                        "Issued by: %s\n";
        // returns a formatted string containing information about the car,
        // amount of time illegally parked,
        // the fine amount, and the officer who wrote the ticket
        return String.format(
                        ticketFormat, car, timeOver, fine, officer);
    }// toString()
}// Ch08_Pc08_Laidlaw_ParkingTicket