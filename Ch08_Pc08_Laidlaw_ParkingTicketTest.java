import java.util.Scanner;

public class Ch08_Pc08_Laidlaw_ParkingTicketTest
{
    public static void main(String[] args)
    {
        // make of the car
        String carMake;
        // model of car
        String carModel;
        // color of car
        String carColor;
        // license plate of car, all uppercase
        String carLicense;
        // amount of time parked
        int carMinsParked;

        // amount of time purchased to park
        int meterMinsPurchased;

        // name of police officer
        String copName;
        // badge number of police officer
        int copID;

        // declaration of a car, meter, and police officer
        Ch08_Pc08_Laidlaw_ParkedCar car;
        Ch08_Pc08_Laidlaw_ParkingMeter meter;
        Ch08_Pc08_Laidlaw_PoliceOfficer officer;
        // reads iput
        Scanner input = new Scanner(System.in);

        // prompt and input for make of car
        System.out.printf("Please enter the make of your car: ");
        carMake = input.nextLine();

        // prompt and input for model of car
        System.out.printf("Please enter the model of your car: ");
        carModel = input.nextLine();

        // prompt and input for color of car
        System.out.printf("Please enter the color of your car: ");
        carColor = input.nextLine();

        // prompt and input for license plate of car
        System.out.printf("Please enter the license plate of your car: ");
        carLicense = input.nextLine();

        // prompt and input for amount of time car has been parked
        System.out.printf("Please enter how many minutes you have been parked: ");
        carMinsParked = input.nextInt();

        // prompt and input for amount of parking time purchased
        System.out.printf("Please enter the number of minutes bought at the parking meter: ");
        meterMinsPurchased = input.nextInt();

        // clears newline that nextInt() leaves dangling so the next read from
        // input doesn't mess up
        input.nextLine();

        // prompt and input for name of police officer
        System.out.printf("Please enter the name of a police officer: ");
        copName = input.nextLine();

        // prompt and input for badge number of police officer
        System.out.printf("Please enter the badge number of a police officer: ");
        copID = input.nextInt();

        input.close();

        // definition of car, meter, and police officer
        car = new Ch08_Pc08_Laidlaw_ParkedCar(carMake, carModel, carColor, carLicense, carMinsParked);
        meter = new Ch08_Pc08_Laidlaw_ParkingMeter(meterMinsPurchased);
        officer = new Ch08_Pc08_Laidlaw_PoliceOfficer(copName, copID);

        // print ticket if car is parked illegaly, otherwise print out remaining
        // time on meter and officer info
        if (officer.checkMeter(meter, car))
        {
            System.out.printf('\n' + officer.writeTicket(meter, car).toString() + '\n');
        } // if(officer.checkMeter())
        else
        {
            System.out.printf("You have %d minutes left on the meter\n %s\n",
                            (meter.getMinsPurchased() - car.getMinsParked()), officer.toString());
        } // else
    }// main(String[] args)
}// Ch08_Pc08_Laidlaw_ParkingTicketTest
