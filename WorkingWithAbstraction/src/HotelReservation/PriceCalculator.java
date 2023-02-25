package HotelReservation;

public class PriceCalculator {
    public static double calculatePrice(double pricePerDay, int days, Season season, Discount discount){
        double basePrice = pricePerDay*days*season.getMultiplier();
        return basePrice*(1-discount.getDiscount());
    }
}
