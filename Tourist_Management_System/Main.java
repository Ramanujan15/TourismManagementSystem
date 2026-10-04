package Tourist_Management_System;

public class Main {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("        DHILTOUR TRAVELS");
        System.out.println("========================================");

        // Creating Tourist Objects

        // No-argument constructor
        Tourist tourist1 = new Tourist();

        tourist1.setTouristId(101);
        tourist1.setTouristName("Arun");
        tourist1.setEmail("arun@gmail.com");
        tourist1.setPhone("9876543210");

        // Parameterized constructor
        Tourist tourist2 = new Tourist(
                102,
                "Priya",
                "priya@gmail.com",
                "9876543211"
        );

        // Display Tourist 1
        tourist1.displayTouristInfo();

        System.out.println("----------------------------------------");

        // Display Tourist 2
        tourist2.displayTouristInfo();

        System.out.println("----------------------------------------");


        // Creating Tourism Packages

        // Polymorphism
        TourismPackage package1 =
                new DomesticTourism(
                        "TP101",
                        "Goa",
                        5,
                        2,
                        40000
                );

        TourismPackage package2 =
                new InternationalTourism(
                        "TP102",
                        "Paris",
                        7,
                        2,
                        100000
                );

        TourismPackage package3 =
                new AdventureTourism(
                        "TP103",
                        "Manali",
                        6,
                        3,
                        60000
                );


        // Store objects in array


        TourismPackage[] packages = {package1,package2,package3};

        // Display Package Details


        for (TourismPackage tourismPackage : packages) {

            tourismPackage.displayPackageDetails();

            System.out.println("Final Price: " + tourismPackage.calculateFinalPrice());

            System.out.println("----------------------------------------");
        }
    }
}
