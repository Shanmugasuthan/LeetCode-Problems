class Solution {  // Define a public class named Solution.

    // Method to determine if a given integer n is a power of two.
    public boolean isPowerOfTwo(int n) {  

        // Check if n is equal to 1, which is 2^0.
        if (n == 1)  
            return true;  // Return true since 1 is a power of two.

        // Check if n is odd. If it is, it cannot be a power of two.
        else if (n % 2 != 0)        
            return false;  // Return false since odd numbers cannot be powers of two.

        // If n is even and greater than 1, enter the loop.
        else {
            while (n > 1) {  // Continue as long as n is greater than 1.
                
                // Divide n by 2.
                n /= 2;  
                
                // Check if the resulting n is equal to 1.
                if (n == 1)  
                    return true;  // Return true, indicating n is a power of two.
                
                // Check if the new value of n is odd.
                else if (n % 2 != 0)  
                    return false;  // Return false if n is odd, meaning it can't be a power of two.
            }
        }    

        // Return false if none of the above conditions are met.
        return false;        
    }
}

