package datatype;

/**
 * Primitive Data type:
 * Print:
 * 	The minimum legal age (in years) to purchase alcohol in USA.
 * 	Average monthly salary of an automation engineer in NYC
 * 	Distance between Earth and Moon in miles.
 * 	The national debt of the United State in US dollars
 * 	The interest rate in Chase bank? (use float to store value)
 * 	In which data type, you should store an item's price?
 * 	Ans for "Is your gender female?"
 * 	Your name initials
 *
 * 	Data type     size(in bit)      description
 * 	------------------------------------------
 * 	byte            8               range: -128 to 127 (-2^7 to 2^7 - 1)
 * 	short           16              range: –32,768 to 32,767 (-2^15 to 2^15 - 1)
 * 	int             32              range: –2,147,483,648 to 2,147,483,647 (-2^31 to 2^31 - 1)
 * 	long            64              range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (-2^63 to 2^63 - 1)
 * 	float           32              stores decimal numbers, small degree of precision
 * 	double          64              stores decimal numbers, large-valued numbers, large degree of precision
 * 	char            16              stores unicode characters or ASCII values, (0 to 2^16 - 1)
 * 	boolean         1               stores true or false
 * */

public class PrimitiveDataType {

    public static void main(String[] args){

        //initialize variables
        byte minLegalAge = 21;
        short avgMonthlySalary = 9999;
        int distanceEarthToMoon = 238900;
        long nationalDebtOfUS = 22000000000000L;
        float interestRateOfChaseBank = 3.739f;
        double priceOfAnItem = 10.49;
        boolean isFemale = false;
        char firstInitial = 'M';
        char lastInitial = 'R';

        System.out.println("The minimum legal age (in years) to purchase alcohol in USA: " + minLegalAge);
        System.out.println("Average monthly salary of an automation engineer in NYC: " + avgMonthlySalary);
        System.out.println("Distance between Earth and Moon in miles: " + distanceEarthToMoon);
        System.out.println("The national debt of the United State in US dollars: " + nationalDebtOfUS);
        System.out.println("The interest rate in Chase bank: " + interestRateOfChaseBank);
        System.out.println("In which data type, you should store an item's price? " + "(double)" + priceOfAnItem);
        System.out.println("Is your gender female? " + isFemale);
        System.out.println("Name initials: " + firstInitial + " and " + lastInitial);
    }
}
