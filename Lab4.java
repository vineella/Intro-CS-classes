import java.util.Scanner;
public class Lab4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //prompting the user to enter the Lower and Upper Bound
        int Lbound = 0;
        int Ubound = 0;
        System.out.println("Please enter the Lower Bound for a prime number search, this value should be an positive integer");
            Lbound = input.nextInt();

        System.out.println("Please enter the Upper Bound for a prime number search, this value should be an positive integer that is larger than the Lower Bound");
            Ubound = input.nextInt();

        //calling for methods
        errorCheck(Lbound, Ubound);
        primeNum(Lbound, Ubound);
    }

    public static void primeNum(int Low, int Up){
        //Locating prime numbers between [x,y] and printing 10 numbers per line
        int tab = 0;
        int count;
        //loop for finding and printing all prime numbers between given range
        for(int i = Low; i<= Up; i++) {
            count = 0;
            for(int j = 1; j <= i ; j++) {
                
                //checks for factors of between given range
                if(i % j == 0)
                    count++;
                
            } // prints only the prime numbers with a tab sequence inbetween, because only prime numbers have two factors
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

    public static void errorCheck(int Lower, int Upper){
        Scanner input = new Scanner(System.in);
        
        //Read in user input and verify that correct values were entered
        int counter = 0;
        
        //checks if lower bound is a positive value 
        if(Lower < 0){                   
            System.out.println("Invalid Answer. Please enter a positive integer");
             
        }

        if(Upper < 0 || Lower > Upper){     //repeats prompt if user input for upper bound is wrong or less than lower bound
            System.out.println("Invalid Answer. Please enter a positive Integer that is larger than the Lower Bound");
        }
            
   
    }
}