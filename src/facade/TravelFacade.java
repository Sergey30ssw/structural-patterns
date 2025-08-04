package facade;

public class TravelFacade {
    private final FlightBooking flightBooking;
    private final HotelBooking hotelBooking;
    private final CarRental carRental;

    public TravelFacade() {
        this.flightBooking = new FlightBooking();
        this.hotelBooking = new HotelBooking();
        this.carRental = new CarRental();
    }

    public void planTrip() {
        System.out.println("Planning trip...");
        flightBooking.book();
        hotelBooking.book();
        carRental.book();
        System.out.println("Trip planned successfully!");
    }

    public void cancelTrip() {
        System.out.println("Canceling trip...");
        flightBooking.cancel();
        hotelBooking.cancel();
        carRental.cancel();
        System.out.println("Trip canceled successfully!");
    }
}