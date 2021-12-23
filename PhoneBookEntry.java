import java.util.ArrayList;

//write a class named PhoneBookEntry that has a fields for a person's name and phone number (Done) 
//thie class should have a contructor and appoprirate accessor and mutator methods (Done)
//Then write a program that creates at least five PhoneBook Entry objects and stores them in an ArrayList. (Done)
//use a loop to display the contents of each object in the ArrayList (Unfinished)

public class PhoneBookEntry {

    //instance variables
    String name;
    String phoneNumber;
    
    //contructor declaring a class
    public PhoneBookEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //method 1
    public String getName(){
        return name;
    }

    //method 2
    public String getphoneNumber(){
        return phoneNumber;
    }

    public String toString() {
        return("This person is: " + this.getName() + "   " + 
               "Their phone number is: " + this.getphoneNumber());
        
    }
}
