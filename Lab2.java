import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) { 
        

        //Generate random lottery number
        int lot1 = (int)(Math.random() * 10);
        int lot2 = (int)(Math.random() * 10);
        int lot3 = (int)(Math.random() * 10);
        int lot4 = (int)(Math.random() * 10);
        int lot5 = (int)(Math.random() * 10);
          

       //accepts 5 positive numbers between [0,9]
       Scanner num = new Scanner(System.in);
      System.out.println("Please enter 5 positive integers from 0 to 9 inclusive. Press the SPACE BAR in between each number");
        int value1 = num.nextInt();
        int value2 = num.nextInt();
        int value3 = num.nextInt();
        int value4 = num.nextInt();
        int value5 = num.nextInt();

       
        //errors handling
        if( value1 < 0 || value1 >= 10){
           System.out.println("Invalid Answer. Enter a value between 0 and 9");
           System.exit(0);
        }
        
        if ( value2 < 0 || value2 >= 10){
            System.out.println("Invalid Answer. Enter a value between 0 and 9");
            System.exit(0);
         }
 

         if ( value3 < 0 || value3 >= 10){
            System.out.println("Invalid Answer. Enter a value between 0 and 9");
            System.exit(0);
         }

         if ( value4 < 0 || value4 >= 10){
            System.out.println("Invalid Answer. Enter a value between 0 and 9");
            System.exit(0);
         }
 

         if ( value5 < 0 || value5 >= 10){
            System.out.println("Invalid Answer. Enter a value between 0 and 9");
            System.exit(0);
         }
 

        //printing lottery number
        System.out.println("The lottery number is: " + lot1 + lot2 + lot3 + lot4 + lot5);
        System.out.println("Your answer was: " + value1 + " " + value2 + " " + value3 + " " + value4 + " " + value5); 
       
        
        //comparing user entered numbers to randomly generated numbers
        int count = 0;

        if(lot1 == value1){
            count++; 
        }

        if (lot2 == value2){
            count++;
        }

        if(lot3 == value3){
            count++;
        }
         
        if(lot4 == value4){
            count++; 
        }
            
        if(lot5 == value5){
            count++; 
        }
        
        System.out.println("The number of identical digits is: " + count);
        
        //Outputting results
        if(count == 5){
            System.out.println("Congrats, all 5 numbers are the same. You have won $500,000");
        }

        else if (count == 4){
            System.out.println("Congrats, 4 numbers are the same. You have won $50,000");  
        }

        else if (count == 3){
            System.out.println("Congrats, 3 numbers are the same. You have won $500");
        }
         
        else{
            System.out.println("sorry this is a non winnning lottery");
        }
    }


}