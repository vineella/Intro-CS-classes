import java.util.ArrayList;



public class SummerLab1 {
        public static void main (String[] args){  

                //Creating 5 PhoneBook Entry objects
                
                PhoneBookEntry Yumi = new PhoneBookEntry("Yumi", "123-465-7890");

                PhoneBookEntry Jake = new PhoneBookEntry("Jake", "234-567-8901");

                PhoneBookEntry Aria = new PhoneBookEntry("Aria", "345-678-9012");

                PhoneBookEntry Alba = new PhoneBookEntry("Alba", "456-789-0123");

                PhoneBookEntry Jace = new PhoneBookEntry("Jace", "567-890-1234");

                //storing PhoneBook Entries in an ArrayList
                ArrayList<PhoneBookEntry> phoneBook = new ArrayList<>();
                        phoneBook.add(Yumi);
                        phoneBook.add(Jake);
                        phoneBook.add(Aria);
                        phoneBook.add(Alba);
                        phoneBook.add(Jace);

                //using a loop to display the contects of each object in the ArrayList
                
                for(PhoneBookEntry phoneBookEntry : phoneBook){
                        System.out.println(phoneBookEntry);
                              
                }
        }
}