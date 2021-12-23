import java.util.Scanner;
public class SummerLab2{
    public static void main(String[] args){

        //asks user to input string argument to be tested
        Scanner input = new Scanner(System.in); 
        System.out.println("What word or phrase do you think is a palindrome?" + "\n" +  
        "Please refrain from using punctuation.");
        String test = input.nextLine();

        //test if input is a palindrome and informs user of results
        palindrome2 sameThing = new palindrome2();
        if(sameThing.isPalindrome(test)){
            System.out.println("This is a Palindrome"); 
        } else {
            System.out.println("This is not a Palindrome"); 

        }

        

    } 
}