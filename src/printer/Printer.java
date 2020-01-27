package printer;

/*
 * Build a printer:
 *
 * 1. User can set toner level range between 0 to 100 (toner level cannot be greater than 100)
 *
 * 2. User should be able to see number of page printed
 *
 * 3. User should be able to print both sided (Note: in that case printed page should be calculated correctly)
 *
 * 4. User can view current toner level at anytime
 *
 * 5. single page == single toner level; (Example: Toner = 100, printed page = 20, updated toner = 80)
 *
 * 6. If toner reaches < 1, then print "Low Toner, Please add more toner"
 *
 * 7. Max pages can be printed == 100;
 *
 * Questions:
 * 1. what are the parameters of the printPage() method
 * 2. what is the difference between a sheet and a page
 * 3. A sheet of paper has two pages
 */

import java.util.Scanner;

public class Printer {

    /*class variables */
    private static final int MAX_TONER_LEVEL = 100;
    private static final int MAX_PRINTED_PAGE = 100;

    /*instance variables*/
    private int tonerLevel;
    private int printedSheets;
    private int printedPages;
    private boolean isMaxPrintedPage;

    /*instance of scanner*/
    Scanner input = new Scanner(System.in);

    /*constructor*/
    public Printer(){

    }

    /*get the current toner level*/
    public int getTonerLevel() {

        return tonerLevel;
    }

    /*set the toner level*/
    public void setTonerLevel(int tonerLevel) {

        int currentTonerLevel = this.tonerLevel + tonerLevel;

        if(currentTonerLevel > MAX_TONER_LEVEL){

            System.out.println("Toner level can't be more than " + MAX_TONER_LEVEL);
            return;
        }

        //setting the toner level
        this.tonerLevel += tonerLevel;
    }

    /*get the number of pages printed*/
    public int getPrintedPages() {

        return printedPages;
    }

    /*get the number of printed sheets*/
    public int getPrintedSheets(){

        return printedSheets;
    }

    /*print single side of a sheet of paper, where printedSheets = number of printed pages
    print both sides of a sheet of paper, where printedSheets = (number of printed pages/2)*/
    public void printPage(int numberOfSinglePages, int beginningPageNo, boolean singleSided){
        //start printing from beginningPageNo
        int pageNo = beginningPageNo;
        //print each page
        System.out.println("Printing....( " + numberOfSinglePages + " pages )...");
        while (tonerLevel != 0 && pageNo <= numberOfSinglePages){
            //Max pages can be printed == 100
            if(printedPages == MAX_PRINTED_PAGE){
                isMaxPrintedPage = true;
                break;
            }
            System.out.println("Page " + pageNo + " of " + numberOfSinglePages);
            //increase printed pages
            printedPages++;
            //decrease toner level
            tonerLevel--;

            pageNo++;
        }

        //amount of printed paper
        if(singleSided){
            printedSheets = printedPages;
        }
        else {
            printedSheets = (printedPages/2);
        }

        //printing is done or low toner
        if(pageNo == numberOfSinglePages + 1){ //at the last iteration of while loop, pageNo = pagesToBePrinted + 1

            System.out.println("....Printing is Done....");
        }
        else if (tonerLevel < 1){

            System.out.println("Low Toner, Please Add More Toner.");

            System.out.println("Do You Want to Add More Toner (Yes/No): ");
            String str = input.nextLine();

            if(str.equalsIgnoreCase("YES")) {

                System.out.println("You can Set Toner Level Between 0 to 100...");

                //prompt user to add more toner
                System.out.println("Please Enter a Number to Add Toner: ");
                int toner = input.nextInt();

                //add more toner
                setTonerLevel(toner);

                //print pages that are yet to be printed
                printPage(numberOfSinglePages, pageNo, singleSided);
            }
            else {
                return;
            }

        }
        else if(isMaxPrintedPage){

            System.out.println("You Have reached the Limit.");
            System.out.println("Max Pages can be Printed is" + MAX_PRINTED_PAGE);
        }
        else {

            System.out.println("!!!Printer Error!!!");
        }
    }

}
