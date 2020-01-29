package printer;

public class BuildPrinter {

    public static void main(String[] args) {

        //printer instance
        Printer printerOne = new Printer();
        Printer printerTwo = new Printer();

        //print double side
        printerTwo.setTonerLevel(10);
        System.out.println("Toner Level: " + printerTwo.getTonerLevel());

        printerTwo.printPage(20, 18, false);

        System.out.println("Number of Printed pages: " + printerTwo.getPrintedPages());
        System.out.println("Number of Printed sheets: " + printerTwo.getPrintedSheets());
        System.out.println("Toner Level: " + printerTwo.getTonerLevel());
    }
}
