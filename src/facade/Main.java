package facade;

public class Main {
    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();

        System.out.println("=== Planning Trip ===");
        travelFacade.planTrip();

        System.out.println("\n=== Canceling Trip (vacation not approved) ===");
        travelFacade.cancelTrip();
    }
}