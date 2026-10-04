package Tourist_Management_System;

public class Tourist {

    // Encapsulation
    private int touristId;
    private String touristName;
    private String email;
    private String phone;

    // No-argument constructor
    public Tourist() {
    }

    // Parameterized constructor
    public Tourist(int touristId, String touristName, String email, String phone) {
        this.touristId = touristId;
        this.touristName = touristName;
        this.email = email;
        this.phone = phone;
    }

    public int getTouristId() {
        return touristId;
    }

    public void setTouristId(int touristId) {
        this.touristId = touristId;
    }

    public String getTouristName() {
        return touristName;
    }

    public void setTouristName(String touristName) {
        this.touristName = touristName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    // Display tourist information
    public void displayTouristInfo() {

        System.out.println("Tourist Details");
        System.out.println("Tourist ID:" + touristId);
        System.out.println("Name:" + touristName);
        System.out.println("Email:" + email);
        System.out.println("Phone:" + phone);
    }
}
