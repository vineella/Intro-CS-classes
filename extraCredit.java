import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.xml.namespace.QName;

import java.util.regex.Matcher;


public class extraCredit {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    //prompt user to enter password
    System.out.println("Please enter a password that is at least 8 characters long and contain only uppercase, lowercase, and numbers");
    String password = input.nextLine();

boolean check;
    //error handling for length
    do{
        if(password.length() < 8){
            System.out.println("Invalid Password. Please enter a password that is at least 8 characters long");
            password = input.nextLine();
        }
    
        //error handling for content
        Pattern p = Pattern.compile("[!@#$%^&*()_+ ]");
        Matcher m = p.matcher(password);
        check = m.find();
        
        if(check == true){
            System.out.println("Invalid Password. Please enter a password that only has uppercase letters, lowercase letters, and numbers");
            password = input.nextLine();
        }
    }while(password.length() < 8 || check == true );
    System.out.println("Password Entered Sucessfully");
    } 
}

