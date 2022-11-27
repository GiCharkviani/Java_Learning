public class Printer {
    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100 && (tonerLevel + tonerAmount) <= 100) {
            tonerLevel += tonerAmount;
            return tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int calculation =  duplex ? (pages/2) : pages;
        pagesPrinted += calculation;
        return calculation;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
