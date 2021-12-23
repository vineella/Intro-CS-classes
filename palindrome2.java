public class palindrome2 {
    public boolean isPalindrome(String test){
       
        // standardizing the code to prevent case and spacing from creating logic errors 
        String clean = test.replaceAll("\\s", "").toLowerCase();
        return recursivePalindrome(clean,0,clean.length()-1);
    }
    
    //takes new string containing user input and determines if it's a palindrome 
    private boolean recursivePalindrome(String test, int start, int end) {
        
        if (start == end) {   //if input is one character then it is a palindrome
            return true;
        } 

        if ((test.charAt(start)) != (test.charAt(end))) {  //if character in mirroring positions are not the same, then the string is not a palindrome
            return false;
        }

        if (start < end + 1) {  //makes sure all code is tested, recurses if not 
            return recursivePalindrome(test, start + 1, end - 1);
        }
    
        return true; //only if the string satisfies the condition to be a palindrome
    } 
}
