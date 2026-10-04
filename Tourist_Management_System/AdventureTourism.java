package Tourist_Management_System;

public class AdventureTourism extends TourismPackage {

    // Constructor
    public AdventureTourism(String packageId,String destination,int days,int travelers,double basePrice) {

        // Calling parent constructor
        super(packageId,destination,days,travelers,basePrice);
    }

    // Method Overriding
    @Override
    public double calculateFinalPrice() {

        double adventureCharge = getBasePrice() * 0.15;

        return getBasePrice() + adventureCharge;
    }

    @Override
    public void displayPackageDetails() {

        super.displayPackageDetails();

        System.out.println("Package Type:Adventure Tourism");
    }
}
