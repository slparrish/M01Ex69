// Scott L. Parrish 10/30/2025
// SDEV 200 Module 1 Exercise 6.9
// Converter class to convert from feet to meters and meters to feet including
// a test program to demonstrate the use of the class
public class Converter {
    // method to convert measurements in feet to meters using the formula
    // meter = 0.305 * foot
    public static double footToMeter(double foot) {

        double result;

        result = 0.305 * foot;
        return result;
    }

    // method to convert measurements in meters to feet using the formula
    // foot = 3.279 * meter
    public static double meterToFoot(double meter) {

        double result;

        result = 3.279 * meter;
        return result;
    }

    public static void main(String[] args) {
        // Arrays to hold foot and meter values to be converted.  Both arrays must be the
        // same length or odd behavior may occur.
        double[] fromMeters = {20,25,30,35,40,45,50,55,60,65};
        double[] fromFeet = {1,2,3,4,5,6,7,8,9,10};

        // Check to make sure the arrays have the same length, if not, exit with a message.
        if (fromFeet.length != fromMeters.length){
            System.out.println("Something went wrong...");
            return;
        }
        // Set up column headers and divider.
        System.out.println("Feet\tMeters\t\t\tMeters\tFeet");
        System.out.println("-----------------------------------------");
        // Loop through values to be converted and display the results in a table.
        for (int i = 0; i < fromFeet.length; i++){
            double meters = footToMeter(fromFeet[i]);
            double feets = meterToFoot(fromMeters[i]);
            System.out.printf("%4.1f\t%4.3f\t\t\t%3.1f\t%6.3f\n", fromFeet[i], meters, fromMeters[i], feets);
        }
    }
}

