package Tourist_Management_System;

public class DomesticTourism extends TourismPackage {

    // Constructor
    public DomesticTourism(String packageId,String destination,int days,int travelers,double basePrice) {

        // Calling parent constructor
        super(packageId, destination, days, travelers, basePrice);
    }

    // Method Overriding
    @Override
    public double calculateFinalPrice() {

        double serviceCharge = getBasePrice() * 0.05;

        return getBasePrice() + serviceCharge;
    }

    @Override
    public void displayPackageDetails() {

        super.displayPackageDetails();

        System.out.println("Package Type:Domestic Tourism");
    }
}
