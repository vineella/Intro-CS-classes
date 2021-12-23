import java.util.Scanner;

public class codingPractice2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //prompting user to enter the day
        System.out.println("Enter an interger for today's day of the week from 0 to 6. 0 being Sunday, 6 being Saturday");
            int day = input.nextInt();

         //results of day   
        if(day == 0){
            System.out.println("Today is Sunday");
        }

        else if (day == 1){
            System.out.println("Today is Monday");
        }

        else if (day == 2){
            System.out.println("Today is Tuesday");
        }

        else if (day == 3){
            System.out.println("Today is Wednesday");
        }
        
        else if (day == 4){
            System.out.println("Today is Thrusday");
        }

        else if (day == 5){
            System.out.println("Today is Friday");
        }
        
        else if (day == 6){
            System.out.println("Today is Saturday");
        }
        
        //error statemtment for day 
        else{
            System.out.println("Please enter an integer associated with the day of the week");
            System.exit(0);
        }

        //calculate future day from today
        System.out.println("Enter the number of days toggo into the future");
        int futureDays = input.nextInt();
        
        //error statement for future day from today
        if (futureDays <= 0) {
            System.out.println("Invalid input for days future");
            System.exit(0);
        }

        //equation to find  future day from today 
        int futureCalculated = (day + futureDays) % 7;

        //diplays results
        if(futureCalculated == 0){
            System.out.println("That is a Sunday");
        }

        else if (futureCalculated == 1){
            System.out.println("that is a Monday");
        }

        else if (futureCalculated == 2){
            System.out.println("that is a Tuesday");
        }

        else if (futureCalculated == 3){
            System.out.println("that is a Wednesday");
        }
        
        else if (futureCalculated == 4){
            System.out.println("that is a Thrusday");
        }

        else if (futureCalculated == 5){
            System.out.println("that is a Friday");
        }
        
        else if (futureCalculated == 6){
            System.out.println("that is a Saturday");
        }

    }
}
