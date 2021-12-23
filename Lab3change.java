import java.util.Scanner;
public class Lab3change {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        
        // declaring and initializing variable  
        int Lbound = 0;
        int Ubound = 0;
        int counter = 0;

            // prompting user to check lower bound
            System.out.println("Please enter the Lower Bound for a prime number search, this value should be an positive integer");
            Lbound = input.nextInt();

            //checks if lower bound is a positive value 
            while(Lbound < 0){                   //repeats prompt if user inputs for lower bound is wrong
                counter++;                      //stores how many times the user inputs an incorrect value
                    if(counter >= 3){          //if user input is wrong 3 times or more, the program exits
                        System.out.println("Sorry you have incorrectly entered an input 3 times, the program will now end.");
                        System.exit(0);
                    }
                System.out.println("Invalid Answer. Please enter a positive Integer"); 
                Lbound = input.nextInt();
            }
           
            System.out.println("Please enter the upper bound for a prime number search, this value should be an positive integer that is larger than the Lower Bound");
            Ubound = input.nextInt();

            while(Ubound < 0 || Lbound > Ubound){     //repeats prompt if user input for upper bound is wrong or less than lower bound
                counter++;                           //stores how many times the user inputs an incorrect value
                if(counter >= 3){                   //if user input is wrong 3 times or more, the program exits
                    System.out.println("Sorry you have incorrectly entered an input 3 times, the program will now end.");
                    System.exit(0);
                }
                System.out.println("Invalid Answer. Please enter a positive Integer that is larger than the Lower Bound");
                Ubound = input.nextInt();
            }

        int count, tab = 0 ;
        
        //loop for finding and printing all prime numbers between given range
        for(int i = Lbound; i<= Ubound; i++) {
            count = 0;
            for(int j = 1; j <= i ; j++) {
                
                //checks for factors of between given range
                if(i % j == 0)
                    count++;
                
            } // prints only the prime numbers, because only prime numbers have two factors
                if(count == 2) {
                    System.out.print(i + "\t");
                    tab++;

                }//permits only 10 outputs per line
                if (tab == 10){
                    System.out.println();
                    tab = 0;
                    }
                
        }
       
              
    }
}

