import java.util.*;
import java.lang.*;


class Address {
    private String street;
    private String city;
    private String state;
    private int zip;
    
    public Address() {
        // default constructor
    }
    
    public Address(String street, String city, String state, int zip) {
        // constructor to initialize address fields
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    public void setAddress(String street, String city, String state, int zip) {
        // method to set address fields
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    public void getAddress() {
        // method to display address
        System.out.println(street);
        System.out.println(city + ", " + state + " " + zip);
    }
}

class HomeAddress extends Address {
    public HomeAddress() {
        // default constructor
    }
    
    public HomeAddress(String street, String city, String state, int zip) {
        // call parent constructor to initialize address fields
        super(street, city, state, zip);
    }
    
    @Override
    public void getAddress() {
        // override parent method to display home address
        System.out.println("\nHome Address :");
        super.getAddress();
    }
}

class OfficeAddress extends Address {
    public OfficeAddress() {
        // default constructor
    }
    
    public OfficeAddress(String street, String city, String state, int zip) {
        // call parent constructor to initialize address fields
        super(street, city, state, zip);
    }
    
    @Override
    public void getAddress() {
        // override parent method to display office address
        System.out.println("\nOffice Address :");
        super.getAddress();
    }
}

class SchoolAddress extends Address {
    public SchoolAddress() {
        // default constructor
    }
    
    public SchoolAddress(String street, String city, String state, int zip) {
        // call parent constructor to initialize address fields
        super(street, city, state, zip);
    }
    
    @Override
    public void getAddress() {
        // override parent method to display school address
        System.out.println("\nSchool Address :");
        super.getAddress();
        System.out.println("\n");
    }
}

public class AddressTest {
    public static void main(String[] args) {
        // create objects of each address type
        HomeAddress home = new HomeAddress("Near Subhash Chowk", "Forbesganj", "Bihar", 854318);
        OfficeAddress office = new OfficeAddress("Opporite of Infosys Office", "Purnia", "Bihar", 547256);
        SchoolAddress school = new SchoolAddress("Patia Main Street", "Bhubneshwar", "Odisha", 67695);
        
        // call getAddress() method for each object
        home.getAddress();
        office.getAddress();
        school.getAddress();
    }
}
