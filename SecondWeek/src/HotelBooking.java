/*
    Task 2:

    Rohit would like to book a hotel with cheapest price for N number of days based on his preferred star rating.
    Each Hotel can have rating as (5star or 3star or 1star), and each hotel's per day cost is mentioned below.
    Based on Rohit's star preference and money he has, find if he can get any cheapest hotel.
    Constraints:
    1.  N - no of days ranging from 1 to 31
    2.  star rating - will be any one of (5,3,1)
    3.  amount - the total amount Rohit can spent max.
    Hotel Details:
    1. The Park, 5 star hotel, will cost $90/day, but if customer stays more than 2 days, then customer gets 20% off on total cost.
    2. Hotel Hyaat, 5 star hotel, will cost $82/day, but if customer stays more than 3 days, then customer gets 12% off on total cost.
    3. Raddisson, 3 star hotel, will cost $60/day, but if customer stays more than 3 days, then customer gets 18% off on total cost.
    4. RainTree, 3 star hotel, will cost $58/day, but if customer stays more than 2 days, then customer gets 15% off on total cost.
    5. Accord, 1 star hotel, will cost $41.55/day, but if customer stays more than 3 days, then customer gets 11.8% off on total cost.
    6. Fortune, 1 star hotel, will cost $43/day, but if customer stays more than 4 days, then customer gets 14.8% on total cost.
    Challenge:
    Create a static method "bookHotel" with 3 arguments and return type as string,
    1. money (Double dataType) -  total amount customer has
    2. days  (Integer dataType) - no.of.days customer like to stay.
    3. rating (Integer dataType) - preferred star rating for the hotel.
    Based on given input, if cheapest hotel is found return string like below,
    'Hotel Booked for "days" days in "star" star Hotel "hotel name" for the cost of "totalCost for hotel"'
    Example:
    "Hotel Booked for 2 days in 3 star hotel The Park for the cost of $186.5"
    If no cheapest hotel is found for the customer, the return string like below,
    Example:
    'Sorry! you dont have sufficient amount to book any hotel'
*/
import java.util.Scanner;
class Hotel {
    private String name;
    private int starRating;
    private double costPerDay;
    private int discountDays;
    private double discountPercentage;

    public Hotel(String name, int starRating, double costPerDay, int discountDays, double discountPercentage) {
        this.name = name;
        this.starRating = starRating;
        this.costPerDay = costPerDay;
        this.discountDays = discountDays;
        this.discountPercentage = discountPercentage;
    }
    public String getName() {
        return name;
    }

    public int getStarRating() {
        return starRating;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public int getDiscountDays() {
        return discountDays;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }
    public double calculateTotalCost(int days) {
        double totalCost = costPerDay * days;
        if (days >= discountDays) {
            double discountAmount = totalCost * discountPercentage / 100;
            totalCost =totalCost - discountAmount;
        }
        return totalCost;
    }
}

public class HotelBooking {
      static  Hotel[] hotels = {
            new Hotel("The Park", 5, 90.0, 2, 20.0),
            new Hotel("Hotel Hyatt", 5, 82.0, 3, 12.0),
            new Hotel("Raddisson", 3, 60.0, 3, 18.0),
            new Hotel("RainTree", 3, 58.0, 2, 15.0),
            new Hotel("Accord", 1, 41.55, 3, 11.8),
            new Hotel("Fortune", 1, 43.0, 4, 14.8)
    };


    public static String bookHotel(double money, int days, int rating) {
        double cheapestCost =Double.MAX_VALUE;
        Hotel cheapestHotel = null;
        for (Hotel hotel : hotels) {
            if (hotel.getStarRating() == rating) {
                double totalCost = hotel.calculateTotalCost(days);
                if (totalCost <= money && totalCost < cheapestCost) {
                    cheapestCost = totalCost;
                    cheapestHotel = hotel;
                }
            }
        }
        if (cheapestHotel != null) {
            return "Hotel Booked for " + days + " days in " + cheapestHotel.getStarRating() + " star hotel " + cheapestHotel.getName() + " for the cost of $" + cheapestCost;
        } else {
            return "Sorry! you don't have sufficient amount to book any hotel";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total amount");
        double money = sc.nextDouble();
        System.out.println("Enter No of days");
        int days = sc.nextInt();
        if (days > 0 && days <= 31) {
            //System.out.println(days);
        } else {
            System.out.println("enter between 1 to 31 for days");
            money = sc.nextDouble();
        }
        System.out.println("Enter star rating");
        int rating = sc.nextInt();

        if (rating <= 5 && rating != rating / 2) {
            //System.out.println(rating);
        } else {
            System.out.println("enter a odd number between 1 to 5 for star rating");
            rating = sc.nextInt();
        }

        String result = bookHotel(money, days, rating);
        System.out.println(result);
    }
}

