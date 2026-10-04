package Tourist_Management_System;

public class InternationalTourism extends TourismPackage {

    // Constructor
    public InternationalTourism(String packageId,String destination,int days,int travelers,double basePrice) {

        // Calling parent constructor
        super(packageId,destination,days,travelers,basePrice);
    }

    // Method Overriding
    @Override
    public double calculateFinalPrice() {

        double serviceCharge = getBasePrice() * 0.10;
        double tax = getBasePrice() * 0.08;

        return getBasePrice() + serviceCharge + tax;
    }

    @Override
    public void displayPackageDetails() {

        super.displayPackageDetails();

        System.out.println("Package Type:International Tourism");
    }
}