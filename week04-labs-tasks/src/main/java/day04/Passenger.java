package day04;

public class Passenger {

    private String name;
    private String ticketNumber;
    private int numberofPackages;

    public Passenger(String name, String ticketNumber, int numberofPackages) {
        this.name = name;
        this.ticketNumber = ticketNumber;
        this.numberofPackages = numberofPackages;
    }

    public String getName() {
        return name;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public int getNumberofPackages() {
        return numberofPackages;
    }
}
